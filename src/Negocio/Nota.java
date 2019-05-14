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
public class Nota {
    private int idNota;
    private int idEstudiante;
    private int idCurso;
    private Date fecha;
    private int idAsignatura;
    private int calificacion;

    public Nota(int idNota, int idEstudiante, int idCurso, Date fecha, int idAsignatura, int calificacion) {
        this.idNota = idNota;
        this.idEstudiante = idEstudiante;
        this.idCurso = idCurso;
        this.fecha = fecha;
        this.idAsignatura = idAsignatura;
        this.calificacion = calificacion;
    }

    public Nota() {
    }
    

    public int getIdNota() {
        return idNota;
    }

    public void setIdNota(int idNota) {
        this.idNota = idNota;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(int idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
    
    
}
