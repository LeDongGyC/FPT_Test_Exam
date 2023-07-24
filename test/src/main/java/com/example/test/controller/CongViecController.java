package com.example.test.controller;

import com.example.test.dto.CongViecTruongDTO;
import com.example.test.service.ICongViecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/congviec")
public class CongViecController {
    @Autowired
    private ICongViecService congViecService;

    /**
     * @author DongPL
     * @version 1.0
     * Deploy ICongViecService's selectAll, receive and traverse congViecList into list1.html
     * @since
     */
    @GetMapping("/list")
    public String showList(Model model, @RequestParam(required = false, defaultValue = "") String searchSoCMND) {
        List<CongViecTruongDTO> congViecList = congViecService.selectAll(searchSoCMND);
//        List<JoinTable> congViecList = congViecService.selectAll(searchSoCMND);
        model.addAttribute("congViecList", congViecList);
        model.addAttribute("searchSoCMND", searchSoCMND);
        return "congviec/list1";
    }
}
