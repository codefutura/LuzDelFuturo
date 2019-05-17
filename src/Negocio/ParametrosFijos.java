/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;


/**
 *
 * @author codefutura
 */
public class ParametrosFijos {
 
   private static Integer idUsuario=0;
   private static String nombreUsuario=null;
   private static Integer autorizacion=0;

    public static Integer getIdUsuario() {
        return idUsuario;
    }

    public static void setIdUsuario(Integer aIdUsuario) {
        idUsuario = aIdUsuario;
    }

    public static String getNombreUsuario() {
        return nombreUsuario;
    }

    public static void setNombreUsuario(String aNombreUsuario) {
        nombreUsuario = aNombreUsuario;
    }

    public static Integer getAutorizacion() {
        return autorizacion;
    }

    public static void setAutorizacion(Integer aAutorizacion) {
        autorizacion = aAutorizacion;
    }
   

    
}
