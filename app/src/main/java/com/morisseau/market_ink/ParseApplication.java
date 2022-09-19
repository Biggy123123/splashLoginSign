package com.morisseau.market_ink;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        // Initializes Parse SDK as soon as the application is created
        //ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("cbUgKrx6RNteK23lz8Ci6OfbtbCH4zcOQUD6imgw")
                .clientKey("G1fOTVvXjxj8DGUZdh9pzs5Weqil4ERHjZWfZrvL")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
