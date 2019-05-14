/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.Date;

/**
 *
 * @author alexa
 */
public class Empleado {
        
    private int idEmpleado;
    private String nombre;
    private String direccion;
    private String cedula;
    private String telefono;
    private int puesto;
    private Date fechaInicio;
    private double sueldo;
    private int tipoEmpleado;
    private int areaTrabajo;

        
    public Empleado(int idEmpleado, String nombre, String direccion, String cedula, String telefono, int puesto, Date fechaInicio, double sueldo, int tipoEmpleado, int areaTrabajo){
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cedula = cedula;
        this.telefono = telefono;
        this.puesto = puesto;
        this.fechaInicio = fechaInicio;
        this.sueldo = sueldo;
        this.tipoEmpleado = tipoEmpleado;
        this.areaTrabajo = areaTrabajo;
}
    
    
    
    public Empleado(){
        
    }
   

    /**
     * @return the idEmpleado
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * @param idEmpleado the idEmpleado to set
     */
    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the puesto
     */
    public int getPuesto() {
        return puesto;
    }

    /**
     * @param puesto the puesto to set
     */
    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    /**
     * @return the fechaInicio
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @return the sueldo
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * @param sueldo the sueldo to set
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * @return the tipoEmpleado
     */
    public int getTipoEmpleado() {
        return tipoEmpleado;
    }

    /**
     * @param tipoEmpleado the tipoEmpleado to set
     */
    public void setTipoEmpleado(int tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    /**
     * @return the areaTrabajo
     */
    public int getAreaTrabajo() {
        return areaTrabajo;
    }

    /**
     * @param areaTrabajo the areaTrabajo to set
     */
    public void setAreaTrabajo(int areaTrabajo) {
        this.areaTrabajo = areaTrabajo;
    }

   
}
