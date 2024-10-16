/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package master;

import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.Koneksi;

public class Form_User extends javax.swing.JPanel {

    private Connection conn = new Koneksi().connect();
    private DefaultTableModel tabelModel;
            
    public Form_User() {
        initComponents();
        aktif();
        kosong();
        dataTable();
        autonumber();
    }

    private void aktif(){
        txtUsername.requestFocus();
    }
    
    private void kosong(){
        txtid.setText("");
        txtUsername.setText("");
        txtNama.setText("");
        txtNoTelp.setText("");
        txtPass.setText("");
        cbLevel.setSelectedItem(null);
    }
    
    private void dataTable(){
        Object[] Baris = {"ID","Nama","Username","Password","No Telfon","Level"};
        tabelModel = new DefaultTableModel(null, Baris);
        String cariItem = txtCari.getText();
        
        try {
            String sql = "select * from user where iduser like '%"+cariItem+"%' or nmuser like'%"+cariItem+"%' or lavel like'%"+cariItem+"%' order by iduser asc";
            Statement stat = conn.prepareStatement(sql);
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                tabelModel.addRow(new Object[]{
                    hasil.getString(1),
                    hasil.getString(2),
                    hasil.getString(3),
                    hasil.getString(4),
                    hasil.getString(5),
                    hasil.getString(6),
                });
            }
            tabelKasir.setModel(tabelModel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data gagal dipanggil"+e);
        }
    }
    
    protected void autonumber(){
        try {
            
            String sql = "select iduser from user order by iduser asc";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            txtid.setText("AB001");     // ada kesalahan pdf txfId
            
            while(rs.next()){
                String id_user = rs.getString("iduser").substring(2);
                int AN = Integer.parseInt(id_user)+1;
                String Nol = "";
                
                if(AN<10){
                    Nol = "000";
                }
                else if(AN<100){
                    Nol = "00";
                }
                else if(AN<1000){
                    Nol = "0";
                }
                else if(AN<10000){
                    Nol = "";
                }
                txtid.setText("AB"+Nol+AN); // ada kesalahan pdf txfId
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "AutoNumber GAGAL");
        }         
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        formBarang = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cbLevel = new javax.swing.JComboBox<>();
        txtid = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtNoTelp = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        btnCari = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelKasir = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1025, 700));
        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        formBarang.setBackground(new java.awt.Color(15, 28, 46));

        jPanel1.setBackground(new java.awt.Color(31, 43, 62));

        jLabel1.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No Telepon");

        jLabel5.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");

        jLabel6.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Level");

        btnSimpan.setBackground(new java.awt.Color(206, 232, 253));
        btnSimpan.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.setPreferredSize(new java.awt.Dimension(80, 30));
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(206, 232, 253));
        btnHapus.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        btnHapus.setText("HAPUS");
        btnHapus.setPreferredSize(new java.awt.Dimension(80, 30));
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(206, 232, 253));
        btnEdit.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        btnEdit.setText("EDIT");
        btnEdit.setPreferredSize(new java.awt.Dimension(80, 30));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID");

        cbLevel.setBackground(new java.awt.Color(15, 28, 46));
        cbLevel.setForeground(new java.awt.Color(255, 255, 255));
        cbLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kasir", "Admin" }));
        cbLevel.setPreferredSize(new java.awt.Dimension(72, 30));

        txtid.setBackground(new java.awt.Color(15, 28, 46));
        txtid.setForeground(new java.awt.Color(255, 255, 255));

        txtUsername.setBackground(new java.awt.Color(15, 28, 46));
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setPreferredSize(new java.awt.Dimension(71, 30));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        txtNama.setBackground(new java.awt.Color(15, 28, 46));
        txtNama.setForeground(new java.awt.Color(255, 255, 255));
        txtNama.setPreferredSize(new java.awt.Dimension(64, 30));

        txtNoTelp.setBackground(new java.awt.Color(15, 28, 46));
        txtNoTelp.setForeground(new java.awt.Color(255, 255, 255));
        txtNoTelp.setPreferredSize(new java.awt.Dimension(64, 30));

        txtPass.setBackground(new java.awt.Color(15, 28, 46));
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setPreferredSize(new java.awt.Dimension(64, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNoTelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbLevel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtid)
                            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        jLabel7.setFont(new java.awt.Font("Bitstream Charter", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Data User");

        btnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search-interface-symbol (1).png"))); // NOI18N
        btnCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCariMouseClicked(evt);
            }
        });

        txtCari.setBackground(new java.awt.Color(15, 28, 46));
        txtCari.setForeground(new java.awt.Color(255, 255, 255));
        txtCari.setPreferredSize(new java.awt.Dimension(64, 30));
        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });

        tabelKasir.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelKasir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelKasirMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelKasir);

        javax.swing.GroupLayout formBarangLayout = new javax.swing.GroupLayout(formBarang);
        formBarang.setLayout(formBarangLayout);
        formBarangLayout.setHorizontalGroup(
            formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formBarangLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formBarangLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(635, 635, 635)
                        .addComponent(btnCari)
                        .addGap(18, 18, 18)
                        .addComponent(txtCari, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                    .addGroup(formBarangLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        formBarangLayout.setVerticalGroup(
            formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formBarangLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        mainPanel.add(formBarang, "card2");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        String sql = "insert into user values (?,?,?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtid.getText());
            stat.setString(2, txtNama.getText());
            stat.setString(3, txtUsername.getText());
            stat.setString(4, txtPass.getText());
            stat.setString(5, txtNoTelp.getText());
            stat.setString(6, cbLevel.getSelectedItem().toString());
            
            stat.executeUpdate();
            kosong();
            txtUsername.requestFocus();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan"+e);
        }
        dataTable();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            String sql = "update user set nmuser=?,username=?,password=?,notlpn=?,lavel=? where iduser='"+txtid.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtNama.getText());
            stat.setString(2, txtUsername.getText());
            stat.setString(3, txtPass.getText());
            stat.setString(4, txtNoTelp.getText());
            stat.setString(5, cbLevel.getSelectedItem().toString());
            
            stat.executeUpdate();
            kosong();
            txtUsername.requestFocus();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data gagal diedit"+e);
        }
        dataTable();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Hapus", "Konfirmasi dialog", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            String sql = "dalate from user where iduser='"+txtid.getText()+"'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil dihaapus");
                kosong();
                txtUsername.requestFocus();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data gagal dihapus"+e);
            }
            dataTable();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCariMouseClicked
        dataTable();
        txtCari.setText("");
    }//GEN-LAST:event_btnCariMouseClicked

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed

    private void tabelKasirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelKasirMouseClicked
        int bar = tabelKasir.getSelectedRow();
        String a = tabelModel.getValueAt(bar, 0).toString();
        String b = tabelModel.getValueAt(bar, 1).toString();
        String c = tabelModel.getValueAt(bar, 2).toString();
        String d = tabelModel.getValueAt(bar, 3).toString();
        String e = tabelModel.getValueAt(bar, 4).toString();
        String f = tabelModel.getValueAt(bar, 5).toString();
        
        txtid.setText(a);
        txtUsername.setText(c);
        txtNama.setText(b);
        txtNoTelp.setText(e);
        txtPass.setText(d);
        cbLevel.setSelectedItem(f);
    }//GEN-LAST:event_tabelKasirMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCari;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cbLevel;
    private javax.swing.JPanel formBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable tabelKasir;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoTelp;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
