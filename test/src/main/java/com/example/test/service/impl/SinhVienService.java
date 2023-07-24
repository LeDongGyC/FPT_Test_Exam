package com.example.test.service.impl;

import com.example.test.model.SinhVien;
import com.example.test.repository.ISinhVienRepository;
import com.example.test.service.ISinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SinhVienService implements ISinhVienService {
    @Autowired
    private ISinhVienRepository repository;

    /**
     * @author DongPL
     * @version 1.0
     * Deploy  method findAll() of ISinhVienService
     * @since
     */
    @Override
    public List<SinhVien> findAll() {
        return repository.findAll();
    }

    /**
     * @author DongPL
     * @version 1.0
     * Deploy  method selectAll() of ISinhVienService
     * @since
     */
    @Override
    public List<SinhVien> selectAll(String soCMND, String hoTen, String email, String soDT, String diaChi) {
        return repository.selectAll(soCMND, hoTen, email, soDT, diaChi);
    }

}
