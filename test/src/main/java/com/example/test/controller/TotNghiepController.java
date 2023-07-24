package com.example.test.controller;

import com.example.test.dto.TotNghiepDTOCreate;
import com.example.test.model.TotNghiep;
import com.example.test.service.INganhService;
import com.example.test.service.ISinhVienService;
import com.example.test.service.ITotNghiepService;
import com.example.test.service.ITruongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/totnghiep")
public class TotNghiepController {
    @Autowired
    private ITotNghiepService totNghiepService;
    @Autowired
    private ISinhVienService sinhVienService;
    @Autowired
    private ITruongService truongService;
    @Autowired
    private INganhService nganhService;

    /**
     * @author DongPL
     * @version 1.0
     * Deploy ITotNghiepService's findAll, receive and traverse nganhList into list.html
     * @since
     */
    @GetMapping("/list")
    public String showList(Model model) {
        List<TotNghiep> totNghiepList = totNghiepService.findAll();
        model.addAttribute("totNghiepList", totNghiepList);
        return "totnghiep/list";
    }

    /**
     * @author DongPL
     * @version 1.0
     * Deploy receive and totnghiepDTO,truongList,sinhvienList,nganhList into list.html
     * @since
     */
    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("totnghiepDTO", new TotNghiepDTOCreate());
        model.addAttribute("truongList", truongService.findAll());
        model.addAttribute("sinhvienList", sinhVienService.findAll());
        model.addAttribute("nganhList", nganhService.findAll());
        return "totnghiep/create";
    }

    /**
     * @author DongPL
     * @version 1.0
     * Deploy ITotNghiepService's create, and check errors after submit,
     * @since
     */
    @PostMapping("/create")
    public String create(@ModelAttribute TotNghiepDTOCreate totnghiepDTO, BindingResult bindingResult, Model model, RedirectAttributes redirectAttributes) {
//        if (bindingResult.hasFieldErrors()) {
//            model.addAttribute("truongList", truongService.findAll());
//            model.addAttribute("sinhvienList", sinhVienService.findAll());
//            model.addAttribute("nganhList", nganhService.findAll());
//            return "totnghiep/create";
//        }
        totNghiepService.create(totnghiepDTO);
        redirectAttributes.addFlashAttribute("mess", "Thêm mới thành công!");
        return "redirect:/totnghiep/list";
    }
}
