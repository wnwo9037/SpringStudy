package com.test.hello;

import com.test.RestClass.Keyboard;
import com.test.RestClass.Message;
import com.test.RestClass.PostedMessage;
import com.test.RestClass.ResponseMessage;
import org.springframework.web.bind.annotation.*;

@RestController
public class RestTestController {

    @RequestMapping("/keyboard")
    public Keyboard getKeyboard(){
        return new Keyboard();
    }

    @RequestMapping(value = "/message", method = RequestMethod.POST)
    public ResponseMessage responseMessage(@RequestBody PostedMessage postedMessage){
        ResponseMessage responseMessage = new ResponseMessage();
        Message msg = new Message();
        System.out.println(postedMessage.getContent());
        msg.setText("Elemetary.\nMy dear, Watson.");
        responseMessage.setMessage(msg);
        return responseMessage;
    }
}
