package com.test.kakaobot;

import com.test.dao.GreetingChatDao;
import com.test.mappers.SherlockUserInterface;
import com.test.model.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
public class DateTestController {

    @Autowired
    private SherlockUserInterface sherlockUserInterface;
    @Autowired
    private GreetingChatDao greetingChatDao;

    /**
     * 마이바티스 기본 최소 설정으로 세팅한 메소드
     * @return Success! Maybeeeee..?
     */
    @RequestMapping(value = "/dataTest", method = RequestMethod.POST)
    @ResponseBody
    public String responseDataInput() {
        UserData userData = new UserData();
        userData.setId(0);
        userData.setUserKey("HASHED_KEY");
        userData.setRoomState(1);
        userData.setFriendState(0);
        sherlockUserInterface.signupUser(userData);
        return "Success! Maybeeeee..?";
    }

    /**
     * SqlSession을 활용해서 덧댄 메소드.
     * @return greetings
     */
    @RequestMapping(value = "/mbSessionMappingTest", method = RequestMethod.POST)
    @ResponseBody
    public List<HashMap> mybatisMappingTest() {
        return greetingChatDao.selectGreeting();
    }
}
