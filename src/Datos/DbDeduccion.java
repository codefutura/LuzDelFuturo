/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Negocio.Deducion;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author codefutura
 */
public class DbDeduccion {

    ///////////////// 
    public int setInsertarEstudiante(Deducion d) {
        String consulta = "INSERT INTO tbl_deduccion (id_empleado,descripcion,monto,fecha) VALUES (?,?,?,?)";
        PreparedStatement pt;
        ConectarBd con = new ConectarBd();
        
        System.out.println(d.getDescripcion());
        int insertada = 0;
        try {
            pt = con.getConexion().prepareStatement(consulta);
            pt.setInt(1, d.getIdEmpleado());
            pt.setString(2, d.getDescripcion());
            pt.setDouble(3, d.getMonto());

            if (d.getFecha() != null) {
                pt.setDate(4, new java.sql.Date(d.getFecha().getTime()));
            } else {
                pt.setDate(4, null);
            }
            insertada = pt.executeUpdate();

            pt.close();

        } catch (SQLException a) {
            JOptionPane.showMessageDialog(null, a.getMessage());
        } finally {
            con.setCerrar();
            con = null;
        }
        return insertada;
    }
}
