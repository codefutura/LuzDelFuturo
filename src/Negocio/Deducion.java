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
public class Deducion {
    private int id_empleado;
    private String descripcion;
    private float porciento;

    public Deducion(int id_empleado, String descripcion, float monto) {
        this.id_empleado = id_empleado;
        this.descripcion = descripcion;
        this.porciento = monto;
    }
      public Deducion() {
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getMonto() {
        return porciento;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMonto(float monto) {
        this.porciento = monto;
    }
      
      
    
}
