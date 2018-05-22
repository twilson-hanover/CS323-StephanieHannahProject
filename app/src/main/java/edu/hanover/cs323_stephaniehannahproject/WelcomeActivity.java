package edu.hanover.cs323_stephaniehannahproject;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }
    public void onClickNextWelcome(View v){
        Intent intent = new Intent (this, DeviceActivity.class);
        startActivity(intent);
        //click button to go to next page
    }
}
