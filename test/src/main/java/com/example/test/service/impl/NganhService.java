package com.example.test.service.impl;

import com.example.test.model.Nganh;
import com.example.test.repository.INganhRepository;
import com.example.test.service.INganhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NganhService implements INganhService {
    @Autowired
    private INganhRepository repository;
    /**
     * @author DongPL
     * @version 1.0
     * Deploy  method findAll() of INganhService
     * @since
     */
    @Override
    public List<Nganh> findAll() {
        return repository.findAll();
    }
}
