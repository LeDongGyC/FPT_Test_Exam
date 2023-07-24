package com.example.test.service;

import com.example.test.model.SinhVien;

import java.util.List;

public interface ISinhVienService {
    /**
     * @author DongPL
     * @version 1.0
     * Find all database sinh_vien
     * @since
     */
    List<SinhVien> findAll();
    /**
     * @author DongPL
     * @version 1.0
     * Search for info student
     */
    List<SinhVien> selectAll(String soCMND, String hoTen, String email, String soDT, String diaChi);
}
