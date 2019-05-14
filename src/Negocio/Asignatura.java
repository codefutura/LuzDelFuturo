/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author delvy
 */
public class Asignatura {
    private int id_asignatura;
    private String descripcion;

    public Asignatura(int id_asignatura, String descripcion) {
        this.id_asignatura = id_asignatura;
        this.descripcion = descripcion;
    }
    
     public Asignatura() {
    }


    public int getId_asignatura() {
        return id_asignatura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId_asignatura(int id_asignatura) {
        this.id_asignatura = id_asignatura;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
