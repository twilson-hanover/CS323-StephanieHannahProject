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
        setContentView(R.layout.activity_device);
        ListView listDevices = getListView();
        ArrayAdapter<Device> listAdapter = new ArrayAdapter<Device>(
                this, android.R.layout.simple_list_item_1, Device.devices);
        listDevices.setAdapter(listAdapter);

        ActionBar actionBar = getActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onListItemClick(ListView listView,
                                View itemView, int position, long id) {
        Intent intent = new Intent(DeviceActivity.this, ProblemActivity.class);
        intent.putExtra(DeviceActivity.device_option, (int) id);
        startActivity(intent);
    }

    /**
     * onOptionsItemSelected is called whenever an item in your options menu (the back button)
     * is selected.
     * @param item is the device selected
     */
    public boolean onOptionsItemSelected(MenuItem item){
        Intent myIntent = new Intent(getApplicationContext(), WelcomeActivity.class);
        startActivityForResult(myIntent, 0);
        return true;

    }

}
