package com.test.kakaobot;

import com.test.Model.UserData;
import com.test.mappers.SherlockUserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DateTest {

    @Autowired
    private SherlockUserInterface sherlockUserInterface;


    @RequestMapping("/datatest")
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
}
