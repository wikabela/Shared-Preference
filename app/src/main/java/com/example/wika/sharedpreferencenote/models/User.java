package com.example.wika.sharedpreferencenote.models;

import android.support.annotation.NonNull;

public class User {

    private Long id;
    private String username;
    private String password;

    public User(String username, String password) {
        this(null, username, password);
    }

    public User(Long id, @NonNull String username, @NonNull String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    @NonNull
    public Long getId() {
        return id;
    }

    public void setId(@NonNull Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

