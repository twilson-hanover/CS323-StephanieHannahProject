package edu.hanover.cs323_stephaniehannahproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SHActivity extends Activity {
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
        setContentView(R.layout.activity_sh);
    }

    /** onClickFinish provides functionality for the full page button that takes you to
     * the WelcomeActivity.
     * @param v occupies a rectangular area on the screen and is responsible for drawing
     *          and event handling.
     */
    public void onClickFinish(View v){
        Intent intent = new Intent (this, WelcomeActivity.class);
        startActivity(intent);
    }
}
