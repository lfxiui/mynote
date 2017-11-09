package com.lifuxi.mynote.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/note")
public class NoteController {
    @RequestMapping("index")
    public String index(){
        return "index";
    }
}
