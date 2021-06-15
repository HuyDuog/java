/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlks;

import java.util.Date;

/**
 *
 * @author Bui Hoan
 */
public class NhanVien {
    private String MANV;
    private String TENNV;
    private String CHUCVU;
    private double LUONGNV;
    private Date NGAYSINH;
    private String GIOITINH;
    private String CHUTHICH;

    public NhanVien(String MANV, String TENNV, String CHUCVU, double LUONGNV, Date NGAYSINH, String GIOITINH, String CHUTHICH) {
        this.MANV = MANV;
        this.TENNV = TENNV;
        this.CHUCVU = CHUCVU;
        this.LUONGNV = LUONGNV;
        this.NGAYSINH = NGAYSINH;
        this.GIOITINH = GIOITINH;
        this.CHUTHICH = CHUTHICH;
    }

    public NhanVien() {
    }

    public String getMANV() {
        return MANV;
    }

    public void setMANV(String MANV) {
        this.MANV = MANV;
    }

    public String getTENNV() {
        return TENNV;
    }

    public void setTENNV(String TENNV) {
        this.TENNV = TENNV;
    }

    public String getCHUCVU() {
        return CHUCVU;
    }

    public void setCHUCVU(String CHUCVU) {
        this.CHUCVU = CHUCVU;
    }

    public double getLUONGNV() {
        return LUONGNV;
    }

    public void setLUONGNV(double LUONGNV) {
        this.LUONGNV = LUONGNV;
    }

    public Date getNGAYSINH() {
        return NGAYSINH;
    }

    public void setNGAYSINH(Date NGAYSINH) {
        this.NGAYSINH = NGAYSINH;
    }

    public String getGIOITINH() {
        return GIOITINH;
    }

    public void setGIOITINH(String GIOITINH) {
        this.GIOITINH = GIOITINH;
    }

    public String getCHUTHICH() {
        return CHUTHICH;
    }

    public void setCHUTHICH(String CHUTHICH) {
        this.CHUTHICH = CHUTHICH;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "MANV=" + MANV + ", TENNV=" + TENNV + ", CHUCVU=" + CHUCVU + ", LUONGNV=" + LUONGNV + ", NGAYSINH=" + NGAYSINH + ", GIOITINH=" + GIOITINH + ", CHUTHICH=" + CHUTHICH + '}';
    }
    
    
    
    
}
