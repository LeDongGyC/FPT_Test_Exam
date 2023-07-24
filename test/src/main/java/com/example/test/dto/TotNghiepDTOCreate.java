package com.example.test.dto;

public class TotNghiepDTOCreate {
    private String SoCMND;

    private String MaTruong;

    private String MaNganh;

    private String heTN;

    private String ngayTN;

    private String loaiTN;

    public TotNghiepDTOCreate() {
    }

    public TotNghiepDTOCreate(String soCMND, String maTruong, String maNganh, String heTN, String ngayTN, String loaiTN) {
        SoCMND = soCMND;
        MaTruong = maTruong;
        MaNganh = maNganh;
        this.heTN = heTN;
        this.ngayTN = ngayTN;
        this.loaiTN = loaiTN;
    }

    public String getSoCMND() {
        return SoCMND;
    }

    public void setSoCMND(String soCMND) {
        SoCMND = soCMND;
    }

    public String getMaTruong() {
        return MaTruong;
    }

    public void setMaTruong(String maTruong) {
        MaTruong = maTruong;
    }

    public String getMaNganh() {
        return MaNganh;
    }

    public void setMaNganh(String maNganh) {
        MaNganh = maNganh;
    }

    public String getHeTN() {
        return heTN;
    }

    public void setHeTN(String heTN) {
        this.heTN = heTN;
    }

    public String getNgayTN() {
        return ngayTN;
    }

    public void setNgayTN(String ngayTN) {
        this.ngayTN = ngayTN;
    }

    public String getLoaiTN() {
        return loaiTN;
    }

    public void setLoaiTN(String loaiTN) {
        this.loaiTN = loaiTN;
    }
}
