package com.example.test.dto;

public class CongViecTruongDTO {
    private String soCmnd;
    private String hoTen;
    private String maNganh;
    private String maTruong;
    private String maNganhCongViec;
    private String tenCongTy;
    private int thoiGianLamViec;

    public CongViecTruongDTO() {
    }

    public CongViecTruongDTO(String soCmnd, String hoTen, String maNganh, String maTruong, String maNganhCongViec, String tenCongTy, int thoiGianLamViec) {
        this.soCmnd = soCmnd;
        this.hoTen = hoTen;
        this.maNganh = maNganh;
        this.maTruong = maTruong;
        this.maNganhCongViec = maNganhCongViec;
        this.tenCongTy = tenCongTy;
        this.thoiGianLamViec = thoiGianLamViec;
    }

    public String getSoCmnd() {
        return soCmnd;
    }

    public void setSoCmnd(String soCmnd) {
        this.soCmnd = soCmnd;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(String maNganh) {
        this.maNganh = maNganh;
    }

    public String getMaTruong() {
        return maTruong;
    }

    public void setMaTruong(String maTruong) {
        this.maTruong = maTruong;
    }

    public String getMaNganhCongViec() {
        return maNganhCongViec;
    }

    public void setMaNganhCongViec(String maNganhCongViec) {
        this.maNganhCongViec = maNganhCongViec;
    }

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public int getThoiGianLamViec() {
        return thoiGianLamViec;
    }

    public void setThoiGianLamViec(int thoiGianLamViec) {
        this.thoiGianLamViec = thoiGianLamViec;
    }

}
