/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author delvy
 */
import Negocio.Empleado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DbEmpleado {
    ///////////////// 

    public int setInsertarEmpleado(Empleado e) {
        String consulta = "INSERT INTO tbl_empleado (nombre,direccion,telefono,cedula,fecha_inicio,puesto,area_trabajo,sueldo, tipo_empleado)"
                + " VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement pt;
        ConectarBd con = new ConectarBd();
        int insertada = 0;
        try {
            pt = con.getConexion().prepareStatement(consulta);
            pt.setString(1, e.getNombre());
            pt.setString(2, e.getDireccion());
            pt.setString(3, e.getTelefono());
            pt.setString(4, e.getCedula());
            pt.setDate(5, new java.sql.Date(e.getFechaInicio().getTime()));
            pt.setInt(6, e.getPuesto());
            pt.setInt(7, e.getAreaTrabajo());
            pt.setDouble(8, e.getSueldo());
            pt.setInt(9, e.getTipoEmpleado());
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

    ///////////////////  
    public int setModificaEstudiante(Empleado e, Integer codigo) {
        String consulta = "UPDATE tbl_estudiante Set nombre=?,direccion=?,telefono=?, cedula =?,fecha_inicio=?,puesto=?,area_tabajo,tipo_empleado=? Where id_empleado=?;";
        PreparedStatement pt;
        int gdExito = 0;
        ConectarBd con = new ConectarBd();
        try {
            pt = con.getConexion().prepareStatement(consulta);
            pt.setString(1, e.getNombre());
            pt.setString(2, e.getDireccion());
            pt.setString(3, e.getTelefono());
            pt.setString(4, e.getCedula());
            pt.setDate(5, new java.sql.Date(e.getFechaInicio().getTime()));
            pt.setInt(6, e.getPuesto());
            pt.setInt(7, e.getAreaTrabajo());
            pt.setDouble(8, e.getSueldo());
            pt.setInt(9, e.getTipoEmpleado());
            pt.setInt(10, codigo);

            gdExito = pt.executeUpdate();
            pt.close();

        } catch (SQLException b) {
            JOptionPane.showMessageDialog(null, b.getMessage());
        } finally {
            con.setCerrar();
            con = null;
        }
        return gdExito;
    }

    ////////// Utlizar para cargar los datos en rejilla //////////
    public static ArrayList buscarEmpleado(String buscar) {
        ConectarBd con = new ConectarBd();
        ResultSet resultado;
        String Query = "Select * from tbl_empleado Where nombre LIKE '%" + buscar + "%' AND tipo_empleado=0";
        resultado = con.getQuery(Query);
        ArrayList<Object> listaData = new ArrayList<>();
        try {
            while (resultado.next()) {
                listaData.add(new Object[]{resultado.getInt("id_empleado"), resultado.getString("nombre"), resultado.getString("direccion"),
                     resultado.getString("telefono")});
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
    
    
     ////////// Utlizar para cargar los datos en rejilla //////////
    public static ArrayList buscarTodoEmpleado(String buscar) {
        ConectarBd con = new ConectarBd();
        ResultSet resultado;
        String Query = "Select * from tbl_empleado Where nombre LIKE '%" + buscar + "%';";
        resultado = con.getQuery(Query);
        ArrayList<Object> listaData = new ArrayList<>();
        try {
            while (resultado.next()) {
                listaData.add(new Object[]{resultado.getInt("id_empleado"), resultado.getString("nombre"), resultado.getString("cedula"),
                     resultado.getString("telefono")});
            }
            resultado.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            con.setCerrar();
            con = null;
        }
        return listaData;
    }
    
    
    
     public static ArrayList getEmpleadosEnNomina(int mes, int anio) {
        ConectarBd con = new ConectarBd();
        ResultSet resultado;
        String Query = "Select tbl_empleado.id_empleado,tbl_empleado.nombre, tbl_empleado.sueldo,(select sum(monto) as bal from tbl_deduccion where id_empleado=tbl_empleado.id_empleado AND  MONTH(fecha) ="+mes+" AND YEAR(fecha) ="+anio+"  ) AS deduccion from tbl_empleado ORDER BY nombre ASC;";
        resultado = con.getQuery(Query);
        ArrayList<Object> listaData = new ArrayList<>();
        try {
            while (resultado.next()) {
                listaData.add(new Object[]{resultado.getInt("id_empleado"), resultado.getString("nombre"),String.format("%.2f", resultado.getDouble("sueldo")), String.format("%.2f",resultado.getDouble("deduccion")),String.format("%.2f",resultado.getDouble("sueldo")-resultado.getDouble("deduccion"))});
            }
            resultado.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            con.setCerrar();
            con = null;
        }
        return listaData;
    }
     
     

    /////////////////
    public static int setEliminaEmpleado(Integer codigo) {
        String consulta = "UPDATE tbl_empleado SET activo = 0 WHERE id_empleado = "
                + codigo + " ;";
        int insertadas = 0;
        ConectarBd con = new ConectarBd();
        PreparedStatement pt;
        try {
            pt = con.getConexion().prepareStatement(consulta);
            insertadas = pt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(DbNomina.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

            con.setCerrar();
            con = null;
        }

        return insertadas;
    }

    public void mostrarEmpleado(Integer idEmpleado, Empleado e) {

        String query = "SELECT nombre, direccion, telefono, sueldo,cedula, puesto, tipo_empleado, area_trabajo "
                + " FROM tbl_empleado WHERE id_empleado = " + idEmpleado;
        ConectarBd con = new ConectarBd();
        ResultSet rs;
        rs = (ResultSet) con.getQuery(query);
        try {
            while (rs.next()) {
                e.setIdEmpleado(rs.getInt("id_estudiante"));
                e.setNombre(rs.getString("nombre"));
                e.setDireccion(rs.getString("direccion"));
                e.setTelefono(rs.getString("telefono"));
                e.setFechaInicio(rs.getDate("fecha_inicio"));
                e.setSueldo(rs.getFloat("sueldo"));
                e.setCedula(rs.getString("cedula"));
                e.setAreaTrabajo(rs.getInt("area_trabajo"));
                e.setTipoEmpleado(rs.getInt("tipo_empleado"));
            }
            rs.close();
            con.setCerrar();
        } catch (SQLException ex) {
            Logger.getLogger(DbEstudiante.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
