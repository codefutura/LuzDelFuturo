/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author delvy
 */
 enum tandas{
 Mañana,
 Tarde,
 Noche,
 Estendida
}
public class Curso {
    private int id_curso;
    private String aula;
    private tandas tanda;

    public Curso(String Aula, tandas tanda) {
        this.aula = Aula;
        this.tanda = tanda;
    }

      public Curso() {
        this.aula = null;
        this.tanda = null;
    }

    public int getId_curso() {
        return id_curso;
    }
      
    public String getAula() {
        return aula;
    }

   
    public String  getTanda() {
        return tanda.name();
    }

    public void setAula(String Aula) {
        this.aula = Aula;
    }

    public void setTanda(String tanda) {
        this.tanda = tandas.valueOf(tanda);
    } 

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

    
}

