package com.example.test.service;

import com.example.test.dto.TotNghiepDTOCreate;
import com.example.test.model.TotNghiep;

import java.util.List;

public interface ITotNghiepService {
    /**
     * @author DongPL
     * @version 1.0
     * Find all database tot_nghiep
     * @since
     */
    List<TotNghiep> findAll();

    /**
     * @author DongPL
     * @version 1.0
     * Insert into one row data in the table tot_nghiep
     * @since
     */
    void create(TotNghiepDTOCreate totNghiepDTO);
}
