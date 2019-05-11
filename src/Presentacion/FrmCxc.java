package Presentacion;

import Datos.DbCxc;
import Negocio.Cxc;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author codefutura
 */
public class FrmCxc extends javax.swing.JDialog {

    private boolean aceptada;
    Integer codigoCxc;
    Cxc c = new Cxc();
    DbCxc dbCP = new DbCxc();

    /**
     * Creates new form FrmCxp
     *
     * @param parent
     * @param modal
     * @param codigo
     */
    public FrmCxc(java.awt.Frame parent, boolean modal, Integer codigo) {
        super(parent, modal);
        initComponents();
        this.codigoCxc = codigo;
        tImporte.setValue(0);
        tPago.setValue(0);
        tBalance.setValue(0);

        tBalance.setVisible(false);
        tPago.setVisible(false);
        lbBalance.setVisible(false);
        lbPagado.setVisible(false);
        tFecha.setDate(new Date());
        tFechaVence.setDate(new Date());
    }

    private int validarInteger(JFormattedTextField f) {
        int valor = 0;
        try {
            valor = Integer.parseInt(String.valueOf(f.getValue()));
        } catch (NumberFormatException e) {
        }

        return valor;
    }

    private double validarDouble(JFormattedTextField f) {
        double valor = 0;
        try {
            valor = Double.parseDouble(String.valueOf(f.getValue()));
        } catch (NumberFormatException e) {
        }

        return valor;
    }

    private int validarIntegerTexto(JFormattedTextField f) {
        int valor = 0;
        try {
            valor = Integer.parseInt(String.valueOf(f.getText()));
        } catch (NumberFormatException e) {
        }

        return valor;
    }

    public boolean isAceptada() {
        return aceptada;
    }

    public void setAceptada(boolean aceptada) {
        this.aceptada = aceptada;
    }

    private void setCxc() {
        c.setCodigoPadres(validarInteger(tCodigoPadre));
        c.setNombrePadre(tNombrePadre.getText());
        c.setImporte(validarDouble(tImporte));
        c.setConcepto(tConcepto.getText());
        c.setFechaAlta(tFecha.getDate());
        c.setFechaVence(tFechaVence.getDate());

    }

    private void altaCxc() {
        dbCP.crearCuentaCobrar(c);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        tCodigoPadre = new javax.swing.JFormattedTextField();
        tNombrePadre = new javax.swing.JTextField();
        tFecha = new com.toedter.calendar.JDateChooser();
        tFechaVence = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tConcepto = new javax.swing.JTextArea();
        tImporte = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        tNumero = new javax.swing.JFormattedTextField();
        tPago = new javax.swing.JFormattedTextField();
        lbPagado = new javax.swing.JLabel();
        tBalance = new javax.swing.JFormattedTextField();
        lbBalance = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cuenta x Cobrar");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("Número");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Deudor");
        jLabel2.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Fecha");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Vence");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("Concepto");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Importe $");

        btnAceptar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        tCodigoPadre.setEditable(false);
        tCodigoPadre.setBackground(new java.awt.Color(255, 255, 204));
        tCodigoPadre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        tCodigoPadre.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        tCodigoPadre.setFocusable(false);
        tCodigoPadre.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tCodigoPadre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tCodigoPadreFocusLost(evt);
            }
        });
        tCodigoPadre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tCodigoPadreKeyReleased(evt);
            }
        });

        tNombrePadre.setEditable(false);
        tNombrePadre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tNombrePadre.setForeground(new java.awt.Color(0, 51, 255));

        tFecha.setForeground(new java.awt.Color(0, 51, 255));
        tFecha.setDateFormatString("dd-MM-yyyy");
        tFecha.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        tFechaVence.setForeground(new java.awt.Color(0, 51, 255));
        tFechaVence.setDateFormatString("dd-MM-yyyy");
        tFechaVence.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        tConcepto.setBackground(new java.awt.Color(184, 236, 199));
        tConcepto.setColumns(20);
        tConcepto.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        tConcepto.setForeground(new java.awt.Color(0, 51, 255));
        tConcepto.setRows(5);
        jScrollPane1.setViewportView(tConcepto);

        tImporte.setBackground(new java.awt.Color(255, 204, 204));
        tImporte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        tImporte.setForeground(new java.awt.Color(0, 51, 255));
        tImporte.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        tImporte.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/binoculars.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tNumero.setEditable(false);
        tNumero.setForeground(new java.awt.Color(255, 0, 0));
        tNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        tNumero.setFocusable(false);
        tNumero.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        tPago.setEditable(false);
        tPago.setForeground(new java.awt.Color(0, 102, 51));
        tPago.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        tPago.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tPago.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        lbPagado.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbPagado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbPagado.setText("Pagado $");

        tBalance.setEditable(false);
        tBalance.setForeground(new java.awt.Color(255, 0, 0));
        tBalance.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        tBalance.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tBalance.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        lbBalance.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbBalance.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbBalance.setText("Balance $");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPagado, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(tPago, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(tBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tCodigoPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tNumero, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tFechaVence, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tNombrePadre, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tCodigoPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tNombrePadre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tFechaVence, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbBalance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tBalance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tPago, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbPagado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (tNombrePadre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Error, seleccione el duedor");
            tCodigoPadre.requestFocus();
            return;
        }
        if (tFecha.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Error, Favor ingresar la fecha");
            return;
        }
        if (tFechaVence.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Error, ingresa la fecha de vencimiento");
            return;
        }

        if (tConcepto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Escriba el concepto");
            tConcepto.requestFocus();
            return;
        }

        if (validarDouble(tImporte) == 0) {
            JOptionPane.showMessageDialog(this, "Error, ingreser el importe");
            tImporte.requestFocus();
            return;
        }

        setCxc();
        if (this.codigoCxc > 0) {
            dbCP.modificarCuentaCobrar(c, this.codigoCxc);
        } else {
            //Alta de la cxc
            altaCxc();
        }

        this.aceptada = true;
        setVisible(false);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        FrmBuscarPadres bp = new FrmBuscarPadres(this, true,true);
        bp.setLocationRelativeTo(null);
        bp.setVisible(true);

        if (bp.getIdSeleccion() > 0) {
            tCodigoPadre.setValue(bp.getIdSeleccion());
            tNombrePadre.setText(bp.getNombre());
        }

        bp.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tCodigoPadreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tCodigoPadreKeyReleased
        /*
        String[] datos = DbPaciente.buscarPorCodigo(tCodigoProveedor.getText());
        if (datos.length > 0) {
            tNombreProveedor.setText(datos[1]);

        } else {
            tNombreProveedor.setText("");
        }
        datos = null;
         */

    }//GEN-LAST:event_tCodigoPadreKeyReleased

    private void tCodigoPadreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tCodigoPadreFocusLost

        if (tNombrePadre.getText().equals(""))
            tCodigoPadre.setValue(0);
    }//GEN-LAST:event_tCodigoPadreFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbBalance;
    private javax.swing.JLabel lbPagado;
    private javax.swing.JFormattedTextField tBalance;
    private javax.swing.JFormattedTextField tCodigoPadre;
    private javax.swing.JTextArea tConcepto;
    private com.toedter.calendar.JDateChooser tFecha;
    private com.toedter.calendar.JDateChooser tFechaVence;
    private javax.swing.JFormattedTextField tImporte;
    private javax.swing.JTextField tNombrePadre;
    private javax.swing.JFormattedTextField tNumero;
    private javax.swing.JFormattedTextField tPago;
    // End of variables declaration//GEN-END:variables

    public void mostrarCxp(Integer codigoCxc) {
        //Buscar la cuenta
        dbCP.CxcPorCodigo(codigoCxc, c, this);

        tCodigoPadre.setValue(c.getCodigoPadres());
        tNombrePadre.setText(c.getNombrePadre());
        tImporte.setValue(c.getImporte());
        tConcepto.setText(c.getConcepto());
        tFecha.setDate(c.getFechaAlta());
        tFechaVence.setDate(c.getFechaVence());
        tNumero.setValue(c.getCodigoCxc());
        tBalance.setValue(c.getBalance());
        tPago.setValue(c.getImportePagado());

        tBalance.setVisible(true);
        tPago.setVisible(true);
        lbBalance.setVisible(true);
        lbPagado.setVisible(true);

    }
}
