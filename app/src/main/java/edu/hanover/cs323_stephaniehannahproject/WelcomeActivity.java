package edu.hanover.cs323_stephaniehannahproject;

import android.content.Intent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class WelcomeActivity extends Activity {
    /**
     * onCreate(Bundle) is where you initialize your activity. Most importantly,
     * here you will usually call setContentView(int) with a layout resource defining
     * your UI, and using findViewById(int) to retrieve the widgets in that UI that you
     * need to interact with programmatically.
     *
     * @param savedInstanceState a reference to a Bundle object that is passed into
     *                           the onCreate method.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }

    /** onClickNextWelcome provides functionality for the "Next" button that takes you to
     * the DeviceActivity.
     * @param v occupies a rectangular area on the screen and is responsible for drawing
     *          and event handling.
     */
    public void onClickNextWelcome(View v){
        Intent intent = new Intent (this, DeviceActivity.class);
        startActivity(intent);
    }

}
