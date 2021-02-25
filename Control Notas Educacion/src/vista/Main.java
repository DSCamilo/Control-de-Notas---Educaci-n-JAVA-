package vista;

import java.util.ArrayList;
import modelo.Acudiente;
import modelo.AsignaturaExtra;
import modelo.Carnet;
import modelo.Estudiante;

public class Main {

    public static void main(String[] args) {

        Carnet carnet1 = new Carnet();
        
        
        Estudiante estudiante1 = new Estudiante("001", "03/01/2001");

        estudiante1.setNombre("Magnolia");
        estudiante1.setApellido("Pajarin");

        ArrayList<Double> notasEstudiante = new ArrayList<>();

        notasEstudiante.add(4.0);
        notasEstudiante.add(5.0);
        notasEstudiante.add(4.2);
        
        AsignaturaExtra asignatura1 = new AsignaturaExtra("00001", "Musica", notasEstudiante, 0);
        
        asignatura1.setPromedio(asignatura1.calcularPromedio(notasEstudiante));
        
        ArrayList<AsignaturaExtra> asignaturas=new ArrayList<>();
        asignaturas.add(asignatura1);
        
        Acudiente acudiente1 = new Acudiente("123", estudiante1);
        acudiente1.setNombre("Patricia");
        acudiente1.setApellido("Pérez");
        
        System.out.println("Bienvenido al sistema de control de notas +"
                + "\n¿Es usted acudiente? Marque 1 +"
                + "\n¿Es usted estudiante? Marque 2");
        System.out.println("El acudiente del estudiante " + estudiante1.getNombre() + " es " +
                "s");
        
        

        
    }
}
