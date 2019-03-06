package com.udacity.gradle.builditbigger.backend;

import com.smartzig.smartzjokes.SmartJokes;


/** The object model for the data we are sending through endpoints */
public class MyBean {

    private String myData;

    public String getData() {

        myData = new SmartJokes().getJoke();
        return myData;

    }
}