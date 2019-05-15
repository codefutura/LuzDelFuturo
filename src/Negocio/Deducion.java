/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.Date;

/**
 *
 * @author delvy
 */
public class Deducion {
    
    private int idEmpleado;
    private String descripcion;
    private double monto;
    private Date fecha;

    public Deducion(int id_empleado, String descripcion, double monto) {
        this.idEmpleado = id_empleado;
        this.descripcion = descripcion;
        this.monto = monto;
    }
      public Deducion() {
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
      
      
    
}
