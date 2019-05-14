/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Negocio.Asignatura;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

/**
 *
 * @author codefutura
 */
public class dbAsignatura {
    
    public int setInsertAsignatura(Asignatura a)
    {
        String consulta = "INSERT INTO tbl_asignatura (descrpcion) VALUES (?);";
        PreparedStatement pt;
        ConectarBd con = new ConectarBd();
        int insertadas = 0;
        try {
            pt = con.getConexion().prepareStatement(consulta);
            pt.setString(1, a.getDescripcion());
            insertadas = pt.executeUpdate();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode());
        }
        finally{
            con.setCerrar();
            con  =null;
        }
        return insertadas;
    }
    
    public static ArrayList todasLasAsignatura() {
        ConectarBd con = new ConectarBd();
        ResultSet resultado;
        String Query = "Select * from tbl_asignatura ORDER BY id_asignatura ASC ;";
        resultado = con.getQuery(Query);
        ArrayList<Object> listaData = new ArrayList<>();
        try {
            while (resultado.next()) {
                listaData.add(new Object[]{resultado.getInt("id_asignatura"), resultado.getString("descripcion")});
            }
            resultado.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode());
        } finally {
            con.setCerrar();
            con = null;
        }
        return listaData;
    }
    
    public static ArrayList asignaturasDelCurso(int idCurso) {
        ConectarBd con = new ConectarBd();
        ResultSet resultado;
        String Query = "SELECT curso.id_curso,curso.id_asignatura, asig.descripcion FROM tbl_asignatura_curso curso inner join tbl_asignatura asig ON asig.id_asignatura=curso.id_asignatura Where id_curso ="+idCurso+" ORDER BY id_asignatura_curso ASC ;";
        resultado = con.getQuery(Query);
        ArrayList<Object> listaData = new ArrayList<>();
        try {
            while (resultado.next()) {
                listaData.add(new Object[]{resultado.getInt("id_asignatura"), resultado.getString("descripcion"),resultado.getString("id_curso")});
            }
            resultado.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode());
        } finally {
            con.setCerrar();
            con = null;
        }
        return listaData;
    }
    
    
     public static ArrayList asignaturasDelCursoPublicar(int idCurso) {
        ConectarBd con = new ConectarBd();
        ResultSet resultado;
        String Query = "SELECT curso.id_curso,curso.id_asignatura, asig.descripcion FROM tbl_asignatura_curso curso inner join tbl_asignatura asig ON asig.id_asignatura=curso.id_asignatura Where id_curso ="+idCurso+" ORDER BY id_asignatura_curso ASC ;";
        resultado = con.getQuery(Query);
        ArrayList<Object> listaData = new ArrayList<>();
        try {
            while (resultado.next()) {
                listaData.add(new Object[]{resultado.getInt("id_asignatura"), resultado.getString("descripcion")});
            }
            resultado.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode());
        } finally {
            con.setCerrar();
            con = null;
        }
        return listaData;
    }
    
    
    
    
}
