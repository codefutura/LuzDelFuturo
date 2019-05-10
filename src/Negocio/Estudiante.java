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
    private String Nombres;
    private String Apellidos;
    private Date FechaNacimiento;
    private String Direccion;
    private String Telefono;
    private String Email;

    public Estudiante(String Nombres, String Apellidos, Date FechaNacimiento, String Direccion, String Telefono, String Email) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.FechaNacimiento = FechaNacimiento;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Email = Email;
    }

    public Estudiante() {
        this.Nombres = null;
        this.Apellidos = null;
        this.FechaNacimiento = null;
        this.Direccion = null;
        this.Telefono = null;
        this.Email = null;
    }
    
    
 
  
    public String getDireccion() {
        return Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public int getId() {
        return Id;
    }

    public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }
  

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }


}
