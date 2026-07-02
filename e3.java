interface Observador{
    void actualizar(String evento);
}

class Catalogo implements Observador{
private String nombreCatalogo;
public Catalogo(String nombreCatalogo){
    this.nombreCatalogo=nombreCatalogo;
}
    @Override 
    void actualizar(String evento){
        System.out.println("Catalogo actualizado " + nombreCatalogo +
        " con el evento: "+evento);
    }
}

class PanelRecomendaciones implements Observador{
    private String nombrePanelRecomendaciones;
    public PanelRecomendaciones(String nombrePanelRecomendaciones){
        this.nombrePanelRecomendaciones=nombrePanelRecomendaciones;
    }
    @Override 
    public void actualizar(String evento){
        System.out.println("Se ha actualizado en el panel " +nombrePanelRecomendaciones+
        " con el evento: "+evento)
    }

}
//sujeto 
class Biblioteca {
    private String nombreBiblioteca;
   private List<Observador> notificadores = new ArrayList<>():

   public Biblioteca(String nombreBiblioteca){
    this.nombreBiblioteca=nombreBiblioteca;
   }

   public void agregoLibro(String nombreLibro){
    System.out.println("Se ha agregado el libro: " + nombreLibro);
    avisarAtodos();
   }


   void avisarAtodos(){
    for(Observador ob : notificadores ){
        ob.actualizar("Nuevo libro agregado a la biblioteca: "+nombreBiblioteca);
    }
   } 
}

public class e3{
public static void main(String[] args){
    
    Biblioteca biblioteca = new Biblioteca("Biblioteca Piura");
    PanelRecomendaciones panelRe = new PanelRecomendaciones("Panel de recomendaciones libros para ninos");
    Catalogo catalogo = new Catalogo("Catalogo de libros de superacion personal. ");
    
    biblioteca.notificadores.add(panelRe);
    biblioteca.notificadores.add(catalogo);

    biblioteca.agregoLibro("El diario de Ana Frank");
    }
}
