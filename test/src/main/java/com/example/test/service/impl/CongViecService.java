package com.example.test.service.impl;

import com.example.test.dto.CongViecTruongDTO;
import com.example.test.model.CongViec;
import com.example.test.repository.ICongViecRepository;
import com.example.test.service.ICongViecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CongViecService implements ICongViecService {
    @Autowired
    private ICongViecRepository repository;

    /**
     * @author DongPL
     * @version 1.0
     * implement method findAll() of ICongViecService
     * @since
     */
    @Override
    public List<CongViec> findAll() {
        return repository.findAll();
    }

    /**
     * @author DongPL
     * @version 1.0
     * Deploy  method selectAll() of ICongViecService
     * @since
     */
    @Override
    public List<CongViecTruongDTO> selectAll(String soCMND) {
        List<Object[]> result = repository.selectAll(soCMND);
        List<CongViecTruongDTO> congViecTruongDTOList = new ArrayList<>();
        for (Object[] obj : result) {
            CongViecTruongDTO dto = new CongViecTruongDTO();
            dto.setSoCmnd((String) obj[0]);
            dto.setHoTen((String) obj[1]);
            dto.setMaNganh((String) obj[2]);
            dto.setMaTruong((String) obj[3]);
            dto.setMaNganhCongViec((String) obj[4]);
            dto.setTenCongTy((String) obj[5]);
            dto.setThoiGianLamViec((int) obj[6]);
            congViecTruongDTOList.add(dto);
        }
        return congViecTruongDTOList;
    }

//    @Override
//    public List<JoinTable> selectAll(String soCMND) {
//        return repository.selectAll(soCMND);
//    }
}
