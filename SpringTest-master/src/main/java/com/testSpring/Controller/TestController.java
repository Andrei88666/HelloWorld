package com.testSpring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class TestController {


    @RequestMapping(method = RequestMethod.GET)
    public String showIndex(Model model) {
        model.addAttribute("message", "  me first message in spring");
        return "page/index";
    }

    @RequestMapping(value = "go",method = RequestMethod.GET)
    public String show(Model model) {
        model.addAttribute("message", " me first message in spring");
        return "redirect:/add";
    }

}
