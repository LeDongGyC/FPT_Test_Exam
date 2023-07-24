package com.example.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sinh_vien")
public class SinhVien {
    @Id
    @Column(name = "so_cmnd", columnDefinition = "varchar(13)")
    private String soCMND;
    @Column(name = "ho_ten", columnDefinition = "varchar(45)")
    private String hoTen;
    @Column(name = "email", columnDefinition = "varchar(45)")
    private String email;
    @Column(name = "so_dt", columnDefinition = "varchar(10)")
    private String soDT;
    @Column(name = "dia_chi", columnDefinition = "varchar(45)")
    private String diaChi;

    public SinhVien() {
    }

    public SinhVien(String soCMND, String hoTen, String email, String soDT, String diaChi) {
        this.soCMND = soCMND;
        this.hoTen = hoTen;
        this.email = email;
        this.soDT = soDT;
        this.diaChi = diaChi;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

}
