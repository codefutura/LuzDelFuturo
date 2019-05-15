package Datos;

import Negocio.Cxc;
import Negocio.FormatoFecha;

import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author codefutura
 */
public class DbCxc {

    public int crearCuentaCobrar(Cxc c) {
        ConectarBd con = new ConectarBd();
        String consulta = "INSERT INTO tbl_cxc (nombre_padre, id_padre, fecha, importe, vence,descripcion,mensualidad,id_estudiante) VALUES ( ?, ?, ?, ?, ?, ?,?,?);";
        PreparedStatement ps;
        int insertada = 0;
        try {
            ps = con.getConexion().prepareStatement(consulta);
            ps.setString(1, c.getNombrePadre());
            ps.setInt(2, c.getCodigoPadres());
            ps.setDate(3, new java.sql.Date(c.getFechaAlta().getTime()));
            ps.setDouble(4, c.getImporte());
            ps.setDate(5, new java.sql.Date(c.getFechaVence().getTime()));
            ps.setString(6, c.getConcepto());
            ps.setDouble(7, c.getMensualidad());
            ps.setDouble(8, c.getEstudiante());
            insertada = ps.executeUpdate();

            ps.close();
            con.setCerrar();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return insertada;
    }
    ///////

    public int modificarCuentaCobrar(Cxc c, Integer codigoCxc) {
        int modificada = 0;
        ConectarBd con = new ConectarBd();
        String consulta = "UPDATE tbl_cxc SET nombre_padre=?, id_padre=?, fecha=?, importe=?, vence=?, descripcion=?,mensualidad=?,id_estudiante=? WHERE id_cxc=?;";
        PreparedStatement ps;
        try {
            ps = con.getConexion().prepareStatement(consulta);
            ps.setString(1, c.getNombrePadre());
            ps.setInt(2, c.getCodigoPadres());
            ps.setDate(3, new java.sql.Date(c.getFechaAlta().getTime()));
            ps.setDouble(4, c.getImporte());
            ps.setDate(5, new java.sql.Date(c.getFechaVence().getTime()));

            ps.setString(6, c.getConcepto());

            ps.setDouble(7, c.getMensualidad());
            ps.setDouble(8, c.getEstudiante());

            ps.setInt(9, codigoCxc);
            modificada = ps.executeUpdate();
            ps.close();
            con.setCerrar();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return modificada;
    }
    /////////////////

    public static void EliminarCxc(Integer codigoCxc) {
        ConectarBd con = new ConectarBd();
        String Query = "DELETE FROM tbl_cxc WHERE id_cxc='" + codigoCxc + "';";
        con.setQuery(Query);
        con.setCerrar();
    }

    /////////
    public void CxcPorCodigo(Integer codigoCxc, Cxc c, Component parental) {
        ConectarBd con = new ConectarBd();
        ResultSet rs;
        String Query = "SELECT id_cxc, nombre_padre, tbl_cxc.id_padre, fecha, importe, pago,(importe-pago ) As balance ,vence,descripcion, estado_pagado,mensualidad,tbl_cxc.id_estudiante,es.nombre as nombre_estudiante FROM tbl_cxc  left join tbl_estudiante es ON es.id_estudiante=tbl_cxc.id_estudiante Where id_cxc='" + codigoCxc + "';";
        rs = con.getQuery(Query);
        try {
            while (rs.next()) {
                c.setCodigoPadres(rs.getInt("id_padre"));
                c.setCodigoCxp(codigoCxc);
                c.setFechaAlta(rs.getDate("fecha"));
                c.setFechaVence(rs.getDate("vence"));
                c.setConcepto(rs.getString("descripcion"));
                c.setImporte(rs.getDouble("importe"));
                c.setImportePagado(rs.getDouble("pago"));
                c.setNombrePadre(rs.getString("nombre_padre"));
                c.setBalance(rs.getDouble("balance"));
                c.setMensualidad(rs.getDouble("mensualidad"));
                c.setEstudiante(rs.getInt("id_estudiante"));
                c.setNombreEstudiante(rs.getString("nombre_estudiante"));
            }
            rs.close();
            con.setCerrar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(parental, e.getMessage());
        }
    }
    ////////

    public static void registrarPagos(Integer codigoCxp, double importePagado, String estado, Component parental) {
        ConectarBd con = new ConectarBd();
        String consulta = "Update tbl_cxc Set pago=pago+?,estado_pagado=? Where id_cxc=?";
        //  con.setQuery(consulta);
        PreparedStatement ps;
        try {

            ps = con.getConexion().prepareStatement(consulta);
            ps.setDouble(1, importePagado);
            ps.setString(2, estado);
            ps.setInt(3, codigoCxp);
            //
            ps.executeUpdate();

            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(parental, e.getMessage());
        } finally {
            con.setCerrar();

        }
    }
    ////////

    public static void buscarCxc(DefaultTableModel tabla, Integer codigoPadre, Component parental) {
        ConectarBd con = new ConectarBd();
        ResultSet resultado;
        String Query = "SELECT id_cxc, nombre_padre, id_padre,importe, pago, (importe-pago ) As balance, vence, descripcion, estado_pagado FROM tbl_cxc Where id_padre='" + codigoPadre + "' And estado_pagado='N' Order By vence ASC;";
        resultado = con.getQuery(Query);
        try {
            while (resultado.next()) {

                tabla.addRow(new Object[]{resultado.getLong("id_cxc"),
                    FormatoFecha.getFechaFormato(resultado.getDate("vence")),
                    resultado.getString("descripcion"), String.format("%.2f",
                    resultado.getDouble("importe")), String.format("%.2f",
                    resultado.getDouble("balance"))});
            }
            resultado.close();
            con.setCerrar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(parental, e.getMessage());
        }
    }
    ///////

    public static void buscarPorNombre(DefaultTableModel tabla, String buscar, Component parental) {
        ConectarBd con = new ConectarBd();
        ResultSet resultado;
        String Query = "SELECT id_cxc, nombre_padre, id_padre, fecha, importe, pago, vence,descripcion,(importe-pago ) As balance, estado_pagado FROM tbl_cxc Where nombre_padre LIKE '%" + buscar + "%';";
        resultado = con.getQuery(Query);
        try {
            while (resultado.next()) {
                tabla.addRow(new Object[]{resultado.getLong("id_cxc"), FormatoFecha.getFechaFormato(resultado.getDate("fecha")), resultado.getString("nombre_padre"), String.format("%,.2f", resultado.getDouble("importe")), String.format("%,.2f", resultado.getDouble("pago")), String.format("%,.2f", resultado.getDouble("balance")), resultado.getString("estado_pagado")});
            }
            resultado.close();
            con.setCerrar();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(parental, e.getMessage());
        }
    }

}
