package com.test.RestClass;

import lombok.Data;

@Data
public class PostedMessage {
    private String user_key;
    private String type;
    private String content;

}
