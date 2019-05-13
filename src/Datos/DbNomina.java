/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;
import Negocio.Nomina;
import Negocio.DetalleNomina;
import Negocio.Deducion;
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
public class DbNomina {
    
    public int setInsertarNomina(Nomina miNomina, ArrayList<DetalleNomina> listaDetallesNomina) throws SQLException
    {
        String consultaNomina = "INSERT INTO  tbl_nomina (fecha, descripcion, total_deducion,total, activa) VALUES (?,?,?,?,1)";
        String consultaDetallesNomina = "INSERT INTO  tbl_detalle_nomina (id_nomina, id_empleado, deduciones, sueldo_neto)" 
                +  " VALUES (?,?,?,?)";
        int insertadas = 0;
        ConectarBd con =  new ConectarBd();
        PreparedStatement ptNomnina ;
        PreparedStatement ptDetalles;

        try {
            con.getConexion().setAutoCommit(false);
            ptNomnina  = con.getConexion().prepareStatement(consultaNomina,java.sql.Statement.RETURN_GENERATED_KEYS);
            ptNomnina.setDate(1, new java.sql.Date(miNomina.getFecha().getTime()));
            ptNomnina.setString(2, miNomina.getDescripcion());
            ptNomnina.setFloat(3, miNomina.getTotal_deducion());
            ptNomnina.setFloat(4, miNomina.getTotal());
            if((insertadas = ptNomnina.executeUpdate()) > 0){
                try(ResultSet ids = ptNomnina.getGeneratedKeys()){
                    if(ids.next()){
                        miNomina.setId_nomina(ids.getInt(1));
                    }
                }
            }
            
            for(DetalleNomina detalle : listaDetallesNomina)
            {
                ptDetalles  = con.getConexion().prepareStatement(consultaDetallesNomina);
                detalle.setId_nomina(miNomina.getId_nomina());
                ptDetalles.setInt(1, detalle.getId_nomina());
                ptDetalles.setInt(2, detalle.getId_empleado());
                ptDetalles.setFloat(3, detalle.getDeduciones());
                ptDetalles.setFloat(4, detalle.getSueldo_neto());
                
                ptDetalles.executeUpdate();
                
            }
            
            con.getConexion().commit();
                    
        } catch (SQLException ex) {
            con.getConexion().rollback();
            Logger.getLogger(DbNomina.class.getName()).log(Level.SEVERE, null, ex);

        }
        finally{
            con.setCerrar();
            con=null;
        }
        return insertadas;
    }
    
    public int setModificarNomina(Nomina miNomina){
        String consulta = "UPDATE tbl_nomina SET descripcion = ?, fechac = ?, deducion_total = ?, total = ? WHERE id_nomina = "
                 + miNomina.getId_nomina() +" ;";
        int insertadas = 0;
        ConectarBd con =  new ConectarBd();
        PreparedStatement pt;
        try{
            pt  = con.getConexion().prepareStatement(consulta);
            pt.setDate(1, new java.sql.Date(miNomina.getFecha().getTime()));
            pt.setString(2, miNomina.getDescripcion());
            pt.setFloat(3, miNomina.getTotal_deducion());
            pt.setFloat(4, miNomina.getTotal());
            insertadas = pt.executeUpdate();
        }
        catch (SQLException ex){
            Logger.getLogger(DbNomina.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
        
            con.setCerrar();
            con=null;
        }
        
        return insertadas;
        
    }
    public ArrayList buscarNomina(String buscar)
    {
        ConectarBd con= new ConectarBd();
        ResultSet resultado;
        String Query="Select * from tbl_nomina where descripcion LIKE '%"+buscar+"%' WHERE activo = 1; ";
        resultado=con.getQuery(Query);
        ArrayList<Object> listaData=new ArrayList<>();    
        try {
            while(resultado.next()){
               listaData.add(new Object[]{resultado.getInt("id_nomina"),resultado.getString("decripcion"),
                   resultado.getDate("fecha"),resultado.getFloat("deducion_total"),resultado.getFloat("total")}); 
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
    
    public int setEliminaNomina(int codigo){
        String consulta = "UPDATE tbl_nomina SET activa = 0 WHERE id_nomina = "
                 + codigo +" ;";
        int insertadas = 0;
        ConectarBd con =  new ConectarBd();
        PreparedStatement pt;
        try{
            pt  = con.getConexion().prepareStatement(consulta);
            insertadas = pt.executeUpdate();
        }
        catch (SQLException ex){
            Logger.getLogger(DbNomina.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
        
            con.setCerrar();
            con=null;
        }
        
        return insertadas;
    }
    
     public void mostrarNomina(Integer idNomina,Nomina miNomina) {
        String queryNomina="SELECT descripcion, fecha, total_desducion, total FROM tbl_nomina WHERE id_nomina = "+ idNomina;
        String queryDetallesNomina="SELECT id_empleado, deduciones, sueldo_neto FROM tbl_detalle-nomina WHERE id_nomina = "+ idNomina;
        
        ConectarBd con = new ConectarBd();
       
        ResultSet rsNomina;        
        ResultSet rsDetallesNomina;
        rsNomina=(ResultSet)con.getQuery(queryNomina);        
        rsDetallesNomina=(ResultSet)con.getQuery(queryDetallesNomina);
        
        
        
        try {
           while(rsNomina.next())
           {
               miNomina.setId_nomina(idNomina);
               miNomina.setDescripcion(rsNomina.getString("descripcion"));
               miNomina.setFecha(rsNomina.getDate("fecha"));
               miNomina.setTotal_deducion(rsNomina.getFloat("total_deducion"));
               miNomina.setTotal(rsNomina.getFloat("total"));
           } 
           rsNomina.close();
           while(rsDetallesNomina.next())
           {
               miNomina.detallesNomina.add(new DetalleNomina(idNomina,rsDetallesNomina.getInt("ïd_empleado"),
                                                             rsDetallesNomina.getFloat("deduciones"),rsDetallesNomina.getFloat("sueldo_neto")));
           } 
           rsDetallesNomina.close();
           con.setCerrar();
        }
        catch (SQLException ex) {
           Logger.getLogger(DbNomina.class.getName()).log(Level.SEVERE, null, ex);
         }     
    }
}