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
public class DetalleNomina {
    private int id_nomina;
    private int id_empleado;
    private float deduciones;
    private float sueldo_neto;

    public DetalleNomina(int id_nomina, int id_empleado, float deduciones, float sueldo_neto) {
        this.id_nomina = id_nomina;
        this.id_empleado = id_empleado;
        this.deduciones = deduciones;
        this.sueldo_neto = sueldo_neto;
    }
  public DetalleNomina() {
    }
    public int getId_nomina() {
        return id_nomina;
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public float getDeduciones() {
        return deduciones;
    }

    public float getSueldo_neto() {
        return sueldo_neto;
    }

    public void setId_nomina(int id_nomina) {
        this.id_nomina = id_nomina;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public void setDeduciones(float deduciones) {
        this.deduciones = deduciones;
    }

    public void setSueldo_neto(float sueldo_neto) {
        this.sueldo_neto = sueldo_neto;
    }
    
    

 
}
