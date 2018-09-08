package com.testSpring.Controller;

import com.testSpring.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;

@Controller
@RequestMapping("/show")
public class AddController {


    ArrayList<String> strings = new ArrayList<>(Arrays.asList("Ivan", "Petr", "KOLIA"));

    @RequestMapping(method = RequestMethod.GET)
    public String showPage(Model model) {
        model.addAttribute("names", strings);
        return "page/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(@ModelAttribute Student student) {
        System.out.printf(student.getName());
        System.out.printf(student.getName2());
        strings.add(student.getName() + student.getName2());
        return "redirect:/show";
    }


    @RequestMapping(value = "/del", method = RequestMethod.GET)
    public String deleteAll(@ModelAttribute Student student) {
        strings.clear();
        return "redirect:/show";
    }
}
