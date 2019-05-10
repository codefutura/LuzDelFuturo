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
    private String nombres;
    private String apellidos;
    private Date fechaNacimiento;
    private String direccion;
    private String telefono;
    private String email;

    public Estudiante(String nombres, String apellidos, Date fechaNacimiento, String direccion, String telefono, String email) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public Estudiante() {
        this.nombres = null;
        this.apellidos = null;
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

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
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

    public void setNombres(String Nombres) {
        this.nombres = Nombres;
    }

    public void setApellidos(String Apellidos) {
        this.apellidos = Apellidos;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.fechaNacimiento = FechaNacimiento;
    }


}
