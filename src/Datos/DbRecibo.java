package Datos;

import Negocio.FormatoFecha;
import Negocio.Recibo;
import java.awt.Component;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author codefutura
 */
public class DbRecibo {

    public long insertarRecibo(Recibo c) {
        ConectarBd con = new ConectarBd();
        String consulta = "INSERT INTO tbl_recibo (fecha, id_estudiante, id_padre,id_cxc, descuento,importe,concepto,numero_recibo) VALUES ( ?, ?, ?, ?, ?, ?,?,?);";
        PreparedStatement ps;
        long numero = 0;
        try {
            ps = con.getConexion().prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, new java.sql.Date(c.getFechaHoy().getTime()));
            ps.setInt(2, c.getIdEstudiante());
            ps.setInt(3, c.getCodigoPadre());
            ps.setInt(4, c.getIdCxc());
            ps.setDouble(5, c.getImporteDto());
            ps.setDouble(6, c.getImporte());
            ps.setString(7, c.getConcepto());
            ps.setString(8, c.getNumeroRecibo());
            
            if (ps.executeUpdate() == 1) {
                con.generarKey(ps);
                numero = con.getIdreturn();
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } finally {
            con.setCerrar();
        }
        return numero;
    }

    public static void listaRecibo(DefaultTableModel tabla, Component parental) {
        ConectarBd con = new ConectarBd();
        String query = "SELECT id_recibo, fch, nombre_paciente, dtos, tot, importe_dto FROM tbl_recibo Order By id_recibo desc;";
        ResultSet rs;
        rs = con.getQuery(query);
        try {
            while (rs.next()) {
                tabla.addRow(new Object[]{rs.getInt("id_recibo"), FormatoFecha.getFechaFormato(rs.getDate("fch")),
                    rs.getString("nombre_paciente"), String.format("%,.2f", rs.getDouble("dtos")), String.format("%,.2f", rs.getDouble("tot"))});
            }
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(parental, e.getMessage());
        } finally {
            con.setCerrar();
        }

    }

    public String preNumeroCotizacion() {
        String Query = "Select MAX(id_recibo) as ultimo from tbl_recibo";
        ConectarBd condb = new ConectarBd();
        ResultSet rs;
        rs = condb.getQuery(Query);
        String ultimo = null;
        try {
            rs.next();
            ultimo = "000000" + Long.toString(rs.getLong("ultimo") + 1);
            rs.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            condb.setCerrar();
        }

        return ultimo;
    }

}
