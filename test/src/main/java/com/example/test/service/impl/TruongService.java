package com.example.test.service.impl;

import com.example.test.model.Truong;
import com.example.test.repository.ITruongRepository;
import com.example.test.service.ITruongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TruongService implements ITruongService {
    @Autowired
    private ITruongRepository repository;
    /**
     * @author DongPL
     * @version 1.0
     * Deploy  method findAll() of ITruongService
     * @since
     */
    @Override
    public List<Truong> findAll() {
        return repository.findAll();
    }
}
