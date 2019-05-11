/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Negocio.Padres;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author codefutura
 */
public class DbPadres {
    
   ///////////////// 
   public int setInsertarEstudiante(Padres p){
     String consulta = "INSERT INTO tbl_padres(nombre,direccion,telefono,fecha_nacimiento,email,cedula,titular_pago)"
                + " VALUES (?,?,?,?,?,?,?)";
        PreparedStatement pt;
        ConectarBd con = new ConectarBd();
        int insertada=0;
        try {
            pt = con.getConexion().prepareStatement(consulta);  
            pt.setString(1,p.getNombre());
            pt.setString(2, p.getDireccion());
            pt.setString(3, p.getTelefono());
            pt.setDate(4, new java.sql.Date(p.getFechaNacimiento().getTime()));
            pt.setString(5, p.getEmail());
            pt.setString(6, p.getCedula());
            pt.setBoolean(7, p.isTitularPago());
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
   public int setModificaPadres(Padres p,Integer codigo) {
        String consulta = "UPDATE tbl_padres Set nombre=?,direccion=?,telefono=?,fecha_vencimiento=?,email=?,cedula=?,titular_pago=? Where id_estudiante=?;";
        PreparedStatement pt;
        int gdExito=0 ;
        ConectarBd con = new ConectarBd();
        try {
            pt = con.getConexion().prepareStatement(consulta);
            pt.setString(1, p.getNombre());
            pt.setString(2, p.getDireccion());
            pt.setString(3, p.getTelefono());
            pt.setDate(4, new java.sql.Date(p.getFechaNacimiento().getTime()));
            pt.setString(5,p.getEmail());
            pt.setString(6,p.getCedula());
            pt.setBoolean(7,p.isTitularPago());
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
        String Query="Select * from tbl_padres where nombre LIKE '%"+buscar+"%'; ";
        resultado=con.getQuery(Query);
        ArrayList<Object> listaData=new ArrayList<>();    
        try {
            while(resultado.next()){
               listaData.add(new Object[]{resultado.getInt("id_padre"),resultado.getString("nombre")+" "+resultado.getString("cedula")
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
     public static void setEliminaPadre(Integer codigo){
        ConectarBd con= new ConectarBd();
        String Query="DELETE FROM tbl_padre WHERE id_padre='"+codigo+"';";
        con.setQuery(Query);
        con.setCerrar();
    }
    
}