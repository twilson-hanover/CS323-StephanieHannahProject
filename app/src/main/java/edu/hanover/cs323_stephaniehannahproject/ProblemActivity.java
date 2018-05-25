package edu.hanover.cs323_stephaniehannahproject;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;

public class ProblemActivity extends Activity {
    /**
     * onCreate(Bundle) is where you initialize your activity. Most importantly,
     * here you will usually call setContentView(int) with a layout resource defining
     * your UI, and using findViewById(int) to retrieve the widgets in that UI that you
     * need to interact with programmatically.
     *
     * @param savedInstanceState a reference to a Bundle object that is passed into
     *                           the onCreate method
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem);
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    /**
     * onClickNextProblem provides functionality for the "Next" button that takes you to
     * the ContactActivity.
     * @param v occupies a rectangular area on the screen and is responsible for drawing
     *          and event handling.
     */
    public void onClickNextProblem(View v){
        Intent intent = new Intent (this, ContactActivity.class);
        startActivity(intent);
    }

    /**
     * onOptionsItemSelected is called whenever an item in your options menu (the back button)
     * is selected.
     * @param item is the device selected
     */
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), DeviceActivity.class);
        startActivityForResult(myIntent, 0);
        return true;

    }
}

