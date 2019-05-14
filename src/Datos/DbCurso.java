package Datos;

import Negocio.Curso;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author delvy
 */
public class DbCurso {

    public long setInsertarCurso(Curso c) {
        String consulta = "INSERT INTO tbl_curso (aula, tanda,capacidad,grado,id_empleado_doc,anio_escolar,nombre_tanda,nombre_grado) VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement pt;
        ConectarBd con = new ConectarBd();
        long insertada = 0;
        try {
            pt = con.getConexion().prepareStatement(consulta, Statement.RETURN_GENERATED_KEYS);
            pt.setString(1, c.getAula());
            pt.setInt(2, c.getTanda());
            pt.setInt(3, c.getCapacidad());
            pt.setInt(4, c.getGrado());
            pt.setString(5, null);
            pt.setString(6, c.getAnioEscolar());
            pt.setString(7, c.getNombreTanda());
             pt.setString(8, c.getNombreGrado());
            pt.executeUpdate();
            con.generarKey(pt);
            insertada = con.getIdreturn();
            pt.close();
        } catch (SQLException a) {
            JOptionPane.showMessageDialog(null, a.getMessage());
        } finally {
            con.setCerrar();
            con = null;
        }
        return insertada;
    }

    public void setRegistroEstudianteEnCuso(long idCurso, long idEstudiante) {
        String consulta = "INSERT INTO tbl_estudiante_curso (id_estudiante,id_curso) VALUES (?,?)";
        PreparedStatement pt;
        ConectarBd con = new ConectarBd();
        long insertada = 0;
        try {
            pt = con.getConexion().prepareStatement(consulta);
            pt.setLong(1, idEstudiante);
            pt.setLong(2, idCurso);
            pt.executeUpdate();
            pt.close();
        } catch (SQLException a) {
            JOptionPane.showMessageDialog(null, a.getMessage());
        } finally {
            con.setCerrar();
            con = null;
        }
    }

    public void setRegistroAsignaturaEnCuso(long idCurso, long idAsignatura) {
        String consulta = "INSERT INTO tbl_asignatura_curso (id_asignatura,id_curso) VALUES (?,?)";
        PreparedStatement pt;
        ConectarBd con = new ConectarBd();
        long insertada = 0;
        try {
            pt = con.getConexion().prepareStatement(consulta);
            pt.setLong(1, idAsignatura);
            pt.setLong(2, idCurso);
            pt.executeUpdate();
            pt.close();
        } catch (SQLException a) {
            JOptionPane.showMessageDialog(null, a.getMessage());
        } finally {
            con.setCerrar();
            con = null;
        }
    }

    public int setModificaCurso(Curso c, Integer codigo) {
        String consulta = "UPDATE tbl_curso SET aula = ?, tanda=?,capacidad = ?,grado = ?,id_empleado_doc = ?,anio_escolar = ? WHERE id_curso = " + codigo + ";";
        PreparedStatement pt;
        ConectarBd con = new ConectarBd();
        int insertada = 0;
        try {
            pt = con.getConexion().prepareStatement(consulta);
            pt.setString(1, c.getAula());
            pt.setInt(2, c.getTanda());
            pt.setInt(3, c.getCapacidad());
            pt.setInt(4, c.getGrado());
            pt.setInt(5, c.getIdDocente());
            pt.setString(6, c.getAnioEscolar());
            pt.setInt(7, codigo);
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

    ////////// Utlizar para cargar los datos en rejilla //////////
    public static ArrayList buscarCursoPorNombre(String buscar) {
        ConectarBd con = new ConectarBd();
        ResultSet resultado;
        String Query = "Select * from tbl_curso where aula LIKE '%" + buscar + "% OR tanda LIKE '%" + buscar + "%';'; ";
        resultado = con.getQuery(Query);
        ArrayList<Object> listaData = new ArrayList<>();
        try {
            while (resultado.next()) {
                listaData.add(new Object[]{resultado.getInt("id_curso"), resultado.getString("aula"), resultado.getString("tanda")});
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

    /////////////////
    public static void setEliminaCurso(Integer codigo) {
        ConectarBd con = new ConectarBd();
        String Query = "DELETE FROM tbl_curso WHERE id_curso =" + codigo + ";";
        con.setQuery(Query);
        con.setCerrar();
    }

    public void mostrarCurso(Integer idCurso, Curso c) {
        String query = "SELECT aula,tanda,id_curso FROM tbl_curso WHERE id_curso = " + idCurso + ";";
        ConectarBd con = new ConectarBd();
        ResultSet rs;
        rs = (ResultSet) con.getQuery(query);
        try {
            while (rs.next()) {
                c.setId_curso(rs.getInt("id_curso"));
                c.setAula(rs.getString("aula"));
                c.setTanda(rs.getInt("tanda"));
            }
            rs.close();
            con.setCerrar();
        } catch (SQLException ex) {
            Logger.getLogger(DbEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
      ////////// Utlizar para cargar los datos en rejilla //////////
    public static ArrayList buscarCursoPorDocente(int buscar) {
        ConectarBd con = new ConectarBd();
        ResultSet resultado;
        String Query = "Select * from tbl_curso where id_empleado_doc=" + buscar + " Order By id_curso desc ; ";
        resultado = con.getQuery(Query);
        ArrayList<Object> listaData = new ArrayList<>();
        try {
            while (resultado.next()) {
                listaData.add(new Object[]{resultado.getInt("id_curso"), resultado.getString("aula"), resultado.getString("Anio_escolar"), resultado.getString("nombre_tanda")});
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
