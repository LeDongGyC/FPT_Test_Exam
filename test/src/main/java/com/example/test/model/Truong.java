package com.example.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "truong")
public class Truong {
    @Id
    @Column(name = "ma_truong",columnDefinition = "varchar(10)")
    private String maTruong;
    @Column(name = "ten_truong",columnDefinition = "varchar(45)")
    private String tenTruong;
    @Column(name = "dia_chi",columnDefinition = "varchar(45)")
    private String diaChi;
    @Column(name = "so_dt",columnDefinition = "varchar(10)")
    private String soDT;

    public Truong() {
    }

    public Truong(String maTruong, String tenTruong, String diaChi, String soDT) {
        this.maTruong = maTruong;
        this.tenTruong = tenTruong;
        this.diaChi = diaChi;
        this.soDT = soDT;
    }

    public String getMaTruong() {
        return maTruong;
    }

    public void setMaTruong(String maTruong) {
        this.maTruong = maTruong;
    }

    public String getTenTruong() {
        return tenTruong;
    }

    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }
}
