/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author delvy
 */
public class Nomina {
    private int id_nomina;
    private Date fecha;
    private String descripcion;
    private float total_deducion;
    private float total;
    public ArrayList detallesNomina;
    boolean activa;

    public Nomina(Date fecha, String descripcion, float total, float total_deducion) {
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.total_deducion = total_deducion;
        this.total = total;
        this.activa = true;
    }
    public Nomina(){

    }

    public void setActiva(boolean Activa) {
        this.activa = Activa;
    }

    public void setId_nomina(int id_nomina) {
        this.id_nomina = id_nomina;
    }

    public void setDetallesNomina(ArrayList detallesNomina) {
        this.detallesNomina = detallesNomina;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTotal_deducion(float total_deducion) {
        this.total_deducion = total_deducion;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getTotal_deducion() {
        return total_deducion;
    }

    public float getTotal() {
        return total;
    }

    public ArrayList getDetallesNomina() {
        return detallesNomina;
    }

    public int getId_nomina() {
        return id_nomina;
    }

    public boolean isActiva() {
        return activa;
    }
    
    
}
