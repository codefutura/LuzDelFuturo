/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Negocio.Estudiante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author codefutura
 */
public class DbEstudiante {
    
   ///////////////// 
   public int setInsertarEstudiante(Estudiante e){
     String consulta = "INSERT INTO tbl_estudiante (nombre,direccion,telefono,fecha_nacimiento,email,id_padre,id_madre)"
                + " VALUES (?,?,?,?,?,?,?)";
        PreparedStatement pt;
        ConectarBd con = new ConectarBd();
        int insertada=0;
        try {
            pt = con.getConexion().prepareStatement(consulta);  
            pt.setString(1,e.getNombre());
            pt.setString(2, e.getDireccion());
            pt.setString(3, e.getTelefono());
            pt.setDate(4, new java.sql.Date(e.getFechaNacimiento().getTime()));
            pt.setString(5, e.getEmail());
            pt.setInt(6, e.getIdPadre());
            pt.setInt(7, e.getIdMadre());
            insertada=pt.executeUpdate();
            pt.close();
           
        } catch (SQLException a) {
            
        } finally{
            con.setCerrar();
            con=null;
        } 
        return  insertada;
   }
   
 ///////////////////  
   public int setModificaEstudiante(Estudiante e,Integer codigo) {
        String consulta = "UPDATE tbl_estudiante Set nombre=?,direccion=?,telefono=?,fecha_vencimiento=?,email=? Where id_estudiante=?;";
        PreparedStatement pt;
        int gdExito=0 ;
        ConectarBd con = new ConectarBd();
        try {
            pt = con.getConexion().prepareStatement(consulta);
            pt.setString(1, e.getNombre());
            pt.setString(2, e.getDireccion());
            pt.setString(3, e.getTelefono());
            pt.setDate(4, new java.sql.Date(e.getFechaNacimiento().getTime()));
            pt.setString(5,e.getEmail());
            pt.setInt(6, codigo);
            gdExito= pt.executeUpdate();
            pt.close();
           
        } catch (SQLException b) {
           JOptionPane.showMessageDialog(null,b.getMessage());
        }finally{
            con.setCerrar();
            con=null;
        }  
        return gdExito;
    } 
    
   ////////// Utlizar para cargar los datos en rejilla //////////
    public static ArrayList buscarEstudiantePorNombre(String buscar){
        ConectarBd con= new ConectarBd();
        ResultSet resultado;
        String Query="Select * from tbl_estudiante where nombre LIKE '%"+buscar+"%'; ";
        resultado=con.getQuery(Query);
        ArrayList<Object> listaData=new ArrayList<>();    
        try {
            while(resultado.next()){
               listaData.add(new Object[]{resultado.getInt("id_estudiante"),resultado.getString("nombre")+" "+resultado.getString("direccion")
             ,resultado.getString("telefono")}); 
            }
            resultado.close();
        
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getErrorCode());
        }finally{
            con.setCerrar();
            con=null;
        } 
        return listaData;
    }
    
    /////////////////
     public static void setEliminaEstudiante(Integer codigo){
        ConectarBd con= new ConectarBd();
        String Query="DELETE FROM tbl_estudiante WHERE id_estudiante='"+codigo+"';";
        con.setQuery(Query);
        con.setCerrar();
    }
    
}
