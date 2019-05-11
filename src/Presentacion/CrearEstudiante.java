
package Presentacion;

import Datos.DbEstudiante;
import Datos.DbPadres;
import Negocio.Estudiante;
import Negocio.Padres;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author alexa
 */
public class CrearEstudiante extends javax.swing.JDialog {

    /**
     * Creates new form CrearEstudiante
     * @param parent
     * @param modal
     */
    DbPadres dbP=new DbPadres();
    Padres p =new Padres();
    DbEstudiante dbe=new DbEstudiante();
    Estudiante e =new Estudiante();

   
    public CrearEstudiante(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbTituloAzul = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tNombre = new javax.swing.JTextField();
        tDireccion = new javax.swing.JTextField();
        tTelefono = new javax.swing.JTextField();
        tEmail = new javax.swing.JTextField();
        tPadre = new javax.swing.JTextField();
        tMadre = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnBuscaPadre = new javax.swing.JButton();
        btnBuscaMadre = new javax.swing.JButton();
        btnCrearPadre = new javax.swing.JButton();
        btnCrearMadre = new javax.swing.JButton();
        tNacimiento = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 153));

        lbTituloAzul.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbTituloAzul.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloAzul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloAzul.setText("Nuevo estudiante");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTituloAzul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTituloAzul)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel3.setText("Direccion");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setText("Telefono");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel5.setText("E-mail");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel6.setText("F. Nacimiento");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel7.setText("Padre");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel8.setText("Madre");

        tNombre.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tNombre.setForeground(new java.awt.Color(0, 51, 255));
        tNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        tDireccion.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tDireccion.setForeground(new java.awt.Color(0, 51, 255));
        tDireccion.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        tTelefono.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tTelefono.setForeground(new java.awt.Color(0, 51, 255));
        tTelefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        tEmail.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tEmail.setForeground(new java.awt.Color(0, 51, 255));
        tEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        tPadre.setEditable(false);
        tPadre.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tPadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tPadreActionPerformed(evt);
            }
        });

        tMadre.setEditable(false);
        tMadre.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        btnAceptar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnBuscaPadre.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnBuscaPadre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/binoculars.png"))); // NOI18N
        btnBuscaPadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaPadreActionPerformed(evt);
            }
        });

        btnBuscaMadre.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnBuscaMadre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/binoculars.png"))); // NOI18N
        btnBuscaMadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaMadreActionPerformed(evt);
            }
        });

        btnCrearPadre.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCrearPadre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/new25.png"))); // NOI18N
        btnCrearPadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPadreActionPerformed(evt);
            }
        });

        btnCrearMadre.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnCrearMadre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/new25.png"))); // NOI18N
        btnCrearMadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearMadreActionPerformed(evt);
            }
        });

        tNacimiento.setForeground(new java.awt.Color(0, 51, 255));
        tNacimiento.setDateFormatString("dd-mm-yyyy");
        tNacimiento.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                            .addComponent(tPadre)
                            .addComponent(tMadre)
                            .addComponent(tNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tNombre)
                            .addComponent(tDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                            .addComponent(tTelefono))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCrearMadre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscaMadre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCrearPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscaPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscaPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btnBuscaMadre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCrearPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tMadre)
                            .addComponent(btnCrearMadre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tPadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tPadreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tPadreActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
       
       //Asignar los datos del formulario a la clase Estudiante
       setEstudiante();
       
       if(tNombre.getText().isEmpty()) {
         JOptionPane.showMessageDialog(this,"Favor ingresar el nombre");
         return;
       }
        if(tDireccion.getText().isEmpty()) {
         JOptionPane.showMessageDialog(this,"Favor ingresar una direccion");
         return;
       }
       if(e.getId()>0){
        //Insertar en la base de datos el estudiante
        dbe.setModificaEstudiante(e,e.getId());
       }else{
        //Insertar en la base de datos el estudiante
        dbe.setInsertarEstudiante(e);  
       }
       
       
       this.dispose();
       
        
            
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCrearPadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPadreActionPerformed
       FrmPadres nuevoPadre=new FrmPadres(this,true);
       nuevoPadre.setLocationRelativeTo(this);
       nuevoPadre.cbSexo.setSelectedIndex(0);
       nuevoPadre.setVisible(true);
       if(nuevoPadre.getCodigoPadres()>0){
            e.setIdPadre((int) nuevoPadre.getCodigoPadres());
            tPadre.setText(nuevoPadre.tNombre.getText());
       }
       nuevoPadre.dispose();
       
    }//GEN-LAST:event_btnCrearPadreActionPerformed

    private void btnCrearMadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearMadreActionPerformed
      FrmPadres nuevaMadre=new FrmPadres(this,true);
       nuevaMadre.setLocationRelativeTo(this);
       nuevaMadre.cbSexo.setSelectedIndex(1);
       nuevaMadre.lbTitulo.setText("Registro de la madre");
       nuevaMadre.pnTitulo.setBackground(Color.magenta);
       nuevaMadre.setVisible(true);
       
       if(nuevaMadre.getCodigoPadres()>0){
            e.setIdMadre((int) nuevaMadre.getCodigoPadres());
            tMadre.setText(nuevaMadre.tNombre.getText());
       }
       nuevaMadre.dispose();
    }//GEN-LAST:event_btnCrearMadreActionPerformed

    private void btnBuscaPadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaPadreActionPerformed
     FrmBuscarPadres busPadres = new FrmBuscarPadres(this, true);
     busPadres.setLocationRelativeTo(this);
     busPadres.setVisible(true);
     if(busPadres.getIdSeleccion()>0){
         tPadre.setText(busPadres.getNombre());
         e.setIdPadre(busPadres.getIdSeleccion());
     }
         
     
    }//GEN-LAST:event_btnBuscaPadreActionPerformed

    private void btnBuscaMadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaMadreActionPerformed
     FrmBuscarPadres busPadres = new FrmBuscarPadres(this, true);
     busPadres.setLocationRelativeTo(this);
     busPadres.setVisible(true);
     if(busPadres.getIdSeleccion()>0){
         tMadre.setText(busPadres.getNombre());
         e.setIdMadre(busPadres.getIdSeleccion());
     }
         
    }//GEN-LAST:event_btnBuscaMadreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscaMadre;
    private javax.swing.JButton btnBuscaPadre;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCrearMadre;
    private javax.swing.JButton btnCrearPadre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JLabel lbTituloAzul;
    private javax.swing.JTextField tDireccion;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tMadre;
    private com.toedter.calendar.JDateChooser tNacimiento;
    private javax.swing.JTextField tNombre;
    private javax.swing.JTextField tPadre;
    private javax.swing.JTextField tTelefono;
    // End of variables declaration//GEN-END:variables

private void setEstudiante(){
    e.setNombre(tNombre.getText());
    e.setDireccion(tDireccion.getText());
    e.setTelefono(tTelefono.getText());
    e.setEmail(tEmail.getText());
    e.setFechaNacimiento(tNacimiento.getDate());
   
}

public void mostrarDatos(Integer codigoEstudiante) {
       dbe.mostrarEstudiante(codigoEstudiante, e);
       
       tNombre.setText(e.getNombre());
       tDireccion.setText(e.getDireccion());
       tTelefono.setText(e.getTelefono());
       tEmail.setText(e.getEmail());
       tNacimiento.setDate(e.getFechaNacimiento());
       tPadre.setText(e.getNombrePadre());
       tMadre.setText(e.getNombreMadre());
   }



}
