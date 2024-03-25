package com.springboot.supermarket.response;


public class LoginResponse{
    String message;
    Boolean status;
    
    public LoginResponse(String message, Boolean status) {
        this.message = message;
        this.status = status;
    }

    public LoginResponse() {
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean isStatus() {
        return this.status;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "{" +
            " message='" + getMessage() + "'" +
            ", status='" + isStatus() + "'" +
            "}";
    }




} 