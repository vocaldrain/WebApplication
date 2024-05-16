package com.kabir.WebApplication.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CrackedController {

    @GetMapping("/cracked")
    public String crackedHomepage() {
        return "index";
    }
}
