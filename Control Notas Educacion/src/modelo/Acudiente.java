
package modelo;


public class Acudiente extends Persona {
    
    
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
}
