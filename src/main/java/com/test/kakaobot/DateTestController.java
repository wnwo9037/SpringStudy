package com.test.kakaobot;

import com.test.DataAccessObject.GreetingChatDAO;
import com.test.Model.UserData;
import com.test.mappers.SherlockUserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
public class DateTestController {

    @Autowired
    private SherlockUserInterface sherlockUserInterface;
    @Autowired
    private GreetingChatDAO greetingChatDAO;

    /**
     * 마이바티스 기본 최소 설정으로 세팅한 메소드
     * @return
     */
    @RequestMapping("/dataTest")
    @ResponseBody
    public String responseDataInput(){
        UserData userData = new UserData();
        userData.setId(0);
        userData.setUser_key("HASHED_KEY");
        userData.setRoom_state(1);
        userData.setFriend_state(0);
        sherlockUserInterface.signupUser(userData);
        return "Success! Maybeeeee..?";
    }

    /**
     * SqlSession을 활용해서 덧댄 메소드
     * @return
     */
    @RequestMapping("/mbSessionMappingTest")
    @ResponseBody
    public List<HashMap> mybatisMappingTest(){
        return greetingChatDAO.selectGreeting();
    }
}
