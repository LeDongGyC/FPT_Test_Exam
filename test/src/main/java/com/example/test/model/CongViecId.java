package com.example.test.model;

import java.io.Serializable;
import java.util.Objects;

public class CongViecId implements Serializable {
    private SinhVien sinhVien;
    private String ngayVaoCongTy;

    public CongViecId() {
    }

    public CongViecId(SinhVien sinhVien, String ngayVaoCongTy) {
        this.sinhVien = sinhVien;
        this.ngayVaoCongTy = ngayVaoCongTy;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public String getNgayVaoCongTy() {
        return ngayVaoCongTy;
    }

    public void setNgayVaoCongTy(String ngayVaoCongTy) {
        this.ngayVaoCongTy = ngayVaoCongTy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CongViecId that = (CongViecId) o;
        return Objects.equals(sinhVien, that.sinhVien) &&
                Objects.equals(ngayVaoCongTy, that.ngayVaoCongTy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sinhVien, ngayVaoCongTy);
    }
}
