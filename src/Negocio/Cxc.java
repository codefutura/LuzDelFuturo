/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.util.Date;

/**
 *
 * @author codefutura
 */
public class Cxc {

    private double importe, importePagado, dtos, balance;
    private Integer codigoPadres, codigoCxc;
    private String nombrePadre, concepto;
    private int codigoTipo;
    private Date fechaAlta, fechaVence;
    private double mensualidad;
    private int estudiante;
    private String nombreEstudiante;

    //Constructor
    public Cxc() {

    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getImportePagado() {
        return importePagado;
    }

    public void setImportePagado(double importePagado) {
        this.importePagado = importePagado;
    }

    public double getDtos() {
        return dtos;
    }

    public void setDtos(double dtos) {
        this.dtos = dtos;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Integer getCodigoPadres() {
        return codigoPadres;
    }

    public void setCodigoPadres(Integer codigoPadres) {
        this.codigoPadres = codigoPadres;
    }

    public Integer getCodigoCxc() {
        return codigoCxc;
    }

    public void setCodigoCxp(Integer codigoCxp) {
        this.codigoCxc = codigoCxp;
    }

    public String getNombrePadre() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombreProveedor) {
        this.nombrePadre = nombreProveedor;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getCodigoTipo() {
        return codigoTipo;
    }

    public void setCodigoTipo(int codigoTipo) {
        this.codigoTipo = codigoTipo;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaVence() {
        return fechaVence;
    }

    public void setFechaVence(Date fechaVence) {
        this.fechaVence = fechaVence;
    }

    public double getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(double mensualidad) {
        this.mensualidad = mensualidad;
    }

    public int getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(int estudiante) {
        this.estudiante = estudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }
    
    

}
