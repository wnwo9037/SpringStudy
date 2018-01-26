package com.test.hello;

import com.test.RestClass.Keyboard;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RestTestController {

    @RequestMapping("/keyboard")
    public Keyboard getKeyboard(){
        return new Keyboard();
    }
}
