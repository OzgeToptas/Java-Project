package ekran;

import evrakkayit.dao.EvrakDAO;
import evrakkayit.dto.EvrakDTO;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author TOPTAS_OZGE
 */
public class NewJFrame extends javax.swing.JFrame {

    
    public NewJFrame() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        UnvanAdSoyadtxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        EdefterYazilimUyumluluktxt = new javax.swing.JTextField();
        EbiletBasvurusutxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        EarsivBasvurusutxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        EfaturaBasvurusutxt = new javax.swing.JTextField();
        EdefterBasvurusutxt = new javax.swing.JTextField();
        EirsaliyeBasvurusutxt = new javax.swing.JTextField();
        kaydetbtn = new javax.swing.JButton();
        temizlebtn = new javax.swing.JButton();
        silbtn = new javax.swing.JButton();
        guncellebtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        VknTcknTxt = new javax.swing.JTextField();
        siraNoTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel12 = new javax.swing.JLabel();
        VknTcknArmtxt = new javax.swing.JTextField();
        SiraNoArmtxt = new javax.swing.JTextField();
        UnvanArmtxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        bulbtn = new javax.swing.JButton();
        firmaBulbtn = new javax.swing.JButton();
        exceleAktarbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        firmaTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("TT"); // NOI18N

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Mükellef Bilgileri"));

        jLabel2.setText("VKN / TCKN :");

        UnvanAdSoyadtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnvanAdSoyadtxtActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("E-DEFTER YAZILIM UYUMLULUK RAPORU ONAYI :");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("E-BİLET BAŞVURUSU :");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel6.setText("E- ARŞİV :");

        jLabel7.setText("E-FATURA BAŞVURUSU :");

        jLabel8.setText("E-DEFTER BAŞVURUSU :");

        jLabel9.setText("E-İRSALİYE :");

        EfaturaBasvurusutxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EfaturaBasvurusutxtActionPerformed(evt);
            }
        });

        EdefterBasvurusutxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdefterBasvurusutxtActionPerformed(evt);
            }
        });

        EirsaliyeBasvurusutxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EirsaliyeBasvurusutxtActionPerformed(evt);
            }
        });

        kaydetbtn.setText("Kaydet");
        kaydetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaydetbtnActionPerformed(evt);
            }
        });

        temizlebtn.setText("Temizle");
        temizlebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                temizlebtnActionPerformed(evt);
            }
        });

        silbtn.setText("Sil");
        silbtn.setEnabled(false);
        silbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silbtnActionPerformed(evt);
            }
        });

        guncellebtn.setText("Güncelle");
        guncellebtn.setEnabled(false);
        guncellebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guncellebtnActionPerformed(evt);
            }
        });

        jLabel1.setText("UNVAN/ AD&SOYAD :");

        VknTcknTxt.setName("aaa"); // NOI18N

        siraNoTxt.setEnabled(false);
        siraNoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siraNoTxtActionPerformed(evt);
            }
        });

        jLabel3.setText("Sıra No:");

        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(UnvanAdSoyadtxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(EdefterYazilimUyumluluktxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(EbiletBasvurusutxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(EarsivBasvurusutxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(EfaturaBasvurusutxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(EdefterBasvurusutxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(EirsaliyeBasvurusutxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(kaydetbtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(temizlebtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(silbtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(guncellebtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(VknTcknTxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(siraNoTxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(kaydetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(guncellebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(silbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(temizlebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(UnvanAdSoyadtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                            .addComponent(EdefterYazilimUyumluluktxt)
                            .addComponent(EbiletBasvurusutxt)
                            .addComponent(EarsivBasvurusutxt)
                            .addComponent(EfaturaBasvurusutxt)
                            .addComponent(EdefterBasvurusutxt)
                            .addComponent(EirsaliyeBasvurusutxt)
                            .addComponent(VknTcknTxt)
                            .addComponent(siraNoTxt))))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siraNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(VknTcknTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UnvanAdSoyadtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EbiletBasvurusutxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(EdefterYazilimUyumluluktxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(EarsivBasvurusutxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EfaturaBasvurusutxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EdefterBasvurusutxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(29, 29, 29)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EirsaliyeBasvurusutxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kaydetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(silbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guncellebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(temizlebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder("Arama"));

        jLabel12.setText("Sıra No:");

        VknTcknArmtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               
            }
        });

        SiraNoArmtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });

        UnvanArmtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });

        jLabel13.setText("VKN / TCKN");

        jLabel14.setText("Unvan");

        bulbtn.setText("Bul");
        bulbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bulbtnActionPerformed(evt);
            }
        });

        firmaBulbtn.setText("Firma Bul");
        firmaBulbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firmaBulbtnActionPerformed(evt);
            }
        });

        exceleAktarbtn.setText("Excele Aktar");
        exceleAktarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exceleAktarbtnActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(jLabel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(VknTcknArmtxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(SiraNoArmtxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(UnvanArmtxt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(bulbtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(firmaBulbtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(exceleAktarbtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(UnvanArmtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(firmaBulbtn))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SiraNoArmtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(VknTcknArmtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(bulbtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(113, 113, 113))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exceleAktarbtn)
                .addContainerGap())
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SiraNoArmtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VknTcknArmtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(bulbtn))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(UnvanArmtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firmaBulbtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exceleAktarbtn))
        );

        firmaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Sıra No", "Vkn / Tckn", "Unvan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(firmaTable);
        if (firmaTable.getColumnModel().getColumnCount() > 0) {
            firmaTable.getColumnModel().getColumn(0).setResizable(false);
            firmaTable.getColumnModel().getColumn(0).setPreferredWidth(25);
            firmaTable.getColumnModel().getColumn(1).setResizable(false);
            firmaTable.getColumnModel().getColumn(1).setPreferredWidth(75);
            firmaTable.getColumnModel().getColumn(2).setResizable(false);
            firmaTable.getColumnModel().getColumn(2).setPreferredWidth(250);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1)
                    .addComponent(jLayeredPane2)
                    .addComponent(jScrollPane1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void temizlebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_temizlebtnActionPerformed
        temizle();
 
    }//GEN-LAST:event_temizlebtnActionPerformed

    private void kaydetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaydetbtnActionPerformed
        btnKaydetActionPerformed(evt);
    }//GEN-LAST:event_kaydetbtnActionPerformed

    private void EirsaliyeBasvurusutxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EirsaliyeBasvurusutxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EirsaliyeBasvurusutxtActionPerformed

    private void EdefterBasvurusutxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdefterBasvurusutxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdefterBasvurusutxtActionPerformed

    private void EfaturaBasvurusutxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EfaturaBasvurusutxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EfaturaBasvurusutxtActionPerformed

    private void UnvanAdSoyadtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnvanAdSoyadtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UnvanAdSoyadtxtActionPerformed

    private void siraNoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siraNoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_siraNoTxtActionPerformed

    private void silbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silbtnActionPerformed
    
        btnsilActionPerformed(evt);
    }//GEN-LAST:event_silbtnActionPerformed

    private void guncellebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guncellebtnActionPerformed
       
        btnguncelleActionPerformed (evt);
    }//GEN-LAST:event_guncellebtnActionPerformed

    private void firmaBulbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firmaBulbtnActionPerformed
         btnfirmabulActionPerformed (evt);
    }//GEN-LAST:event_firmaBulbtnActionPerformed

    private void exceleAktarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exceleAktarbtnActionPerformed
        btnExceleAktarActionPerformed (evt);
        
    }//GEN-LAST:event_exceleAktarbtnActionPerformed

    private void btnKaydetActionPerformed(ActionEvent evt) {
    try {
      String vknTckn    = VknTcknTxt.getText();
      String unvan      = UnvanAdSoyadtxt.getText();
      String EdefterUyumluluk = EdefterYazilimUyumluluktxt.getText ();
      String EbiletBasvurusu = EbiletBasvurusutxt.getText ();
      String EfaturaBasvurusu = EfaturaBasvurusutxt.getText ();
      String EdefterBasvurusu = EdefterBasvurusutxt.getText ();
      String EirsaliyeBasvurusu = EirsaliyeBasvurusutxt.getText ();
      String EarsivBasvurusu = EarsivBasvurusutxt.getText ();
       

      if(vknTckn.equals("")) {
        JOptionPane.showMessageDialog(null, "Vkn / Tckn Boş bırakılamaz ..!");
      }else if (unvan.equals("")) {
        JOptionPane.showMessageDialog(null, "Unvan Boş bırakılamaz ..!");
      }else {
        EvrakDTO evrak = new EvrakDTO(vknTckn,unvan,EdefterUyumluluk, EbiletBasvurusu, EfaturaBasvurusu, EdefterBasvurusu, EirsaliyeBasvurusu, EarsivBasvurusu );
        int siraNo = EvrakDAO.siraNoAl();
        
       boolean sonuc = EvrakDAO.evrakEkle(evrak,siraNo);
        if (sonuc) {
          siraNoTxt.setText(siraNo+"");
          JOptionPane.showMessageDialog(null, "Evrak Eklendi. Evrak SIRA NO = " + siraNo);
          temizle(); 
        } else {
          JOptionPane.showMessageDialog(null, "Evrak Eklenemedi..!");
        }
      }
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
  }
    private void bulbtnActionPerformed(ActionEvent evt) {
        String siraNo = SiraNoArmtxt.getText();
        String vknTckn= VknTcknArmtxt.getText();
        
        kaydetbtn.setEnabled(false);
        guncellebtn.setEnabled(true);
        silbtn.setEnabled(true);
        
        if(siraNo.equals("") && vknTckn.equals("")){
             JOptionPane.showMessageDialog(null, "Lütfen arama kriterlerinden en az birini giriniz !");
            return;
        }
        try {
            EvrakDTO evrak = EvrakDAO.evrakBul(siraNo, vknTckn);
            
            if (evrak == null){
                JOptionPane.showMessageDialog(null, "Evrak Bulunmadı..!");
            }else  {
                
                VknTcknTxt.setText(evrak.getVknTckn());
                UnvanAdSoyadtxt.setText(evrak.getunvan());
                EarsivBasvurusutxt.setText(evrak.getEarsivBasvurusu());
                EbiletBasvurusutxt.setText(evrak.getEarsivBasvurusu());
                EfaturaBasvurusutxt.setText(evrak.getEfaturaBasvurusu());
                EdefterBasvurusutxt.setText(evrak.getEdefterBasvurusu());
                EirsaliyeBasvurusutxt.setText(evrak.getEirsaliyeBasvurusu());
                EdefterYazilimUyumluluktxt.setText(evrak.getEdefterUyumluluk());
                siraNoTxt.setText(evrak.getSiraNo()+"");
                
            }
       
          
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
        private void btnfirmabulActionPerformed(ActionEvent evt) {
        String unvan = UnvanArmtxt.getText();
        
        
        if(UnvanArmtxt.equals("")) {
             JOptionPane.showMessageDialog(null, "Lütfen ünvan kısmını doldurunuz !");
            return;
        }
        try {
            ArrayList<EvrakDTO> evraklar = EvrakDAO.unvanBul(unvan);
            
            if (evraklar.size() == 0){
                JOptionPane.showMessageDialog(null, "Evrak Bulunmadı..!");
            }else  {
                
                DefaultTableModel model = (DefaultTableModel) firmaTable.getModel();
                model.setRowCount(0);
                for(EvrakDTO evrak : evraklar) {
                     Object[] rowData = { evrak.getSiraNo(), evrak.getVknTckn(), evrak.getunvan()};
                     model.addRow(rowData);
                }
                
                /*VknTcknTxt.setText(evrak.getVknTckn());
                UnvanAdSoyadtxt.setText(evrak.getunvan());
                EarsivBasvurusutxt.setText(evrak.getEarsivBasvurusu());
                EbiletBasvurusutxt.setText(evrak.getEarsivBasvurusu());
                EfaturaBasvurusutxt.setText(evrak.getEfaturaBasvurusu());
                EdefterBasvurusutxt.setText(evrak.getEdefterBasvurusu());
                EirsaliyeBasvurusutxt.setText(evrak.getEirsaliyeBasvurusu());
                EdefterYazilimUyumluluktxt.setText(evrak.getEdefterUyumluluk());
                siraNoTxt.setText(evrak.getSiraNo()+"");*/
                
            }
       
          
        } catch (SQLException ex) {
            Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
     private void btnsilActionPerformed(ActionEvent evt) {
        String siraNo = siraNoTxt.getText();
        try {
            if (siraNo.equals("")) {
                JOptionPane.showMessageDialog(null, "Lütfen önce silmek istediğiniz evrağı aşağıdaki arama alanından bulunuz !");
                return;
            } else {
                boolean sonuc = EvrakDAO.evrakSil(siraNo);
                if (sonuc == true) {
                    JOptionPane.showMessageDialog(null, siraNo + " Sıra numaralı evrak başarıyla silindi..!");
                } else {
                    JOptionPane.showMessageDialog(null, "Hata :: Evrak silinemedi..!");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void temizle()
  {
    
    this.VknTcknTxt.setText("");

    this.EarsivBasvurusutxt.setText("");
    this.EdefterYazilimUyumluluktxt.setText("");
    this.EirsaliyeBasvurusutxt.setText("");
    this.EdefterBasvurusutxt.setText("");
    this.EfaturaBasvurusutxt.setText("");
    this.UnvanAdSoyadtxt.setText("");
    this.EbiletBasvurusutxt.setText("");
    this.UnvanArmtxt.setText("");
    this.VknTcknArmtxt.setText("");
    this.SiraNoArmtxt.setText("");
    this.siraNoTxt.setText("");
    kaydetbtn.setEnabled(true);
    guncellebtn.setEnabled(false);
    silbtn.setEnabled(false);
    DefaultTableModel model = (DefaultTableModel) firmaTable.getModel();
    model.setRowCount(0);
    
  }
    private void btnguncelleActionPerformed(ActionEvent evt) {
        String siraNo = siraNoTxt.getText();
        try {
            if (siraNo.equals("")) {
                JOptionPane.showMessageDialog(null, "Lütfen önce güncellemek istediğiniz evrağı aşağıdaki arama alanından bulunuz !");
                return;
            } else {
                String vknTckn    = VknTcknTxt.getText();
                String unvan      = UnvanAdSoyadtxt.getText();
                String EdefterUyumluluk = EdefterYazilimUyumluluktxt.getText ();
                String EbiletBasvurusu = EbiletBasvurusutxt.getText ();
                String EfaturaBasvurusu = EfaturaBasvurusutxt.getText ();
                String EdefterBasvurusu = EdefterBasvurusutxt.getText ();
                String EirsaliyeBasvurusu = EirsaliyeBasvurusutxt.getText ();
                String EarsivBasvurusu = EarsivBasvurusutxt.getText ();
       

                if(vknTckn.equals("")) {
                  JOptionPane.showMessageDialog(null, "Vkn / Tckn Boş bırakılamaz ..!");
                }else if (unvan.equals("")) {
                  JOptionPane.showMessageDialog(null, "Unvan Boş bırakılamaz ..!");
                }else {
                  EvrakDTO evrak = new EvrakDTO(vknTckn,unvan,EdefterUyumluluk, EbiletBasvurusu, EfaturaBasvurusu, EdefterBasvurusu, EirsaliyeBasvurusu, EarsivBasvurusu );
                          boolean sonuc = EvrakDAO.guncelle(evrak,siraNo);
                          if (sonuc == true) {
                              JOptionPane.showMessageDialog(null, siraNo + " Sıra numaralı evrak başarıyla güncellendi..!");
                          } else {
                              JOptionPane.showMessageDialog(null, "Hata :: Evrak güncellenemedi..!");
                          }
                      }
           }
        } catch (SQLException e) {
            e.printStackTrace();
        
        }
        temizle();
       }
    
     private void btnExceleAktarActionPerformed(ActionEvent evt) {
    try {
      EvrakDAO.databaseToExcel();
    } catch (SQLException ex) {
      Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
      Logger.getLogger(NewJFrame.class.getName()).log(Level.SEVERE, null, ex);
    }
  }
    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EarsivBasvurusutxt;
    private javax.swing.JTextField EbiletBasvurusutxt;
    private javax.swing.JTextField EdefterBasvurusutxt;
    private javax.swing.JTextField EdefterYazilimUyumluluktxt;
    private javax.swing.JTextField EfaturaBasvurusutxt;
    private javax.swing.JTextField EirsaliyeBasvurusutxt;
    private javax.swing.JTextField SiraNoArmtxt;
    private javax.swing.JTextField UnvanAdSoyadtxt;
    private javax.swing.JTextField UnvanArmtxt;
    private javax.swing.JTextField VknTcknArmtxt;
    private javax.swing.JTextField VknTcknTxt;
    private javax.swing.JButton bulbtn;
    private javax.swing.JButton exceleAktarbtn;
    private javax.swing.JButton firmaBulbtn;
    private javax.swing.JTable firmaTable;
    private javax.swing.JButton guncellebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kaydetbtn;
    private javax.swing.JButton silbtn;
    private javax.swing.JTextField siraNoTxt;
    private javax.swing.JButton temizlebtn;
    // End of variables declaration//GEN-END:variables

 

  
}
