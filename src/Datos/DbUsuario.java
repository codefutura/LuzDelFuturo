
package Datos;

import Negocio.Usuario;
import java.awt.Component;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author codefutura
 */
public class DbUsuario {

   Connection conex=null;
    
    public static int getCodigoUsuario(String clave,String nombre,Component parental){
       int codigo=0;
        ConectarBd con = new ConectarBd();
        String query = ((new StringBuilder()))
                .append("Select * from tbl_usuario where clave='")
                .append(clave).append("'and nombre='" )
                .append(nombre).append( "';").toString();
        try {
            ResultSet resultado ;
            resultado=con.getQuery(query);
            while (resultado.next()) {
                
               codigo=resultado.getInt("id_usuario");
            }
            resultado.close();
            con.setCerrar();
        } catch (SQLException ex) {
            JOptionPane.showConfirmDialog(parental, ex.getMessage());
        }
     return codigo;
    }
    
   
    
     public static boolean getIdUsuario(String clave,String nombre) {
      // String[] codigo=new String[6];
        boolean encontrado=false;
        String query = ((new StringBuilder()))
                .append("Select id_usuario,nombre,clave,tipo from tbl_usuario "
                        + "where clave=AES_ENCRYPT('")
                .append(clave).append("','llave') and tbl_usuario.nombre='" )
                .append(nombre).append( "';").toString();
        ConectarBd con = new ConectarBd();
        try {
            ResultSet resultado ;
            resultado=con.getQuery(query);  
            while (resultado.next()) { 
                encontrado=true;
                break;
            }
            resultado.close();
        } catch (SQLException ex) {
           
        }finally{  
           con.setCerrar();
           con=null;
        }    
     return encontrado;
    }
        
    public void crearUsuario(Usuario c) {
        ConectarBd con = new ConectarBd();
        String consulta;
        if(c.getTipoUsuario()==2)
             consulta="INSERT INTO tbl_usuario (nombre, clave,tipo) VALUES ( ?,?,?);";
        else
             consulta="INSERT INTO tbl_usuario (nombre, clave,tipo) VALUES ( ?,AES_ENCRYPT(?,'llave'),?);";
        
        PreparedStatement ps;
        try {
            ps=con.getConexion().prepareStatement(consulta);
            ps.setString(1,c.getNombre());
            ps.setString(2, c.getClave());
             ps.setInt(3, c.getTipoUsuario());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, ex.getMessage());
        }finally{
            con.setCerrar();
        }   
    }   
    
 
  
    public void modificarUsuario(Usuario c,Integer idUsuario) {
        ConectarBd con = new ConectarBd();
        String consulta=null;
        
        if(c.getTipoUsuario()==2)
            consulta="UPDATE tbl_usuario SET nombre=?,clave=?,tipo=? WHERE id_usuario=?;";
        else
            consulta="UPDATE tbl_usuario SET nombre=?, clave=AES_ENCRYPT(?,'llave'),tipo=? WHERE id_usuario=?;";
        
        PreparedStatement ps;
        try {
            ps=con.getConexion().prepareStatement(consulta);
            ps.setString(1,c.getNombre());
            ps.setString(2, c.getClave());
            ps.setInt(3, c.getTipoUsuario());     
            ps.setInt(4, idUsuario);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }finally{
            con.setCerrar();
        }
    }  
    
    
    public static void eliminarUsuario(Integer idUsuario) {
        ConectarBd con = new ConectarBd();
        String consulta="DELETE FROM tbl_usuario WHERE id_usuario='"+idUsuario+"';";
        try {
            con.setQuery(consulta);
            con.setCerrar();  
        } catch (HeadlessException e) {
        }
        
     }   
  
    public  void usuarioPorCodigo(Integer codigoUser,Usuario c){
        ConectarBd con= new ConectarBd();
        ResultSet rs;
        String Query="SELECT id_usuario, nombre,clave as pass, AES_DECRYPT(clave,'llave') as clave, tipo FROM tbl_usuario"
                + " Where id_usuario='"+codigoUser+"';";
        rs=con.getQuery(Query);
        try {
            while(rs.next()){
                c.setIdUsuario(codigoUser);
                c.setNombre(rs.getString("nombre"));
                if(rs.getInt("tipo")==2)
                    c.setClave(rs.getString("pass"));
                else
                    c.setClave(rs.getString("clave"));
                
                c.setTipoUsuario(rs.getInt("tipo"));
            }
            rs.close();
              
        } catch (SQLException e) { 
             JOptionPane.showMessageDialog(null, e.getMessage());
        }finally{
           con.setCerrar();  
        }
    }
    
    public static void buscarPorNombre(DefaultTableModel tabla,String buscar,Component parental){
        ConectarBd con= new ConectarBd();
        ResultSet resultado;
        String Query="Select id_usuario,nombre,AES_DECRYPT(clave,'llave') as clave from tbl_usuario Where nombre LIKE '%"+buscar+"%';";
        resultado=con.getQuery(Query);
        try {
            while(resultado.next()){
                tabla.addRow(new Object[]{resultado.getLong("id_usuario"),resultado.getString("nombre")}); 
            }
            resultado.close();
            con.setCerrar();   
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(parental, e.getMessage());
        }
    }
      public static int nUusuario(){
        ConectarBd con= new ConectarBd();
        ResultSet resultado;
        String Query="Select count(*) as cantidad from tbl_usuario;";
        resultado=con.getQuery(Query);
        int n = 0;
        try {
            while(resultado.next()){
               n=resultado.getInt("cantidad");
            }
            resultado.close();
            con.setCerrar();   
        } catch (SQLException e) {
          
        }
        return n;
    }
}
