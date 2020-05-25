package com.howtodoinjava.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@RestController
public class LoginController {
    @RequestMapping(value = "user/login", method = RequestMethod.GET)
    public ModelAndView checkLogin(HttpServletRequest request){
        return new ModelAndView();
    }
}
