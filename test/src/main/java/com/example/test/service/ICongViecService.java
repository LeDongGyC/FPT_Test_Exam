package com.example.test.service;

import com.example.test.dto.CongViecTruongDTO;
import com.example.test.model.CongViec;

import java.util.List;

public interface ICongViecService {
    /**
     * @author DongPL
     * @version 1.0
     * Find all database cong_viec
     * @since
     */
    List<CongViec> findAll();

    /**
     * @author DongPL
     * @version 1.0
     * Search for student info totnghiep and vieclam
     * @since
     */
    List<CongViecTruongDTO> selectAll(String soCMND);
//    List<JoinTable> selectAll(String soCMND);
}
