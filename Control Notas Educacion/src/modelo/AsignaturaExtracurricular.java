/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author sagov8
 */
public class AsignaturaExtracurricular {
   
    private String codigoMateria;
    private String nombreAsignatura;
    private ArrayList notas;
    private float promedio;

    public AsignaturaExtracurricular(String codigoMateria, String nombreAsignatura, ArrayList notas, float promedio) {
        this.codigoMateria = codigoMateria;
        this.nombreAsignatura = nombreAsignatura;
        this.notas = notas;
        this.promedio = promedio;
    }

    public AsignaturaExtracurricular() {
    
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

    public float getPromedio() {
        return promedio;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    
    
}
