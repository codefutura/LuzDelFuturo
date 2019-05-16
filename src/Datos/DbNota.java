package Datos;

import Negocio.Nota;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author codefutura
 */
public class DbNota {

    public int insertarPublicacionDeNota(Nota n) {
        ConectarBd con = new ConectarBd();
        String consulta = "INSERT INTO tbl_nota (id_estudiante, id_curso,id_asignatura,calificacion,fecha_publicacion,observacion) VALUES ( ?,?,?,?,?,?);";
        PreparedStatement ps;
        int insertada=0;
        try {
            ps = con.getConexion().prepareStatement(consulta);
            ps.setInt(1, n.getIdEstudiante());
            ps.setInt(2, n.getIdCurso());
            ps.setInt(3, n.getIdAsignatura());
            ps.setInt(4, n.getCalificacion());
            if (n.getFecha() != null) {
                ps.setDate(5, new java.sql.Date(n.getFecha().getTime()));
            } else {
                ps.setDate(5, null);
            }
            ps.setString(6, n.getObservacion());
            insertada=ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            con.setCerrar();
        }
        
        return insertada;
    }

}
