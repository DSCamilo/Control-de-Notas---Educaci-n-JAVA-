package vista;

import java.util.ArrayList;
import java.util.Scanner;
import modelo.Acudiente;
import modelo.AsignaturaExtra;
import modelo.Carnet;
import modelo.Estudiante;

public class Main {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
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

    
        estudiante1.agregarMateriaExtra(asignatura1);

        Acudiente acudiente1 = new Acudiente("123", estudiante1);
        acudiente1.setNombre("Patricia");
        acudiente1.setApellido("Pérez");

        int ingreso = 0;
        String codestu = "";
        int estu = 0;
        String materiaingreso="";
        Estudiante objestu = new Estudiante();
        System.out.println("Bienvenido al sistema de control de notas "
                + "\n¿Es usted acudiente? Marque 1 "
                + "\n¿Es usted estudiante? Marque 2");
        // System.out.println("El acudiente del estudiante " + estudiante1.getNombre() + " es " +
        //         "s");

        ingreso = t.nextInt();

        if (ingreso == 1) {
            acudiente1.consultarNota();

        }
        if (ingreso == 2) {
            System.out.println(" Ingrese una opcion \n" + "Consultar notas  = 1\n" + " Agregar materia = 2");
            estu = t.nextInt();

            if (estu == 1) {
                estudiante1.consultarNota();

            }
            if (estu == 2) {
                   System.out.println("Ingrese nombre materia ");
                   materiaingreso=t.next();
                   
                   AsignaturaExtra asig=new AsignaturaExtra();
                   
                   asig.setNombreAsignatura(materiaingreso);
                   asig.setCodigoMateria("003");
                   estudiante1.agregarMateriaExtra(asig);
                   System.out.println("Materias matriculadas : "+estudiante1.getAsignaturas().toString());
            }
       

        }

        //    System.out.println("al camilo le gusta el pito ");
    }
}
