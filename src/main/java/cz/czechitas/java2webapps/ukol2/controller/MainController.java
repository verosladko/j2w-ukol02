package cz.czechitas.java2webapps.ukol2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Random;

@Controller
public class MainController {

    private final Random random = new Random();
    private final List<String> seznamTextu = List.of("Hard choices, easy life. Easy choices, hard life. – Jerzy Gregorek", "The wisest are the most annoyed at the loss of time. - Dante Alighieri, 1265 - 1312",
            "Einstein stated: Theories should be as simple as possible, but no simpler.So we will say. Training should be as simple as possible, but no simpler.",
            "The most courageous decision that you can make each day is to be in a good mood. - Voltaire",
            "Work like you don’t need the money. Love like you’ve never been hurt. Dance like nobody’s watching.");

    @GetMapping("/")
    public ModelAndView webpage() {
        int nahodneCislo = random.nextInt(5) + 1;


        ModelAndView result = new ModelAndView("index");
        result.addObject("obrazek", String.format("/images/obrazek-%d.jpg", nahodneCislo));
        result.addObject("text", String.valueOf(seznamTextu));
        return result;

    }

}
