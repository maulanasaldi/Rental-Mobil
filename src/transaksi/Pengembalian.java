/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package transaksi;
import koneksi.Koneksi;
import PopUp.*;
import component.scrollcostume.ScrollBarCustom;
import java.awt.Color;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.table.DefaultTableModel;
import login.UserID;

public class Pengembalian extends javax.swing.JPanel {

    public String idnota, tglnota, idpelanggan, iduser;
    public String idnota1, kdmobil, hargamobil, idsupir, hargasupir, dp, lama, tunggakan;
    private Connection conn = new Koneksi().connect();
    private DefaultTableModel tabmode;
    
    public Pengembalian() {
        initComponents();   
        String KD = UserID.getUserLogin();
        lblIdKasir.setText(KD);
        kosong();
        aktif();
        nama();
        ScrollBarCustom sbv = new ScrollBarCustom();
        sbv.setForeground(new Color(130,130,130,100));
        jScrollPane1.setVerticalScrollBar(sbv);
        
        ScrollBarCustom sbh = new ScrollBarCustom();
        sbh.setForeground(new Color(130,130,130,100));
        jScrollPane1.setHorizontalScrollBar(sbh);
        
    }
    
    protected void nama(){
        try {
            String sql = "select * from user where iduser ='"+lblIdKasir.getText()+"'";            
            Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            
            if(hasil.next()){
                lblNmKasir.setText(hasil.getString("nmuser"));
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal DIpanggil"+e);
        }
    }

    protected void kosong(){
        txtIdKasir.setText("");
        txtIdPelanggan.setText("");
        txtIdNota.setText("");
        txtIdNota1.setText("");
        txtIdSupir.setText("");
        txtIdSupir.setText("");
        txtLama.setText("");
        txtTunggakan.setText("");
        txtIdSupir.setText("");
        txtHargaMobil.setText("");
        txtHargaSupir.setText("");
        txtTglPinajam.setText("");
    }
    
    protected void aktif(){
        txtLama.requestFocus();
        txtTglPengembalian.setEditor(new JSpinner.DateEditor(txtTglPengembalian,"yyyy/MM/dd"));
        Object[] Baris = {
            "ID Pelanggan","Kode Mobil","Harga Mobil","ID Supir","Harga Supir","Uang Muka","Lama","Biaya"
        };
        tabmode = new DefaultTableModel(null, Baris);
        tblTransaksiP.setModel(tabmode);
    }
    
    
    
    public void itemTerpilihPlgn(){
        PopUpNota pn = new PopUpNota();
        pn.nota = this;
        txtIdPelanggan.setText(idpelanggan);
        txtIdNota.setText(idnota);
        txtIdKasir.setText(iduser);
        txtTglPinajam.setText(tglnota);
    }
    
    public void itemTerpilihMobil(){
        PopUpIsi pi = new PopUpIsi();
        pi.isi = this;
        txtIdNota1.setText(idnota);
        txtKdMobil.setText(kdmobil);
        txtIdSupir.setText(idsupir);
        txtHargaMobil.setText(hargamobil);
        txtHargaSupir.setText(hargasupir);
        txtTunggakan.setText(tunggakan);
        txtLama.setText(lama);
        txtDp.setText(dp); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        formBarang = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblIdKasir = new javax.swing.JLabel();
        lblNmKasir = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtIdNota = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtIdPelanggan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnCariNota = new javax.swing.JButton();
        txtIdKasir = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTglPinajam = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtIdSupir = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtKdMobil = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtIdNota1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnCariIsi = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtHargaMobil = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtHargaSupir = new javax.swing.JTextField();
        txtTglPengembalian = new javax.swing.JSpinner();
        jLabel22 = new javax.swing.JLabel();
        txtLama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDp = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtTunggakan = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTransaksiP = new javax.swing.JTable();

        setBackground(new java.awt.Color(15, 28, 46));
        setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBorder(null);

        formBarang.setBackground(new java.awt.Color(15, 28, 46));
        formBarang.setMaximumSize(new java.awt.Dimension(32767, 32800));
        formBarang.setPreferredSize(new java.awt.Dimension(1089, 1110));

        jLabel1.setFont(new java.awt.Font("Bitstream Charter", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("PENGEMBALIAN");

        btnSimpan.setText("Simpan");
        btnSimpan.setPreferredSize(new java.awt.Dimension(80, 28));
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.setPreferredSize(new java.awt.Dimension(80, 28));
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.setPreferredSize(new java.awt.Dimension(80, 28));
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Kasir :");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID Kasir :");

        lblIdKasir.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        lblIdKasir.setForeground(new java.awt.Color(255, 255, 255));
        lblIdKasir.setText("Label ID Kasir");

        lblNmKasir.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        lblNmKasir.setForeground(new java.awt.Color(255, 255, 255));
        lblNmKasir.setText("Label Nama Kasir");
        lblNmKasir.setPreferredSize(new java.awt.Dimension(37, 30));

        jPanel3.setBackground(new java.awt.Color(31, 43, 62));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        txtIdNota.setBackground(new java.awt.Color(15, 28, 46));
        txtIdNota.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        txtIdNota.setForeground(new java.awt.Color(255, 255, 255));
        txtIdNota.setPreferredSize(new java.awt.Dimension(65, 28));

        jLabel11.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("ID Nota");

        txtIdPelanggan.setBackground(new java.awt.Color(15, 28, 46));
        txtIdPelanggan.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        txtIdPelanggan.setForeground(new java.awt.Color(204, 204, 204));
        txtIdPelanggan.setMinimumSize(new java.awt.Dimension(30, 24));
        txtIdPelanggan.setPreferredSize(new java.awt.Dimension(30, 28));

        jLabel8.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID Pelanggan");

        btnCariNota.setText("Cari");
        btnCariNota.setPreferredSize(new java.awt.Dimension(60, 23));
        btnCariNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariNotaActionPerformed(evt);
            }
        });

        txtIdKasir.setBackground(new java.awt.Color(15, 28, 46));
        txtIdKasir.setForeground(new java.awt.Color(255, 255, 255));
        txtIdKasir.setPreferredSize(new java.awt.Dimension(80, 28));

        jLabel10.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ID Kasir");

        txtTglPinajam.setBackground(new java.awt.Color(15, 28, 46));
        txtTglPinajam.setForeground(new java.awt.Color(255, 255, 255));
        txtTglPinajam.setPreferredSize(new java.awt.Dimension(80, 28));

        jLabel18.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Tgl Peminjaman");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtIdPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCariNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtIdNota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIdKasir, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))
                    .addComponent(jLabel18)
                    .addComponent(txtTglPinajam, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel8)
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCariNota, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel11)
                .addGap(12, 12, 12)
                .addComponent(txtIdNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel10)
                .addGap(12, 12, 12)
                .addComponent(txtIdKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel18)
                .addGap(12, 12, 12)
                .addComponent(txtTglPinajam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(31, 43, 62));

        txtIdSupir.setBackground(new java.awt.Color(15, 28, 46));
        txtIdSupir.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        txtIdSupir.setForeground(new java.awt.Color(204, 204, 204));
        txtIdSupir.setPreferredSize(new java.awt.Dimension(30, 28));

        jLabel16.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("ID Supir");

        txtKdMobil.setBackground(new java.awt.Color(15, 28, 46));
        txtKdMobil.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        txtKdMobil.setForeground(new java.awt.Color(204, 204, 204));
        txtKdMobil.setPreferredSize(new java.awt.Dimension(30, 28));

        jLabel14.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Kode Mobil");

        txtIdNota1.setBackground(new java.awt.Color(15, 28, 46));
        txtIdNota1.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        txtIdNota1.setForeground(new java.awt.Color(204, 204, 204));
        txtIdNota1.setMinimumSize(new java.awt.Dimension(30, 24));
        txtIdNota1.setPreferredSize(new java.awt.Dimension(30, 28));

        jLabel13.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ID Nota");

        btnCariIsi.setText("Cari");
        btnCariIsi.setPreferredSize(new java.awt.Dimension(60, 23));
        btnCariIsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariIsiActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Tgl Pengembalian");

        jLabel24.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Harga Mobil");

        txtHargaMobil.setBackground(new java.awt.Color(15, 28, 46));
        txtHargaMobil.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        txtHargaMobil.setForeground(new java.awt.Color(204, 204, 204));
        txtHargaMobil.setPreferredSize(new java.awt.Dimension(35, 28));

        jLabel25.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Harga Supir");

        txtHargaSupir.setBackground(new java.awt.Color(15, 28, 46));
        txtHargaSupir.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        txtHargaSupir.setForeground(new java.awt.Color(204, 204, 204));
        txtHargaSupir.setPreferredSize(new java.awt.Dimension(35, 28));

        txtTglPengembalian.setModel(new javax.swing.SpinnerDateModel());
        txtTglPengembalian.setPreferredSize(new java.awt.Dimension(50, 28));

        jLabel22.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Lama");

        txtLama.setBackground(new java.awt.Color(15, 28, 46));
        txtLama.setForeground(new java.awt.Color(255, 255, 255));
        txtLama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLamaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hari");

        txtDp.setBackground(new java.awt.Color(15, 28, 46));
        txtDp.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        txtDp.setForeground(new java.awt.Color(204, 204, 204));
        txtDp.setPreferredSize(new java.awt.Dimension(30, 28));

        jLabel19.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Uang Muka");

        txtTunggakan.setBackground(new java.awt.Color(15, 28, 46));
        txtTunggakan.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        txtTunggakan.setForeground(new java.awt.Color(204, 204, 204));
        txtTunggakan.setPreferredSize(new java.awt.Dimension(30, 28));

        jLabel17.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Tunggakan");

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtKdMobil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txtIdNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCariIsi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtIdSupir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtHargaSupir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel21)
                            .addComponent(jLabel24)
                            .addComponent(txtHargaMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtTglPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17)
                                .addComponent(txtTunggakan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDp, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19)))
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(txtLama, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel14)
                        .addGap(15, 15, 15)
                        .addComponent(txtKdMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addGap(15, 15, 15)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtIdNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnCariIsi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel19)
                                            .addGap(13, 13, 13)
                                            .addComponent(txtDp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel21)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtTglPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(1, 1, 1)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel17)
                            .addGap(13, 13, 13)
                            .addComponent(txtTunggakan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(jLabel24)
                            .addGap(13, 13, 13)
                            .addComponent(txtHargaMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addGap(15, 15, 15)
                            .addComponent(txtIdSupir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel25)
                            .addGap(15, 15, 15)
                            .addComponent(txtHargaSupir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTambah)
                .addGap(44, 44, 44))
        );

        tblTransaksiP.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblTransaksiP);

        javax.swing.GroupLayout formBarangLayout = new javax.swing.GroupLayout(formBarang);
        formBarang.setLayout(formBarangLayout);
        formBarangLayout.setHorizontalGroup(
            formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formBarangLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(formBarangLayout.createSequentialGroup()
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formBarangLayout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblIdKasir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblNmKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formBarangLayout.createSequentialGroup()
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        formBarangLayout.setVerticalGroup(
            formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formBarangLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblIdKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNmKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(formBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 966, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(formBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        jScrollPane1.setViewportView(jPanel1);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fd = sdf.format(txtTglPengembalian.getValue());
        String sql = "insert into riwayat values (?,?,?,?,?,?)";   // BEDA NAMA TABLENYA NYA
        try {
            int t = tblTransaksiP.getRowCount();
            for(int i=0; i<t; i++){
                String xidplgn = tblTransaksiP.getValueAt(i, 0).toString();
                String xkdmobil = tblTransaksiP.getValueAt(i,1).toString();
                String xidsupir = tblTransaksiP.getValueAt(i, 3).toString();
                String xlama = tblTransaksiP.getValueAt(i,6).toString();
                String xbiaya = tblTransaksiP.getValueAt(i,7).toString();

                PreparedStatement stat2 = conn.prepareStatement(sql);
                stat2.setString(1, txtIdNota.getText());
                stat2.setString(2, xkdmobil);
                stat2.setString(3, xidsupir);
                stat2.setString(4, xidplgn);
                stat2.setString(5, xlama);
                stat2.setString(6, xbiaya);

                stat2.executeUpdate();
            }
            JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Data GAGAL Disimpan"+e);
        }
        kosong();
        aktif();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        kosong();
        aktif();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int index = tblTransaksiP.getSelectedRow();
        tabmode.removeRow(index);
        tblTransaksiP.setModel(tabmode);
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnCariNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariNotaActionPerformed
        PopUpNota pn = new PopUpNota();
        pn.nota = this;
        pn.setVisible(true);
        pn.setResizable(false);
    }//GEN-LAST:event_btnCariNotaActionPerformed

    private void btnCariIsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariIsiActionPerformed
        PopUpIsi pi = new PopUpIsi();
        pi.isi = this;
        pi.setVisible(true);
        pi.setResizable(false);
    }//GEN-LAST:event_btnCariIsiActionPerformed

    private void txtLamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLamaActionPerformed

    }//GEN-LAST:event_txtLamaActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        try {
            String idplgn = txtIdPelanggan.getText();
            String kdmobil = txtKdMobil.getText();
            int hargamobil = Integer.parseInt(txtHargaMobil.getText());
            String idsupir = txtIdSupir.getText();
            int hargasupir = Integer.parseInt(txtHargaSupir.getText());
            int dp = Integer.parseInt(txtDp.getText());
            int lama = Integer.parseInt(txtLama.getText());
            int tunggakan = Integer.parseInt(txtTunggakan.getText());

            tabmode.addRow(new Object[]{idplgn,kdmobil,hargamobil,idsupir,hargasupir,dp,lama,tunggakan});
            tblTransaksiP.setModel(tabmode);
        } catch (Exception e) {
            System.out.println("Error" + e);
        }

        txtKdMobil.setText("");
        txtHargaMobil.setText("");
        txtIdSupir.setText("");
        txtHargaSupir.setText("");
        txtDp.setText("");
        txtLama.setText("");
        txtTunggakan.setText("");
    }//GEN-LAST:event_btnTambahActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnCariIsi;
    private javax.swing.JButton btnCariNota;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JPanel formBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblIdKasir;
    private javax.swing.JLabel lblNmKasir;
    private javax.swing.JTable tblTransaksiP;
    private javax.swing.JTextField txtDp;
    private javax.swing.JTextField txtHargaMobil;
    private javax.swing.JTextField txtHargaSupir;
    private javax.swing.JTextField txtIdKasir;
    private javax.swing.JTextField txtIdNota;
    private javax.swing.JTextField txtIdNota1;
    private javax.swing.JTextField txtIdPelanggan;
    private javax.swing.JTextField txtIdSupir;
    private javax.swing.JTextField txtKdMobil;
    private javax.swing.JTextField txtLama;
    private javax.swing.JSpinner txtTglPengembalian;
    private javax.swing.JTextField txtTglPinajam;
    private javax.swing.JTextField txtTunggakan;
    // End of variables declaration//GEN-END:variables
}
