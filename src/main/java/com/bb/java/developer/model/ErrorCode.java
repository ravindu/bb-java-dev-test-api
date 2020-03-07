package com.bb.java.developer.model;

public enum ErrorCode {
    INTERNAL_ERROR_CODE("500"),
    VALIDATION_ERROR_CODE("400");

    private String errorCode;

    private ErrorCode(String errorCode){
        this.errorCode= errorCode;
    }

    public String getErrorCode(){
        return this.errorCode;
    }
}
