package com.greetgo.HelloWorldSite.domain;

public class PageDomain {
    private String message;

    public PageDomain(String message) {
        this.message = message;
    }

    public PageDomain() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return this.message;
    }
}
