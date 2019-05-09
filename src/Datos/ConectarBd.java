
package Datos;

import java.sql.*;
import javax.swing.JOptionPane;
import Presentacion.FrmConexionDB;
import java.awt.Component;


public class ConectarBd{   
    protected static String database ;
    protected static String servidor ;
    protected static String puerto;
    protected static String usuario;
    protected static String clave;
    public Connection con=null;
    public long idreturn;

    
    public ConectarBd(){
        idreturn =0;
        try{
            Class.forName("org.mariadb.jdbc.Driver");
            con =(Connection)DriverManager.getConnection("jdbc:mariadb://"+servidor+":"+puerto+"/"+database, usuario, clave);
        }catch(ClassNotFoundException | SQLException ex){
                 FrmConexionDB zpcon = new FrmConexionDB(null,true);
                zpcon.setLocationRelativeTo(null);
                zpcon.setVisible(true);
                zpcon.dispose();
            con=null;
        }
    }
    
    
    
    
    public ConectarBd(int i){
        
    }
    
    
    
    public boolean probarConexion(String serv,String datab,String puert,String user,String cla,Component parental){
       Connection conec=null;
        try{
            int nu;
            nu=0;
         
            //MARIADB
            Class.forName("org.mariadb.jdbc.Driver");
            //mariadb
            conec =(Connection)DriverManager.getConnection("jdbc:mariadb://"+serv+":"+puert+"/"+datab, user, cla);
           return true;
        }
        catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(parental, "Error, al intentar conectar con la base de datos");
             
            return false;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(parental,"Error, al intentar conectar con la base de datos");
            
             conec=null;
             return false;
        }catch(Exception e){
            JOptionPane.showMessageDialog(parental,"Error, al intentar conectar con la base de datos");
              
             conec=null;
             return false;     
        }
       
        
    }
    
    
    public static void asignarParametrosCon(String serv,String datab,String puert,String user,String cla){
        servidor=serv;
        database=datab;
        puerto=puert;
        usuario=user;
        clave=cla;
    }
    
    
    public ResultSet getQuery(String _query){
        Statement state;
        ResultSet rset =null;
        try
        {
          state =(Statement) con.createStatement(); 
          rset=state.executeQuery(_query);
           
        }catch(SQLException ex){
          JOptionPane.showMessageDialog(null, "Error , en consulta a la base de datos -> "+ex.getMessage());} 
      return rset;
    }
    
    

    public void setQuery(String _query){
        try{
            Statement stat;
            stat= con.createStatement();
            stat.execute(_query);
            stat.close(); 
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void setQueryRetorno(String _query){
        try{
            Statement state = con.createStatement();
            state.execute(_query, 1);
            generarKey(state);
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void setQueryContador(String _query){
        try{
            Statement state = con.createStatement();
            state.execute(_query);
            generarKey(state);
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void setCerrar(){
        try{
            if(con.isClosed()==false){
                 con.close();
                 con=null;
            }
        }
        catch(SQLException e){
           
        }
    }

    public Connection getConexion(){
        return con;
    }

    public long getIdreturn(){
        return idreturn;
    }

    public void generarKey(Statement stm){
        this.idreturn = 0;
        try{
            ResultSet rs;
            rs=stm.getGeneratedKeys();
            if(rs.next())
                this.idreturn = rs.getLong(1);
            rs.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, (new StringBuilder()).append("ERROR, al retornar id de la ficha ").append(e.getMessage()).toString());
        }
    }
    
    protected ResultSet consultarDatos(Connection con, String sql) {
        ResultSet rs=null;
	try {
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery(sql);

            } catch (SQLException e) {
            }

        return rs;

    }

    public static String getDatabase() {
        return database;
    }

    

    public static String getUsuario() {
        return usuario;
    }

    
    public static String getClave() {
        return clave;
    }

   

    
}
