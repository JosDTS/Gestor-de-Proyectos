/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gestorproyectos;
import ConexionSQL.ClassConexionSQLServer;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

/**
 *
 * @author ESTUDIANTE
 */
public class Login extends JFrame {

    /**
     * Creates new form Login
     */
    RecoverPassword recoverPass = new RecoverPassword();
    Register register = new Register();
    Home home = new Home();

    public Login() {
        initComponents();
        setTitle("Login");

        recoverPass.StylePlaceHolder(txtUser);
        recoverPass.StylePlaceHolder(txtPass);

        initStyles();
    }

    private void initStyles() {

        // Cambia de color la letra con el puntero Recuperar Contraseña
        JLb_RecuperarContraseña.addMouseListener(new java.awt.event.MouseAdapter() {

            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLb_RecuperarContraseñaMouseClicked(evt);

            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLb_RecuperarContraseña.setForeground(new Color(0, 153, 153)); // Cambia el color al pasar el mouse
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLb_RecuperarContraseña.setForeground(new Color(51, 51, 51)); // Restaura el color original
            }
        });

        //Se cambia  de color las letras de la palabra registro al pasar el cursor 
        JLb_Registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JLb_RegistrarseMouseClicked(evt);
            }

            @Override
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JLb_Registrarse.setForeground(new Color(0, 153, 153)); // Cambia el color al pasar el mouse
            }

            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JLb_Registrarse.setForeground(new Color(51, 51, 51)); // Restaura el color original
            }
        });

    }

    //Metodos para que se vean las ventanas de la aplicacion
    private void JLb_RecuperarContraseñaMouseClicked(java.awt.event.MouseEvent evt) {

        String Check_Email = JOptionPane.showInputDialog(null, " Ingrese su email ");

        if (Check_Email != null) {
            recoverPass.setVisible(true);
            this.dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Email no registrado.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }

    private void JLb_RegistrarseMouseClicked(java.awt.event.MouseEvent evt) {

        register.setVisible(true);
        this.dispose();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label2 = new java.awt.Label();
        background = new javax.swing.JPanel();
        jL_LogoContainer = new javax.swing.JPanel();
        jL_Logo = new javax.swing.JLabel();
        containerLogin = new java.awt.Panel();
        label1 = new java.awt.Label();
        Msj_Login = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Ingresar_btn = new javax.swing.JButton();
        JLb_RecuperarContraseña = new javax.swing.JLabel();
        JLb_Registrarse = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();

        label2.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        background.setForeground(new java.awt.Color(255, 255, 255));

        jL_LogoContainer.setBackground(new java.awt.Color(1, 155, 152));

        jL_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LogoNexxus.png"))); // NOI18N

        javax.swing.GroupLayout jL_LogoContainerLayout = new javax.swing.GroupLayout(jL_LogoContainer);
        jL_LogoContainer.setLayout(jL_LogoContainerLayout);
        jL_LogoContainerLayout.setHorizontalGroup(
            jL_LogoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jL_LogoContainerLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jL_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jL_LogoContainerLayout.setVerticalGroup(
            jL_LogoContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jL_LogoContainerLayout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jL_Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );

        containerLogin.setBackground(new java.awt.Color(255, 255, 255));

        label1.setText("label1");

        Msj_Login.setBackground(new java.awt.Color(0, 0, 0));
        Msj_Login.setFont(new java.awt.Font("Source Serif Pro Light", 1, 36)); // NOI18N
        Msj_Login.setForeground(new java.awt.Color(0, 0, 0));
        Msj_Login.setText("Iniciar Seción");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/User1.png"))); // NOI18N

        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(204, 204, 204));
        txtUser.setText("Ingrese su email");
        txtUser.setBorder(null);
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUserMousePressed(evt);
            }
        });
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });

        label3.setText("label3");

        label4.setFont(new java.awt.Font("Source Serif Pro", 0, 18)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 51, 51));
        label4.setText("Email: ");

        label5.setText("label5");

        label6.setFont(new java.awt.Font("Source Serif Pro", 0, 18)); // NOI18N
        label6.setForeground(new java.awt.Color(0, 51, 51));
        label6.setText("Contraseña: ");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Password.png"))); // NOI18N

        Ingresar_btn.setBackground(new java.awt.Color(0, 153, 153));
        Ingresar_btn.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        Ingresar_btn.setForeground(new java.awt.Color(255, 255, 255));
        Ingresar_btn.setText("Ingresar");
        Ingresar_btn.setBorderPainted(false);
        Ingresar_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ingresar_btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ingresar_btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Ingresar_btnMouseExited(evt);
            }
        });
        Ingresar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingresar_btnActionPerformed(evt);
            }
        });

        JLb_RecuperarContraseña.setFont(new java.awt.Font("Source Serif Pro", 0, 14)); // NOI18N
        JLb_RecuperarContraseña.setForeground(new java.awt.Color(51, 51, 51));
        JLb_RecuperarContraseña.setText("¿Olvidaste tu contraseña?");

        JLb_Registrarse.setFont(new java.awt.Font("Source Sans Pro", 0, 14)); // NOI18N
        JLb_Registrarse.setForeground(new java.awt.Color(51, 51, 51));
        JLb_Registrarse.setText("Registrarse");

        txtPass.setBackground(new java.awt.Color(255, 255, 255));
        txtPass.setFont(new java.awt.Font("Source Serif Pro", 0, 14)); // NOI18N
        txtPass.setText("Contraseña");
        txtPass.setBorder(null);
        txtPass.setEchoChar('\u0000');
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });

        javax.swing.GroupLayout containerLoginLayout = new javax.swing.GroupLayout(containerLogin);
        containerLogin.setLayout(containerLoginLayout);
        containerLoginLayout.setHorizontalGroup(
            containerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLoginLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(containerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLoginLayout.createSequentialGroup()
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(317, Short.MAX_VALUE))
                    .addGroup(containerLoginLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(JLb_RecuperarContraseña)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JLb_Registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerLoginLayout.createSequentialGroup()
                        .addGroup(containerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(containerLoginLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPass))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, containerLoginLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, containerLoginLayout.createSequentialGroup()
                                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(70, 70, 70))))
            .addGroup(containerLoginLayout.createSequentialGroup()
                .addGroup(containerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(containerLoginLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(Msj_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(containerLoginLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(Ingresar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        containerLoginLayout.setVerticalGroup(
            containerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerLoginLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Msj_Login)
                .addGap(50, 50, 50)
                .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(containerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(containerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(txtPass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(containerLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLb_RecuperarContraseña)
                    .addComponent(JLb_Registrarse))
                .addGap(39, 39, 39)
                .addComponent(Ingresar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(jL_LogoContainer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(containerLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jL_LogoContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(containerLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void Ingresar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingresar_btnActionPerformed
     // Obtener los datos del formulario
    String email = txtUser.getText();  // Email ingresado
    String contraseña = new String(txtPass.getPassword());  // Contraseña ingresada

    // Crear la clase de conexión
    ClassConexionSQLServer conexion = new ClassConexionSQLServer();
    
    // Verificar las credenciales
    if (conexion.VerifyLogin(email, contraseña)) {
        JOptionPane.showMessageDialog(this, "Inicio de sesión exitoso");
        home.setVisible(true);
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(this, "Email o contraseña incorrectos");
    }


    }//GEN-LAST:event_Ingresar_btnActionPerformed

    private void Ingresar_btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ingresar_btnMouseEntered
        Ingresar_btn.setBackground(new Color(0, 170, 170));
    }//GEN-LAST:event_Ingresar_btnMouseEntered


    private void Ingresar_btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ingresar_btnMouseExited
        Ingresar_btn.setBackground(new Color(0, 153, 153));
    }//GEN-LAST:event_Ingresar_btnMouseExited

    private void txtUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMousePressed


    }//GEN-LAST:event_txtUserMousePressed

    private void Ingresar_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ingresar_btnMouseClicked

    }//GEN-LAST:event_Ingresar_btnMouseClicked

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        if (txtUser.getText().equals("Ingrese su email")) {
            txtUser.setText(null);
            txtUser.requestFocus();
            recoverPass.DeleteStylePlaceHolder(txtUser);
        }
    }//GEN-LAST:event_txtUserFocusGained

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        if (txtUser.getText().length() == 0) {
            recoverPass.StylePlaceHolder(txtUser);
            txtUser.setText("Ingrese su email");
        }
    }//GEN-LAST:event_txtUserFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        if (txtPass.getText().equals("Contraseña")) {
            txtPass.setText(null);
            txtPass.requestFocus();
            txtPass.setEchoChar('*');
            recoverPass.DeleteStylePlaceHolder(txtPass);

        }
    }//GEN-LAST:event_txtPassFocusGained

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        if (txtPass.getText().length() == 0) {
            recoverPass.StylePlaceHolder(txtPass);
            txtPass.setText("Contraseña");
            txtPass.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_txtPassFocusLost

    public static void main(String args[]) {

        FlatLightLaf.setup();
        Login loginFrame = new Login();
        loginFrame.setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ingresar_btn;
    private javax.swing.JLabel JLb_RecuperarContraseña;
    private javax.swing.JLabel JLb_Registrarse;
    private javax.swing.JLabel Msj_Login;
    private javax.swing.JPanel background;
    private java.awt.Panel containerLogin;
    private javax.swing.JLabel jL_Logo;
    private javax.swing.JPanel jL_LogoContainer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
