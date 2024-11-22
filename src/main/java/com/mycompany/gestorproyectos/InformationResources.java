/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gestorproyectos;

/**
 *
 * @author ESTUDIANTE
 */
public class InformationResources extends javax.swing.JFrame {

    /**
     * Creates new form InformationResources
     */
    RecoverPassword recoverPass = new RecoverPassword(); 
    
    public InformationResources() {
        initComponents();
        recoverPass.StylePlaceHolder(txtNameResources);
        recoverPass.StylePlaceHolder(txtTypeResources);
        recoverPass.StylePlaceHolder(txtCuantityResource);
        recoverPass.StylePlaceHolder(txtCostsResources);
        
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
        jPanel2 = new javax.swing.JPanel();
        btnBackReports = new javax.swing.JButton();
        lbNameResources = new javax.swing.JLabel();
        txtCostsResources = new javax.swing.JTextField();
        lbCuantityResources = new javax.swing.JLabel();
        txtNameResources = new javax.swing.JTextField();
        lbTypeResources = new javax.swing.JLabel();
        txtTypeResources = new javax.swing.JTextField();
        lbCostsResources = new javax.swing.JLabel();
        txtCuantityResource = new javax.swing.JTextField();
        btnConfirmAddResources = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        btnBackReports.setBackground(new java.awt.Color(255, 255, 255));
        btnBackReports.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fluent-emoji-high-contrast--left-arrow.png"))); // NOI18N
        btnBackReports.setBorder(null);
        btnBackReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackReportsActionPerformed(evt);
            }
        });

        lbNameResources.setFont(new java.awt.Font("Source Serif Pro", 0, 18)); // NOI18N
        lbNameResources.setForeground(new java.awt.Color(0, 0, 0));
        lbNameResources.setText("Nombre: ");

        txtCostsResources.setText("Costos");
        txtCostsResources.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCostsResourcesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCostsResourcesFocusLost(evt);
            }
        });

        lbCuantityResources.setFont(new java.awt.Font("Source Serif Pro", 0, 18)); // NOI18N
        lbCuantityResources.setForeground(new java.awt.Color(0, 0, 0));
        lbCuantityResources.setText("Cantidad de Recursos: ");

        txtNameResources.setText("Nombre");
        txtNameResources.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameResourcesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameResourcesFocusLost(evt);
            }
        });

        lbTypeResources.setFont(new java.awt.Font("Source Serif Pro", 0, 18)); // NOI18N
        lbTypeResources.setForeground(new java.awt.Color(0, 0, 0));
        lbTypeResources.setText("Tipo de Recurso:");

        txtTypeResources.setText("Tipo de Recurso");
        txtTypeResources.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTypeResourcesFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTypeResourcesFocusLost(evt);
            }
        });

        lbCostsResources.setFont(new java.awt.Font("Source Serif Pro", 0, 18)); // NOI18N
        lbCostsResources.setForeground(new java.awt.Color(0, 0, 0));
        lbCostsResources.setText("Costo: ");

        txtCuantityResource.setText("Cantidad de Recursos");
        txtCuantityResource.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCuantityResourceFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCuantityResourceFocusLost(evt);
            }
        });

        btnConfirmAddResources.setBackground(new java.awt.Color(0, 153, 153));
        btnConfirmAddResources.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConfirmAddResources.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmAddResources.setText("Agregar");
        btnConfirmAddResources.setBorderPainted(false);
        btnConfirmAddResources.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmAddResourcesMouseClicked(evt);
            }
        });
        btnConfirmAddResources.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmAddResourcesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnBackReports, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCuantityResources)
                            .addComponent(lbNameResources)
                            .addComponent(lbTypeResources)
                            .addComponent(lbCostsResources))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCostsResources)
                            .addComponent(txtNameResources)
                            .addComponent(txtTypeResources, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCuantityResource, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(btnConfirmAddResources, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBackReports, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNameResources)
                    .addComponent(txtNameResources, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTypeResources)
                    .addComponent(txtTypeResources, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCuantityResources)
                    .addComponent(txtCuantityResource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCostsResources)
                    .addComponent(txtCostsResources, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(btnConfirmAddResources, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
        Resources resources = new Resources();
        resources.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackReportsActionPerformed

    private void txtCostsResourcesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCostsResourcesFocusGained
        if (txtCostsResources.getText().equals("Costos")) {
            txtCostsResources.setText(null);
            txtCostsResources.requestFocus();

            recoverPass.DeleteStylePlaceHolder(txtCostsResources);
        }
    }//GEN-LAST:event_txtCostsResourcesFocusGained

    private void txtCostsResourcesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCostsResourcesFocusLost
        if (txtCostsResources.getText().length() == 0) {
            recoverPass.StylePlaceHolder(txtCostsResources);
            txtCostsResources.setText("Costos");
        }
    }//GEN-LAST:event_txtCostsResourcesFocusLost

    private void txtNameResourcesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameResourcesFocusGained
        if (txtNameResources.getText().equals("Nombre")) {
            txtNameResources.setText(null);
            txtNameResources.requestFocus();

            recoverPass.DeleteStylePlaceHolder(txtNameResources);
        }
    }//GEN-LAST:event_txtNameResourcesFocusGained

    private void txtNameResourcesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameResourcesFocusLost
         if (txtNameResources.getText().length() == 0) {
            recoverPass.StylePlaceHolder(txtNameResources);
            txtNameResources.setText("Nombre");
        }
    }//GEN-LAST:event_txtNameResourcesFocusLost

    private void txtTypeResourcesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTypeResourcesFocusGained
        if (txtTypeResources.getText().equals("Tipo de Recurso")) {
            txtTypeResources.setText(null);
            txtTypeResources.requestFocus();

            recoverPass.DeleteStylePlaceHolder(txtTypeResources);
        }
    }//GEN-LAST:event_txtTypeResourcesFocusGained

    private void txtTypeResourcesFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTypeResourcesFocusLost
           if (txtTypeResources.getText().length() == 0) {
            recoverPass.StylePlaceHolder(txtTypeResources);
            txtTypeResources.setText("Tipo de Recurso");
        }
    }//GEN-LAST:event_txtTypeResourcesFocusLost

    private void txtCuantityResourceFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCuantityResourceFocusGained
         if (txtCuantityResource.getText().equals("Cantidad de Recursos")) {
            txtCuantityResource.setText(null);
            txtCuantityResource.requestFocus();

            recoverPass.DeleteStylePlaceHolder(txtCuantityResource);
        }
    }//GEN-LAST:event_txtCuantityResourceFocusGained

    private void txtCuantityResourceFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCuantityResourceFocusLost
           if (txtCuantityResource.getText().length() == 0) {
            recoverPass.StylePlaceHolder(txtCuantityResource);
            txtCuantityResource.setText("Cantidad de Recursos");
        }
    }//GEN-LAST:event_txtCuantityResourceFocusLost

    private void btnConfirmAddResourcesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmAddResourcesMouseClicked

    }//GEN-LAST:event_btnConfirmAddResourcesMouseClicked

    private void btnConfirmAddResourcesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmAddResourcesActionPerformed

    }//GEN-LAST:event_btnConfirmAddResourcesActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
          this.requestFocusInWindow(); 
    }//GEN-LAST:event_formWindowGainedFocus

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackReports;
    private javax.swing.JButton btnConfirmAddResources;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbCostsResources;
    private javax.swing.JLabel lbCuantityResources;
    private javax.swing.JLabel lbNameResources;
    private javax.swing.JLabel lbTypeResources;
    private javax.swing.JTextField txtCostsResources;
    private javax.swing.JTextField txtCuantityResource;
    private javax.swing.JTextField txtNameResources;
    private javax.swing.JTextField txtTypeResources;
    // End of variables declaration//GEN-END:variables
}
