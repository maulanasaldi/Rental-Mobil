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

public class Form_Pelanggan extends javax.swing.JPanel {
    
    private Connection conn = new Koneksi().connect();
    private DefaultTableModel tabelModel;
            
    public Form_Pelanggan() {
        initComponents();
        aktif();
        kosong();
        dataTable();
    }
    
    private void aktif(){
        txtNama.requestFocus();
    }
    
    private void kosong(){
        txtId.setText("");
        txtNama.setText("");
        txtNoId.setText("");
        txtNoTelp.setText("");
        txtAlamat.setText("");
    }
    
    private void dataTable(){
        Object[] Baris = {"ID","Nama","No. Identitas","No Telepon","Alamat"};
        tabelModel = new DefaultTableModel(null,Baris);
        String cariItem = txtCari.getText();
        
        try {
            String sql = "SELECT * FROM pelanggan where idplgn like'%"+cariItem+"%'or nama like'%"+cariItem+"%'order by idplgn asc";
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                tabelModel.addRow(new Object[]{
                    hasil.getString(1),
                    hasil.getString(2),
                    hasil.getString(3),
                    hasil.getString(4),
                    hasil.getString(5),
                });
            }
            tblPelanggan.setModel(tabelModel);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data gagal dipanggail"+e);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtNoId = new javax.swing.JTextField();
        txtNoTelp = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        btnCari = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPelanggan = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1025, 955));
        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        formBarang.setBackground(new java.awt.Color(15, 28, 46));

        jPanel1.setBackground(new java.awt.Color(31, 43, 62));

        jLabel1.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID ");

        jLabel2.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("No. Identitas");

        jLabel4.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No Telepon");

        jLabel6.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Alamat");

        btnSimpan.setBackground(new java.awt.Color(206, 232, 253));
        btnSimpan.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        btnSimpan.setText("SIMPAN");
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

        txtId.setBackground(new java.awt.Color(15, 28, 46));
        txtId.setForeground(new java.awt.Color(255, 255, 255));
        txtId.setPreferredSize(new java.awt.Dimension(71, 30));

        txtNama.setBackground(new java.awt.Color(15, 28, 46));
        txtNama.setForeground(new java.awt.Color(255, 255, 255));
        txtNama.setPreferredSize(new java.awt.Dimension(71, 30));

        txtNoId.setBackground(new java.awt.Color(15, 28, 46));
        txtNoId.setForeground(new java.awt.Color(255, 255, 255));
        txtNoId.setPreferredSize(new java.awt.Dimension(71, 30));

        txtNoTelp.setBackground(new java.awt.Color(15, 28, 46));
        txtNoTelp.setForeground(new java.awt.Color(255, 255, 255));
        txtNoTelp.setPreferredSize(new java.awt.Dimension(71, 30));

        txtAlamat.setBackground(new java.awt.Color(15, 28, 46));
        txtAlamat.setColumns(20);
        txtAlamat.setForeground(new java.awt.Color(255, 255, 255));
        txtAlamat.setRows(5);
        jScrollPane2.setViewportView(txtAlamat);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNoTelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNoId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNoId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNoTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Bitstream Charter", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Data Pelanggan");

        btnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search-interface-symbol (1).png"))); // NOI18N
        btnCari.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                btnCariAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        btnCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCariMouseClicked(evt);
            }
        });

        txtCari.setBackground(new java.awt.Color(15, 28, 46));
        txtCari.setForeground(new java.awt.Color(255, 255, 255));
        txtCari.setPreferredSize(new java.awt.Dimension(64, 30));

        tblPelanggan.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPelangganMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPelanggan);

        javax.swing.GroupLayout formBarangLayout = new javax.swing.GroupLayout(formBarang);
        formBarang.setLayout(formBarangLayout);
        formBarangLayout.setHorizontalGroup(
            formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formBarangLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formBarangLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(formBarangLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 485, Short.MAX_VALUE)
                        .addComponent(btnCari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        formBarangLayout.setVerticalGroup(
            formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formBarangLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(formBarangLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(formBarangLayout.createSequentialGroup()
                        .addGroup(formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCari))
                        .addGap(19, 19, 19)))
                .addGroup(formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(288, Short.MAX_VALUE))
        );

        mainPanel.add(formBarang, "card2");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        String sql = "insert into pelanggan values (?,?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtId.getText());
            stat.setString(2, txtNama.getText());
            stat.setString(3, txtNoId.getText());
            stat.setString(4, txtNoTelp.getText());
            stat.setString(5, txtAlamat.getText());
            
            stat.executeUpdate();
            kosong();
            txtNama.requestFocus();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan"+e);
        }
        dataTable();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try {
            String sql = "update pelanggan set nama=?, noidentitas=?, notelp=?, alamat=? where idplgn='"+txtId.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtNama.getText());
            stat.setString(2, txtNoId.getText());
            stat.setString(3, txtNoTelp.getText());
            stat.setString(4, txtAlamat.getText());            
            
            stat.executeUpdate();
            kosong();
            txtNama.requestFocus();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data gagal diedit"+e);
        }
        dataTable();      
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Hapus","Konfirmasi dialog",JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            String sql = "delete from pelanggan where idplgn ='"+txtId.getText()+"'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                kosong();
                txtNama.requestFocus();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data gagal dihapus"+e);
            }
        }
        dataTable();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCariAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_btnCariAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCariAncestorAdded

    private void btnCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCariMouseClicked
        dataTable();
    }//GEN-LAST:event_btnCariMouseClicked

    private void tblPelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPelangganMouseClicked
        int bar = tblPelanggan.getSelectedRow();
        String a = tabelModel.getValueAt(bar, 0).toString();
        String b = tabelModel.getValueAt(bar, 1).toString();
        String c = tabelModel.getValueAt(bar, 2).toString();
        String d = tabelModel.getValueAt(bar, 3).toString();
        String e = tabelModel.getValueAt(bar, 4).toString();
        
        txtId.setText(a);
        txtNama.setText(b);
        txtNoId.setText(c);
        txtNoTelp.setText(d);
        txtAlamat.setText(e);
    }//GEN-LAST:event_tblPelangganMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCari;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JPanel formBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable tblPelanggan;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNoId;
    private javax.swing.JTextField txtNoTelp;
    // End of variables declaration//GEN-END:variables
}
