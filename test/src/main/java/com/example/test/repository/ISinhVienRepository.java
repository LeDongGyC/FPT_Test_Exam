package com.example.test.repository;

import com.example.test.model.SinhVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ISinhVienRepository extends JpaRepository<SinhVien, String> {
    /**
     * @author DongPL
     * @version 1.0
     * A navite SQL with the function search all info student's
     * @since
     */
    @Query(value = "select * from sinh_vien where so_cmnd like %:so_cmnd% and ho_ten like %:ho_ten% and email like %:email% and so_dt like %:so_dt% and dia_chi like %:dia_chi%", nativeQuery = true)
    List<SinhVien> selectAll(@Param("so_cmnd") String SoCMND, @Param("ho_ten") String hoTen, @Param("email") String email, @Param("so_dt") String soDT, @Param("dia_chi") String diaChi);
}
