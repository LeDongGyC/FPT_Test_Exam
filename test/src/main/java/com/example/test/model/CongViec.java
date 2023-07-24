package com.example.test.model;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "cong_viec")
@IdClass(CongViecId.class)
public class CongViec {
    @Id
    @ManyToOne
    @JoinColumn(name = "so_cmnd", referencedColumnName = "so_cmnd")
    private SinhVien sinhVien;
    @Id
    @Column(name = "ngay_vao_cong_ty", columnDefinition = "date")
    private String ngayVaoCongTy;
    @ManyToOne
    @JoinColumn(name = "ma_nganh", referencedColumnName = "ma_nganh")
    private Nganh nganh;
    @Column(name = "ten_cong_viec", columnDefinition = "varchar(45)")
    private String tenCongViec;
    @Column(name = "ten_cong_ty", columnDefinition = "varchar(45)")
    private String tenCongTy;
    @Column(name = "dia_chi_cong_ty", columnDefinition = "varchar(45)")
    private String diaChiCongTy;
    @Column(name = "thoi_gian_lam_viec")
    private int thoiGianLamViec;

    public CongViec() {
    }

    public CongViec(SinhVien sinhVien, String ngayVaoCongTy, Nganh nganh, String tenCongViec, String tenCongTy, String diaChiCongTy, int thoiGianLamViec) {
        this.sinhVien = sinhVien;
        this.ngayVaoCongTy = ngayVaoCongTy;
        this.nganh = nganh;
        this.tenCongViec = tenCongViec;
        this.tenCongTy = tenCongTy;
        this.diaChiCongTy = diaChiCongTy;
        this.thoiGianLamViec = thoiGianLamViec;
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

    public Nganh getNganh() {
        return nganh;
    }

    public void setNganh(Nganh nganh) {
        this.nganh = nganh;
    }

    public String getTenCongViec() {
        return tenCongViec;
    }

    public void setTenCongViec(String tenCongViec) {
        this.tenCongViec = tenCongViec;
    }

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public String getDiaChiCongTy() {
        return diaChiCongTy;
    }

    public void setDiaChiCongTy(String diaChiCongTy) {
        this.diaChiCongTy = diaChiCongTy;
    }

    public int getThoiGianLamViec() {
        return thoiGianLamViec;
    }

    public void setThoiGianLamViec(int thoiGianLamViec) {
        this.thoiGianLamViec = thoiGianLamViec;
    }
    public String getDayFormat() {
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
        Date dateDate = null;
        try {
            dateDate = formatDate.parse(this.ngayVaoCongTy);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat formatString = new SimpleDateFormat("dd/MM/yyyy");
        String dateFormat = formatString.format(dateDate);
        return dateFormat;
    }
}
