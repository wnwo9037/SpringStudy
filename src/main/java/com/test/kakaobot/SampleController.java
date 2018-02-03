package com.test.kakaobot;

import com.test.Model.UserData;
import com.test.mappers.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @Autowired
    private TestMapper testMapper;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }

//    @RequestMapping("/index")
//    public String viewIndex(Model model) {
//        model.addAttribute("greeting", "Hello, world!");
//        return "index";
//    }

    @RequestMapping("/test")
    @ResponseBody
    String getTime(){
        return testMapper.getTime();
    }

    @RequestMapping("/testJSP")
    @ResponseBody
    String getTimeS(){
        return "index";
    }
}