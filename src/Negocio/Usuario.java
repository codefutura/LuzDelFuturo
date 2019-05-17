
package Negocio;

/**
 *
 * @author codefutura
 */
public class Usuario {
    private String nombre;
    private String clave;
    private Integer idUsuario;
    private int tipoUsuario;
  

    public Usuario(String nombre, String clave,int id_odontologo) {
        this.nombre = nombre;
        this.clave = clave;
        
    }

    public Usuario() {
        this.nombre =null;
        this.clave =null;

    }


    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(int tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    
    
    
}
