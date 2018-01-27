package com.test.kakaobot;

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
        msg.setText("Elemetary.\nMy dear, Watson.");

        if("셜록".equals(postedMessage.getContent())){
            int randomWord = (int)Math.floor(Math.random()*10)+1;
            switch (randomWord) {
                case 1 :
                    msg.setText("무슨 일인가?");
                    break;
                case 2 :
                    msg.setText("사건이 있나?");
                    break;
                case 3 :
                    msg.setText("오늘은 시간이 없군.");
                    break;
                case 4 :
                    msg.setText("의뢰인이 오면 알려주게.\n도망쳐야 하니까.");
                    break;
                case 5 :
                    msg.setText("알파브라보찰리델타에코.. 음? 혹시 날 불렀었나?");
                    break;
                case 6 :
                    msg.setText("재미있는 일이 생겼으면 좋겠는데 말이야.");
                    break;
                case 7 :
                    msg.setText("마성의 눈빛, 회색의 뇌세포..! 아 이게 아니지.");
                    break;
                case 8 :
                    msg.setText("왜 그러나?");
                    break;
                case 9 :
                    msg.setText("쉽지 않은 사건이야..");
                    break;
                case 10 :
                    msg.setText("날 불렀나?");
                    break;
            }
        }

        responseMessage.setMessage(msg);
        return responseMessage;
    }
}
