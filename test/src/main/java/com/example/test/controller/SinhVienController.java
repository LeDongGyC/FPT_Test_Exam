package com.example.test.controller;

import com.example.test.model.SinhVien;
import com.example.test.service.ISinhVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/sinhvien")
public class SinhVienController {
    @Autowired
    private ISinhVienService sinhVienService;

    /**
     * @author DongPL
     * @version 1.0
     * Deploy ISinhVienService's selectAll, receive and traverse List and search for data into list.html
     * @since
     */
    @GetMapping("/list")
    public String showList(Model model,
                           @RequestParam(required = false, defaultValue = "") String searchSoCMND,
                           @RequestParam(required = false, defaultValue = "") String searchHoTen,
                           @RequestParam(required = false, defaultValue = "") String searchEmail,
                           @RequestParam(required = false, defaultValue = "") String searchSoDT,
                           @RequestParam(required = false, defaultValue = "") String searchDiaChi) {
        List<SinhVien> sinhVienList = sinhVienService.selectAll(searchSoCMND, searchHoTen, searchEmail, searchSoDT, searchDiaChi);
        model.addAttribute("sinhVienList", sinhVienList);
        model.addAttribute("searchSoCMND", searchSoCMND);
        model.addAttribute("searchHoTen", searchHoTen);
        model.addAttribute("searchEmail", searchEmail);
        model.addAttribute("searchSoDT", searchSoDT);
        model.addAttribute("searchDiaChi", searchDiaChi);
        return "sinhvien/list";
    }
}
