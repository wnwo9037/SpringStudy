package com.test.mappers;

import com.test.model.UserData;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SherlockUserInterface {
    public void signupUser(UserData userData);

    public int idCheck(String userKey);
}