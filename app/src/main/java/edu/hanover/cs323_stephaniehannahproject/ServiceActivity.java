package edu.hanover.cs323_stephaniehannahproject;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class ServiceActivity extends Activity {
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
        setContentView(R.layout.activity_service);
    }

    /** onClickService provides functionality for the "Submit" button that takes you to
     * the SHActivity, and also provides functionality for the toast.
     * @param view occupies a rectangular area on the screen and is responsible for drawing
     *          and event handling.
     */
    public void onClickService(View view) {
        Intent intent = new Intent(this, MyIntentService.class);
        intent.putExtra(MyIntentService.EXTRA_MESSAGE,
                getResources().getString(R.string.button_response));
        startService(intent);
    }
}
