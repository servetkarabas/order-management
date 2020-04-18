package com.roche.order.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class UIController {
    @GetMapping({"/","/buyer","/b"})
    public  String    openBuyerPage(Model m, RedirectAttributes ra){

        return "buyer";

    }
    @GetMapping({"/o","/order"})
    public  String    openOrderPage(Model m, RedirectAttributes ra){

        return "order";

    }
    @GetMapping({"/p","/product"})
    public  String    openProductPage(Model m, RedirectAttributes ra){

        return "product";

    }
}
