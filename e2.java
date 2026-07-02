//Compositive 
interface ElementoBiblioteca{
    void mostrar();
}

class Libro implements ElementoBiblioteca{
    private String titulo;
    public Libro(String titulo){
        this.titulo=titulo;
    }

    @Override 
    public void mostrar(){
        System.out.println("Libro: "+titulo);
    }
}

class Estanteria implements ElementoBiblioteca{
    private String nombre;
    public Estanteria(String nombre){
        this.nombre=nombre;
    }
    List<ElementoBiblioteca> elementos = new ArrayList<>();

    public void agregarElementosUwu(ElementoBiblioteca elemento){
        elementos.add(elemento);
    }

    @Override 
    public void mostrar (){
        System.out.println("Estanteria con nombre: "+nombre);

        for(ElementoBiblioteca elementito : elementos){
            elementito.mostrar();
        }
    }
    
}

public static void main (String[] args){
    public class e2{
        Estanteria raiz = new Estanteria("Raiz");
        Libro libro1 = new Libro("Libro 1");
        Libro libro2 = new Libro("Libro 2"):
        Libro libro3 = new Libro("Libro 3");

        raiz.elementos.add(libro1);
        raiz.elementos.add(libro2);
        raiz.elementos.add(libro3);
        Estanteria subEstanteria = new Estanteria("Sub Estanteria");
        raiz.elementos.add(subEstanteria);
    }
}