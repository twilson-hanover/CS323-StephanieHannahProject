package edu.hanover.cs323_stephaniehannahproject;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;
import android.support.v4.view.MenuItemCompat;
import android.view.MenuItem;
import android.app.ActionBar;



public class DeviceActivity extends ListActivity {
    public static final String device_option = "deviceNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device);
//        int deviceNo = (Integer) getIntent().getExtras().get(device_option);
//        Device devices = Device.devices[deviceNo];
//        AdapterView.OnItemClickListener itemClickListener =
//                new AdapterView.OnItemClickListener() {
//                    public void onItemClick(AdapterView<?> listView,
//                                            View v,
//                                            int position,
//                                            long id) {
//                        if (position == 0) {
//                            Intent intent = new Intent(DeviceActivity.this,
//                                    ProblemActivity.class);
//                            startActivity(intent);
//                        }
//                    }
        ListView listDevices = getListView();
        ArrayAdapter<Device> listAdapter = new ArrayAdapter<Device>(
                this, android.R.layout.simple_list_item_1, Device.devices);
        listDevices.setAdapter(listAdapter);

        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
                }
        //Add the listener to the list view
//        ListView listView = (ListView) findViewById(R.id.list);
//        listView.setOnItemClickListener(itemClickListener);
//    }
    @Override
    public void onListItemClick(ListView listView,
                                View itemView, int position, long id) {
        Intent intent = new Intent(DeviceActivity.this, ProblemActivity.class);
        intent.putExtra(DeviceActivity.device_option, (int) id);
        startActivity(intent);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), WelcomeActivity.class);
        startActivityForResult(myIntent, 0);
        return true;

    }

}
