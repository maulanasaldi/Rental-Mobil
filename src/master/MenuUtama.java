/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package master;

import component.scrollcostume.ScrollBarCustom;

import java.sql.*;
import java.awt.Color;
import java.util.HashMap;
import javax.swing.JOptionPane;
import transaksi.*;
import koneksi.Koneksi;
import login.SignIn;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author mmaul
 */
public class MenuUtama extends javax.swing.JFrame {
    private Connection conn = new Koneksi().connect();
    /**
     * Creates new form MenuUtama
     */
    public MenuUtama(String Id, String Nama, String Lavel) {
        initComponents();
        super.setExtendedState(MAXIMIZED_BOTH);
        labelNama.setText(Nama);
        labelStatus.setText(Lavel);
        ScrollBarCustom sb = new ScrollBarCustom();
        sb.setForeground(new Color(130,130,130, 100));
        jScrollPane2.setVerticalScrollBar(sb);  
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        labelNama = new javax.swing.JLabel();
        labelStatus = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        masterMobil = new javax.swing.JPanel();
        masterIconMobil = new javax.swing.JLabel();
        btn_mobil = new javax.swing.JLabel();
        masterSupir = new javax.swing.JPanel();
        masterIconCar = new javax.swing.JLabel();
        bt_supir = new javax.swing.JLabel();
        masterKasir = new javax.swing.JPanel();
        masterIconKasir = new javax.swing.JLabel();
        bt_kasir = new javax.swing.JLabel();
        masterPelanggan = new javax.swing.JPanel();
        masterIconPelanggan = new javax.swing.JLabel();
        bt_pelanggan = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        masterPinjam = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        bt_pinjam = new javax.swing.JLabel();
        masterPengembalian = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        bt_pengembalian = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        btnLMobil = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        btnLsupir = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        btnLpelanggan = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        btnLuser = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        penampil = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(15, 28, 46));
        jPanel1.setPreferredSize(new java.awt.Dimension(300, 569));

        jPanel3.setBackground(new java.awt.Color(15, 28, 46));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/boy.png"))); // NOI18N

        labelNama.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        labelNama.setForeground(new java.awt.Color(255, 255, 255));
        labelNama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNama.setText("M. Maulana Saldi");

        labelStatus.setFont(new java.awt.Font("Bitstream Charter", 2, 12)); // NOI18N
        labelStatus.setForeground(new java.awt.Color(255, 255, 255));
        labelStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelStatus.setText("admin");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(labelNama, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addComponent(labelStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(labelNama)
                .addGap(5, 5, 5)
                .addComponent(labelStatus)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jScrollPane2.setBorder(null);

        jPanel4.setBackground(new java.awt.Color(15, 28, 46));
        jPanel4.setPreferredSize(new java.awt.Dimension(280, 792));

        jLabel4.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MASTER");

        masterMobil.setBackground(new java.awt.Color(15, 28, 46));
        masterMobil.setPreferredSize(new java.awt.Dimension(100, 35));

        masterIconMobil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/car (2).png"))); // NOI18N
        masterIconMobil.setText("jLabel7");
        masterIconMobil.setPreferredSize(new java.awt.Dimension(35, 35));

        btn_mobil.setBackground(new java.awt.Color(31, 58, 95));
        btn_mobil.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        btn_mobil.setForeground(new java.awt.Color(255, 255, 255));
        btn_mobil.setText("Mobil");
        btn_mobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_mobilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_mobilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_mobilMouseExited(evt);
            }
        });

        javax.swing.GroupLayout masterMobilLayout = new javax.swing.GroupLayout(masterMobil);
        masterMobil.setLayout(masterMobilLayout);
        masterMobilLayout.setHorizontalGroup(
            masterMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(masterMobilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(masterIconMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_mobil, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        masterMobilLayout.setVerticalGroup(
            masterMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, masterMobilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(masterMobilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(masterIconMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_mobil, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addContainerGap())
        );

        masterSupir.setBackground(new java.awt.Color(15, 28, 46));
        masterSupir.setPreferredSize(new java.awt.Dimension(100, 35));

        masterIconCar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delivery-man.png"))); // NOI18N
        masterIconCar.setText("jLabel7");
        masterIconCar.setToolTipText("");
        masterIconCar.setPreferredSize(new java.awt.Dimension(35, 35));

        bt_supir.setBackground(new java.awt.Color(31, 58, 95));
        bt_supir.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        bt_supir.setForeground(new java.awt.Color(255, 255, 255));
        bt_supir.setText("Supir");
        bt_supir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_supirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_supirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_supirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout masterSupirLayout = new javax.swing.GroupLayout(masterSupir);
        masterSupir.setLayout(masterSupirLayout);
        masterSupirLayout.setHorizontalGroup(
            masterSupirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(masterSupirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(masterIconCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_supir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        masterSupirLayout.setVerticalGroup(
            masterSupirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, masterSupirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_supir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(masterIconCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        masterKasir.setBackground(new java.awt.Color(15, 28, 46));
        masterKasir.setPreferredSize(new java.awt.Dimension(100, 35));

        masterIconKasir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/clerk.png"))); // NOI18N
        masterIconKasir.setText("jLabel7");
        masterIconKasir.setPreferredSize(new java.awt.Dimension(35, 35));

        bt_kasir.setBackground(new java.awt.Color(31, 58, 95));
        bt_kasir.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        bt_kasir.setForeground(new java.awt.Color(255, 255, 255));
        bt_kasir.setText("User");
        bt_kasir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_kasirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_kasirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_kasirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout masterKasirLayout = new javax.swing.GroupLayout(masterKasir);
        masterKasir.setLayout(masterKasirLayout);
        masterKasirLayout.setHorizontalGroup(
            masterKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(masterKasirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(masterIconKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_kasir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        masterKasirLayout.setVerticalGroup(
            masterKasirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, masterKasirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_kasir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(masterIconKasir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        masterPelanggan.setBackground(new java.awt.Color(15, 28, 46));
        masterPelanggan.setPreferredSize(new java.awt.Dimension(100, 35));

        masterIconPelanggan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/customer.png"))); // NOI18N
        masterIconPelanggan.setText("jLabel7");
        masterIconPelanggan.setPreferredSize(new java.awt.Dimension(35, 35));

        bt_pelanggan.setBackground(new java.awt.Color(31, 58, 95));
        bt_pelanggan.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        bt_pelanggan.setForeground(new java.awt.Color(255, 255, 255));
        bt_pelanggan.setText("Pelanggan");
        bt_pelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_pelangganMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_pelangganMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_pelangganMouseExited(evt);
            }
        });

        javax.swing.GroupLayout masterPelangganLayout = new javax.swing.GroupLayout(masterPelanggan);
        masterPelanggan.setLayout(masterPelangganLayout);
        masterPelangganLayout.setHorizontalGroup(
            masterPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(masterPelangganLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(masterIconPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_pelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        masterPelangganLayout.setVerticalGroup(
            masterPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, masterPelangganLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_pelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(masterIconPelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel12.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("TRANSAKSI");

        masterPinjam.setBackground(new java.awt.Color(15, 28, 46));
        masterPinjam.setPreferredSize(new java.awt.Dimension(100, 35));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/rent.png"))); // NOI18N
        jLabel13.setText("jLabel7");
        jLabel13.setPreferredSize(new java.awt.Dimension(35, 35));

        bt_pinjam.setBackground(new java.awt.Color(31, 58, 95));
        bt_pinjam.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        bt_pinjam.setForeground(new java.awt.Color(255, 255, 255));
        bt_pinjam.setText("Peminjaman");
        bt_pinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_pinjamMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_pinjamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_pinjamMouseExited(evt);
            }
        });

        javax.swing.GroupLayout masterPinjamLayout = new javax.swing.GroupLayout(masterPinjam);
        masterPinjam.setLayout(masterPinjamLayout);
        masterPinjamLayout.setHorizontalGroup(
            masterPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(masterPinjamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_pinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        masterPinjamLayout.setVerticalGroup(
            masterPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(masterPinjamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_pinjam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        masterPengembalian.setBackground(new java.awt.Color(15, 28, 46));
        masterPengembalian.setPreferredSize(new java.awt.Dimension(100, 35));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/return (1).png"))); // NOI18N
        jLabel15.setText("jLabel7");
        jLabel15.setPreferredSize(new java.awt.Dimension(35, 35));

        bt_pengembalian.setBackground(new java.awt.Color(31, 58, 95));
        bt_pengembalian.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        bt_pengembalian.setForeground(new java.awt.Color(255, 255, 255));
        bt_pengembalian.setText("Pengembalian");
        bt_pengembalian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_pengembalianMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_pengembalianMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_pengembalianMouseExited(evt);
            }
        });

        javax.swing.GroupLayout masterPengembalianLayout = new javax.swing.GroupLayout(masterPengembalian);
        masterPengembalian.setLayout(masterPengembalianLayout);
        masterPengembalianLayout.setHorizontalGroup(
            masterPengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(masterPengembalianLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_pengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        masterPengembalianLayout.setVerticalGroup(
            masterPengembalianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(masterPengembalianLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(bt_pengembalian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel21.setFont(new java.awt.Font("Bitstream Charter", 0, 13)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("LAPORAN");

        jPanel20.setBackground(new java.awt.Color(15, 28, 46));
        jPanel20.setPreferredSize(new java.awt.Dimension(100, 35));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/car (2).png"))); // NOI18N
        jLabel22.setText("jLabel7");
        jLabel22.setPreferredSize(new java.awt.Dimension(35, 35));

        btnLMobil.setBackground(new java.awt.Color(31, 58, 95));
        btnLMobil.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        btnLMobil.setForeground(new java.awt.Color(255, 255, 255));
        btnLMobil.setText("Laporan Mobil");
        btnLMobil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLMobilMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnLMobil, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel21.setBackground(new java.awt.Color(15, 28, 46));
        jPanel21.setPreferredSize(new java.awt.Dimension(100, 35));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/car (2).png"))); // NOI18N
        jLabel24.setText("jLabel7");
        jLabel24.setPreferredSize(new java.awt.Dimension(35, 35));

        btnLsupir.setBackground(new java.awt.Color(31, 58, 95));
        btnLsupir.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        btnLsupir.setForeground(new java.awt.Color(255, 255, 255));
        btnLsupir.setText("Laporan Supir");
        btnLsupir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLsupirMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLsupir, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnLsupir, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel23.setBackground(new java.awt.Color(15, 28, 46));
        jPanel23.setPreferredSize(new java.awt.Dimension(100, 35));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/car (2).png"))); // NOI18N
        jLabel28.setText("jLabel7");
        jLabel28.setPreferredSize(new java.awt.Dimension(35, 35));

        btnLpelanggan.setBackground(new java.awt.Color(31, 58, 95));
        btnLpelanggan.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        btnLpelanggan.setForeground(new java.awt.Color(255, 255, 255));
        btnLpelanggan.setText("Laporan Pelanggan");
        btnLpelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLpelangganMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLpelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnLpelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel24.setBackground(new java.awt.Color(15, 28, 46));
        jPanel24.setPreferredSize(new java.awt.Dimension(100, 35));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/car (2).png"))); // NOI18N
        jLabel30.setText("jLabel7");
        jLabel30.setPreferredSize(new java.awt.Dimension(35, 35));

        btnLuser.setBackground(new java.awt.Color(31, 58, 95));
        btnLuser.setFont(new java.awt.Font("Bitstream Charter", 1, 14)); // NOI18N
        btnLuser.setForeground(new java.awt.Color(255, 255, 255));
        btnLuser.setText("Laporan User");
        btnLuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLuserMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLuser, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnLuser, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton1.setText("Log Keluar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(masterPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(masterKasir, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(masterSupir, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(masterMobil, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(masterPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(masterPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(masterMobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(masterSupir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(masterKasir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(masterPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(masterPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(masterPengembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 562, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(37, 37, 37))
        );

        jScrollPane2.setViewportView(jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1304, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(31, 43, 62));

        penampil.setBackground(new java.awt.Color(31, 43, 62));
        penampil.setLayout(new java.awt.BorderLayout());

        jLabel3.setBackground(new java.awt.Color(31, 43, 62));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("KELOMPOK SATU");
        penampil.add(jLabel3, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(penampil, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(penampil, javax.swing.GroupLayout.DEFAULT_SIZE, 1500, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_mobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_mobilMouseClicked
        masterMobil.setBackground(new Color(31,58,95));

        penampil.removeAll();
        penampil.add(new Form_Mobil());
        penampil.repaint();
        penampil.revalidate();
    }//GEN-LAST:event_btn_mobilMouseClicked

    private void btn_mobilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_mobilMouseEntered
        masterMobil.setBackground(new Color(31,43,62));
    }//GEN-LAST:event_btn_mobilMouseEntered

    private void btn_mobilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_mobilMouseExited
        masterMobil.setBackground(new Color(15,28,46));
    }//GEN-LAST:event_btn_mobilMouseExited

    private void bt_supirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_supirMouseClicked
        masterSupir.setBackground(new Color(31,58,95));

        penampil.removeAll();
        penampil.add(new Form_Supir());
        penampil.repaint();
        penampil.revalidate();
    }//GEN-LAST:event_bt_supirMouseClicked

    private void bt_supirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_supirMouseEntered
        masterSupir.setBackground(new Color(31,43,62));
    }//GEN-LAST:event_bt_supirMouseEntered

    private void bt_supirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_supirMouseExited
        masterSupir.setBackground(new Color(15,28,46));
    }//GEN-LAST:event_bt_supirMouseExited

    private void bt_kasirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_kasirMouseClicked
        masterKasir.setBackground(new Color(31,58,95));

        penampil.removeAll();
        penampil.add(new Form_User());
        penampil.repaint();
        penampil.revalidate();
    }//GEN-LAST:event_bt_kasirMouseClicked

    private void bt_kasirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_kasirMouseEntered
        masterKasir.setBackground(new Color(31,43,62));
    }//GEN-LAST:event_bt_kasirMouseEntered

    private void bt_kasirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_kasirMouseExited
        masterKasir.setBackground(new Color(15,28,46));
    }//GEN-LAST:event_bt_kasirMouseExited

    private void bt_pelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_pelangganMouseClicked
        masterPelanggan.setBackground(new Color(31,58,95));

        penampil.removeAll();
        penampil.add(new Form_Pelanggan());
        penampil.repaint();
        penampil.revalidate();
    }//GEN-LAST:event_bt_pelangganMouseClicked

    private void bt_pelangganMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_pelangganMouseEntered
        masterPelanggan.setBackground(new Color(31,43,62));
    }//GEN-LAST:event_bt_pelangganMouseEntered

    private void bt_pelangganMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_pelangganMouseExited
        masterPelanggan.setBackground(new Color(15,28,46));
    }//GEN-LAST:event_bt_pelangganMouseExited

    private void bt_pinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_pinjamMouseClicked
        masterPinjam.setBackground(new Color(31,58,95));

        penampil.removeAll();
        penampil.add(new Peminjaman());
        penampil.repaint();
        penampil.revalidate();
    }//GEN-LAST:event_bt_pinjamMouseClicked

    private void bt_pinjamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_pinjamMouseEntered
        masterPinjam.setBackground(new Color(31,43,62));
    }//GEN-LAST:event_bt_pinjamMouseEntered

    private void bt_pinjamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_pinjamMouseExited
        masterPinjam.setBackground(new Color(15,28,46));
    }//GEN-LAST:event_bt_pinjamMouseExited

    private void bt_pengembalianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_pengembalianMouseClicked
        masterPengembalian.setBackground(new Color(31,58,95));

        penampil.removeAll();
        penampil.add(new Pengembalian());
        penampil.repaint();
        penampil.revalidate();
    }//GEN-LAST:event_bt_pengembalianMouseClicked

    private void bt_pengembalianMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_pengembalianMouseEntered
        masterPengembalian.setBackground(new Color(31,43,62));
    }//GEN-LAST:event_bt_pengembalianMouseEntered

    private void bt_pengembalianMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_pengembalianMouseExited
        masterPengembalian.setBackground(new Color(15,28,46));
    }//GEN-LAST:event_bt_pengembalianMouseExited

    private void btnLMobilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLMobilMouseClicked
        try {
            String path = "./src/Report/mobil.jasper";
            HashMap parameter = new HashMap();
            JasperPrint print = JasperFillManager.fillReport(path, parameter, conn);
            JasperViewer.viewReport(print, false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Dokumen tidak ada"+ex);
        }
    }//GEN-LAST:event_btnLMobilMouseClicked

    private void btnLsupirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLsupirMouseClicked
        try {
            String path = "./src/Report/supir.jasper";
            HashMap parameter = new HashMap();
            JasperPrint print = JasperFillManager.fillReport(path, parameter, conn);
            JasperViewer.viewReport(print, false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Dokumen tidak ada"+ex);
        }
    }//GEN-LAST:event_btnLsupirMouseClicked

    private void btnLpelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLpelangganMouseClicked
        try {
            String path = "./src/Report/pelanggan.jasper";
            HashMap parameter = new HashMap();
            JasperPrint print = JasperFillManager.fillReport(path, parameter, conn);
            JasperViewer.viewReport(print, false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Dokumen tidak ada"+ex);
        }
    }//GEN-LAST:event_btnLpelangganMouseClicked

    private void btnLuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuserMouseClicked
        try {
            String path = "./src/Report/user.jasper";
            HashMap parameter = new HashMap();
            JasperPrint print = JasperFillManager.fillReport(path, parameter, conn);
            JasperViewer.viewReport(print, false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Dokumen tidak ada"+ex);
        }
    }//GEN-LAST:event_btnLuserMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SignIn login = new SignIn();
        login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama("Id","Nama","Lavel").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bt_kasir;
    private javax.swing.JLabel bt_pelanggan;
    private javax.swing.JLabel bt_pengembalian;
    private javax.swing.JLabel bt_pinjam;
    private javax.swing.JLabel bt_supir;
    private javax.swing.JLabel btnLMobil;
    private javax.swing.JLabel btnLpelanggan;
    private javax.swing.JLabel btnLsupir;
    private javax.swing.JLabel btnLuser;
    private javax.swing.JLabel btn_mobil;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelNama;
    private javax.swing.JLabel labelStatus;
    private javax.swing.JLabel masterIconCar;
    private javax.swing.JLabel masterIconKasir;
    private javax.swing.JLabel masterIconMobil;
    private javax.swing.JLabel masterIconPelanggan;
    private javax.swing.JPanel masterKasir;
    private javax.swing.JPanel masterMobil;
    private javax.swing.JPanel masterPelanggan;
    private javax.swing.JPanel masterPengembalian;
    private javax.swing.JPanel masterPinjam;
    private javax.swing.JPanel masterSupir;
    private javax.swing.JPanel penampil;
    // End of variables declaration//GEN-END:variables
}
