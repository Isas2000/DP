//Compositive 
interface Componente{
    void mostrar();
}

class Personal implements Componente{
    String nombre;
    public Personal(String nombre){
        this.nombre=nombre;
    }
    @Override 
    public void mostrar(){
        System.out.println("Personal: " +nombre)
    }
}

class Departamento implements Componente{
     
     String nombre;
     public Departamento(String nombre){
        this.nombre=nombre;
     }

     List<Componente> componentes = new ArrayList<>();

     void agregarComponentes(Componente compo ){
        componentes.add(compo);
     }

     @Override 
     public void mostrar(){
        System.out.println("Departamento: "+nombre);
        for(Componente c : componentes){
             c.mostrar();
        }
     }
     
}