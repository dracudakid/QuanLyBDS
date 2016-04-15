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
public class GiaoDich {
    private String maGD;
    private String maNVGD;
    private String moTaGD;
    private String benMua;
    private String benBan;
    private String maBDS;
    private int soTien;
    private String ngayGD;
    private float tiLeHoaHong;

    public GiaoDich(String maGD, String maNVGD, String moTaGD, String benMua, String benBan, String maBDS, int soTien, String ngayGD, float tiLeHoaHong) {
        this.maGD = maGD;
        this.maNVGD = maNVGD;
        this.moTaGD = moTaGD;
        this.benMua = benMua;
        this.benBan = benBan;
        this.maBDS = maBDS;
        this.soTien = soTien;
        this.ngayGD = ngayGD;
        this.tiLeHoaHong = tiLeHoaHong;
    }

    public String getMaGD() {
        return maGD;
    }

    public void setMaGD(String maGD) {
        this.maGD = maGD;
    }

    public String getMaNVGD() {
        return maNVGD;
    }

    public void setMaNVGD(String maNVGD) {
        this.maNVGD = maNVGD;
    }

    public String getMoTaGD() {
        return moTaGD;
    }

    public void setMoTaGD(String moTaGD) {
        this.moTaGD = moTaGD;
    }

    public String getBenMua() {
        return benMua;
    }

    public void setBenMua(String benMua) {
        this.benMua = benMua;
    }

    public String getBenBan() {
        return benBan;
    }

    public void setBenBan(String benBan) {
        this.benBan = benBan;
    }

    public String getMaBDS() {
        return maBDS;
    }

    public void setMaBDS(String maBDS) {
        this.maBDS = maBDS;
    }

    public int getSoTien() {
        return soTien;
    }

    public void setSoTien(int soTien) {
        this.soTien = soTien;
    }

    public String getNgayGD() {
        return ngayGD;
    }

    public void setNgayGD(String ngayGD) {
        this.ngayGD = ngayGD;
    }

    public float getTiLeHoaHong() {
        return tiLeHoaHong;
    }

    public void setTiLeHoaHong(float tiLeHoaHong) {
        this.tiLeHoaHong = tiLeHoaHong;
    }
    
}
