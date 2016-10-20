package com.example.ashwin.facebookevents;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FacebookSdk.sdkInitialize(getApplicationContext());
        AppEventsLogger.activateApp(this);
    }

    public void tagEvent(View view) {
        AppEventsLogger logger = AppEventsLogger.newLogger(this);
        // Add to a button click handler
        logger.logEvent("Test 1 button clicked");
    }
}
