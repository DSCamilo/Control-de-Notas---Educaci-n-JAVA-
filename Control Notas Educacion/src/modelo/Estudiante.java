package modelo;

import java.util.ArrayList;

public class Estudiante extends Persona implements MenuConsulta {

    private String codigoEstudiante;
    private String fechaNacimiento;
    private Carnet carnet;
    private ArrayList<AsignaturaExtra> asignaturas;

    public Estudiante(String codigoEstudiante, String fechaNacimiento) {
        this.codigoEstudiante = codigoEstudiante;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //Asociacion
    public Estudiante() {
    }
    
    //Agregación
    public void agregarMateriaExtra(AsignaturaExtra asignatura){
        asignaturas.add(asignatura);
    }
    
    //Composición
    public void crearCarnet(String idEstudiante, String sexo, String tipoSangre,
            String fechaVencimiento){
        
        Carnet carnet = new Carnet();
        carnet.setIdentificacionEstudiante(idEstudiante);
        carnet.setSexo(sexo);
        carnet.setTipoSangre(tipoSangre);
        carnet.setFechaVencimiento(fechaVencimiento);
    }
    
    //Getter y Setter
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
 
    //interfaz
    public void consultarNota() {
        
        for (int i = 0; i < asignaturas.size(); i++) {
            System.out.println("Materia: " + asignaturas.get(i).getNombreAsignatura()
                    + " Promedio: " + asignaturas.get(i).getPromedio());

        }

    }

}
