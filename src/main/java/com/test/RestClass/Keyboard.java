package com.test.RestClass;

import lombok.Data;

@Data
public class Keyboard {
    private String type;
    private String[] buttons;

    public Keyboard(){
        this.type = "text";
        this.buttons = new String[]{"비작동버튼", "비작동버튼", "비작동버튼"};
    }
}
