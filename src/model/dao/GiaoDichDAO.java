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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.bean.GiaoDich;

/**
 *
 * @author hoanghuynhman
 */
public class GiaoDichDAO {
    Database db = new Database();
    Connection conn;

    public ArrayList<GiaoDich> getListGiaoDich() {
        ArrayList<GiaoDich> gdList = new ArrayList<>();
        String query = "Select * from giaodich";
        
        try {
            Statement st = db.getConnection().createStatement();
            ResultSet rs = st.executeQuery(query);
            GiaoDich gd = null;
            while(rs.next()){
                gd = new GiaoDich(rs.getString("MaGD"), rs.getString("MaNVGD"), rs.getString("MoTaGD"), rs.getString("BenMua"), rs.getString("BenBan"), rs.getString("MaBDS"), rs.getInt("SoTien"), rs.getString("NgayGD"), rs.getFloat("TyLeHoaHong"));
                gdList.add(gd);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GiaoDichDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return gdList;
    }
}
