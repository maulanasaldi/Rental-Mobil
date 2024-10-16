package login;

import component.PanelLoading;
import java.awt.Color;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.SwingUtilities;

import net.miginfocom.swing.MigLayout;

public class SignUp extends javax.swing.JFrame {

    private PanelLoading loading;

    public SignUp() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        btnSignUp.setFocusPainted(false);
        init();
    }

    private void init() {
        loading = new PanelLoading();
        loading.setBounds(0, 0, bg.getWidth(), bg.getHeight()); // Sesuaikan ukuran agar menutupi seluruh 'bg'
        bg.setLayout(null); // Gunakan layout null untuk penempatan manual
        bg.add(loading);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new component.panelrounded.PanelRounded();
        btnSignUp = new swing.ButtonOutLine();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelRounded2 = new component.panelrounded.PanelRounded();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSignIn = new swing.Button();
        jLabel6 = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        txtName = new swing.TextField();
        txtEmail = new swing.TextField();
        txtPass = new swing.MyPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(15, 28, 46));
        bg.setRoudTopLeft(20);
        bg.setRoundBottomLeft(20);
        bg.setRoundBottomRight(20);
        bg.setRoundTopRight(20);

        btnSignUp.setBackground(new java.awt.Color(77, 100, 141));
        btnSignUp.setForeground(new java.awt.Color(224, 224, 224));
        btnSignUp.setText("SIGN UP");
        btnSignUp.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
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
        jLabel3.setText("Welcome Back!");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(224, 224, 224));
        jLabel4.setText("To keep connected with us please");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(224, 224, 224));
        jLabel5.setText("login with your personal info");

        btnSignIn.setBackground(new java.awt.Color(77, 100, 141));
        btnSignIn.setForeground(new java.awt.Color(224, 224, 224));
        btnSignIn.setText("SIGN IN");
        btnSignIn.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignInActionPerformed(evt);
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
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(panelRounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRounded2Layout.createSequentialGroup()
                        .addGroup(panelRounded2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(50, 50, 50))
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
                .addGap(48, 48, 48)
                .addComponent(btnSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        txtName.setHint("Name");
        txtName.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtEmail.setHint("Email");
        txtEmail.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/mail.png"))); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtPass.setHint("Password");
        txtPass.setPrefixIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pass.png"))); // NOI18N
        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSignUp, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPass, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(panelRounded2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRounded2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        dispose();
    }//GEN-LAST:event_btnCloseMouseClicked

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        txtEmail.requestFocus();
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        txtPass.requestFocus();
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        btnSignUp.doClick();
    }//GEN-LAST:event_txtPassActionPerformed

    private void btnSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignInActionPerformed
        SignIn si = new SignIn();
        si.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSignInActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        register();
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void register() {
        loading.setVisible(true); // Tampilkan loading panel
        System.out.println("klik");

        // Simulasikan proses latar belakang
        new Thread(() -> {
            try {
                Thread.sleep(2000); // Simulasi penundaan proses
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            SwingUtilities.invokeLater(() -> loading.setVisible(false)); // Sembunyikan loading panel setelah selesai
        }).start();
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.panelrounded.PanelRounded bg;
    private javax.swing.JLabel btnClose;
    private swing.Button btnSignIn;
    private swing.ButtonOutLine btnSignUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private component.panelrounded.PanelRounded panelRounded2;
    private swing.TextField txtEmail;
    private swing.TextField txtName;
    private swing.MyPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
