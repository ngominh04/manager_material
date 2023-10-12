package vn.com.devmaster.service.managermaterial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vn.com.devmaster.service.managermaterial.reponsitory.Responsitory;

@Controller
public class CommonController {
    @Autowired
    Responsitory responsitory;
    @GetMapping("")
    public String showIndex(Model model){
        model.addAttribute("trangChu",responsitory.getProductTC());
        return "layout/index";
    }
}
