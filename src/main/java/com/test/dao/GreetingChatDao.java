package com.test.dao;

import com.test.model.Greeting;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public class GreetingChatDao {

    @Autowired
    private SqlSession sqlSession;

    public List<HashMap> selectGreeting() {
        return this.sqlSession.selectList("selectGreeting");
    }

    public void insertGreeting(Greeting greeting) {
        this.sqlSession.insert("insertGreeting", greeting);
    }
}
