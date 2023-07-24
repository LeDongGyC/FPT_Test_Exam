package com.example.test.repository;

import com.example.test.model.CongViec;
import com.example.test.model.CongViecId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ICongViecRepository extends JpaRepository<CongViec, CongViecId> {
    final String SQL = "select sv.so_cmnd, sv.ho_ten, tn.ma_nganh as ma_nganh_tot_nghiep, tn.ma_truong, cv.ma_nganh as ma_nganh_cong_viec, cv.ten_cong_ty, cv.thoi_gian_lam_viec from tot_nghiep tn\n" +
            "join sinh_vien sv on tn.so_cmnd = sv.so_cmnd\n" +
            "join truong t on tn.ma_truong = t.ma_truong\n" +
            "join nganh n on tn.ma_nganh = n.ma_nganh\n" +
            "join cong_viec cv on n.ma_nganh = cv.ma_nganh\n" +
            "where sv.so_cmnd = ?";
    /**
     * @author DongPL
     * @version 1.0
     * A navite SQL with the function search all info student's congviec and vieclam
     * @since
     */
    @Query(value = SQL, nativeQuery = true)
    List<Object[]> selectAll(@Param("so_cmnd") String soCmnd);
//    List<JoinTable> selectAll(@Param("so_cmnd") String soCmnd);
}
