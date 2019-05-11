/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;

/**
 *
 * @author codefutura
 */
public class FormatoFecha {
    
   //Devuelve la fecha formateada en una cadena
    public static String getFechaFormato(Date fch){
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        String fecha=null;
        if(fch!=null)
            fecha=formateador.format(fch);
        return fecha;
    }
    
     public static String getFechaFormatoConBarras(Date fch){
        SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
        String fecha=null;
        if(fch!=null)
            fecha=formateador.format(fch);
        return fecha;
    }
    
    public static Date getStringToFecha(String fch){
         SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy",Locale.ENGLISH);
         Date valor=null;
         
         if(fch.equals("null")){
             return null;
         }
           try { 
                valor=formateador.parse(fch);
            } catch (ParseException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        
        return valor;
    }
    
    public static Date getValidaCampoFecha(JDateChooser dt){
        Date valor=null;
        if(dt.getDate()!=null){
            SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd",Locale.ENGLISH);
            String fech=formateador.format(dt.getDate());

            try {
                valor=formateador.parse(fech);
            } catch (ParseException e) {
            }      
         }
        return valor;
    }

    public static String getParaGuardarFecha(JDateChooser dt){
        String fech="";
        if(dt.getDate()!=null){
            SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-dd",Locale.ENGLISH);
            fech=formateador.format(dt.getDate());
         }
        return ""+fech;
    }
}

