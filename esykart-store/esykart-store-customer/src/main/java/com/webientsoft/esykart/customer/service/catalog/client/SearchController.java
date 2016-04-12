package com.webientsoft.esykart.customer.service.catalog.client;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/search")
public class SearchController {

    @RequestMapping("/")
    public String search(Model model,  @RequestParam(value = "q") String q){
        return null;
    }

}