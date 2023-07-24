package com.example.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nganh")
public class Nganh {
    @Id
    @Column(name = "ma_nganh",columnDefinition = "varchar(10)")
    private String maNganh;
    @Column(name = "ten_nganh",columnDefinition = "varchar(45)")
    private String tenNganh;
    @Column(name = "loai_nganh",columnDefinition = "varchar(45)")
    private String loaiNganh;

    public Nganh() {
    }

    public Nganh(String maNganh, String tenNganh, String loaiNganh) {
        this.maNganh = maNganh;
        this.tenNganh = tenNganh;
        this.loaiNganh = loaiNganh;
    }

    public String getMaNganh() {
        return maNganh;
    }

    public void setMaNganh(String maNganh) {
        this.maNganh = maNganh;
    }

    public String getTenNganh() {
        return tenNganh;
    }

    public void setTenNganh(String tenNganh) {
        this.tenNganh = tenNganh;
    }

    public String getLoaiNganh() {
        return loaiNganh;
    }

    public void setLoaiNganh(String loaiNganh) {
        this.loaiNganh = loaiNganh;
    }
}
