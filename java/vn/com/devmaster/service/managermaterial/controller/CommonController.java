package vn.com.devmaster.service.managermaterial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {
    @GetMapping("")
    public String showIndex(){
        return "layout/index";
    }
}
