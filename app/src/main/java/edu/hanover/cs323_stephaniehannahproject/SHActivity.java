package edu.hanover.cs323_stephaniehannahproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SHActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sh);
    }
    public void onClickFinish(View v){
        Intent intent = new Intent (this, WelcomeActivity.class);
        startActivity(intent);
        //click button to go to next page
    }
}
