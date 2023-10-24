package com.github.spboot.sayargyi.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String indexPage(){
        return "index";
    }

@GetMapping("/about")
public String aboutPage() {
    return "about";
}
}

