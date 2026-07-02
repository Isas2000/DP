//proxy 
interface accesoHistorialMedico{
    void accederHistorial();
}

class InformacionPacienteReal implements accesoHistorialMedico{
    private String historial;
    public InformacionPacienteReal(String historial){
        this.historial=historial;
    }
    @Override 
    public void accederHistorial(){
        System.out.println("Accediendo al historial medico: " + historial);
    }
}

class GestorProxy implements accesoHistorialMedico{
    private InformacionPacienteReal informacionPacienteReal;
    private String historial;
    private boolean usuarioAutorizado;

    public GestorProxy(String historial, boolean usuarioAutorizado){
        this.historial=historial;
        this.usuarioAutorizado=usuarioAutorizado;
    }
    @Override 
    public void accederHistorial(){
        if(usuarioAutorizado){
            System.out.println("");
            if(informacionPacienteReal==null){
                informacionPacienteReal = new InformacionPacienteReal(historial);
            }
            informacionPacienteReal.accederHistorial();
        } else {
            System.out.println("Acceso denegado. ");
        }
    }
}