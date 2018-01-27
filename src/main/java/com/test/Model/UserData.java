package com.test.Model;

import lombok.Data;

@Data
public class UserData {
    private int id;
    private String user_key;
    private int room_state;
    private int friend_state;
}
