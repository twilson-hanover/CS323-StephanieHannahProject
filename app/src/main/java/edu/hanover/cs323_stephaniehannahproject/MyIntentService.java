package edu.hanover.cs323_stephaniehannahproject;

import android.app.IntentService; import android.content.Intent; import android.util.Log;
public class MyIntentService extends IntentService {
    public static final String EXTRA_MESSAGE = "message";

    public MyIntentService() { super("MyIntentService");
    }
    @Override
    protected void onHandleIntent(Intent intent) {
        synchronized (this) {
            try {
                wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String text = intent.getStringExtra(EXTRA_MESSAGE);
        showText(text);
    }
    private void showText(final String text) {
        Log.v("MyIntentService", "The message is: " + text);
    }
}