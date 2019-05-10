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
public class Estudiante {
    private int Id;
    private String nombre;
    private Date fechaNacimiento;
    private String direccion;
    private String telefono;
    private String email;
    private int idPadre;
    private int idMadre;

    public Estudiante(String nombre,  Date fechaNacimiento, String direccion, String telefono, String email) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public Estudiante() {
        this.nombre = null;
        this.fechaNacimiento = null;
        this.direccion = null;
        this.telefono = null;
        this.email = null;
    }
    
    
 
  
    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return Id;
    }

    public String getNombre() {
        return nombre;
    }

  
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
  

    public void setDireccion(String Direccion) {
        this.direccion = Direccion;
    }

    public void setTelefono(String Telefono) {
        this.telefono = Telefono;
    }

    public void setEmail(String Email) {
        this.email = Email;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNombre(String Nombres) {
        this.nombre = Nombres;
    }


    public void setFechaNacimiento(Date FechaNacimiento) {
        this.fechaNacimiento = FechaNacimiento;
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
     * @return the idMadre
     */
    public int getIdMadre() {
        return idMadre;
    }

    /**
     * @param idMadre the idMadre to set
     */
    public void setIdMadre(int idMadre) {
        this.idMadre = idMadre;
    }


}
