package login;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import koneksi.Koneksi;
import master.MenuUtama;

public class SignIn extends javax.swing.JFrame {

    private Connection conn = new Koneksi().connect();

    public SignIn() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        txtUsername.requestFocus();
        btnSignIn.setFocusPainted(false);
        btnSignUp.setFocusPainted(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRounded1 = new component.panelrounded.PanelRounded();
        btnSignIn = new swing.ButtonOutLine();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelRounded2 = new component.panelrounded.PanelRounded();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSignUp = new swing.Button();
        jLabel6 = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        txtUsername = new swing.TextField();
        txtPassword = new swing.MyPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelRounded1.setBackground(new java.awt.Color(15, 28, 46));
        panelRounded1.setRoudTopLeft(20);
        panelRounded1.setRoundBottomLeft(20);
        panelRounded1.setRoundBottomRight(20);
        panelRounded1.setRoundTopRight(20);

        btnSignIn.setBackground(new java.awt.Color(77, 100, 141));
        btnSignIn.setForeground(new java.awt.Color(224, 224, 224));
        btnSignIn.setText("SIGN IN");
        btnSignIn.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sign In");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(224, 224, 224));
        jLabel2.setText("Forgot your password ?\"");

        panelRounded2.setBackground(new java.awt.Color(31, 43, 62));
        panelRounded2.setRoundBottomRight(30);
        panelRounded2.setRoundTopRight(30);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(224, 224, 224));
        jLabel3.setText("Hi, Friend!");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(224, 224, 224));
        jLabel4.setText("Enter your personal details");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(224, 224, 224));
        jLabel5.setText("and start journey with us");

        btnSignUp.setBackground(new java.awt.Color(77, 100, 141));
        btnSignUp.setForeground(new java.awt.Color(224, 224, 224));
        btnSignUp.setText("SIGN UP");
        btnSignUp.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hello.png"))); // NOI18N

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/close_1.png"))); // NOI18N
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRounded2Layout = new javax.swing.GroupLayout(panelRounded2);
        panelRounded2.setLayout(panelRounded2Layout);
        panelRounded2Layout.setHorizontalGroup(
            panelRounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRounded2Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(panelRounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRounded2Layout.createSequentialGroup()
                        .addGroup(panelRounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRounded2Layout.createSequentialGroup()
                        .addComponent(btnClose)
                        .addContainerGap())))
        );
        panelRounded2Layout.setVerticalGroup(
            panelRounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRounded2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnClose)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(40, 40, 40)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );

        txtUsername.setHint("Email");
        txtUsername.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/mail.png"))); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        txtPassword.setHint("Password");
        txtPassword.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pass.png"))); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelRounded1Layout = new javax.swing.GroupLayout(panelRounded1);
        panelRounded1.setLayout(panelRounded1Layout);
        panelRounded1Layout.setHorizontalGroup(
            panelRounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRounded1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(panelRounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addComponent(panelRounded2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelRounded1Layout.setVerticalGroup(
            panelRounded1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRounded2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelRounded1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRounded1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRounded1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        String username = txtUsername.getText();
        String password = txtPassword.getText();

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Username dan password tidak boleh kosong");
            return;
        }

        try {
            String sql = "SELECT * FROM user WHERE username=? AND password=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, password); // Pertimbangkan untuk menggunakan password yang di-hash di sini
            ResultSet hasil = pstmt.executeQuery();

            if (hasil.next()) {
                String id = hasil.getString("iduser"); // Sesuaikan dengan nama kolom yang benar di database
                String nama = hasil.getString("username"); // Sesuaikan dengan kolom yang benar
                String level = hasil.getString("lavel"); // Sesuaikan dengan kolom level/lavel yang benar

                UserID.setUserLogin(nama); // Tetap bisa digunakan untuk login tracking
                JOptionPane.showMessageDialog(null, "Login Berhasil");

                // Panggil constructor MenuUtama dengan parameter yang sesuai
                new MenuUtama(id, nama, level).setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Username atau Password Salah");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal untuk login: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSignInActionPerformed

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        dispose();
    }//GEN-LAST:event_btnCloseMouseClicked

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        txtPassword.requestFocus();
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        SignUp su = new SignUp();
        su.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        btnSignIn.doClick();
    }//GEN-LAST:event_txtPasswordActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnClose;
    private swing.ButtonOutLine btnSignIn;
    private swing.Button btnSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private component.panelrounded.PanelRounded panelRounded1;
    private component.panelrounded.PanelRounded panelRounded2;
    private swing.MyPasswordField txtPassword;
    private swing.TextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
