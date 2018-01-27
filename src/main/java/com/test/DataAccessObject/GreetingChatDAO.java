package com.test.DataAccessObject;

import com.test.Model.Greeting;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public class GreetingChatDAO {

    @Autowired
    private SqlSession sqlSession;

    public List<HashMap> selectGreeting(){
        return this.sqlSession.selectList("selectGreeting");
    }

    public void insertGreeting(Greeting greeting){
        this.sqlSession.insert("insertGreeting", greeting);
    }
}
