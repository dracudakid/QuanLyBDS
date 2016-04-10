/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlybds;

import java.awt.Dimension;
import javax.swing.JFrame;

/**
 *
 * @author khidot73
 */
public class XemDanhSachNhuCauBDS extends javax.swing.JPanel {

    /**
     * Creates new form XemDanhSachNhuCauBDS
     */
    public XemDanhSachNhuCauBDS() {
        initComponents();
    }
     
      
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgLoaiNC = new javax.swing.ButtonGroup();
        bgLoaiBDS = new javax.swing.ButtonGroup();
        bgViTri = new javax.swing.ButtonGroup();
        pnXemDanhSachNhuCauBDS = new javax.swing.JPanel();
        btTroVe = new javax.swing.JButton();
        pnTimKiem = new javax.swing.JPanel();
        LBDanhSach = new javax.swing.JLabel();
        tfDienTichMim = new javax.swing.JTextField();
        tfDienTichMax = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btTimKiem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        rdbtMua = new javax.swing.JRadioButton();
        rdbtThue = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        rdbtLoaiBDS = new javax.swing.JRadioButton();
        rdbtNha = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        rdbtViTri1 = new javax.swing.JRadioButton();
        rdbtViTri2 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btThemNhuCau = new javax.swing.JButton();

        btTroVe.setText("Trở về");

        pnTimKiem.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm"));

        LBDanhSach.setText("DIỆN TÍCH");

        jLabel1.setText("-");

        btTimKiem.setLabel("Tìm kiếm");
        btTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTimKiemActionPerformed(evt);
            }
        });

        jLabel2.setText("LOẠI NC :");

        bgLoaiNC.add(rdbtMua);
        rdbtMua.setText("Mua");
        rdbtMua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtMuaActionPerformed(evt);
            }
        });

        bgLoaiNC.add(rdbtThue);
        rdbtThue.setLabel("Thuê");

        jLabel3.setText("LOẠI BDS");

        bgLoaiBDS.add(rdbtLoaiBDS);
        rdbtLoaiBDS.setText("Đất");

        bgLoaiBDS.add(rdbtNha);
        rdbtNha.setText("Nhà");

        jLabel4.setText("VỊ TRÍ :");

        bgViTri.add(rdbtViTri1);
        rdbtViTri1.setText("Ngoại ô");

        bgViTri.add(rdbtViTri2);
        rdbtViTri2.setText("Trung tâm");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, "", null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã NC", "Mã KH", "Loại NC", "Vị Trí", "Diện tích(Min-Max)", "Ghi Chú"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setText("m2");

        javax.swing.GroupLayout pnTimKiemLayout = new javax.swing.GroupLayout(pnTimKiem);
        pnTimKiem.setLayout(pnTimKiemLayout);
        pnTimKiemLayout.setHorizontalGroup(
            pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTimKiemLayout.createSequentialGroup()
                .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTimKiemLayout.createSequentialGroup()
                        .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnTimKiemLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(LBDanhSach))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTimKiemLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rdbtMua, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfDienTichMim, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdbtThue)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTimKiemLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfDienTichMax, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnTimKiemLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdbtLoaiBDS)
                                .addGap(18, 18, 18)
                                .addComponent(rdbtNha)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addGroup(pnTimKiemLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnTimKiemLayout.createSequentialGroup()
                                .addComponent(rdbtViTri1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdbtViTri2))
                            .addComponent(btTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 61, Short.MAX_VALUE))
                    .addGroup(pnTimKiemLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        pnTimKiemLayout.setVerticalGroup(
            pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTimKiemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBDanhSach)
                    .addComponent(tfDienTichMim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDienTichMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btTimKiem)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnTimKiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdbtMua, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rdbtThue)
                        .addComponent(jLabel3)
                        .addComponent(rdbtLoaiBDS)
                        .addComponent(rdbtNha)
                        .addComponent(jLabel4)
                        .addComponent(rdbtViTri1))
                    .addComponent(rdbtViTri2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addContainerGap())
        );

        btThemNhuCau.setText("Thêm nhu cầu");
        btThemNhuCau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemNhuCauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnXemDanhSachNhuCauBDSLayout = new javax.swing.GroupLayout(pnXemDanhSachNhuCauBDS);
        pnXemDanhSachNhuCauBDS.setLayout(pnXemDanhSachNhuCauBDSLayout);
        pnXemDanhSachNhuCauBDSLayout.setHorizontalGroup(
            pnXemDanhSachNhuCauBDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnXemDanhSachNhuCauBDSLayout.createSequentialGroup()
                .addComponent(btTroVe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btThemNhuCau)
                .addContainerGap())
            .addComponent(pnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnXemDanhSachNhuCauBDSLayout.setVerticalGroup(
            pnXemDanhSachNhuCauBDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnXemDanhSachNhuCauBDSLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnXemDanhSachNhuCauBDSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btTroVe)
                    .addComponent(btThemNhuCau))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btTroVe.getAccessibleContext().setAccessibleName("btTroVe");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(pnXemDanhSachNhuCauBDS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnXemDanhSachNhuCauBDS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnXemDanhSachNhuCauBDS.getAccessibleContext().setAccessibleParent(pnXemDanhSachNhuCauBDS);
    }// </editor-fold>//GEN-END:initComponents

    private void rdbtMuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtMuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtMuaActionPerformed

    private void btTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btTimKiemActionPerformed

    private void btThemNhuCauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemNhuCauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btThemNhuCauActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBDanhSach;
    private javax.swing.ButtonGroup bgLoaiBDS;
    private javax.swing.ButtonGroup bgLoaiNC;
    private javax.swing.ButtonGroup bgViTri;
    private javax.swing.JButton btThemNhuCau;
    private javax.swing.JButton btTimKiem;
    private javax.swing.JButton btTroVe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pnTimKiem;
    private javax.swing.JPanel pnXemDanhSachNhuCauBDS;
    private javax.swing.JRadioButton rdbtLoaiBDS;
    private javax.swing.JRadioButton rdbtMua;
    private javax.swing.JRadioButton rdbtNha;
    private javax.swing.JRadioButton rdbtThue;
    private javax.swing.JRadioButton rdbtViTri1;
    private javax.swing.JRadioButton rdbtViTri2;
    private javax.swing.JTextField tfDienTichMax;
    private javax.swing.JTextField tfDienTichMim;
    // End of variables declaration//GEN-END:variables
}
