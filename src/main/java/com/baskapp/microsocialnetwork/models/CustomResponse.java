package com.baskapp.microsocialnetwork.models;


public class CustomResponse {
    public int statusCode;
    public String message;
    public Object data;

    public CustomResponse(int statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }

    public CustomResponse(int statusCode, Object data) {
        this.statusCode = statusCode;
        this.data = data;
    }

    public CustomResponse(int statusCode, String message, Object data) {
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }
}
