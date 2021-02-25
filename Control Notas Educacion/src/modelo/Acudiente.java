
package modelo;

import java.util.Scanner;


public class Acudiente extends Persona implements MenuConsulta{
    
    
   private String codigoAcudiente;
   private Estudiante estudiante;
   
   //Asociación
    public Acudiente(String codigoAcudiente, Estudiante estudiante) {
        
        this.codigoAcudiente = codigoAcudiente;
        this.estudiante = estudiante;
    }

    public Acudiente() {
       
    }
   
    public String getCodigoAcudiente() {
        return codigoAcudiente;
    }

    public void setCodigoAcudiente(String codigoAcudiente) {
        this.codigoAcudiente = codigoAcudiente;
    } 

    @Override
    public void consultarNota() {


        for(int i = 0 ; i < estudiante.getAsignaturas().size(); i++){
            System.out.println("\nMateria: " + 
                    estudiante.getAsignaturas().get(i).getNombreAsignatura() +
                    "\nNota: " + estudiante.getAsignaturas().get(i).getPromedio());
        }
        

    }
}
