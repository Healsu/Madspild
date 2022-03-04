package com.example.madspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class Main {



    @GetMapping("/Homepage")
    public String homepage(){
        return "index";
    }

    @GetMapping("/Kontakt")
    public String kontakt(){
        return "kontakt";
    }
    @GetMapping("/side2")
    public String Side2(){
        return "side2";
    }

}
