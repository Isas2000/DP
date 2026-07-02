interface Comando {
    void ejecutar();
}
//receptor
class GestionLibro{
    void prestar(){
        System.out.println("Prestando el libro...");
    }
    void devolver(){
        System.out.println("Devolviendo el libro...");
    }
    void reservar(){
        System.out.println("Reservando el libro...")
    }
}
//metodos tratados como objetos
class ComandoPrestar{
    private GestionLibro gestionLibro;
    
    public ComandoPrestar(GestionLibro gestionLibro){
        this.gestionLibro=gestionLibro;
    }

    @Override 
    public void ejecutar(){
        gestionLibro.prestar();
    }
}

class ComandoDevolver{
    private GestionLibro gestionLibro;
    public ComandoDevolver(GestionLibro gestionLibro){
        this.gestionLibro=gestionLibro;
    }
    @Override 
    public void ejecutar(){
        gestionLibro.devolver();
    }
}

class ComandoReservar{
    private GestionLibro gestionLibro;
    public ComandoReserva(GestionLibro gestionLibro){
        this.gestionLibro=gestionLibro;
    }
    @Override 
    public void Ejecutar(){
        gestionLibro.reservar();
    }        
}
//lo ejecuta sin saber que hay detras solo pide y se le brinda lo que solicita 

class Usuario{
    private Comando comando;
    public Usuario(Comand comando){
        this.comando=comando;
    }

    public void ejecutarComoUsuario(){
        comando.ejecutar();
    }
}

