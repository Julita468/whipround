package pl.sda.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class WhiproundController {

    @GetMapping("/")
    public ModelAndView getWhipround() {
        return new ModelAndView("whipround");
    }
}
