/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.Date;

/**
 *
 * @author michael
 */
public class Padres {

    private int idPadre;
    private String nombre;
    private String direccion;
    private Date fechaNacimiento;
    private String cedula;
    private String email;
    private boolean titularPago;
    private String telefono;
    private int Sexo;

    public Padres(int idPadre, String nombre, String direccion, Date fechaNacimiento, String cedula, String email, boolean titularPago) {
        this.idPadre = idPadre;
        this.nombre = nombre;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.cedula = cedula;
        this.email = email;
        this.titularPago = titularPago;

    }

    public Padres() {

    }


    /**
     * @return the idPadre
     */
    public int getIdPadre() {
        return idPadre;
    }

    /**
     * @param idPadre the idPadre to set
     */
    public void setIdPadre(int idPadre) {
        this.idPadre = idPadre;
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
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the titularPago
     */
    public boolean isTitularPago() {
        return titularPago;
    }

    /**
     * @param titularPago the titularPago to set
     */
    public void setTitularPago(boolean titularPago) {
        this.titularPago = titularPago;
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

    public int getSexo() {
        return Sexo;
    }

    public void setSexo(int Sexo) {
        this.Sexo = Sexo;
    }

}
