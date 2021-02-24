package modelo;

import java.util.ArrayList;


public class Estudiante extends Persona implements MenuConsulta {
    
    
    private String codigoEstudiante;
    private String fechaNacimiento;
    private Acudiente acudiente;
    private Carnet carnet;
    private ArrayList AsignaturaExtracirricular;

    public Estudiante(String codigoEstudiante, String fechaNacimiento) {
        this.codigoEstudiante = codigoEstudiante;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Estudiante( 
            String codigoEstudiante, String fechaNacimiento, 
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Acudiente getAcudiente() {
        return acudiente;
    }

    public void setAcudiente(Acudiente acudiente) {
        this.acudiente = acudiente;
    }

    public Carnet getCarnet() {
        return carnet;
    }

    public void setCarnet(Carnet carnet) {
        this.carnet = carnet;
    }

    @Override
    public void consultarNota() {
        Estudiante estudiante = new Estudiante("123", "123");
        
    }
    
    
}
