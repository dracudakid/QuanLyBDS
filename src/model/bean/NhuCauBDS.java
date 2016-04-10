/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author khidot73
 */
public class NhuCauBDS {
    private String maNC;
    private String maKH;
    private String loaiNC;
    private String loaiBDS;
    private String viTri;
    private int dientichMax;
    private int dientichMin;
    private String ghiChu;

    public String getMaNC() {
        return maNC;
    }

    public String getMaKH() {
        return maKH;
    }

    public String getLoaiNC() {
        return loaiNC;
    }

    public String getLoaiBDS() {
        return loaiBDS;
    }

    public String getViTri() {
        return viTri;
    }

    public int getDientichMax() {
        return dientichMax;
    }

    public int getDientichMin() {
        return dientichMin;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setMaNC(String maNC) {
        this.maNC = maNC;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public void setLoaiNC(String loaiNC) {
        this.loaiNC = loaiNC;
    }

    public void setLoaiBDS(String loaiBDS) {
        this.loaiBDS = loaiBDS;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public void setDientichMax(int dientichMax) {
        this.dientichMax = dientichMax;
    }

    public void setDientichMin(int dientichMin) {
        this.dientichMin = dientichMin;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public NhuCauBDS() {
    }

    public NhuCauBDS(String maNC, String maKH, String loaiNC, String loaiBDS, String viTri, int dientichMax, int dientichMin, String ghiChu) {
        this.maNC = maNC;
        this.maKH = maKH;
        this.loaiNC = loaiNC;
        this.loaiBDS = loaiBDS;
        this.viTri = viTri;
        this.dientichMax = dientichMax;
        this.dientichMin = dientichMin;
        this.ghiChu = ghiChu;
    }
    
    
    
}
