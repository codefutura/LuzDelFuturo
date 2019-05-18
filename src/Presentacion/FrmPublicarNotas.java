package Presentacion;

import Datos.DbCurso;
import Datos.DbEstudiante;
import Datos.DbNota;
import Datos.dbAsignatura;
import Negocio.Nota;
import java.awt.event.KeyEvent;

import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author codefutura
 */
public class FrmPublicarNotas extends javax.swing.JDialog {

    private int idCursoSelecionado;
    private int idEstudianteSelecionado;

    /**
     * Creates new form FrmPublicarNotas
     *
     * @param parent
     * @param modal
     */
    public FrmPublicarNotas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        formatoRejilla();

        tFecha.setDate(new Date());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstudiante = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableAsignatura = new javax.swing.JTable();
        btnPublicar = new javax.swing.JButton();
        btnAnularPublicacion = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableCursos = new javax.swing.JTable();
        tNombreDocente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnBuscarDocente = new javax.swing.JButton();
        tFecha = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableEstudiante.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTableEstudiante.setForeground(new java.awt.Color(0, 51, 204));
        jTableEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEstudiante.setGridColor(new java.awt.Color(204, 204, 204));
        jTableEstudiante.setRowHeight(20);
        jTableEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableEstudianteMousePressed(evt);
            }
        });
        jTableEstudiante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableEstudianteKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEstudiante);

        jTableAsignatura.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jTableAsignatura.setForeground(new java.awt.Color(0, 153, 51));
        jTableAsignatura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Asignatura", "Calificar", "Observacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableAsignatura.setGridColor(new java.awt.Color(204, 204, 204));
        jTableAsignatura.setRowHeight(20);
        jTableAsignatura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTableAsignaturaFocusLost(evt);
            }
        });
        jTableAsignatura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAsignaturaMouseClicked(evt);
            }
        });
        jTableAsignatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableAsignaturaKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTableAsignatura);

        btnPublicar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnPublicar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nota.png"))); // NOI18N
        btnPublicar.setText("Publicar notas");
        btnPublicar.setToolTipText("");
        btnPublicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPublicarActionPerformed(evt);
            }
        });

        btnAnularPublicacion.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnAnularPublicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/delete_1.png"))); // NOI18N
        btnAnularPublicacion.setText("Anular publicación");

        jPanel8.setBackground(new java.awt.Color(0, 204, 51));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cursos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N
        jPanel8.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jPanel8.setOpaque(false);

        jTableCursos.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jTableCursos.setForeground(new java.awt.Color(0, 51, 255));
        jTableCursos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Aula", "Año escolar", "Tanda"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableCursos.setGridColor(new java.awt.Color(204, 204, 204));
        jTableCursos.setRowHeight(20);
        jTableCursos.setShowHorizontalLines(false);
        jTableCursos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableCursosMousePressed(evt);
            }
        });
        jTableCursos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTableCursosKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(jTableCursos);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );

        tNombreDocente.setEditable(false);
        tNombreDocente.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        tNombreDocente.setForeground(new java.awt.Color(0, 153, 102));
        tNombreDocente.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tNombreDocente.setFocusable(false);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setText("Docente");

        btnBuscarDocente.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnBuscarDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/binoculars.png"))); // NOI18N
        btnBuscarDocente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarDocente.setFocusPainted(false);
        btnBuscarDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDocenteActionPerformed(evt);
            }
        });

        tFecha.setDateFormatString("dd-MM-yyyy");
        tFecha.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Fecha");

        jPanel1.setBackground(new java.awt.Color(35, 144, 180));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Publicación de Notas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 51, 0));
        btnSalir.setText("-->");
        btnSalir.setContentAreaFilled(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.setFocusPainted(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnPublicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAnularPublicacion))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(tNombreDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tNombreDocente)
                    .addComponent(tFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPublicar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAnularPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDocenteActionPerformed
        FrmBuscarEmpleado docente = new FrmBuscarEmpleado(this, true);
        docente.setLocationRelativeTo(null);
        docente.setVisible(true);
        int idDocente = 0;

        if (docente.confirmarSeleccion > 0) {
            idDocente = Integer.parseInt(String.valueOf(docente.jTableEmpleado.getValueAt(docente.jTableEmpleado.getSelectedRow(), 0)));
            tNombreDocente.setText(String.valueOf(docente.jTableEmpleado.getValueAt(docente.jTableEmpleado.getSelectedRow(), 1)));
        }
        cargaCusosDocente(idDocente);
    }//GEN-LAST:event_btnBuscarDocenteActionPerformed

    private void jTableCursosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCursosMousePressed

        this.idCursoSelecionado = Integer.parseInt(String.valueOf(jTableCursos.getValueAt(jTableCursos.getSelectedRow(), 0)));
        cargaEstudianteDelCuso(idCursoSelecionado);
        cargaAsignaturaDelCuso(idCursoSelecionado);
    }//GEN-LAST:event_jTableCursosMousePressed

    private void jTableEstudianteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEstudianteMousePressed
        this.idEstudianteSelecionado = Integer.parseInt(String.valueOf(jTableEstudiante.getValueAt(jTableEstudiante.getSelectedRow(), 0)));
        limpiarTablaMateria();
    }//GEN-LAST:event_jTableEstudianteMousePressed

    private void btnPublicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPublicarActionPerformed
        if (this.idCursoSelecionado == 0) {
            JOptionPane.showMessageDialog(this, "Error, seleccione el curso");
            return;
        }

        if (this.idEstudianteSelecionado == 0) {
            JOptionPane.showMessageDialog(this, "Error, seleccione el estudiante");
            return;
        }
        if (revisarNotas() == false) {  
            JOptionPane.showMessageDialog(this, "Algunas notas no han sigo asignadas!", "ERROR",0);
            return;
        }

        publicarNota();
        JOptionPane.showMessageDialog(this, "Publicación exitosa !");

        DefaultTableModel mod = (DefaultTableModel) jTableEstudiante.getModel();
        mod.removeRow(jTableEstudiante.getSelectedRow());
        idEstudianteSelecionado = 0;
        limpiarTablaMateria();
    }//GEN-LAST:event_btnPublicarActionPerformed

    private void jTableAsignaturaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTableAsignaturaFocusLost

    }//GEN-LAST:event_jTableAsignaturaFocusLost

    private void jTableCursosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableCursosKeyReleased

        if (evt.getKeyCode() == 38 | evt.getKeyCode() == 40) {
            this.idCursoSelecionado = Integer.parseInt(String.valueOf(jTableCursos.getValueAt(jTableCursos.getSelectedRow(), 0)));
            cargaEstudianteDelCuso(idCursoSelecionado);
            cargaAsignaturaDelCuso(idCursoSelecionado);
        }

        if (evt.getKeyCode() == 10) {
            this.idCursoSelecionado = Integer.parseInt(String.valueOf(jTableCursos.getValueAt(jTableCursos.getSelectedRow(), 0)));
            cargaEstudianteDelCuso(idCursoSelecionado);
            cargaAsignaturaDelCuso(idCursoSelecionado);
        }

    }//GEN-LAST:event_jTableCursosKeyReleased

    private void jTableEstudianteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableEstudianteKeyReleased

        if (evt.getKeyCode() == 38 | evt.getKeyCode() == 40) {
            this.idEstudianteSelecionado = Integer.parseInt(String.valueOf(jTableEstudiante.getValueAt(jTableEstudiante.getSelectedRow(), 0)));
            limpiarTablaMateria();
        }

        if (evt.getKeyCode() == 10) {
            this.idEstudianteSelecionado = Integer.parseInt(String.valueOf(jTableEstudiante.getValueAt(jTableEstudiante.getSelectedRow(), 0)));
            limpiarTablaMateria();
        }
    }//GEN-LAST:event_jTableEstudianteKeyReleased

    private void jTableAsignaturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAsignaturaMouseClicked
        if (evt.getClickCount() == 2) {
            asignarNota();
        }

    }//GEN-LAST:event_jTableAsignaturaMouseClicked

    private void jTableAsignaturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableAsignaturaKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
            asignarNota();
        }

    }//GEN-LAST:event_jTableAsignaturaKeyPressed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnularPublicacion;
    private javax.swing.JButton btnBuscarDocente;
    private javax.swing.JButton btnPublicar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableAsignatura;
    private javax.swing.JTable jTableCursos;
    private javax.swing.JTable jTableEstudiante;
    private com.toedter.calendar.JDateChooser tFecha;
    private javax.swing.JTextField tNombreDocente;
    // End of variables declaration//GEN-END:variables

    private void cargaCusosDocente(int id_docente) {
        ArrayList datos = DbCurso.buscarCursoPorDocente(id_docente);
        DefaultTableModel model = (DefaultTableModel) jTableCursos.getModel();
        model.setNumRows(0);
        datos.forEach(obj -> {
            model.addRow((Object[]) obj);
        });
    }

    private void cargaAsignaturaDelCuso(int id_curso) {
        ArrayList datos = dbAsignatura.asignaturasDelCursoPublicar(id_curso);
        DefaultTableModel model = (DefaultTableModel) jTableAsignatura.getModel();
        model.setNumRows(0);
        datos.forEach(obj -> {
            model.addRow((Object[]) obj);
        });
    }

    private void cargaEstudianteDelCuso(int id_curso) {
        ArrayList datos = DbEstudiante.estudianteDelCursoPublicar(id_curso);
        DefaultTableModel model = (DefaultTableModel) jTableEstudiante.getModel();
        model.setNumRows(0);
        datos.forEach(obj -> {
            model.addRow((Object[]) obj);
        });
    }

    private void formatoRejilla() {
        //Tabla de estudiante
        TableColumnModel columnModel = jTableEstudiante.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(10);
        columnModel.getColumn(1).setPreferredWidth(200);
        jTableEstudiante.setColumnModel(columnModel);
        jTableEstudiante.getTableHeader().setReorderingAllowed(false);

        //Tabla de asignatura
        TableColumnModel colModel = jTableAsignatura.getColumnModel();
        colModel.getColumn(0).setPreferredWidth(8);
        colModel.getColumn(1).setPreferredWidth(150);
        colModel.getColumn(2).setPreferredWidth(8);
        colModel.getColumn(3).setMaxWidth(0);
        colModel.getColumn(3).setMinWidth(0);
        colModel.getColumn(3).setPreferredWidth(0);
        jTableAsignatura.setColumnModel(colModel);
        jTableAsignatura.getTableHeader().setReorderingAllowed(false);
    }

    private void limpiarTablaMateria() {
        int filas = jTableAsignatura.getRowCount();
        for (int i = 0; i < filas; i++) {
            jTableAsignatura.setValueAt("", i, 2);

        }
    }

    private void publicarNota() {
        int filas = jTableAsignatura.getRowCount();
        int idAsignatura = 0;
        int calificacion = 0;
        DbNota dbn = new DbNota();
        Nota n = new Nota();
        n.setIdCurso(this.idCursoSelecionado);
        n.setIdEstudiante(this.idEstudianteSelecionado);
        n.setFecha(tFecha.getDate());
        for (int i = 0; i < filas; i++) {
            try {
                idAsignatura = Integer.parseInt(String.valueOf(jTableAsignatura.getValueAt(i, 0)));
                calificacion = Integer.parseInt(String.valueOf(jTableAsignatura.getValueAt(i, 2)));

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
                return;
            }
            String observacion = String.valueOf(jTableAsignatura.getValueAt(i, 3));
            n.setIdAsignatura(idAsignatura);
            n.setCalificacion(calificacion);
            n.setObservacion(observacion);
            //Registrar en la base de datos
            if (dbn.insertarPublicacionDeNota(n) > 0) {

            } else {
                JOptionPane.showMessageDialog(this, "Error, al intentar publicar");
                return;

            }
        }
    }

    private void asignarNota() {

        if (this.idEstudianteSelecionado == 0) {
            JOptionPane.showMessageDialog(this, "Favoer seleccionar el estudiante !!");
            return;
        }
        FrmNota nota = new FrmNota(this, true);
        nota.setLocationRelativeTo(this);
        nota.tAsignatura.setText(String.valueOf(jTableAsignatura.getValueAt(jTableAsignatura.getSelectedRow(), 1)));
        if (!"null".equals(String.valueOf(jTableAsignatura.getValueAt(jTableAsignatura.getSelectedRow(), 2)))) {
            nota.tCalificar.setText(String.valueOf(jTableAsignatura.getValueAt(jTableAsignatura.getSelectedRow(), 2)));
        }
        if (!"null".equals(String.valueOf(jTableAsignatura.getValueAt(jTableAsignatura.getSelectedRow(), 3)))) {
            nota.tObservacion.setText(String.valueOf(jTableAsignatura.getValueAt(jTableAsignatura.getSelectedRow(), 3)));
        }

        nota.setVisible(true);

        if (nota.aceptada) {
            jTableAsignatura.setValueAt(nota.tCalificar.getValue(), jTableAsignatura.getSelectedRow(), 2);
            jTableAsignatura.setValueAt(nota.tObservacion.getText(), jTableAsignatura.getSelectedRow(), 3);
        }
    }

    private boolean revisarNotas() {
        boolean estado = false;
        for (int i = 0; i < jTableAsignatura.getRowCount(); i++) {
            if (validarInteger(i)==0) {
                estado = false;
                break;
            } else {
                estado = true;
            }
        }
        return estado;
    }
    
    
    
     private int validarInteger(int i) {
        int valor = 0;
        try {
            valor = Integer.parseInt(String.valueOf(jTableAsignatura.getValueAt(i, 2)));
        } catch (NumberFormatException e) {
        }

        return valor;
    }
     
}
