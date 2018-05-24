package edu.hanover.cs323_stephaniehannahproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ContactActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }

    public void onClickService(View view) {
        Intent intent = new Intent(this, MyIntentService.class);
        intent.putExtra(MyIntentService.EXTRA_MESSAGE,
                getResources().getString(R.string.button_response));
        startService(intent);
    }
}
