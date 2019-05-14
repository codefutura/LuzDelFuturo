package Negocio;

import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author codefutura
 */
public class Recibo {
    private Integer codigoPadre, numero;
    private Date fechaHoy;
    private String nombrePadre;
    private Double total, dto, importeDto, importe;
    private String concepto;
    
    private int idEstudiante;
    private int idCxc;
    private String numeroRecibo;
    private int idRecibo;
            
    DefaultTableModel tbl;


    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public Integer getCodigoPadre() {
        return codigoPadre;
    }

    public void setCodigoPadre(Integer codigoPadre) {
        this.codigoPadre = codigoPadre;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Date getFechaHoy() {
        return fechaHoy;
    }

    public void setFechaHoy(Date fechaHoy) {
        this.fechaHoy = fechaHoy;
    }

    public String getNombrePadres() {
        return nombrePadre;
    }

    public void setNombrePadre(String nombrePadre) {
        this.nombrePadre = nombrePadre;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double getDto() {
        return dto;
    }

    public void setDto(Double dto) {
        this.dto = dto;
    }

    public Double getImporteDto() {
        return importeDto;
    }

    public void setImporteDto(Double importeDto) {
        this.importeDto = importeDto;
    }

    public DefaultTableModel getTbl() {
        return tbl;
    }

    public void setTbl(DefaultTableModel tbl) {
        this.tbl = tbl;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getIdCxc() {
        return idCxc;
    }

    public void setIdCxc(int idCxc) {
        this.idCxc = idCxc;
    }

    public String getNumeroRecibo() {
        return numeroRecibo;
    }

    public void setNumeroRecibo(String numeroRecibo) {
        this.numeroRecibo = numeroRecibo;
    }

    public int getIdRecibo() {
        return idRecibo;
    }

    public void setIdRecibo(int idRecibo) {
        this.idRecibo = idRecibo;
    }
    
    

}
