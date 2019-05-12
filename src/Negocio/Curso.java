package Negocio;

import java.util.Date;

/**
 *
 * @author delvy
 */
public class Curso {

    private int id_curso;
    private String aula;
    private int tanda;
    private int capacidad;
    private int idDocente;
 
    private int grado;
    private String anioEscolar;

    public Curso(String Aula, int tanda) {
        this.aula = Aula;
        this.tanda = tanda;
    }

    public Curso() {
        this.aula = null;
        this.tanda = 0;
    }

    public int getId_curso() {
        return id_curso;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String Aula) {
        this.aula = Aula;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    public int getTanda() {
        return tanda;
    }

    public void setTanda(int tanda) {
        this.tanda = tanda;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getIdDocente() {
        return idDocente;
    }

    public void setIdDocente(int idDocente) {
        this.idDocente = idDocente;
    }


    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }

    public String getAnioEscolar() {
        return anioEscolar;
    }

    public void setAnioEscolar(String anioEscolar) {
        this.anioEscolar = anioEscolar;
    }

    
}
