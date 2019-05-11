/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import Negocio.Curso;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author delvy
 */
public class DbCurso {
 
   public int setInsertarCurso(Curso c){
       String consulta = "INSERT INTO tblCurso (id_curso, aula, tanda) VALUES (?,?)";
       PreparedStatement pt ;
       ConectarBd con = new ConectarBd();
       int insertada  = 0;
       try{
           pt = con.getConexion().prepareStatement(consulta);
           pt.setString(2, c.getAula());           
           pt.setString(3, c.getTanda());
           
           insertada = pt.executeUpdate();
           pt.close();
       }catch (SQLException a){
           
            JOptionPane.showMessageDialog(null,a.getMessage());
       }
       finally{
           con.setCerrar();
           con=null;

       }
       return insertada;
   }
   
     public int setModificaCurso(Curso c, Integer codigo){
       String consulta = "UPDATE tblCurso SET aula = ?, tanda=? WHERE id_curso = "+ codigo +";";
       PreparedStatement pt ;
       ConectarBd con = new ConectarBd();
       int insertada  = 0;
       try{
           pt = con.getConexion().prepareStatement(consulta);
           pt.setString(2, c.getAula());           
           pt.setString(3, c.getTanda());
           
           insertada = pt.executeUpdate();
           pt.close();
       }catch (SQLException a){
           
            JOptionPane.showMessageDialog(null,a.getMessage());
       }
       finally{
           con.setCerrar();
           con=null;

       }
       return insertada;
   }
     
   ////////// Utlizar para cargar los datos en rejilla //////////
    public static ArrayList buscarCursoPorNombre(String buscar){
        ConectarBd con= new ConectarBd();
        ResultSet resultado;
        String Query="Select * from tbl_curso where aula LIKE '%"+buscar+"% OR tanda LIKE '%"+buscar+"%';'; ";
        resultado=con.getQuery(Query);
        ArrayList<Object> listaData=new ArrayList<>();    
        try {
            while(resultado.next()){
               listaData.add(new Object[]{resultado.getInt("id_curso"),resultado.getString("aula"),resultado.getString("tanda")}); 
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
     public static void setEliminaCurso(Integer codigo){
        ConectarBd con= new ConectarBd();
        String Query="DELETE FROM tbl_curso WHERE id_curso ="+codigo+";";
        con.setQuery(Query);
        con.setCerrar();
    }
     
     
    public void mostrarCurso(Integer idCurso,Curso c) {
        String query="SELECT aula,tanda,id_curso FROM tbl_estudiante WHERE id_curso = " + idCurso + ";";
        ConectarBd con = new ConectarBd();
        ResultSet rs;
        rs=(ResultSet) con.getQuery(query);
        try {
           while(rs.next())
           {
               c.setId_curso(rs.getInt("id_curso"));
               c.setAula(rs.getString("aula"));
               c.setTanda(rs.getString("tanda"));
           } 
           rs.close();
           con.setCerrar();
        }
        catch (SQLException ex) {
           Logger.getLogger(DbEstudiante.class.getName()).log(Level.SEVERE, null, ex);
         }     
    }
}
