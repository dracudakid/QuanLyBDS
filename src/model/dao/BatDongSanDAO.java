/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.sql.Connection;
import java.util.ArrayList;
import model.bean.BatDongSan;

/**
 *
 * @author hoanghuynhman
 */
public class BatDongSanDAO {
    Database db = new Database();
    Connection conn;

    public ArrayList<BatDongSan> getListBatDongSan() {
        return new ArrayList<>();
    }
}
