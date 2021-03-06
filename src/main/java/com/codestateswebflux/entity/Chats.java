package com.codestateswebflux.entity;

public class Chats {

    private String name;

    private String message;

    private String job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Chats(String name, String message, String job) {
        this.name = name;
        this.message = message;
        this.job = job;
    }
}
