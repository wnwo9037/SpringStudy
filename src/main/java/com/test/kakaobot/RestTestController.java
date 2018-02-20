package com.test.kakaobot;

import com.test.mappers.SherlockUserInterface;
import com.test.model.UserData;
import com.test.restclass.Keyboard;
import com.test.restclass.Message;
import com.test.restclass.PostedMessage;
import com.test.restclass.ResponseMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTestController {

    @Autowired
    private SherlockUserInterface sherlockUserInterface;

    @RequestMapping(value = "/keyboard", method = RequestMethod.POST)
    public Keyboard getKeyboard() {
        return new Keyboard();
    }

    /**
     * javadoc이 있어야되네.
     * @param postedMessage message
     * @return Elemetary.\nMy dear, Watson.
     */
    @RequestMapping(value = "/message", method = RequestMethod.POST)
    public ResponseMessage responseMessage(@RequestBody PostedMessage postedMessage) {
        Message msg = new Message();
        msg.setText("Elemetary.\nMy dear, Watson.");

        if (sherlockUserInterface.idCheck(postedMessage.getUserKey()) == 0) {
            UserData userData = new UserData();
            userData.setId(0);
            userData.setUserKey(postedMessage.getUserKey());
            userData.setRoomState(1);
            userData.setFriendState(0);
            sherlockUserInterface.signupUser(userData);
        }

        if ("셜록".equals(postedMessage.getContent())) {
            int randomWord = (int)Math.floor(Math.random() * 10) + 1;

            // 나중에 이런 문구들을 모두 DB에서 빼오는 방식으로 설정한다.
            // 여기에 맞춰서 DB 설계를 해야할 듯.
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
                default:
                    break;
            }
        }

        ResponseMessage responseMessage = new ResponseMessage();
        responseMessage.setMessage(msg);
        return responseMessage;
    }
}
