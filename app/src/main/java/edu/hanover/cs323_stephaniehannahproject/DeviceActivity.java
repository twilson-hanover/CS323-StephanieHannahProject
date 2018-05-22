package edu.hanover.cs323_stephaniehannahproject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;


public class DeviceActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device);
    }
    AdapterView.OnItemClickListener itemClickListener =
            new AdapterView.OnItemClickListener(){
                public void onItemClick(AdapterView<?> listView,
                                        View v,
                                        int position,
                                        long id) {
                    if (position == 0) {
                        Intent intent = new Intent(DeviceActivity.this,
                                WelcomeActivity.class);
                        startActivity(intent);
                    }
                }
            };
    //Add the listener to the list view
//    ListView listView = (ListView) findViewById(R.id.list_options);
//    listView.setOnItemClickListener(itemClickListener);
}
