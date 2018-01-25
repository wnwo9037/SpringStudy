package com.test;

import com.test.mappers.TestMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.sql.*;
@SpringBootApplication
@MapperScan("com.test.mappers")
public class SpringTestApplication {

	public static void main(String[] args) {
		/* 연결 확인을 위한 임시코드 */
//		try {
//			Class.forName("org.mariadb.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kakaobot","wnwo","51158128");
//			Statement st = con.createStatement();
//			st.executeUpdate("insert into test values ( 2, 'Watson', 34 )");
//			st.close();
//			con.close();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
		SpringApplication.run(SpringTestApplication.class, args);
	}
}
