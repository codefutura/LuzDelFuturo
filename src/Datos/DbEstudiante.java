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
import java.util.logging.Level;
import java.util.logging.Logger;
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
          
            if(e.getFechaNacimiento()!=null)
                pt.setDate(5, new java.sql.Date(e.getFechaNacimiento().getTime()));
            else
                pt.setDate(5, null);
          
            pt.setString(5, e.getEmail());
            
            if(e.getIdPadre()>0)
               pt.setInt(6, e.getIdPadre());
            else
               pt.setString(6, null);
             
            if(e.getIdMadre()>0)
               pt.setInt(7,e.getIdMadre());
            else
               pt.setString(7, null);
    
            insertada=pt.executeUpdate();
            pt.close();
           
        } catch (SQLException a) {
            JOptionPane.showMessageDialog(null,a.getMessage());
        } finally{
            con.setCerrar();
            con=null;
        } 
        return  insertada;
   }
   
 ///////////////////  
   public int setModificaEstudiante(Estudiante e,Integer codigo) {
        String consulta = "UPDATE tbl_estudiante Set nombre=?,direccion=?,telefono=?,fecha_nacimiento=?,email=?,id_padre=?,id_madre=? Where id_estudiante=?;";
        PreparedStatement pt;
        int gdExito=0 ;
        ConectarBd con = new ConectarBd();
        try {
            pt = con.getConexion().prepareStatement(consulta);
            pt.setString(1, e.getNombre());
            pt.setString(2, e.getDireccion());
            pt.setString(3, e.getTelefono());
           
            if(e.getFechaNacimiento()!=null)
                pt.setDate(4, new java.sql.Date(e.getFechaNacimiento().getTime()));
            else
                pt.setDate(4, null);
            
            pt.setString(5, e.getEmail());
            
            if(e.getIdPadre()>0)
               pt.setInt(6, e.getIdPadre());
            else
               pt.setString(6, null);
             
            if(e.getIdMadre()>0)
               pt.setInt(7,e.getIdMadre());
            else
               pt.setString(7, null);
            pt.setInt(8, codigo);
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
     
     
    public void mostrarEstudiante(Integer idEstudiante,Estudiante e) {
        String query="SELECT e.nombre,e.direccion,e.telefono,e.id_padre,e.id_madre,e.fecha_nacimiento,e.email,e.id_estudiante, p.nombre as nombrePadre,m.nombre as nombreMadre FROM tbl_estudiante e \n" +
" left join tbl_padres p on p.id_padre=e.id_padre  left join tbl_padres m on m.id_padre=e.id_madre where e.id_estudiante="+idEstudiante;
        ConectarBd con = new ConectarBd();
        ResultSet rs;
        rs=(ResultSet) con.getQuery(query);
        try {
           while(rs.next())
           {
               e.setId(rs.getInt("id_estudiante"));
               e.setNombre(rs.getString("nombre"));
               e.setDireccion(rs.getString("direccion"));
               e.setEmail(rs.getString("email"));
               e.setTelefono(rs.getString("telefono"));
               e.setFechaNacimiento(rs.getDate("fecha_nacimiento"));
               e.setIdPadre(rs.getInt("id_padre"));
               e.setIdMadre(rs.getInt("id_Madre"));   
               e.setNombreMadre(rs.getString("nombreMadre"));
               e.setNombrePadre(rs.getString("nombrePadre"));
           } 
           rs.close();
           con.setCerrar();
        }
        catch (SQLException ex) {
           Logger.getLogger(DbEstudiante.class.getName()).log(Level.SEVERE, null, ex);
         }     
    }
}
