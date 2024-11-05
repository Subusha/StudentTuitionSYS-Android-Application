package com.example.studenttuitionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Quiz {
    private String name;
    private String password;

    public Quiz(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
