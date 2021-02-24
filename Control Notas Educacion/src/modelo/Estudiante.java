package modelo;

import java.util.ArrayList;

public class Estudiante extends Persona implements MenuConsulta {

    private String codigoEstudiante;
    private String fechaNacimiento;
    private Acudiente acudiente;
    private Carnet carnet;
    private ArrayList<AsignaturaExtra> asignaturas;

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

    public ArrayList<AsignaturaExtra> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(ArrayList<AsignaturaExtra> asignaturas) {
        this.asignaturas = asignaturas;
    }
    
    

    
    public void consultarNota() {
        
        
        for (int i = 0; i < asignaturas.size(); i++) {
            System.out.println("Materia: " + asignaturas.get(i).getNombreAsignatura()
                    + " Promedio: " + asignaturas.get(i).getPromedio());

        }

    }

}
