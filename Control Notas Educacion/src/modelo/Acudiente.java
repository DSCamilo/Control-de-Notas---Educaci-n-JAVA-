
package modelo;


public class Acudiente extends Persona implements MenuConsulta{
    
    
   private String codigoAcudiente;
   
    public Acudiente(String codigoAcudiente) {
        
        this.codigoAcudiente = codigoAcudiente;
    }

    public Acudiente() {
       
    }
   
    public String getCodigoAcudiente() {
        return codigoAcudiente;
    }

    public void setCodigoAcudiente(String codigoAcudiente) {
        this.codigoAcudiente = codigoAcudiente;
    } 
    
    public void ConsultarNotas(){
        
    }

    @Override
    public void consultarNota() {
        System.out.println("Materia: " + asignaturas.get(i).getNombreAsignatura()
                    + " Promedio: " + asignaturas.get(i).getPromedio());
    }
}
