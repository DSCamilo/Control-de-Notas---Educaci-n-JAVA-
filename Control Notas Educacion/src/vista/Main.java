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
        estudiante1.crearCarnet("0001", "M", "O+", "02/06/2021");

        ArrayList<Double> notasEstudiante = new ArrayList<>();

        notasEstudiante.add(4.0);
        notasEstudiante.add(5.0);
        notasEstudiante.add(4.2);

        AsignaturaExtra asignatura1 = new AsignaturaExtra("00001", "Musica", notasEstudiante, 0);

        asignatura1.setPromedio(asignatura1.calcularPromedio(notasEstudiante));

        ArrayList<AsignaturaExtra> asignaturas = new ArrayList<>();

        asignaturas.add(asignatura1);

        estudiante1.setAsignaturas(asignaturas);
        estudiante1.agregarMateriaExtra(asignatura1);

        Acudiente acudiente1 = new Acudiente("123", estudiante1);
        acudiente1.setNombre("Patricia");
        acudiente1.setApellido("Pérez");

        int ingreso = 0;
        String codestu = "";
        int opcion = 0;
        String materiaingreso = "";
        Estudiante objestu = new Estudiante();
        System.out.println("Bienvenido al sistema de control de notas "
                + "\n¿Es usted acudiente? Marque 1 "
                + "\n¿Es usted estudiante? Marque 2");

        ingreso = t.nextInt();

        if (ingreso == 1) {
            System.out.println("\nLas notas del estudiante " + acudiente1.getNombre() + " son:");
            acudiente1.consultarNota();

        } else if (ingreso == 2) {
            System.out.println(" Ingrese una opcion \n" + "Consultar notas  = 1\n"
                    + " Agregar materia = 2\n" + "Modificar info carnet = 3");
            opcion = t.nextInt();

            switch (opcion) {
                case 1:
                    estudiante1.consultarNota();
                    break;
                case 2:
                    System.out.println("Ingrese nombre materia ");
                    materiaingreso = t.next();

                    AsignaturaExtra asig = new AsignaturaExtra();

                    asig.setNombreAsignatura(materiaingreso);
                    asig.setCodigoMateria("003");
                    estudiante1.agregarMateriaExtra(asig);
                    System.out.println("Materias matriculadas : " + estudiante1.getAsignaturas().toString());
                    break;
                case 3:
                    System.out.println("" + estudiante1.getCarnet());
                    System.out.println("\nDesea modificar el nombre (1: Si, 2: NO):");
                    int eleccion = t.nextInt();
                    if (eleccion == 1) {
                        t.nextLine();
                        System.out.println("\nIngrese el nuevo nombre: ");
                        estudiante1.getCarnet().setNombreEstudiante(t.nextLine());
                        System.out.println("\n\nNombre modificado");
                        System.out.println("\n" + estudiante1.getCarnet());

                    }

                default:
                    System.out.println("Seleccione una opción correcta");
            }

        }

    }
}
