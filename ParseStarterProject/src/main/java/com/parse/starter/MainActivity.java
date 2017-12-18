/*
 * Copyright (c) 2015-present, Parse, LLC.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
package com.parse.starter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Switch;

import com.parse.GetCallback;
import com.parse.LogInCallback;
import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseAnonymousUtils;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;
import com.parse.SaveCallback;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        // Let's say we want to save someone's user name!
        // Score is a class so it is in capital
        ParseObject score = new ParseObject("Score");
        // That would save our variable username with a value of rob.
        // And make it a new object within the Score class
        score.put("username", "rob");
        score.put("score", 86);
        // Number of ways to save this object
        score.saveInBackground(new SaveCallback() {
            // When the saving is done
            @Override
            public void done(ParseException e) {

                if(e == null)
                {
                    Log.i("Save in background", "successful");
                } else {
                    Log.i("Save in background", "failed: " + e.toString());
                }

            }
        });*/

        /*Now how do we retrieve objects from Parse Sever?*/
        /*Parse Query takes in a parse object and the object class "Score"*/
        /*ParseQuery<ParseObject> query = ParseQuery.getQuery("Score");
        query.getInBackground("CbzE6l8iwb", new GetCallback<ParseObject>() {
            @Override
            public void done(ParseObject object, ParseException e) {
                if (e == null && object != null)
                {
                    //We can also update the values of our objects like the following
                    //Just use the put method again to update the value.
                    //object.put("score", 1650);
                    //And then after updating we have to save it again!
                    //object.saveInBackground();
                    //We commented the code above because we only have to update once to save
                    Log.i("Object", object.getString("username"));
                    Log.i("Object", Integer.toString(object.getInt("score")));
                } else
                {
                    Log.i("Object", "Doesn't exist");
                }
            }
        });*/

        /*Now create a tweet class, user, tweet, parse it, query it, and update it and query again!*/
        /*ParseObject tweet = new ParseObject("Tweet");
        tweet.put("user", "Rob");
        tweet.put("tweet", "Hello there Rob!");

        tweet.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if (e == null){
                    Log.i("Save in Background", "Successful");
                } else
                {
                    Log.i("Save in Background", "Failed to Save");
                }
            }
        });*/
        //Now Query it!
        ParseQuery<ParseObject> queryTweet = ParseQuery.getQuery("Tweet");

        queryTweet.getInBackground("mlFRvUmUpk", new GetCallback<ParseObject>() {
            @Override
            public void done(ParseObject object, ParseException e) {
                if (e == null && object != null)
                {
                    //object.put("tweet", "Hello new Tweet");
                    //object.saveInBackground();
                    Log.i("Object", object.getString("user"));
                    Log.i("Object", object.getString("tweet"));
                } else
                {
                    Log.i("Object", "Doesn't exist!");
                }
            }
        });
























        ParseAnalytics.trackAppOpenedInBackground(getIntent());
    }

}