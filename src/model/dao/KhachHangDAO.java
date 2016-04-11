/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.KhachHang;

/**
 *
 * @author dracu
 */
public class KhachHangDAO {
    private Database db;
    private Connection conn;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;

    public KhachHangDAO() {
        db = new Database();
        conn = null;
    }
    
    public ArrayList<KhachHang> getListKhachHang(){
        ArrayList<KhachHang> alKhachHang = new ArrayList<>();
        KhachHang kh;
        conn = db.getConnection();
        String query = "SELECT * FROM khachhang";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(query);
            while(rs.next()){
                kh = new KhachHang(rs.getString("MaKH"), rs.getString("TenKH"), rs.getString("GioiTinh"), rs.getString("NgaySinh"), rs.getString("DiaChi"), rs.getString("Email"), rs.getString("SoDienThoai"), rs.getString("LoaiKH"));
                alKhachHang.add(kh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return alKhachHang;
    }
    public ArrayList<KhachHang> getListKhachHangByLoaiKH(String LoaiKH){
        ArrayList<KhachHang> alKhachHang = new ArrayList<>();
        KhachHang kh;
        conn = db.getConnection();
        String query = "SELECT * FROM khachhang WHERE LoaiKH=?";
        try {
            pst = conn.prepareStatement(query);
            pst.setString(1, LoaiKH);
            rs = pst.executeQuery();
            while(rs.next()){
                kh = new KhachHang(rs.getString("MaKH"), rs.getString("TenKH"), rs.getString("GioiTinh"), rs.getString("NgaySinh"), rs.getString("DiaChi"), rs.getString("Email"), rs.getString("SoDienThoai"), rs.getString("LoaiKH"));
                alKhachHang.add(kh);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return alKhachHang;
    }

    public KhachHang getKhachHangByMaKH(String maKH) {
        KhachHang kh = null;
        String query = "Select * from khachhang where MaKH=?";
        try {
            pst = db.getConnection().prepareStatement(query);
            pst.setString(1, maKH);
            rs = pst.executeQuery();
            if(rs.next()){
                kh = new KhachHang(rs.getString("MaKH"), rs.getString("TenKH"), rs.getString("GioiTinh"), rs.getString("NgaySinh"), rs.getString("DiaChi"), rs.getString("Email"), rs.getString("SoDienThoai"), rs.getString("LoaiKH"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(KhachHangDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kh;
    }
}