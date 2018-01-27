package com.test.mappers;

import com.test.Model.UserData;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
    String getTime();
}