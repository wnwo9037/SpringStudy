package com.test.kakaobot;

import com.test.mappers.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class SampleController {

    @Autowired
    private TestMapper testMapper;

    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    String getTime() {
        return testMapper.getTime();
    }

    @RequestMapping(value = "/testJSP", method = RequestMethod.POST)
    @ResponseBody
    String getTimeS() {
        return "index";
    }
}