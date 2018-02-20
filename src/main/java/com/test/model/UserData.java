package com.test.model;

import lombok.Data;

@Data
public class UserData {
    private int id;
    private String userKey;
    private int roomState;
    private int friendState;
}
