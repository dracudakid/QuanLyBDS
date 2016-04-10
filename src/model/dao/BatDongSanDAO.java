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
import model.bean.BatDongSan;

/**
 *
 * @author hoanghuynhman
 */
public class BatDongSanDAO {
    private Database db;
    private Connection conn;
    private Statement st;
    private PreparedStatement pst;
    private ResultSet rs;
    
    public BatDongSanDAO() {
        db = new Database();
        conn = null;
    }
    
    public ArrayList<BatDongSan> getListBatDongSan(){
        ArrayList<BatDongSan> alBatDongSan = new ArrayList<>();
        BatDongSan bds;
        conn = db.getConnection();
        String query = "SELECT * FROM batdongsan";
        try {
            st = conn.createStatement();
            rs = st.executeQuery(query);
            System.out.println(query);
            while(rs.next())
            {
                bds = new BatDongSan(rs.getString("maBDS"), rs.getString("maKH"), rs.getString("loaiNC"), rs.getString("loaiBDS"), rs.getString("diaChi"), rs.getString("viTri"), rs.getString("huong"), rs.getInt("dienTich"), rs.getInt("giaTien"), rs.getString("ghiChu"), rs.getString("tinhTrang"));
                alBatDongSan.add(bds);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BatDongSanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(BatDongSanDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return alBatDongSan;
    }
    public boolean editBatDongSan(BatDongSan objBatDongSan){
        boolean result = true;
        String query = "UPDATE khachhang SET MaKH=?, LoaiNC=?, LoaiBDS=?, DiaChi=?, ViTri=?, Huong=? ,DienTich=?, GiaTien=?, GhiChu=?, TinhTrang=? WHERE MaBDS=?";
        conn = db.getConnection();
        try {
            pst = conn.prepareStatement(query);
            pst.setString(1, objBatDongSan.getMaKH());
            pst.setString(2, objBatDongSan.getLoaiNC());
            pst.setString(3, objBatDongSan.getLoaiBDS());
            pst.setString(4, objBatDongSan.getDiaChi());
            pst.setString(5, objBatDongSan.getViTri());
            pst.setString(6, objBatDongSan.getHuong());
            pst.setInt(7, objBatDongSan.getDienTich());
            pst.setInt(8, objBatDongSan.getGiaTien());
            pst.setString(9, objBatDongSan.getGhiChu());
            pst.setString(10, objBatDongSan.getTinhTrang());
            pst.setString(11, objBatDongSan.getMaBDS());
            pst.executeUpdate();
        } catch (SQLException ex) {
            result = false;
            Logger.getLogger(BatDongSanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                rs.close();
                pst.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(BatDongSanDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
}

public boolean deleteKhachHang(String MaBDS){
        boolean result = true;
        String query = "DELETE FROM khachhang WHERE MaBDS=?";
        conn = db.getConnection();
        try {
            pst = conn.prepareStatement(query);
            pst.setString(1, MaBDS);
            pst.executeUpdate();
        } catch (SQLException ex) {
            result = false;
            Logger.getLogger(BatDongSanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                rs.close();
                pst.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(BatDongSanDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
    }
    public boolean addKhachHang(BatDongSan objBatDongSan){
        boolean result = true;
        String query = "INSERT INTO `khachhang`(`MaBDS`, `MaKH`, `LoaiNC`, `LoaiBDS`, `DiaChi`, `ViTri`, `Huong`, `DienTich`, `GiaTien`, `GhiChu`, `TinhTrang`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        conn = db.getConnection();
        try {
            pst = conn.prepareStatement(query);
            pst.setString(1, objBatDongSan.getMaBDS());
            pst.setString(2, objBatDongSan.getMaKH());
            pst.setString(3, objBatDongSan.getLoaiNC());
            pst.setString(4, objBatDongSan.getLoaiBDS());
            pst.setString(5, objBatDongSan.getDiaChi());
            pst.setString(6, objBatDongSan.getViTri());
            pst.setString(7, objBatDongSan.getHuong());
            pst.setInt(8, objBatDongSan.getDienTich());
            pst.setInt(9, objBatDongSan.getGiaTien());
            pst.setString(10, objBatDongSan.getGhiChu());
            pst.setString(11, objBatDongSan.getTinhTrang());
            pst.executeUpdate();
        } catch (SQLException ex) {
            result = false;
            Logger.getLogger(BatDongSanDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                rs.close();
                pst.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(BatDongSanDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return result;
    }    

}