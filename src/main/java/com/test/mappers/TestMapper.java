package com.test.mappers;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
    String getTime();
}