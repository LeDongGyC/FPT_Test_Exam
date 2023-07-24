package com.example.test.service.impl;

import com.example.test.dto.TotNghiepDTOCreate;
import com.example.test.model.TotNghiep;
import com.example.test.repository.ITotNghiepRepository;
import com.example.test.service.ITotNghiepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class TotNghiepService implements ITotNghiepService {
    @Autowired
    private ITotNghiepRepository repository;
    /**
     * @author DongPL
     * @version 1.0
     * Deploy  method findAll() of ITotNghiepService
     * @since
     */
    @Override
    public List<TotNghiep> findAll() {
        return repository.findAll();
    }
    /**
     * @author DongPL
     * @version 1.0
     * Deploy  method create() of ITotNghiepService
     * @since
     */
    @Override
    public void create(TotNghiepDTOCreate totNghiepDTO) {
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedTime = currentTime.format(formatter);
        totNghiepDTO.setNgayTN(formattedTime);
        repository.create(totNghiepDTO.getSoCMND(), totNghiepDTO.getMaTruong(), totNghiepDTO.getMaNganh(), totNghiepDTO.getHeTN(), totNghiepDTO.getNgayTN(), totNghiepDTO.getLoaiTN());
    }
}
