/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author hoanghuynhman
 */
public class BatDongSan {
    private String maBDS;
    private String maKH;
    private String loaiNC;
    private String loaiBDS;
    private String diaChi;
    private String viTri;
    private String huong;
    private int dienTich;
    private int giaTien;
    private String ghiChu;
    private String tinhTrang;

    public String getMaBDS() {
        return maBDS;
    }

    public BatDongSan(String maBDS, String maKH, String loaiNC, String loaiBDS, String diaChi, String viTri, String huong, int dienTich, int giaTien, String ghiChu, String tinhTrang) {
        this.maBDS = maBDS;
        this.maKH = maKH;
        this.loaiNC = loaiNC;
        this.loaiBDS = loaiBDS;
        this.diaChi = diaChi;
        this.viTri = viTri;
        this.huong = huong;
        this.dienTich = dienTich;
        this.giaTien = giaTien;
        this.ghiChu = ghiChu;
        this.tinhTrang = tinhTrang;
    }

    public void setMaBDS(String maBDS) {
        this.maBDS = maBDS;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getLoaiNC() {
        return loaiNC;
    }

    public void setLoaiNC(String loaiNC) {
        this.loaiNC = loaiNC;
    }

    public String getLoaiBDS() {
        return loaiBDS;
    }

    public void setLoaiBDS(String loaiBDS) {
        this.loaiBDS = loaiBDS;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public String getHuong() {
        return huong;
    }

    public void setHuong(String huong) {
        this.huong = huong;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    
}
