package com.itwpsb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PSBController {

    @GetMapping(value = {"/", "home"})
    public String home() {
        return "home";
    }
}
