package modelo;

public class Carnet {

    private String identificacionEstudiante;
    private String sexo;
    private String tipoSangre;
    private String nombreEstudiante;
    private String fechaVencimiento;

    public String getIdentificacionEstudiante() {
        return identificacionEstudiante;
    }

    public void setIdentificacionEstudiante(String identificacionEstudiante) {
        this.identificacionEstudiante = identificacionEstudiante;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    @Override
    public String toString() {
        return "Carnet{" + "identificacionEstudiante=" + identificacionEstudiante + ", sexo=" + sexo + ", tipoSangre=" + tipoSangre + ", nombreEstudiante=" + nombreEstudiante + ", fechaVencimiento=" + fechaVencimiento + '}';
    }
    
}
