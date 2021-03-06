/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FrameView;

import library.ButtonColumn;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import model.bean.KhachHang;
import model.dao.KhachHangDAO;

/**
 *
 * @author Agile
 */
public class XemDanhSachKH extends javax.swing.JPanel {

    /**
     * Creates new form XemDanhSachKH
     */
    public XemDanhSachKH() {
        initComponents();
        loadTable();
    }

    private void loadTable() {
        KhachHangDAO khDao = new KhachHangDAO();
        //Get List into Tat ca panel
        ArrayList<KhachHang> alTCKhachHang = khDao.getListKhachHang();
        DefaultTableModel modelTC = (DefaultTableModel) jtTatCa.getModel();
        for (KhachHang kh : alTCKhachHang) {
            Object[] row = {kh.getMaKH(), kh.getLoaiKH(), kh.getTenKH(), kh.getDiaChi(), kh.getSoDienThoai(), "Xem thêm"};
            modelTC.addRow(row);
        }
        Action xemThem = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTable table = (JTable) e.getSource();
                int modelRow = Integer.valueOf(e.getActionCommand());
                String maKH = (String) table.getModel().getValueAt(modelRow, 0);
                new XemThongTinKHMua(maKH).setVisible(true);
            }
        };
        ButtonColumn buttonColumn = new ButtonColumn(jtTatCa, xemThem, 5);
        //Get List into Khach Hang mua panel
        ArrayList<KhachHang> alKhachHangMua = khDao.getListKhachHangByLoaiKH("Mua");
        DefaultTableModel modelMua = (DefaultTableModel) jtKhachHangMua.getModel();
        for (KhachHang kh : alKhachHangMua) {
            Object[] row = {kh.getMaKH(), kh.getLoaiKH(), kh.getTenKH(), kh.getDiaChi(), kh.getSoDienThoai(), "Xem thêm"};
            modelMua.addRow(row);
        }
        buttonColumn = new ButtonColumn(jtKhachHangMua, xemThem, 5);
        //Get List into Khach Hang ban panel
        ArrayList<KhachHang> alKhachHangBan = khDao.getListKhachHangByLoaiKH("Bán");
        DefaultTableModel modelBan = (DefaultTableModel) jtKhachHangBan.getModel();
        for (KhachHang kh : alKhachHangBan) {
            Object[] row = {kh.getMaKH(), kh.getLoaiKH(), kh.getTenKH(), kh.getDiaChi(), kh.getSoDienThoai(), "Xem thêm"};
            modelBan.addRow(row);
        }
        buttonColumn = new ButtonColumn(jtKhachHangBan, xemThem, 5);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        lbLoaiKhachHang = new javax.swing.JLabel();
        lbTimKiem = new javax.swing.JLabel();
        tpKhachHang = new javax.swing.JTabbedPane();
        jpTatca = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtTatCa = new javax.swing.JTable();
        jpKHMua = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtKhachHangMua = new javax.swing.JTable();
        jpKHBan = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtKhachHangBan = new javax.swing.JTable();
        tfTimKiem = new javax.swing.JTextField();
        btThemKhachHang = new javax.swing.JButton();

        lbLoaiKhachHang.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbLoaiKhachHang.setText("Loại khách hàng:");

        lbTimKiem.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lbTimKiem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTimKiem.setText("Tìm kiếm");

        tpKhachHang.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        jtTatCa.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtTatCa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KH", "Loại KH", "Họ và tên", "Địa chỉ", "Số điện thoại", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtTatCa.setRowHeight(25);
        jtTatCa.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jtTatCa);
        if (jtTatCa.getColumnModel().getColumnCount() > 0) {
            jtTatCa.getColumnModel().getColumn(0).setResizable(false);
            jtTatCa.getColumnModel().getColumn(0).setPreferredWidth(70);
            jtTatCa.getColumnModel().getColumn(1).setResizable(false);
            jtTatCa.getColumnModel().getColumn(2).setResizable(false);
            jtTatCa.getColumnModel().getColumn(3).setResizable(false);
            jtTatCa.getColumnModel().getColumn(4).setResizable(false);
            jtTatCa.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout jpTatcaLayout = new javax.swing.GroupLayout(jpTatca);
        jpTatca.setLayout(jpTatcaLayout);
        jpTatcaLayout.setHorizontalGroup(
            jpTatcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );
        jpTatcaLayout.setVerticalGroup(
            jpTatcaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
        );

        tpKhachHang.addTab("Tất cả", jpTatca);

        jtKhachHangMua.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KH", "Loại KH", "Họ và tên", "Địa chỉ", "Số điện thoại", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtKhachHangMua.setRowHeight(25);
        jtKhachHangMua.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jtKhachHangMua);
        if (jtKhachHangMua.getColumnModel().getColumnCount() > 0) {
            jtKhachHangMua.getColumnModel().getColumn(0).setResizable(false);
            jtKhachHangMua.getColumnModel().getColumn(0).setPreferredWidth(40);
            jtKhachHangMua.getColumnModel().getColumn(1).setResizable(false);
            jtKhachHangMua.getColumnModel().getColumn(1).setPreferredWidth(40);
            jtKhachHangMua.getColumnModel().getColumn(2).setResizable(false);
            jtKhachHangMua.getColumnModel().getColumn(2).setPreferredWidth(120);
            jtKhachHangMua.getColumnModel().getColumn(3).setResizable(false);
            jtKhachHangMua.getColumnModel().getColumn(3).setPreferredWidth(160);
            jtKhachHangMua.getColumnModel().getColumn(4).setResizable(false);
            jtKhachHangMua.getColumnModel().getColumn(4).setPreferredWidth(100);
            jtKhachHangMua.getColumnModel().getColumn(5).setResizable(false);
            jtKhachHangMua.getColumnModel().getColumn(5).setPreferredWidth(70);
        }

        javax.swing.GroupLayout jpKHMuaLayout = new javax.swing.GroupLayout(jpKHMua);
        jpKHMua.setLayout(jpKHMuaLayout);
        jpKHMuaLayout.setHorizontalGroup(
            jpKHMuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );
        jpKHMuaLayout.setVerticalGroup(
            jpKHMuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
        );

        tpKhachHang.addTab("Khách hàng mua", jpKHMua);

        jtKhachHangBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã KH", "Loại KH", "Họ và tên", "Địa chỉ", "Số điện thoại", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtKhachHangBan.setRowHeight(25);
        jtKhachHangBan.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jtKhachHangBan);
        if (jtKhachHangBan.getColumnModel().getColumnCount() > 0) {
            jtKhachHangBan.getColumnModel().getColumn(0).setResizable(false);
            jtKhachHangBan.getColumnModel().getColumn(0).setPreferredWidth(40);
            jtKhachHangBan.getColumnModel().getColumn(1).setResizable(false);
            jtKhachHangBan.getColumnModel().getColumn(1).setPreferredWidth(40);
            jtKhachHangBan.getColumnModel().getColumn(2).setResizable(false);
            jtKhachHangBan.getColumnModel().getColumn(2).setPreferredWidth(120);
            jtKhachHangBan.getColumnModel().getColumn(3).setResizable(false);
            jtKhachHangBan.getColumnModel().getColumn(3).setPreferredWidth(160);
            jtKhachHangBan.getColumnModel().getColumn(4).setResizable(false);
            jtKhachHangBan.getColumnModel().getColumn(4).setPreferredWidth(120);
            jtKhachHangBan.getColumnModel().getColumn(5).setResizable(false);
            jtKhachHangBan.getColumnModel().getColumn(5).setPreferredWidth(70);
        }

        javax.swing.GroupLayout jpKHBanLayout = new javax.swing.GroupLayout(jpKHBan);
        jpKHBan.setLayout(jpKHBanLayout);
        jpKHBanLayout.setHorizontalGroup(
            jpKHBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 675, Short.MAX_VALUE)
        );
        jpKHBanLayout.setVerticalGroup(
            jpKHBanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
        );

        tpKhachHang.addTab("Khách hàng bán", jpKHBan);

        btThemKhachHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btThemKhachHang.setText("Thêm khách hàng");
        btThemKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemKhachHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tpKhachHang)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbLoaiKhachHang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btThemKhachHang)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbLoaiKhachHang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tpKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btThemKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpKhachHang.getAccessibleContext().setAccessibleName("jTabbedPaneKhachHang");
    }// </editor-fold>//GEN-END:initComponents

    private void btThemKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemKhachHangActionPerformed
        ThemKhachHang tkh = new ThemKhachHang();
        tkh.setVisible(true);
    }//GEN-LAST:event_btThemKhachHangActionPerformed

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(800, 600));
        frame.add(new XemDanhSachKH());
        frame.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btThemKhachHang;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel jpKHBan;
    private javax.swing.JPanel jpKHMua;
    private javax.swing.JPanel jpTatca;
    private javax.swing.JTable jtKhachHangBan;
    private javax.swing.JTable jtKhachHangMua;
    private javax.swing.JTable jtTatCa;
    private javax.swing.JLabel lbLoaiKhachHang;
    private javax.swing.JLabel lbTimKiem;
    private javax.swing.JTextField tfTimKiem;
    private javax.swing.JTabbedPane tpKhachHang;
    // End of variables declaration//GEN-END:variables
}
