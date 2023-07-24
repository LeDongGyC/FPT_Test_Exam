package com.example.test.controller;

import com.example.test.model.Truong;
import com.example.test.service.ITruongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/truong")
public class TruongController {
    @Autowired
    private ITruongService truongService;
    /**
     * @author DongPL
     * @version 1.0
     * Deploy ITruongService's findAll, receive and traverse truongList into list.html
     * @since
     */
    @GetMapping("/list")
    public String showList(Model model){
        List<Truong> truongList = truongService.findAll();
        model.addAttribute("truongList",truongList);
        return "truong/list";
    }
}
