package com.test.restclass;

import lombok.Data;

@Data
public class PostedMessage {
    private String userKey;
    private String type;
    private String content;
}
