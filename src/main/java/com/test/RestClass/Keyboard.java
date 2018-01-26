package com.test.RestClass;

public class Keyboard {

    private String type;
    private String[] buttons;

    public Keyboard(){
        this.type = "buttons";
        this.buttons = new String[]{"선택1", "선택2", "선택3"};
    }

    public String getType(){
        return type;
    }
    public String[] getButtons(){
        return buttons;
    }
}
