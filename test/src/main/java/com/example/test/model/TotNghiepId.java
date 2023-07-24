package com.example.test.model;

import java.io.Serializable;
import java.util.Objects;

public class TotNghiepId implements Serializable {
    private SinhVien sinhVien;
    private Truong truong;
    private Nganh nganh;

    public TotNghiepId() {
    }

    public TotNghiepId(SinhVien sinhVien, Truong truong, Nganh nganh) {
        this.sinhVien = sinhVien;
        this.truong = truong;
        this.nganh = nganh;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public Truong getTruong() {
        return truong;
    }

    public void setTruong(Truong truong) {
        this.truong = truong;
    }

    public Nganh getNganh() {
        return nganh;
    }

    public void setNganh(Nganh nganh) {
        this.nganh = nganh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TotNghiepId that = (TotNghiepId) o;
        return Objects.equals(sinhVien, that.sinhVien) &&
                Objects.equals(truong, that.truong) &&
                Objects.equals(nganh, that.nganh);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sinhVien, truong, nganh);
    }
}
