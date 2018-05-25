package edu.hanover.cs323_stephaniehannahproject;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ContactActivity extends Activity {
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
        setContentView(R.layout.activity_contact);
        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    /** onClickService provides functionality for the "Submit" button that pops up the toast
     * and also goes to SHActivity.
     * @param view occupies a rectangular area on the screen and is responsible for drawing
     *          and event handling.
     */
    public void onClickService(View view) {
        Intent intent = new Intent(this, MyIntentService.class);
        intent.putExtra(MyIntentService.EXTRA_MESSAGE,
                getResources().getString(R.string.button_response));
        startService(intent);

        Intent stephhan = new Intent (this, SHActivity.class);
        startActivity(stephhan);
    }

    /**
     * onOptionsItemSelected is called whenever an item in your options menu (the back button)
     * is selected.
     * @param item is the device selected
     */
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), ProblemActivity.class);
        startActivityForResult(myIntent, 0);
        return true;

    }
}
