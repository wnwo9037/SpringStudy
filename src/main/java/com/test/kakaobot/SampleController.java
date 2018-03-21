package com.test.kakaobot;

import com.test.mappers.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.redis.connection.RedisClusterConnection;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.util.JedisClusterCRC16;

@Controller
@EnableAutoConfiguration
public class SampleController {
    @Autowired
    private TestMapper testMapper;
    @Autowired
    RedisConnectionFactory connectionFactory;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    String home() {
        RedisClusterConnection connection = connectionFactory.getClusterConnection();
        for (int i=0; i<1000; ++i) {
            String key = "foo" + i;
            System.out.println("key: " +  key + ", slot: " + JedisClusterCRC16.getCRC16(key.getBytes()));
            connection.set(key.getBytes(), "bar".getBytes());
        }
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    String getTime() {
        return testMapper.getTime();
    }

    @RequestMapping(value = "/testJSP", method = RequestMethod.POST)
    @ResponseBody
    String getTimeS() {
        return "index";
    }
}