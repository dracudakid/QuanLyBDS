/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrameView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import model.bean.NhanVien;
import model.dao.NhanVienDAO;

/**
 *
 * @author dracu
 */
public class TrangChu extends javax.swing.JFrame {

    /**
     * Creates new form TrangChu
     */
    public TrangChu() {
        initComponents();
        Timer timer = new Timer(1000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                DateFormat df = new SimpleDateFormat("EEEE, MMMM dd yyyy, HH:mm");
                lbNgay.setText(df.format(new Date()));
            }
           
        });
        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pnDangNhap = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfTenTaiKhoan = new javax.swing.JTextField();
        tfMatKhau = new javax.swing.JTextField();
        cbNhoMatKhau = new javax.swing.JCheckBox();
        btDangNhap = new javax.swing.JButton();
        lbError = new javax.swing.JLabel();
        pnThongBaoMoi = new javax.swing.JPanel();
        spThongBaoMoi = new javax.swing.JScrollPane();
        lbNgay = new javax.swing.JLabel();
        btHoTro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trung tâm môi giới Bất động sản");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("SE21 TEAM");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("TRUNG TÂM MÔI GIỚI BẤT ĐỘNG SẢN");

        pnDangNhap.setBorder(javax.swing.BorderFactory.createTitledBorder("Đăng nhập"));
        pnDangNhap.setPreferredSize(new java.awt.Dimension(300, 150));

        jLabel3.setText("Tên tài khoản:");

        jLabel4.setText("Mật khẩu:");

        cbNhoMatKhau.setText("Nhớ mật khẩu");

        btDangNhap.setText("Đăng nhập");
        btDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDangNhapActionPerformed(evt);
            }
        });

        lbError.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout pnDangNhapLayout = new javax.swing.GroupLayout(pnDangNhap);
        pnDangNhap.setLayout(pnDangNhapLayout);
        pnDangNhapLayout.setHorizontalGroup(
            pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDangNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnDangNhapLayout.createSequentialGroup()
                        .addComponent(cbNhoMatKhau)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(btDangNhap)
                        .addGap(12, 12, 12))
                    .addGroup(pnDangNhapLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(44, 44, 44)
                        .addComponent(tfTenTaiKhoan))
                    .addGroup(pnDangNhapLayout.createSequentialGroup()
                        .addComponent(lbError)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnDangNhapLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(65, 65, 65)
                        .addComponent(tfMatKhau)))
                .addContainerGap())
        );
        pnDangNhapLayout.setVerticalGroup(
            pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDangNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfTenTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(lbError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbNhoMatKhau)
                    .addComponent(btDangNhap))
                .addContainerGap())
        );

        pnThongBaoMoi.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông báo mới"));

        javax.swing.GroupLayout pnThongBaoMoiLayout = new javax.swing.GroupLayout(pnThongBaoMoi);
        pnThongBaoMoi.setLayout(pnThongBaoMoiLayout);
        pnThongBaoMoiLayout.setHorizontalGroup(
            pnThongBaoMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongBaoMoiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spThongBaoMoi)
                .addContainerGap())
        );
        pnThongBaoMoiLayout.setVerticalGroup(
            pnThongBaoMoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongBaoMoiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spThongBaoMoi, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addContainerGap())
        );

        btHoTro.setText("Hổ trợ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addComponent(pnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnThongBaoMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNgay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btHoTro)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jLabel2)
                    .addContainerGap(347, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(pnDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(pnThongBaoMoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNgay)
                    .addComponent(btHoTro))
                .addGap(15, 15, 15))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(jLabel2)
                    .addContainerGap(536, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDangNhapActionPerformed
        String tentaikhoan = tfTenTaiKhoan.getText().trim();
        String matkhau = tfMatKhau.getText().trim();
        if(tentaikhoan.isEmpty() || matkhau.isEmpty()){
            lbError.setText("Xin vui lòng nhập Tài khoản và Mật khẩu");
        } else{
            lbError.setText("");
            NhanVienDAO nvDAO = new NhanVienDAO();
            NhanVien nhanvien = nvDAO.getNhanVienByMaNV(tentaikhoan);
            if(nhanvien != null && tentaikhoan.equals(nhanvien.getMaNV()) && matkhau.equals(nhanvien.getMatKhau())){
                System.out.println("Dang nhap thanh cong");
            } else{
                lbError.setText("Sai Tài khoản hoặc Mật khẩu. Vui lòng nhập lại.");
            } 
        }
        
    }//GEN-LAST:event_btDangNhapActionPerformed

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
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDangNhap;
    private javax.swing.JButton btHoTro;
    private javax.swing.JCheckBox cbNhoMatKhau;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbError;
    private javax.swing.JLabel lbNgay;
    private javax.swing.JPanel pnDangNhap;
    private javax.swing.JPanel pnThongBaoMoi;
    private javax.swing.JScrollPane spThongBaoMoi;
    private javax.swing.JTextField tfMatKhau;
    private javax.swing.JTextField tfTenTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
