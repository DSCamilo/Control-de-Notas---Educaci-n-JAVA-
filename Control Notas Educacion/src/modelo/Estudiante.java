
package modelo;


public class Estudiante extends Persona {
    
    
    private String codigoEstudiante;
    private int fechaNacimiento;
    private Acudiente acudiente;
    private Carnet carnet;

    public Estudiante(String codigoEstudiante, int fechaNacimiento) {
        this.codigoEstudiante = codigoEstudiante;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Estudiante( 
            String codigoEstudiante, int fechaNacimiento, 
            Acudiente acudiente, Carnet carnet) {
        
        this.codigoEstudiante = codigoEstudiante;
        this.fechaNacimiento = fechaNacimiento;
        this.acudiente = acudiente;
        this.carnet = carnet;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
    public String consultarNotas (String nombreMateria){
        String valor ="";
        
        
        
        
       return valor;
    }
    
}
