package com.example.test.controller;

import com.example.test.model.Nganh;
import com.example.test.service.INganhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/nganh")
public class NganhController {
    @Autowired
    private INganhService nganhService;

    /**
     * @author DongPL
     * @version 1.0
     * Deploy INganhService's findAll, receive and traverse nganhList into list.html
     * @since
     */
    @GetMapping("/list")
    public String showList(Model model) {
        List<Nganh> nganhList = nganhService.findAll();
        model.addAttribute("nganhList", nganhList);
        return "nganh/list";
    }
}
