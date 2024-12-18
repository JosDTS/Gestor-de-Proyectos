/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gestorproyectos;

import ConexionSQL.ClassConexionSQLServer;
import ConexionSQL.Proyects;
import java.awt.event.ActionEvent;
import java.sql.Date;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.*;

/**
 *
 * @author ESTUDIANTE
 */
public class InformationProyect extends javax.swing.JFrame {

    /**
     * Creates new form InformationProyect
     */
    RecoverPassword recoverPass = new RecoverPassword();
    
    private Proyects proyecto; 

    public InformationProyect() {
        super("Editar Proyecto");
        initComponents();
        setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
        setupPlaceholders(); 
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
        lbNameProyect = new javax.swing.JLabel();
        lbStatusProyect = new javax.swing.JLabel();
        lbDateInitProyect = new javax.swing.JLabel();
        lbDateFinallyProyect = new javax.swing.JLabel();
        lbDepartamentProyect = new javax.swing.JLabel();
        lbBudgetProyect = new javax.swing.JLabel();
        lbDescriptionProyect = new javax.swing.JLabel();
        txtNameProyect = new javax.swing.JTextField();
        txtDateInitProyect = new javax.swing.JTextField();
        txtDateFinallyProyect = new javax.swing.JTextField();
        txtStatusProyect = new javax.swing.JTextField();
        txtBudgetProyect = new javax.swing.JTextField();
        txtDescriptionProyect = new javax.swing.JTextField();
        txtDepartamentProyect = new javax.swing.JTextField();
        btnProyects = new javax.swing.JButton();
        btnConfirmAddProyects = new javax.swing.JButton();

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

        lbNameProyect.setFont(new java.awt.Font("Source Serif Pro", 0, 18)); // NOI18N
        lbNameProyect.setForeground(new java.awt.Color(0, 0, 0));
        lbNameProyect.setText("Nombre: ");

        lbStatusProyect.setFont(new java.awt.Font("Source Serif Pro", 0, 18)); // NOI18N
        lbStatusProyect.setForeground(new java.awt.Color(0, 0, 0));
        lbStatusProyect.setText("Estado:");

        lbDateInitProyect.setFont(new java.awt.Font("Source Serif Pro", 0, 18)); // NOI18N
        lbDateInitProyect.setForeground(new java.awt.Color(0, 0, 0));
        lbDateInitProyect.setText("Fecha Inicio: ");

        lbDateFinallyProyect.setFont(new java.awt.Font("Source Serif Pro", 0, 18)); // NOI18N
        lbDateFinallyProyect.setForeground(new java.awt.Color(0, 0, 0));
        lbDateFinallyProyect.setText("Fecha Final: ");

        lbDepartamentProyect.setFont(new java.awt.Font("Source Serif Pro", 0, 18)); // NOI18N
        lbDepartamentProyect.setForeground(new java.awt.Color(0, 0, 0));
        lbDepartamentProyect.setText("Departamento Encargado:");

        lbBudgetProyect.setFont(new java.awt.Font("Source Serif Pro", 0, 18)); // NOI18N
        lbBudgetProyect.setForeground(new java.awt.Color(0, 0, 0));
        lbBudgetProyect.setText("Presupuesto:");

        lbDescriptionProyect.setFont(new java.awt.Font("Source Serif Pro", 0, 18)); // NOI18N
        lbDescriptionProyect.setForeground(new java.awt.Color(0, 0, 0));
        lbDescriptionProyect.setText("Descripción:");

        txtNameProyect.setText("Nombre de Proyecto");
        txtNameProyect.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameProyectFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameProyectFocusLost(evt);
            }
        });

        txtDateInitProyect.setText("(yyyy-MM-dd)");
        txtDateInitProyect.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDateInitProyectFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDateInitProyectFocusLost(evt);
            }
        });

        txtDateFinallyProyect.setText("(yyyy-MM-dd)");
        txtDateFinallyProyect.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDateFinallyProyectFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDateFinallyProyectFocusLost(evt);
            }
        });

        txtStatusProyect.setText("Estado");
        txtStatusProyect.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtStatusProyectFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtStatusProyectFocusLost(evt);
            }
        });
        txtStatusProyect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusProyectActionPerformed(evt);
            }
        });

        txtBudgetProyect.setText("Presupuesto");
        txtBudgetProyect.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBudgetProyectFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBudgetProyectFocusLost(evt);
            }
        });

        txtDescriptionProyect.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDescriptionProyect.setText("Descripcion");
        txtDescriptionProyect.setActionCommand("<Not Set>");
        txtDescriptionProyect.setAutoscrolls(false);
        txtDescriptionProyect.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDescriptionProyect.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDescriptionProyectFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDescriptionProyectFocusLost(evt);
            }
        });
        txtDescriptionProyect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionProyectActionPerformed(evt);
            }
        });

        txtDepartamentProyect.setText("Departamento Encargado");
        txtDepartamentProyect.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDepartamentProyectFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDepartamentProyectFocusLost(evt);
            }
        });

        btnProyects.setBackground(new java.awt.Color(255, 255, 255));
        btnProyects.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fluent-emoji-high-contrast--left-arrow.png"))); // NOI18N
        btnProyects.setBorder(null);
        btnProyects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProyectsActionPerformed(evt);
            }
        });

        btnConfirmAddProyects.setBackground(new java.awt.Color(0, 153, 153));
        btnConfirmAddProyects.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnConfirmAddProyects.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmAddProyects.setText("Agregar");
        btnConfirmAddProyects.setBorderPainted(false);
        btnConfirmAddProyects.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmAddProyectsMouseClicked(evt);
            }
        });
        btnConfirmAddProyects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmAddProyectsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbBudgetProyect)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBudgetProyect, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbDateInitProyect)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDateInitProyect, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbNameProyect)
                                .addGap(39, 39, 39)
                                .addComponent(txtNameProyect, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbDateFinallyProyect)
                                    .addComponent(lbStatusProyect))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtStatusProyect, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDateFinallyProyect, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lbDescriptionProyect)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtDescriptionProyect, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lbDepartamentProyect, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDepartamentProyect, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnProyects, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(btnConfirmAddProyects, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnProyects, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNameProyect)
                    .addComponent(txtNameProyect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDateInitProyect)
                    .addComponent(txtDateInitProyect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDateFinallyProyect)
                    .addComponent(txtDateFinallyProyect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbStatusProyect)
                    .addComponent(txtStatusProyect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBudgetProyect)
                    .addComponent(txtBudgetProyect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDescriptionProyect)
                    .addComponent(txtDescriptionProyect, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDepartamentProyect)
                    .addComponent(txtDepartamentProyect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnConfirmAddProyects, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
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

  

    public void loadData(Proyects proyecto) {
        this.proyecto = proyecto; 

        if (proyecto != null) {
            
            txtNameProyect.setText(proyecto.getNombre());
            txtDateInitProyect.setText(proyecto.getFechaInicio().toString());
            txtDateFinallyProyect.setText(proyecto.getFechaFin().toString());
            txtStatusProyect.setText(proyecto.getEstado());
            txtBudgetProyect.setText(String.valueOf(proyecto.getPresupuesto()));
            txtDescriptionProyect.setText(proyecto.getDescripcion());
            txtDepartamentProyect.setText(proyecto.getDepartamentoEncargado());
        }
    }
    

    private void guardarProyecto() {
        if (proyecto == null) {
            JOptionPane.showMessageDialog(this, "No se ha cargado un proyecto para editar.");
            return;
        }

        String nombre = txtNameProyect.getText();
        String fechaInicioStr = txtDateInitProyect.getText();
        String fechaFinStr = txtDateFinallyProyect.getText();
        String estado = txtStatusProyect.getText();

        float presupuesto;
        try {
            presupuesto = Float.parseFloat(txtBudgetProyect.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El presupuesto debe ser un número válido.");
            return;
        }

        String descripcion = txtDescriptionProyect.getText();
        String departamentoEncargado = txtDepartamentProyect.getText();

        
        Date fechaInicio;
        Date fechaFin;

        try {
            fechaInicio = Date.valueOf(fechaInicioStr);
            fechaFin = Date.valueOf(fechaFinStr);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "Formato de fecha inválido. Use YYYY-MM-DD.");
            return; 
        }

        
        Proyects proyectoActualizado = new Proyects(
                this.proyecto.getIdProyecto(), 
                nombre,
                fechaInicio,
                fechaFin,
                estado,
                presupuesto,
                descripcion,
                departamentoEncargado
        );

        ClassConexionSQLServer conexion = new ClassConexionSQLServer();

        boolean exito = conexion.editarProyecto(proyectoActualizado);

        if (exito) {
            JOptionPane.showMessageDialog(this, "Proyecto editado con éxito.");
          
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Error al editar el proyecto.");
        }
    }

    private void setupPlaceholders() {
        RecoverPassword recoverPass = new RecoverPassword();
        recoverPass.StylePlaceHolder(txtNameProyect);
        recoverPass.StylePlaceHolder(txtDateInitProyect);
        recoverPass.StylePlaceHolder(txtDateFinallyProyect);
        recoverPass.StylePlaceHolder(txtStatusProyect);
        recoverPass.StylePlaceHolder(txtBudgetProyect);
        recoverPass.StylePlaceHolder(txtDescriptionProyect);
        recoverPass.StylePlaceHolder(txtDepartamentProyect);
    }

    private void txtNameProyectFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameProyectFocusGained
        if (txtNameProyect.getText().equals("Nombre de Proyecto")) {
            txtNameProyect.setText(null);
            txtNameProyect.requestFocus();

            recoverPass.DeleteStylePlaceHolder(txtNameProyect);
        }
    }//GEN-LAST:event_txtNameProyectFocusGained

    private void txtDateInitProyectFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDateInitProyectFocusGained
        if (txtDateInitProyect.getText().equals("(yyyy-MM-dd)")) {
            txtDateInitProyect.setText(null);
            txtDateInitProyect.requestFocus();

            recoverPass.DeleteStylePlaceHolder(txtDateInitProyect);
        }
    }//GEN-LAST:event_txtDateInitProyectFocusGained

    private void txtDateFinallyProyectFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDateFinallyProyectFocusGained
        if (txtDateFinallyProyect.getText().equals("(yyyy-MM-dd)")) {
            txtDateFinallyProyect.setText(null);
            txtDateFinallyProyect.requestFocus();

            recoverPass.DeleteStylePlaceHolder(txtDateFinallyProyect);
        }
    }//GEN-LAST:event_txtDateFinallyProyectFocusGained

    private void txtStatusProyectFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStatusProyectFocusGained
        if (txtStatusProyect.getText().equals("Estado")) {
            txtStatusProyect.setText(null);
            txtStatusProyect.requestFocus();

            recoverPass.DeleteStylePlaceHolder(txtStatusProyect);
        }
    }//GEN-LAST:event_txtStatusProyectFocusGained

    private void txtStatusProyectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusProyectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStatusProyectActionPerformed

    private void txtBudgetProyectFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBudgetProyectFocusGained
        if (txtBudgetProyect.getText().equals("Presupuesto")) {
            txtBudgetProyect.setText(null);
            txtBudgetProyect.requestFocus();

            recoverPass.DeleteStylePlaceHolder(txtBudgetProyect);
        }
    }//GEN-LAST:event_txtBudgetProyectFocusGained

    private void txtDescriptionProyectFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescriptionProyectFocusGained
        if (txtDescriptionProyect.getText().equals("Descripcion")) {
            txtDescriptionProyect.setText(null);
            txtDescriptionProyect.requestFocus();

            recoverPass.DeleteStylePlaceHolder(txtDescriptionProyect);
        }
    }//GEN-LAST:event_txtDescriptionProyectFocusGained

    private void txtDepartamentProyectFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDepartamentProyectFocusGained
        if (txtDepartamentProyect.getText().equals("Departamento Encargado")) {
            txtDepartamentProyect.setText(null);
            txtDepartamentProyect.requestFocus();

            recoverPass.DeleteStylePlaceHolder(txtDepartamentProyect);
        }
    }//GEN-LAST:event_txtDepartamentProyectFocusGained

    private void txtNameProyectFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameProyectFocusLost
        if (txtNameProyect.getText().length() == 0) {
            recoverPass.StylePlaceHolder(txtNameProyect);
            txtNameProyect.setText("Nombre de Proyecto");
        }
    }//GEN-LAST:event_txtNameProyectFocusLost

    private void txtDateInitProyectFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDateInitProyectFocusLost
        if (txtDateInitProyect.getText().length() == 0) {
            recoverPass.StylePlaceHolder(txtDateInitProyect);
            txtDateInitProyect.setText("yyyy-MM-dd");
        }
    }//GEN-LAST:event_txtDateInitProyectFocusLost

    private void txtDateFinallyProyectFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDateFinallyProyectFocusLost
        if (txtDateFinallyProyect.getText().length() == 0) {
            recoverPass.StylePlaceHolder(txtDateFinallyProyect);
            txtDateFinallyProyect.setText("yyyy-MM-dd");
        }
    }//GEN-LAST:event_txtDateFinallyProyectFocusLost

    private void txtStatusProyectFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStatusProyectFocusLost
        if (txtStatusProyect.getText().length() == 0) {
            recoverPass.StylePlaceHolder(txtStatusProyect);
            txtStatusProyect.setText("Estado");
        }
    }//GEN-LAST:event_txtStatusProyectFocusLost

    private void txtBudgetProyectFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBudgetProyectFocusLost
        if (txtBudgetProyect.getText().length() == 0) {
            recoverPass.StylePlaceHolder(txtBudgetProyect);
            txtBudgetProyect.setText("Presupuesto");
        }
    }//GEN-LAST:event_txtBudgetProyectFocusLost

    private void txtDescriptionProyectFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDescriptionProyectFocusLost
        if (txtDescriptionProyect.getText().length() == 0) {
            recoverPass.StylePlaceHolder(txtDescriptionProyect);
            txtDescriptionProyect.setText("Descripcion");
        }
    }//GEN-LAST:event_txtDescriptionProyectFocusLost

    private void txtDepartamentProyectFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDepartamentProyectFocusLost
        if (txtDepartamentProyect.getText().length() == 0) {
            recoverPass.StylePlaceHolder(txtDepartamentProyect);
            txtDepartamentProyect.setText("Departamento Encargado");
        }
    }//GEN-LAST:event_txtDepartamentProyectFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void btnProyectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProyectsActionPerformed
        Home home = new Home();
        home.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnProyectsActionPerformed

    private void btnConfirmAddProyectsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmAddProyectsMouseClicked

    }//GEN-LAST:event_btnConfirmAddProyectsMouseClicked

    private void btnConfirmAddProyectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmAddProyectsActionPerformed
        guardarProyecto();
    

    }//GEN-LAST:event_btnConfirmAddProyectsActionPerformed

    private void txtDescriptionProyectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionProyectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriptionProyectActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirmAddProyects;
    private javax.swing.JButton btnProyects;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbBudgetProyect;
    private javax.swing.JLabel lbDateFinallyProyect;
    private javax.swing.JLabel lbDateInitProyect;
    private javax.swing.JLabel lbDepartamentProyect;
    private javax.swing.JLabel lbDescriptionProyect;
    private javax.swing.JLabel lbNameProyect;
    private javax.swing.JLabel lbStatusProyect;
    private javax.swing.JTextField txtBudgetProyect;
    private javax.swing.JTextField txtDateFinallyProyect;
    private javax.swing.JTextField txtDateInitProyect;
    private javax.swing.JTextField txtDepartamentProyect;
    private javax.swing.JTextField txtDescriptionProyect;
    private javax.swing.JTextField txtNameProyect;
    private javax.swing.JTextField txtStatusProyect;
    // End of variables declaration//GEN-END:variables
}
