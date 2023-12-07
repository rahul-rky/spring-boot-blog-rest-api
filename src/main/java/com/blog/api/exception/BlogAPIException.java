package com.blog.api.exception;

import org.springframework.http.HttpStatus;

public class BlogAPIException extends RuntimeException{
    HttpStatus status;
    String message;

    public BlogAPIException(HttpStatus status, String message){
        this.status = status;
        this.message = message;
    }
    public BlogAPIException(HttpStatus status, String message, String message1){
        super(message);
        this.status = status;
        this.message = message1;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
