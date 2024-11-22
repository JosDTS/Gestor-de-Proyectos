/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gestorproyectos;

import ConexionSQL.ClassConexionSQLServer;
import ConexionSQL.ReportsClass;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ESTUDIANTE
 */
public class Reports extends javax.swing.JFrame {

    /**
     * Creates new form Reports
     */
    public Reports() {
        initComponents();
        cargarDatos();
    }
    
    private void cargarDatos() {
        ClassConexionSQLServer conexion = new ClassConexionSQLServer();
        List<ReportsClass> List = conexion.obtenerInformes();

        DefaultTableModel model = (DefaultTableModel) tableReports.getModel();
        model.setRowCount(0); 

        for (ReportsClass p : List) {
            Object[] rowData = {
                p.getIDInforme(),
                p.getAutor(),
                p.getDescripcion(),
                p.getFechaCreacion()
            };
            model.addRow(rowData);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTasksText = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lbReportsText = new javax.swing.JLabel();
        btnBackReports = new javax.swing.JButton();
        btnAddReports = new javax.swing.JButton();
        btnEliminateReports = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableReports = new javax.swing.JTable();
        btnEditReports1 = new javax.swing.JButton();

        lbTasksText.setBackground(new java.awt.Color(255, 255, 255));
        lbTasksText.setFont(new java.awt.Font("Source Serif Pro", 0, 36)); // NOI18N
        lbTasksText.setForeground(new java.awt.Color(0, 0, 0));
        lbTasksText.setText("Tareas");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lbReportsText.setBackground(new java.awt.Color(255, 255, 255));
        lbReportsText.setFont(new java.awt.Font("Source Serif Pro", 0, 36)); // NOI18N
        lbReportsText.setForeground(new java.awt.Color(0, 0, 0));
        lbReportsText.setText("Informes");

        btnBackReports.setBackground(new java.awt.Color(255, 255, 255));
        btnBackReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fluent-emoji-high-contrast--left-arrow.png"))); // NOI18N
        btnBackReports.setBorder(null);
        btnBackReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackReportsActionPerformed(evt);
            }
        });

        btnAddReports.setBackground(new java.awt.Color(0, 153, 153));
        btnAddReports.setFont(new java.awt.Font("Source Serif Pro", 0, 18)); // NOI18N
        btnAddReports.setForeground(new java.awt.Color(255, 255, 255));
        btnAddReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mdi--pen-add.png"))); // NOI18N
        btnAddReports.setText("Agregar");
        btnAddReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddReportsActionPerformed(evt);
            }
        });

        btnEliminateReports.setBackground(new java.awt.Color(0, 153, 153));
        btnEliminateReports.setFont(new java.awt.Font("Source Serif Pro", 0, 18)); // NOI18N
        btnEliminateReports.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminateReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tabler--trash.png"))); // NOI18N
        btnEliminateReports.setText("Eliminar");

        tableReports.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Informe", "Autor", "Descripción", "Fecha  Creacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableReports);

        btnEditReports1.setBackground(new java.awt.Color(0, 153, 153));
        btnEditReports1.setFont(new java.awt.Font("Source Serif Pro", 0, 18)); // NOI18N
        btnEditReports1.setForeground(new java.awt.Color(255, 255, 255));
        btnEditReports1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nimbus--edit.png"))); // NOI18N
        btnEditReports1.setText("Editar");
        btnEditReports1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditReports1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBackReports, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(282, 282, 282)
                        .addComponent(lbReportsText))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(btnAddReports, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(btnEditReports1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(btnEliminateReports, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBackReports, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lbReportsText, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminateReports, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditReports1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddReports, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackReportsActionPerformed
        ViewProyects view = new ViewProyects();
        view.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackReportsActionPerformed

    private void btnAddReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddReportsActionPerformed
        InformationReports informationReports = new InformationReports();
        informationReports.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnAddReportsActionPerformed

    private void btnEditReports1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditReports1ActionPerformed
        InformationReports informationReports = new InformationReports();
        informationReports.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEditReports1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddReports;
    private javax.swing.JButton btnBackReports;
    private javax.swing.JButton btnEditReports1;
    private javax.swing.JButton btnEliminateReports;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbReportsText;
    private javax.swing.JLabel lbTasksText;
    private javax.swing.JTable tableReports;
    // End of variables declaration//GEN-END:variables
}
