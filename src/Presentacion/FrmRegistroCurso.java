/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

/**
 *
 * @author alexa
 */
public class FrmRegistroCurso extends javax.swing.JDialog {

    /**
     * Creates new form frmRegistroCurso
     */
    public FrmRegistroCurso(java.awt.Frame parent, boolean modal) {
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

        pnTitulo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tAula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbTanda = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        pnTitulo1 = new javax.swing.JPanel();
        lbTitulo1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAsignatura = new javax.swing.JTable();
        pnTitulo2 = new javax.swing.JPanel();
        lbTitulo2 = new javax.swing.JLabel();
        jspDatos = new javax.swing.JScrollPane();
        jTableEstudiante = new javax.swing.JTable();
        btnEliminarSeleccionado = new javax.swing.JButton();
        btnSeleccionar1 = new javax.swing.JButton();
        btnSeleccionar2 = new javax.swing.JButton();
        btnEliminarSeleccionado1 = new javax.swing.JButton();
        btnEliminarSeleccionado2 = new javax.swing.JButton();
        btnEliminarSeleccionado3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cbTanda1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnTitulo.setBackground(new java.awt.Color(205, 97, 85));

        lbTitulo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("Registro Curso");

        javax.swing.GroupLayout pnTituloLayout = new javax.swing.GroupLayout(pnTitulo);
        pnTitulo.setLayout(pnTituloLayout);
        pnTituloLayout.setHorizontalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnTituloLayout.setVerticalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setText("Aula:");

        tAula.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tAula.setForeground(new java.awt.Color(0, 51, 255));
        tAula.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("Tanda:");

        cbTanda.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbTanda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matutina", "Vespertina" }));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("Fecha:");

        pnTitulo1.setBackground(new java.awt.Color(212, 230, 241));

        lbTitulo1.setBackground(new java.awt.Color(246, 221, 204));
        lbTitulo1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbTitulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo1.setText("Estudiante");

        javax.swing.GroupLayout pnTitulo1Layout = new javax.swing.GroupLayout(pnTitulo1);
        pnTitulo1.setLayout(pnTitulo1Layout);
        pnTitulo1Layout.setHorizontalGroup(
            pnTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTitulo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnTitulo1Layout.setVerticalGroup(
            pnTitulo1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTitulo1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTAsignatura.setBackground(new java.awt.Color(235, 245, 251));
        jTAsignatura.setForeground(new java.awt.Color(51, 51, 51));
        jTAsignatura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Asignatura"
            }
        ));
        jScrollPane1.setViewportView(jTAsignatura);

        pnTitulo2.setBackground(new java.awt.Color(246, 221, 204));

        lbTitulo2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lbTitulo2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo2.setText("Asignatura");

        javax.swing.GroupLayout pnTitulo2Layout = new javax.swing.GroupLayout(pnTitulo2);
        pnTitulo2.setLayout(pnTitulo2Layout);
        pnTitulo2Layout.setHorizontalGroup(
            pnTitulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTitulo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo2, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnTitulo2Layout.setVerticalGroup(
            pnTitulo2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTitulo2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo2)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTableEstudiante.setBackground(new java.awt.Color(234, 250, 241));
        jTableEstudiante.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jTableEstudiante.setForeground(new java.awt.Color(15, 15, 168));
        jTableEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEstudiante.setGridColor(new java.awt.Color(45, 75, 192));
        jTableEstudiante.setRowHeight(20);
        jspDatos.setViewportView(jTableEstudiante);

        btnEliminarSeleccionado.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnEliminarSeleccionado.setText("Eliminar seleccionado");
        btnEliminarSeleccionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarSeleccionadoActionPerformed(evt);
            }
        });

        btnSeleccionar1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnSeleccionar1.setText("Agregar seleccionado");
        btnSeleccionar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionar1ActionPerformed(evt);
            }
        });

        btnSeleccionar2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnSeleccionar2.setText("Agregar seleccionado");
        btnSeleccionar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionar2ActionPerformed(evt);
            }
        });

        btnEliminarSeleccionado1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnEliminarSeleccionado1.setText("Eliminar seleccionado");
        btnEliminarSeleccionado1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarSeleccionado1ActionPerformed(evt);
            }
        });

        btnEliminarSeleccionado2.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnEliminarSeleccionado2.setText("Cancelar");
        btnEliminarSeleccionado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarSeleccionado2ActionPerformed(evt);
            }
        });

        btnEliminarSeleccionado3.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnEliminarSeleccionado3.setText("Cancelar");
        btnEliminarSeleccionado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarSeleccionado3ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("Grado:");

        cbTanda1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbTanda1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nivel Inicial", "Primario", "Secundario" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pnTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jspDatos)
                            .addComponent(jScrollPane1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnEliminarSeleccionado1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSeleccionar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminarSeleccionado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnEliminarSeleccionado3, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSeleccionar1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnEliminarSeleccionado, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbTanda1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbTanda, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tAula, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(703, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbTanda1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tAula, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbTanda, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSeleccionar1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarSeleccionado3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(pnTitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSeleccionar2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarSeleccionado1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminarSeleccionado2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jspDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(168, 168, 168)
                    .addComponent(pnTitulo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(449, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarSeleccionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSeleccionadoActionPerformed
      
    }//GEN-LAST:event_btnEliminarSeleccionadoActionPerformed

    private void btnSeleccionar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSeleccionar1ActionPerformed

    private void btnSeleccionar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSeleccionar2ActionPerformed

    private void btnEliminarSeleccionado1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSeleccionado1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarSeleccionado1ActionPerformed

    private void btnEliminarSeleccionado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSeleccionado2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarSeleccionado2ActionPerformed

    private void btnEliminarSeleccionado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarSeleccionado3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarSeleccionado3ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarSeleccionado;
    private javax.swing.JButton btnEliminarSeleccionado1;
    private javax.swing.JButton btnEliminarSeleccionado2;
    private javax.swing.JButton btnEliminarSeleccionado3;
    private javax.swing.JButton btnSeleccionar1;
    private javax.swing.JButton btnSeleccionar2;
    private javax.swing.JComboBox<String> cbTanda;
    private javax.swing.JComboBox<String> cbTanda1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTAsignatura;
    private javax.swing.JTable jTableEstudiante;
    private javax.swing.JScrollPane jspDatos;
    public javax.swing.JLabel lbTitulo;
    public javax.swing.JLabel lbTitulo1;
    public javax.swing.JLabel lbTitulo2;
    public javax.swing.JPanel pnTitulo;
    public javax.swing.JPanel pnTitulo1;
    public javax.swing.JPanel pnTitulo2;
    public javax.swing.JTextField tAula;
    // End of variables declaration//GEN-END:variables
}
