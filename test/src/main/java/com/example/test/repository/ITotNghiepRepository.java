package com.example.test.repository;

import com.example.test.model.TotNghiep;
import com.example.test.model.TotNghiepId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ITotNghiepRepository extends JpaRepository<TotNghiep, TotNghiepId> {
    /**
     * @author DongPL
     * @version 1.0
     * A navite SQL with the function create a info totnghiep
     * @since
     */
    @Modifying
    @Query(value = "INSERT INTO tot_nghiep (so_cmnd, ma_truong, ma_nganh, he_tn, ngay_tn, loai_tn) VALUES(?1,?2,?3,?4,?5,?6)", nativeQuery = true)
    void create(String SoCMND, String MaTruong, String MaNganh, String HeTN, String NgayTN, String LoaiTN);
}
