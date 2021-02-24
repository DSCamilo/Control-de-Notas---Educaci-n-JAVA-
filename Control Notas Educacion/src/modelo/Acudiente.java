
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
