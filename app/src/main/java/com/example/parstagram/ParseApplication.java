package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application 

{@Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("sCSoshYdWGgmKs3m6m7hyDpRmcFG9hRese57iTXp")
                .clientKey("gEPIYjROCCxU927uKDPnNd6KIfqqevSHLkYIzMLN")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}

