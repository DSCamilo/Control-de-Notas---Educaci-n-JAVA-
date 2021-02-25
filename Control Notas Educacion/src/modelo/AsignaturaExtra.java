package modelo;

import java.util.ArrayList;

/**
 *
 * @author sagov8
 */
public class AsignaturaExtra {

    private String codigoMateria;
    private String nombreAsignatura;
    private ArrayList notas;
    private double promedio;

    public AsignaturaExtra(String codigoMateria, String nombreAsignatura, ArrayList notas, float promedio) {
        this.codigoMateria = codigoMateria;
        this.nombreAsignatura = nombreAsignatura;
        this.notas = notas;
        this.promedio = promedio;
    }

    public AsignaturaExtra() {

    }

    public String getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public ArrayList getNotas() {
        return notas;
    }

    public void setNotas(ArrayList notas) {
        this.notas = notas;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double calcularPromedio(ArrayList<Double> notas) {

        double sumatoria = 0;

        for (int i = 0; i < notas.size(); i++) {

            sumatoria += notas.get(i);

        }

        return Math.round((sumatoria / notas.size() - 1)*100.0)/100.0;
    }

    @Override
    public String toString() {
        return "AsignaturaExtra{" + "codigoMateria=" + codigoMateria + ", nombreAsignatura=" + nombreAsignatura + ", notas=" + notas + ", promedio=" + promedio + '}';
    }
    
    

}
