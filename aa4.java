//Observer 
interface Observador{
    void actualizar(String evento);
}

class CentralEnfermeria{
    String nombre;
    @Override 
    public void actualizar(String evento){
        System.out.println("Central de enfermeria con nombre: "+ nombre = " se ha actualizado el 
        evento " = evento);
    }

}

class SistemaAlertas{
    String nombre;
    @Override 
    public void actualizar(String evento){
        System.out.println("Sistema de alertas con nombre: "+nombre + " se ha actualizado el evento "+
        evento);
    }

}

class Paciente {
    String nombre;
    private List<Observador> notificadores = new ArrayList<>();
        public Paciente(String nombre){
        this.nombre=nombre;
    }
    void notificar(){

    }

    void avisarATodos(){
        for(Observador ob : notificadores ){
            ob.actualizar("Paciente a cambiado de estado con nombre: " + nombre );
        }
    }

    void agregarEstadoPaciente(String estado){
        for(Observador ob: notificadores){
            ob.actualizar("Paciente con nombre "+ nombre + " ha cambiado de estado a: "+estado);
        }
    }
}
public class e3{
public static void main(String[] args){

}
}