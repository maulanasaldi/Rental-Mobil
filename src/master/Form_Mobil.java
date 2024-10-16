/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package master;

import java.sql.*;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import koneksi.Koneksi;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author saldi
 */
public class Form_Mobil extends javax.swing.JPanel {
    private Connection conn = new Koneksi().connect();   
    private DefaultTableModel tabelmodel;
    public Form_Mobil() {
        initComponents();
        aktif();
        kosong();
        dataTable();
    }
    
    private void aktif(){
        cbMerek.requestFocus();
    }
    
    private void kosong(){
        txtKode.setText("");
        cbMerek.setSelectedItem(null);
        txtTahun.setText("");
        txtNoPolis.setText("");
        txtHarga.setText(""); 
    }
    
    private void dataTable(){
            Object[] Baris = {"Kode","Merek","Tahun","No Polisi","Harga"};
            tabelmodel = new DefaultTableModel(null, Baris);
            String cariItem = txtCari.getText();
            
            try {
                String sql = "SELECT * FROM mobil where kdmobil like '%"+cariItem+"%' or merek like '%"+cariItem+"%' order by kdmobil asc";
                Statement stat = conn.createStatement();
                ResultSet hasil = stat.executeQuery(sql);
                while (hasil.next()) {
                    tabelmodel.addRow(new Object[]{
                        hasil.getString(1),
                        hasil.getString(2),
                        hasil.getString(3),
                        hasil.getString(4),
                        hasil.getString(5),
                    });
                }
                tabelMobil.setModel(tabelmodel);
        } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data gagal dipanggil"+e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        formMobil = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btSimpan = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        cbMerek = new javax.swing.JComboBox<>();
        txtKode = new javax.swing.JTextField();
        txtTahun = new javax.swing.JTextField();
        txtNoPolis = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnCari = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMobil = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1025, 800));
        setLayout(new java.awt.CardLayout());

        mainPanel.setLayout(new java.awt.CardLayout());

        formMobil.setBackground(new java.awt.Color(15, 28, 46));
        formMobil.setPreferredSize(new java.awt.Dimension(1025, 600));

        jPanel1.setBackground(new java.awt.Color(31, 43, 62));

        jLabel1.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kode");

        jLabel2.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Merek ");

        jLabel3.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tahun");

        jLabel4.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No. Polisi");

        btSimpan.setBackground(new java.awt.Color(206, 232, 253));
        btSimpan.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        btSimpan.setText("SIMPAN");
        btSimpan.setPreferredSize(new java.awt.Dimension(80, 30));
        btSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSimpanActionPerformed(evt);
            }
        });

        btHapus.setBackground(new java.awt.Color(206, 232, 253));
        btHapus.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        btHapus.setText("HAPUS");
        btHapus.setPreferredSize(new java.awt.Dimension(80, 30));
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });

        btEdit.setBackground(new java.awt.Color(206, 232, 253));
        btEdit.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        btEdit.setText("EDIT");
        btEdit.setPreferredSize(new java.awt.Dimension(80, 30));
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Harga");

        cbMerek.setBackground(new java.awt.Color(15, 28, 46));
        cbMerek.setForeground(new java.awt.Color(255, 255, 255));
        cbMerek.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Honda", "Mazda", "Bmw", "Nissan", "Suzuki", "Daihatsu", "Toyota", "Mercedes", "Proton" }));
        cbMerek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMerekActionPerformed(evt);
            }
        });

        txtKode.setBackground(new java.awt.Color(15, 28, 46));
        txtKode.setForeground(new java.awt.Color(255, 255, 255));
        txtKode.setPreferredSize(new java.awt.Dimension(64, 30));

        txtTahun.setBackground(new java.awt.Color(15, 28, 46));
        txtTahun.setForeground(new java.awt.Color(255, 255, 255));
        txtTahun.setPreferredSize(new java.awt.Dimension(64, 30));

        txtNoPolis.setBackground(new java.awt.Color(15, 28, 46));
        txtNoPolis.setForeground(new java.awt.Color(255, 255, 255));
        txtNoPolis.setPreferredSize(new java.awt.Dimension(64, 30));

        txtHarga.setBackground(new java.awt.Color(15, 28, 46));
        txtHarga.setForeground(new java.awt.Color(255, 255, 255));
        txtHarga.setPreferredSize(new java.awt.Dimension(64, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNoPolis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTahun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMerek, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 6, Short.MAX_VALUE)
                                .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHarga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMerek, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNoPolis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Bitstream Charter", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Data Mobil");

        btnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search-interface-symbol (1).png"))); // NOI18N
        btnCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCariMouseClicked(evt);
            }
        });

        txtCari.setBackground(new java.awt.Color(15, 28, 46));
        txtCari.setForeground(new java.awt.Color(255, 255, 255));
        txtCari.setOpaque(true);
        txtCari.setPreferredSize(new java.awt.Dimension(64, 30));

        tabelMobil.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelMobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMobilMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelMobil);

        javax.swing.GroupLayout formMobilLayout = new javax.swing.GroupLayout(formMobil);
        formMobil.setLayout(formMobilLayout);
        formMobilLayout.setHorizontalGroup(
            formMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formMobilLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(formMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formMobilLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 575, Short.MAX_VALUE)
                        .addComponent(btnCari)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formMobilLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)))
                .addGap(20, 20, 20))
        );
        formMobilLayout.setVerticalGroup(
            formMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formMobilLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(formMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCari)))
                .addGap(30, 30, 30)
                .addGroup(formMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1622, Short.MAX_VALUE))
        );

        mainPanel.add(formMobil, "card2");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSimpanActionPerformed
        String sql = "insert into mobil values (?,?,?,?,?)";
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtKode.getText());
            stat.setString(2, cbMerek.getSelectedItem().toString());
            stat.setString(3, txtTahun.getText());
            stat.setString(4, txtNoPolis.getText());
            stat.setString(5, txtHarga.getText());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
            kosong();
            cbMerek.requestFocus();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan"+e);
        }
        dataTable();
    }//GEN-LAST:event_btSimpanActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        try {
            String sql = "update mobil set merek=?,tahun=?,nopolisi=?,harga=? where kdmobil='"+txtKode.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, cbMerek.getSelectedItem().toString());
            stat.setString(2, txtTahun.getText());
            stat.setString(3, txtNoPolis.getText());
            stat.setString(4, txtHarga.getText());
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil diubah");
            cbMerek.requestFocus();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Data gagal diubah"+e);
        }
        dataTable();
    }//GEN-LAST:event_btEditActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        int ok = JOptionPane.showConfirmDialog(null, "Hapus", "Konfirmasi dialog", JOptionPane.YES_NO_OPTION);
        if (ok == 0) {
            String sql = "delete from mobil where kdmobil = '"+txtKode.getText()+"'";
            try {
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus");
                kosong();
                txtKode.requestFocus();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data gagal dihapus"+e);
            }
            dataTable();
        }
    }//GEN-LAST:event_btHapusActionPerformed

    private void btnCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCariMouseClicked
        dataTable();
    }//GEN-LAST:event_btnCariMouseClicked

    private void cbMerekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMerekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMerekActionPerformed

    private void tabelMobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMobilMouseClicked
        int bar = tabelMobil.getSelectedRow();
        String a = tabelmodel.getValueAt(bar, 0).toString();
        String b = tabelmodel.getValueAt(bar, 1).toString();
        String c = tabelmodel.getValueAt(bar, 2).toString();
        String d = tabelmodel.getValueAt(bar, 3).toString();
        String e = tabelmodel.getValueAt(bar, 4).toString();
        
        txtKode.setText(a);
        cbMerek.setSelectedItem(b);
        txtTahun.setText(c);
        txtNoPolis.setText(d);
        txtHarga.setText(e);
        
        
    }//GEN-LAST:event_tabelMobilMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btSimpan;
    private javax.swing.JLabel btnCari;
    private javax.swing.JComboBox<String> cbMerek;
    private javax.swing.JPanel formMobil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable tabelMobil;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNoPolis;
    private javax.swing.JTextField txtTahun;
    // End of variables declaration//GEN-END:variables
}
