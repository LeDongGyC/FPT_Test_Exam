package com.example.test.model;

import javax.persistence.*;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "tot_nghiep")
@IdClass(TotNghiepId.class)
public class TotNghiep implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "so_cmnd", referencedColumnName = "so_cmnd", foreignKey = @ForeignKey(name = "FK_TOTNGHIEP_SINHVIEN"))
    private SinhVien sinhVien;

    @Id
    @ManyToOne
    @JoinColumn(name = "ma_truong", referencedColumnName = "ma_truong", foreignKey = @ForeignKey(name = "FK_TOTNGHIEP_TRUONG"))
    private Truong truong;

    @Id
    @ManyToOne
    @JoinColumn(name = "ma_nganh", referencedColumnName = "ma_nganh", foreignKey = @ForeignKey(name = "FK_TOTNGHIEP_NGANH"))
    private Nganh nganh;
    @Column(name = "he_tn", columnDefinition = "varchar(10)")
    private String heTN;
    @Column(name = "ngay_tn", columnDefinition = "date")
    private String ngayTN;
    @Column(name = "loai_tn", columnDefinition = "varchar(10)")
    private String loaiTN;

    public TotNghiep() {
    }

    public TotNghiep(SinhVien sinhVien, Truong truong, Nganh nganh, String heTN, String ngayTN, String loaiTN) {
        this.sinhVien = sinhVien;
        this.truong = truong;
        this.nganh = nganh;
        this.heTN = heTN;
        this.ngayTN = ngayTN;
        this.loaiTN = loaiTN;
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

    public String getDayFormat() {
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
        Date dateDate = null;
        try {
            dateDate = formatDate.parse(this.ngayTN);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat formatString = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormat = formatString.format(dateDate);
        return dateFormat;
    }
}
