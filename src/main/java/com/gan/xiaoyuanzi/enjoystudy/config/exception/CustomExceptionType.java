package com.gan.xiaoyuanzi.enjoystudy.config.exception;

public enum CustomExceptionType {
    USER_INPUT_ERROR("Input exception",400),
    SYSTEM_ERROR("System exception",500),
    OTHER_ERROR("Other exception",999);

    private String typeDesc;
    private int code;

    public String getTypeDesc(){
        return typeDesc;
    }
    public int getCode(){
        return code;
    }

    CustomExceptionType(String typeDesc, int code) {
        this.typeDesc = typeDesc;
        this.code = code;
    }
}
