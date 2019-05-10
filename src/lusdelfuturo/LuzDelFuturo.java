/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lusdelfuturo;

import Datos.ConectarBd;
import Presentacion.FrmConexionDB;
import Presentacion.FrmLogin;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author codefutura
 */
public class LuzDelFuturo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            cargarConfiguracion();
        } catch (IOException ex) {
            Logger.getLogger(LuzDelFuturo.class.getName()).log(Level.SEVERE, null, ex);
        }
            apariencia();
            FrmLogin login = new FrmLogin();
            login.setLocationRelativeTo(null);
            login.setVisible(true);
            
    }
    

      
     private static void cargarConfiguracion() throws FileNotFoundException, IOException{
      File archivo;
      archivo= new File("database.properties");      
      if(archivo.exists()==false){
           FrmConexionDB dbc = new FrmConexionDB(null,true);
            dbc.setLocationRelativeTo(null);
            dbc.setVisible(true);
            dbc=null;
        }else{
          try {
              Properties pro;
              String clav;
              pro = new Properties(); 
              pro.load(new FileReader("database.properties"));
              clav=pro.getProperty("db.clave");
              
              ConectarBd.asignarParametrosCon(pro.getProperty("db.ip"), pro.getProperty("db.database"), pro.getProperty("db.puerto"), pro.getProperty("db.usuario"), clav);
              pro=null;
          } catch (Exception ex) {
              Logger.getLogger(LuzDelFuturo.class.getName()).log(Level.SEVERE, null, ex);
          }
      }  
     
    }
     
     
    private static void apariencia(){
       Locale l ;
       l = new Locale("en","US");
       Locale.setDefault(l);
       try{
           UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        }
        catch(ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e){
            JOptionPane.showMessageDialog(null, "ERROR, en tratar de aplicar apariencias de ventana");
        }
    } 

    
}
