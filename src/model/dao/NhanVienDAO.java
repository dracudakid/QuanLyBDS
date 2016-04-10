/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.NhanVien;

/**
 *
 * @author dracu
 */
public class NhanVienDAO {
    Database db = new Database();
    Connection conn;
    public NhanVien getNhanVienByMaNV(String maNV){
        String query = "select * from nhanvien where maNV='"+maNV+"'";
        NhanVien nv = null;
        try {
            Statement st = db.getConnection().createStatement();
            ResultSet rs = st.executeQuery(query);
            System.out.println(query);
            if(rs.next()){
                nv = new NhanVien();
                nv.setMaNV(rs.getString("MaNV"));
                nv.setTenNV(rs.getString("TenNV"));
                nv.setMatKhau(rs.getString("MatKhau"));
                nv.setNgaySinh(rs.getString("NgaySinh"));
                nv.setGioiTinh(rs.getString("GioiTinh"));
                nv.setChucVu(rs.getString("ChucVu"));
                nv.setDiaChi(rs.getString("DiaChi"));
                nv.setSoDienThoai(rs.getString("SoDienThoai"));
                nv.setEmail(rs.getString("Email"));
            }
            return nv;
        } catch (SQLException ex) {
            Logger.getLogger(NhanVienDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            db.closeConnection();
        }
        return null;
    }
   
}
