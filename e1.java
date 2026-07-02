//proxy 
interface Libro(){
     public void leerContenido():
}

class LibroReal implements Libro{
    private String contenido;
    public LibroReal(String contenido){
        this.contenido=contenido;
    }
    @Override 
    public void leerContenido(){
        System.out.println(contenido);
    }
}

class LibroProxy implements Libro{
    private String contenido;
    private LibroReal libroReal;
    private boolean usuarioMembresia;
    public LibroProxy(String contenido, boolean usuarioMembresia){
        this.contenido=contenido;
        this.usuarioMembresia=usuarioMembresia;
    }

    @Override
    public void leerContenido(){
        if(usuarioMenbresia){
            System.out.pritnln("Usted es un usuario con membresia, puede acceder al contenido del libro");
            if(libroReal==null){
                libroReal = new LibroReal(contenido); 
            }
            libroReal.leerContenido();
        } else {
            System.out.println("Necesita ser un usuario con membresia para acceder al contenido.");
        }
    }
}

