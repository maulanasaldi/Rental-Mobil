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

/**
 *
 * @author mmaul
 */
public class Peminjaman extends javax.swing.JPanel {
    public String idplgn, nama, noidentitas, notelp, alamat;
    public String kdmobil,merek,tahun,nopolisi,harga,lama;
    public String idsupir, namasupir, status, notlp, hargasupir, alamatSupir;
    private Connection conn = new Koneksi().connect();
    private DefaultTableModel tabmode;
    
    public Peminjaman() {
        initComponents();   
        String KD = UserID.getUserLogin();
        lblIdKasir.setText(KD); 
        kosong();
        aktif();
        autonumber();
        nama();
        ScrollBarCustom sb = new ScrollBarCustom();
        sb.setForeground(new Color(130,130,130,100));               
        jScrollPane2.setVerticalScrollBar(sb);
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
        txtIdNota.setText("");
        txtIdPelanggan.setText("");
        txtNmPlgn.setText("");
        txtAlamat.setText("");
        txtKdMobil.setText("");
        txtTarif.setText("");
        txtTarif.setText("");
        txtLama.setText("");
        txtDp.setText("");
        txtTotal.setText("");
        txtTotalHarga.setText("");
        txtIdSupir.setText("");
        txtNmSupir.setText("");
        txtHargaSupir.setText("");
    }
    
    protected void aktif(){
        txtLama.requestFocus();
        txtTgl.setEditor(new JSpinner.DateEditor(txtTgl,"yyyy/MM/dd"));
        Object[] Baris = {
            "Kode Mobil","Merek","Harga Mobil","ID Supir","Harga Supir","Uang Muka","Lama","Total","Tunggakakn"
        };
        tabmode = new DefaultTableModel(null, Baris);
        tblTransaksi.setModel(tabmode);
    }
    
    
    protected void autonumber(){
        try {
            
            String sql = "select idnota from nota order by idnota asc";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            txtIdNota.setText("IN0001");    
            
            while(rs.next()){
                String id_nota = rs.getString("idnota").substring(2);
                int AN = Integer.parseInt(id_nota)+1;
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
                txtIdNota.setText("IN"+Nol+AN);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "AutoNumber GAGAL");
        }         
    }
    
    public void itemTerpilihPlgn(){
        PopUpPelanggan pp = new PopUpPelanggan();
        pp.plgn = this;
        txtIdPelanggan.setText(idplgn);
        txtNmPlgn.setText(nama);
        txtAlamat.setText(alamat);
    }
    
    public void itemTerpilihMobil(){
        PopUpMobil pb = new PopUpMobil();
        pb.mobil = this;
        txtKdMobil.setText(kdmobil);
        txtMerek.setText(merek);
        txtTarif.setText(harga);
        txtDp.requestFocus();
    }
    
    public void itemTerpilihSupir(){
        PopUpSupir pb = new PopUpSupir();
        pb.supir = this;
        txtIdSupir.setText(idsupir);
        txtNmSupir.setText(namasupir);
        txtHargaSupir.setText(hargasupir);
        txtKdMobil.requestFocus();
    }
    
    public void hitung(){
        int total = 0;
        for (int i=0; i<tblTransaksi.getRowCount(); i++){
            int amount = Integer.valueOf(tblTransaksi.getValueAt(i,7).toString());
            total += amount;
        }
        txtTotalHarga.setText(Integer.toString(total));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        formBarang = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtTotalHarga = new javax.swing.JTextField();
        txtTgl = new javax.swing.JSpinner();
        txtIdNota = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblIdKasir = new javax.swing.JLabel();
        lblNmKasir = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtIdPelanggan = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNmPlgn = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        btnCariPelanggan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAlamat = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtKdMobil = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtMerek = new javax.swing.JTextField();
        btnCariMobil = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtTarif = new javax.swing.JTextField();
        txtDp = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        txtLama = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtIdSupir = new javax.swing.JTextField();
        btnCariSupir = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        txtNmSupir = new javax.swing.JTextField();
        txtHargaSupir = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblTransaksi = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        mainPanel.setBackground(new java.awt.Color(15, 28, 46));
        mainPanel.setLayout(new java.awt.BorderLayout());

        jScrollPane2.setBackground(new java.awt.Color(15, 28, 46));
        jScrollPane2.setBorder(null);

        jPanel1.setBackground(new java.awt.Color(15, 28, 46));

        formBarang.setBackground(new java.awt.Color(15, 28, 46));
        formBarang.setMaximumSize(new java.awt.Dimension(32767, 32800));
        formBarang.setPreferredSize(new java.awt.Dimension(1089, 1110));

        jLabel1.setFont(new java.awt.Font("Bitstream Charter", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("PEMINJAMAN");

        jLabel10.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("ID Nota");

        jLabel15.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Tanggal Nota");
        jLabel15.setPreferredSize(new java.awt.Dimension(85, 30));

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

        txtTotalHarga.setBackground(new java.awt.Color(15, 28, 46));
        txtTotalHarga.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        txtTotalHarga.setForeground(new java.awt.Color(204, 204, 204));
        txtTotalHarga.setMinimumSize(new java.awt.Dimension(50, 24));
        txtTotalHarga.setPreferredSize(new java.awt.Dimension(30, 28));
        txtTotalHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalHargaActionPerformed(evt);
            }
        });

        txtTgl.setModel(new javax.swing.SpinnerDateModel());
        txtTgl.setPreferredSize(new java.awt.Dimension(64, 28));

        txtIdNota.setBackground(new java.awt.Color(15, 28, 46));
        txtIdNota.setForeground(new java.awt.Color(255, 255, 255));
        txtIdNota.setPreferredSize(new java.awt.Dimension(80, 28));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total Harga");

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Kasir");

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID Kasir");

        lblIdKasir.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        lblIdKasir.setForeground(new java.awt.Color(255, 255, 255));
        lblIdKasir.setText("Label ID Kasir");

        lblNmKasir.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        lblNmKasir.setForeground(new java.awt.Color(255, 255, 255));
        lblNmKasir.setText("Label Nama Kasir");
        lblNmKasir.setPreferredSize(new java.awt.Dimension(37, 30));

        jPanel2.setBackground(new java.awt.Color(31, 43, 62));

        jLabel8.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID Pelanggan");

        txtIdPelanggan.setBackground(new java.awt.Color(15, 28, 46));
        txtIdPelanggan.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        txtIdPelanggan.setForeground(new java.awt.Color(204, 204, 204));
        txtIdPelanggan.setMinimumSize(new java.awt.Dimension(30, 24));
        txtIdPelanggan.setPreferredSize(new java.awt.Dimension(30, 28));
        txtIdPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdPelangganActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nama Panjang");

        txtNmPlgn.setBackground(new java.awt.Color(15, 28, 46));
        txtNmPlgn.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        txtNmPlgn.setForeground(new java.awt.Color(204, 204, 204));
        txtNmPlgn.setPreferredSize(new java.awt.Dimension(65, 28));

        jLabel12.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Alamat");

        btnCariPelanggan.setText("Cari");
        btnCariPelanggan.setPreferredSize(new java.awt.Dimension(60, 23));
        btnCariPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariPelangganActionPerformed(evt);
            }
        });

        txtAlamat.setBackground(new java.awt.Color(15, 28, 46));
        txtAlamat.setColumns(20);
        txtAlamat.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtAlamat.setForeground(new java.awt.Color(255, 255, 255));
        txtAlamat.setRows(5);
        jScrollPane1.setViewportView(txtAlamat);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtIdPelanggan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCariPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                    .addComponent(txtNmPlgn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel8)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCariPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel11)
                .addGap(12, 12, 12)
                .addComponent(txtNmPlgn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel12)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(31, 43, 62));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Kode Mobil");

        txtKdMobil.setBackground(new java.awt.Color(15, 28, 46));
        txtKdMobil.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        txtKdMobil.setForeground(new java.awt.Color(204, 204, 204));
        txtKdMobil.setMinimumSize(new java.awt.Dimension(30, 24));
        txtKdMobil.setPreferredSize(new java.awt.Dimension(30, 28));

        jLabel14.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Merek");

        txtMerek.setBackground(new java.awt.Color(15, 28, 46));
        txtMerek.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        txtMerek.setForeground(new java.awt.Color(204, 204, 204));
        txtMerek.setPreferredSize(new java.awt.Dimension(30, 28));

        btnCariMobil.setText("Cari");
        btnCariMobil.setPreferredSize(new java.awt.Dimension(60, 23));
        btnCariMobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariMobilActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Harga");

        txtTarif.setBackground(new java.awt.Color(15, 28, 46));
        txtTarif.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        txtTarif.setForeground(new java.awt.Color(204, 204, 204));
        txtTarif.setPreferredSize(new java.awt.Dimension(30, 28));

        txtDp.setBackground(new java.awt.Color(15, 28, 46));
        txtDp.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        txtDp.setForeground(new java.awt.Color(204, 204, 204));
        txtDp.setPreferredSize(new java.awt.Dimension(30, 28));

        jLabel17.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Uang Muka");

        txtTotal.setBackground(new java.awt.Color(15, 28, 46));
        txtTotal.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(204, 204, 204));
        txtTotal.setPreferredSize(new java.awt.Dimension(30, 28));
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Total");

        btnTambah.setText("Tambah");
        btnTambah.setBorder(null);
        btnTambah.setPreferredSize(new java.awt.Dimension(75, 28));
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        txtLama.setBackground(new java.awt.Color(15, 28, 46));
        txtLama.setForeground(new java.awt.Color(255, 255, 255));
        txtLama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLamaActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Lama");

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hari");

        jLabel21.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("ID Supir");

        txtIdSupir.setBackground(new java.awt.Color(15, 28, 46));
        txtIdSupir.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        txtIdSupir.setForeground(new java.awt.Color(204, 204, 204));
        txtIdSupir.setMinimumSize(new java.awt.Dimension(30, 24));
        txtIdSupir.setPreferredSize(new java.awt.Dimension(30, 28));

        btnCariSupir.setText("Cari");
        btnCariSupir.setPreferredSize(new java.awt.Dimension(60, 23));
        btnCariSupir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariSupirActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Nama Supir");

        txtNmSupir.setBackground(new java.awt.Color(15, 28, 46));
        txtNmSupir.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        txtNmSupir.setForeground(new java.awt.Color(204, 204, 204));
        txtNmSupir.setPreferredSize(new java.awt.Dimension(30, 28));

        txtHargaSupir.setBackground(new java.awt.Color(15, 28, 46));
        txtHargaSupir.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        txtHargaSupir.setForeground(new java.awt.Color(204, 204, 204));
        txtHargaSupir.setPreferredSize(new java.awt.Dimension(30, 28));

        jLabel25.setFont(new java.awt.Font("Bitstream Charter", 0, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Harga");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel21)
                                        .addComponent(jLabel24))
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addComponent(txtIdSupir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addComponent(btnCariSupir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtHargaSupir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNmSupir, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel25))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel16))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtKdMobil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btnCariMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtTarif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMerek, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(txtLama, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(txtDp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel17)
                    .addComponent(jLabel22))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(13, 13, 13)
                                .addComponent(txtDp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(13, 13, 13)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtKdMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCariMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(13, 13, 13)
                                .addComponent(txtMerek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(12, 12, 12)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel21)
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdSupir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCariSupir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel24)
                        .addGap(13, 13, 13)
                        .addComponent(txtNmSupir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel16)
                    .addComponent(jLabel25))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtTarif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHargaSupir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(12, 12, 12)
                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );

        tblTransaksi.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblTransaksi);

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
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(403, 403, 403)
                        .addComponent(jLabel3))
                    .addGroup(formBarangLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(formBarangLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblIdKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(formBarangLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNmKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(111, 111, 111)
                        .addGroup(formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formBarangLayout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTgl, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, formBarangLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdNota, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, formBarangLayout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3))
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        formBarangLayout.setVerticalGroup(
            formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formBarangLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(formBarangLayout.createSequentialGroup()
                        .addGroup(formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtIdNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIdKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNmKasir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))))
                .addGap(30, 30, 30)
                .addGroup(formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(formBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(formBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(formBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 1037, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel1);

        mainPanel.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        add(mainPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fd = sdf.format(txtTgl.getValue());
        String sql = "insert into nota values (?,?,?,?)";   // BEDA NAMA TABLENYA NYA
        String zsql = "insert into isi values (?,?,?,?,?,?,?,?)";   // BEDA NAMA TABLENYA NYA
        try {
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, txtIdNota.getText());
            stat.setString(2, fd);  // fd untuktanggal
            stat.setString(3, txtIdPelanggan.getText());
            stat.setString(4, lblIdKasir.getText());

            stat.executeUpdate();

            int t = tblTransaksi.getRowCount();
            for(int i=0; i<t; i++){
                String xkdmobil = tblTransaksi.getValueAt(i,0).toString();
                String xhargamobil = tblTransaksi.getValueAt(i,2).toString();
                String xidsupir = tblTransaksi.getValueAt(i, 3).toString();
                String xhargasupir = tblTransaksi.getValueAt(i, 4).toString();
                String xdp = tblTransaksi.getValueAt(i,5).toString();
                String xlama = tblTransaksi.getValueAt(i,6).toString();
                String xtunggakan = tblTransaksi.getValueAt(i, 7).toString();

                PreparedStatement stat2 = conn.prepareStatement(zsql);
                stat2.setString(1, txtIdNota.getText());
                stat2.setString(2, xkdmobil);
                stat2.setString(3, xhargamobil);
                stat2.setString(4, xidsupir);
                stat2.setString(5, xhargasupir);
                stat2.setString(6, xdp);
                stat2.setString(7, xlama);
                stat2.setString(8, xtunggakan);

                stat2.executeUpdate();
            }
            JOptionPane.showMessageDialog(null,"Data Berhasil Disimpan");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Data GAGAL Disimpan"+e);
        }
        kosong();
        aktif();
        autonumber();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        kosong();
        aktif();
        autonumber();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int index = tblTransaksi.getSelectedRow();
        tabmode.removeRow(index);
        tblTransaksi.setModel(tabmode);
        hitung();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void txtTotalHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalHargaActionPerformed

    }//GEN-LAST:event_txtTotalHargaActionPerformed

    private void txtIdPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdPelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdPelangganActionPerformed

    private void btnCariPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariPelangganActionPerformed
        PopUpPelanggan pp = new PopUpPelanggan();
        pp.plgn = this;
        pp.setVisible(true);
        pp.setResizable(false);
    }//GEN-LAST:event_btnCariPelangganActionPerformed

    private void btnCariMobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariMobilActionPerformed
        PopUpMobil pp = new PopUpMobil();
        pp.mobil = this;
        pp.setVisible(true);
        pp.setResizable(false);
    }//GEN-LAST:event_btnCariMobilActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed

    }//GEN-LAST:event_txtTotalActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        try {
            String kodemobil = txtKdMobil.getText();
            String merek = txtMerek.getText();
            int hargamobil = Integer.parseInt(txtTarif.getText());
            String idsupir = txtIdSupir.getText();
            int hargasupir = Integer.parseInt(txtHargaSupir.getText());
            int dp = Integer.parseInt(txtDp.getText());
            int lama = Integer.parseInt(txtLama.getText());
            int total = Integer.parseInt(txtTotal.getText());

            tabmode.addRow(new Object[]{kodemobil,merek,hargamobil,idsupir,hargasupir,dp,lama,total});
            tblTransaksi.setModel(tabmode);

        } catch (Exception e) {
            System.out.println("Error : "+ e);
        }

        txtKdMobil.setText("");
        txtMerek.setText("");
        txtDp.setText("");
        txtTarif.setText("");
        txtLama.setText("");
        txtTotal.setText("");
        txtIdSupir.setText("");
        txtNmSupir.setText("");
        txtHargaSupir.setText("");

        hitung();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void txtLamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLamaActionPerformed
        int xharga = Integer.parseInt(txtTarif.getText());
        int xhargaS = Integer.parseInt(txtHargaSupir.getText());
        int xlama = Integer.parseInt(txtLama.getText());
        int xdp = Integer.parseInt(txtDp.getText());
        int xjml = (xharga * xlama) + (xhargaS * xlama) - xdp;
        txtTotal.setText(String.valueOf(xjml));
    }//GEN-LAST:event_txtLamaActionPerformed

    private void btnCariSupirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariSupirActionPerformed
        PopUpSupir ps = new PopUpSupir();
        ps.supir = this;
        ps.setVisible(true);
        ps.setResizable(false);
    }//GEN-LAST:event_btnCariSupirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnCariMobil;
    private javax.swing.JButton btnCariPelanggan;
    private javax.swing.JButton btnCariSupir;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnTambah;
    private javax.swing.JPanel formBarang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblIdKasir;
    private javax.swing.JLabel lblNmKasir;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTable tblTransaksi;
    private javax.swing.JTextArea txtAlamat;
    private javax.swing.JTextField txtDp;
    private javax.swing.JTextField txtHargaSupir;
    private javax.swing.JTextField txtIdNota;
    private javax.swing.JTextField txtIdPelanggan;
    private javax.swing.JTextField txtIdSupir;
    private javax.swing.JTextField txtKdMobil;
    private javax.swing.JTextField txtLama;
    private javax.swing.JTextField txtMerek;
    private javax.swing.JTextField txtNmPlgn;
    private javax.swing.JTextField txtNmSupir;
    private javax.swing.JTextField txtTarif;
    private javax.swing.JSpinner txtTgl;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotalHarga;
    // End of variables declaration//GEN-END:variables
}
