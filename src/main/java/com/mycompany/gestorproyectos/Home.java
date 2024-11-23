/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gestorproyectos;

import ConexionSQL.ClassConexionSQLServer;
import ConexionSQL.Person;
import ConexionSQL.Proyects;
import StyleTable.TableActionCellEditor;
import StyleTable.TableActionCellRender;
import StyleTable.TableActionEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DatabaseMetaData;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ESTUDIANTE
 */
public class Home extends javax.swing.JFrame {

    RecoverPassword recoverPass = new RecoverPassword();
    ViewProyects view = new ViewProyects();

    /**
     * Creates new form Home
     */
    public Home() {

        initComponents();
        
        recoverPass.StylePlaceHolder(txtSearch);

        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onView(int row) {
                System.out.println("View Row: " + row);
                view.setVisible(true);
                dispose();
            }
        };
        table.getColumnModel().getColumn(8).setCellRenderer(new TableActionCellRender());
        table.getColumnModel().getColumn(8).setCellEditor(new TableActionCellEditor(event));

        cargarDatos();
        
        
         btnUser.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               Person usuarioLogueado = obtenerUsuarioLogueado(); 

               if (usuarioLogueado != null) {
                   UserInformation userInfoFrame = new UserInformation(usuarioLogueado);
                   userInfoFrame.setVisible(true); 
               } else {
                   JOptionPane.showMessageDialog(Home.this, "No hay un usuario logueado.");
               }
           }
       });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundProyects = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbProyectText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnEliminateProyect = new javax.swing.JButton();
        btnAddProyect1 = new javax.swing.JButton();
        btnEditProyect = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        backgroundProyects.setBackground(new java.awt.Color(0, 153, 153));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lbProyectText.setBackground(new java.awt.Color(255, 255, 255));
        lbProyectText.setFont(new java.awt.Font("Source Serif Pro", 0, 36)); // NOI18N
        lbProyectText.setForeground(new java.awt.Color(0, 0, 0));
        lbProyectText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbProyectText.setText("Proyectos");

        table.setBackground(new java.awt.Color(255, 255, 255));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Proyecto", "Nombre", "Fecha Inicio", "Fecha Fin", "Estado", " Presupuesto", "Descripción", "Departamento Encargado", "Mas Información"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(51, 51, 51));
        table.setRowHeight(40);
        table.setSelectionBackground(new java.awt.Color(0, 153, 153));
        table.setSelectionForeground(new java.awt.Color(51, 51, 51));
        table.setShowGrid(false);
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(1).setMinWidth(70);
            table.getColumnModel().getColumn(1).setMaxWidth(70);
            table.getColumnModel().getColumn(4).setMinWidth(70);
            table.getColumnModel().getColumn(4).setMaxWidth(70);
            table.getColumnModel().getColumn(7).setMinWidth(150);
            table.getColumnModel().getColumn(7).setMaxWidth(150);
        }

        txtSearch.setBackground(new java.awt.Color(204, 204, 204));
        txtSearch.setForeground(new java.awt.Color(0, 0, 0));
        txtSearch.setText("Buscar...");
        txtSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 6, true));
        txtSearch.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSearchFocusLost(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(0, 153, 153));
        btnSearch.setFont(new java.awt.Font("Source Serif Pro", 0, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnEliminateProyect.setBackground(new java.awt.Color(0, 153, 153));
        btnEliminateProyect.setFont(new java.awt.Font("Source Serif Pro", 0, 18)); // NOI18N
        btnEliminateProyect.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminateProyect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tabler--trash.png"))); // NOI18N
        btnEliminateProyect.setText("Eliminar");
        btnEliminateProyect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminateProyectActionPerformed(evt);
            }
        });

        btnAddProyect1.setBackground(new java.awt.Color(0, 153, 153));
        btnAddProyect1.setFont(new java.awt.Font("Source Serif Pro", 0, 18)); // NOI18N
        btnAddProyect1.setForeground(new java.awt.Color(255, 255, 255));
        btnAddProyect1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mdi--pen-add.png"))); // NOI18N
        btnAddProyect1.setText("Agregar");
        btnAddProyect1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProyect1ActionPerformed(evt);
            }
        });

        btnEditProyect.setBackground(new java.awt.Color(0, 153, 153));
        btnEditProyect.setFont(new java.awt.Font("Source Serif Pro", 0, 18)); // NOI18N
        btnEditProyect.setForeground(new java.awt.Color(255, 255, 255));
        btnEditProyect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nimbus--edit.png"))); // NOI18N
        btnEditProyect.setText("Editar");
        btnEditProyect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditProyectActionPerformed(evt);
            }
        });

        btnUser.setBackground(new java.awt.Color(255, 255, 255));
        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/qlementine-icons--user-16 (2).png"))); // NOI18N
        btnUser.setBorder(null);
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddProyect1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnEditProyect, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnEliminateProyect, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnUser)
                        .addGap(269, 269, 269)
                        .addComponent(lbProyectText, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbProyectText, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnUser)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSearch))
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminateProyect, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditProyect, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddProyect1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(98, 98, 98))
        );

        javax.swing.GroupLayout backgroundProyectsLayout = new javax.swing.GroupLayout(backgroundProyects);
        backgroundProyects.setLayout(backgroundProyectsLayout);
        backgroundProyectsLayout.setHorizontalGroup(
            backgroundProyectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundProyectsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        backgroundProyectsLayout.setVerticalGroup(
            backgroundProyectsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundProyectsLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundProyects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundProyects, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
   private Person obtenerUsuarioLogueado() {
    ClassConexionSQLServer conexion = new ClassConexionSQLServer();
    String email = "g"; 
    String contraseña = "g"; 

    if (conexion.VerifyLogin(email, contraseña)) {
       
        return conexion.obtenerDatosUsuario(email); 
    }
    
    return null; 
}
    
    /**
     * Metodo para recargar la tabla 
     */
    public void cargarDatos() {
        ClassConexionSQLServer conexion = new ClassConexionSQLServer();
        List<Proyects> proyectosList = conexion.obtenerProyectos();

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); 

        for (Proyects p : proyectosList) {
            Object[] rowData = {
                p.getIdProyecto(),
                p.getNombre(),
                p.getFechaInicio(),
                p.getFechaFin(),
                p.getEstado(),
                p.getPresupuesto(),
                p.getDescripcion(),
                p.getDepartamentoEncargado(),
                "Más Información"
            };
            model.addRow(rowData);
        }
    }
    
    
    /**
     * Metodo para buscar los proyectos por el nombre del proyecto
     */
    private void buscarProyecto() {
    String nombreBuscado = txtSearch.getText().trim(); 

    ClassConexionSQLServer conexion = new ClassConexionSQLServer();
    List<Proyects> proyectosList = conexion.buscarProyectosPorNombre(nombreBuscado);

    DefaultTableModel model = (DefaultTableModel) table.getModel();
    model.setRowCount(0); 
    for (Proyects p : proyectosList) {
        Object[] rowData = {
            p.getIdProyecto(),
            p.getNombre(),
            p.getFechaInicio(),
            p.getFechaFin(),
            p.getEstado(),
            p.getPresupuesto(),
            p.getDescripcion(),
            p.getDepartamentoEncargado(),
            "Más Información" 
        };
        model.addRow(rowData); 
    }
}
   /**
    * Metodo para sleccionar un proyecto y eliminarlo
    */
    
    private void eliminarProyecto() {
    int selectedRow = table.getSelectedRow(); 

    if (selectedRow >= 0) { 
        int idProyecto = (int) table.getValueAt(selectedRow, 0); 

        int confirm = JOptionPane.showConfirmDialog(this, "¿Estás seguro de que deseas eliminar este proyecto?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            ClassConexionSQLServer conexion = new ClassConexionSQLServer();
            boolean exito = conexion.eliminarProyecto(idProyecto); 

            if (exito) {
                JOptionPane.showMessageDialog(this, "Proyecto eliminado con éxito.");
                cargarDatos();
            } else {
                JOptionPane.showMessageDialog(this, "Error al eliminar el proyecto.");
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor selecciona un proyecto para eliminar.");
    }
}


    private void txtSearchFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusGained
        if (txtSearch.getText().equals("Buscar...")) {
            txtSearch.setText(null);
            txtSearch.requestFocus();

            recoverPass.DeleteStylePlaceHolder(txtSearch);
        }
    }//GEN-LAST:event_txtSearchFocusGained

    private void txtSearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchFocusLost
        if (txtSearch.getText().length() == 0) {
            recoverPass.StylePlaceHolder(txtSearch);
            txtSearch.setText("Buscar...");
        }
    }//GEN-LAST:event_txtSearchFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnAddProyect1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProyect1ActionPerformed
        ClassConexionSQLServer conexion = new ClassConexionSQLServer();
    
    
    boolean exito = conexion.insertarProyecto(); 

    if (exito) {
        JOptionPane.showMessageDialog(this,"Proyecto agregado con éxito.");
        cargarDatos(); 
    } else {
        JOptionPane.showMessageDialog(this,"Error al agregar el proyecto.");
    }
    }//GEN-LAST:event_btnAddProyect1ActionPerformed

    private void btnEditProyectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditProyectActionPerformed
  int selectedRow = table.getSelectedRow(); 

    if (selectedRow >= 0) { 
        int idProyecto = (int) table.getValueAt(selectedRow, 0); 

        ClassConexionSQLServer conexion = new ClassConexionSQLServer();
        
       
        Proyects proyectoSeleccionado = conexion.obtenerProyectoPorId(idProyecto); 

        if (proyectoSeleccionado != null) { 
            InformationProyect informationFrame = new InformationProyect(); 
            informationFrame.loadData(proyectoSeleccionado); 
            
            informationFrame.setVisible(true); 
            
            informationFrame.addWindowListener(new java.awt.event.WindowAdapter() {
                public void windowClosed(java.awt.event.WindowEvent windowEvent) {
                    cargarDatos(); 
                }
            });
        } else {
            JOptionPane.showMessageDialog(this,"Error al obtener los datos del proyecto.");
        }
    } else {
        JOptionPane.showMessageDialog(this,"Por favor selecciona un proyecto para editar.");
    }
    }//GEN-LAST:event_btnEditProyectActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
      buscarProyecto();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnEliminateProyectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminateProyectActionPerformed
        eliminarProyecto();
    }//GEN-LAST:event_btnEliminateProyectActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundProyects;
    private javax.swing.JButton btnAddProyect1;
    private javax.swing.JButton btnEditProyect;
    private javax.swing.JButton btnEliminateProyect;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbProyectText;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
