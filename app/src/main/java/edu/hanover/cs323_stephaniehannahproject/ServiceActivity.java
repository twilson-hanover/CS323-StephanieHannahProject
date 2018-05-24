package edu.hanover.cs323_stephaniehannahproject;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class ServiceActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
    }

    public void onClickService(View view) {
        Intent intent = new Intent(this, MyIntentService.class);
        intent.putExtra(MyIntentService.EXTRA_MESSAGE,
                getResources().getString(R.string.button_response));
        startService(intent);
    }
}
