/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlks;

/**
 *
 * @author Bui Hoan
 */
public class DichVu {
    private String MADV;
    private String TENNVL;
    private double GIADV;

    public DichVu(String MADV, String TENNVL, double GIADV) {
        this.MADV = MADV;
        this.TENNVL = TENNVL;
        this.GIADV = GIADV;
    }

    public DichVu() {
    }

    public String getMADV() {
        return MADV;
    }

    public void setMADV(String MADV) {
        this.MADV = MADV;
    }

    public String getTENNVL() {
        return TENNVL;
    }

    public void setTENNVL(String TENNVL) {
        this.TENNVL = TENNVL;
    }

    public double getGIADV() {
        return GIADV;
    }

    public void setGIADV(double GIADV) {
        this.GIADV = GIADV;
    }

    @Override
    public String toString() {
        return "DichVu{" + "MADV=" + MADV + ", TENNVL=" + TENNVL + ", GIADV=" + GIADV + '}';
    }
    
    
    
}