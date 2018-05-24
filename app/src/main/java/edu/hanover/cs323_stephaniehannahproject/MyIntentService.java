package edu.hanover.cs323_stephaniehannahproject;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import android.os.Handler;
import android.widget.Toast;

public class MyIntentService extends IntentService {
    public static final String EXTRA_MESSAGE = "message";
    private Handler handler;

    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        handler = new Handler();
        return super.onStartCommand(intent, flags, startId);
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
//        Log.v("MyIntentService", "The message is: " + text);
        handler.post(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_LONG).show();
            }
        });
    }
}