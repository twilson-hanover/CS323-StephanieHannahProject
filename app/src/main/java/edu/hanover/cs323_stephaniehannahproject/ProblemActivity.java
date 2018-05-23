package edu.hanover.cs323_stephaniehannahproject;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;
import android.content.Intent;

public class ProblemActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem);
//        ListView listDevices = getListView();
//        ArrayAdapter<Device> listAdapter = new ArrayAdapter<Device>(
//                this, android.R.layout.simple_list_item_1, Device.devices);
//        listDevices.setAdapter(listAdapter);
    }

    public void onClickNextProblem(View v){
        Intent intent = new Intent (this, ContactActivity.class);
        startActivity(intent);
        //click button to go to next page
    }

//    @Override
//    public void onListItemClick(ListView listView,
//                                View itemView, int position, long id) {
//        Intent intent = new Intent(ProblemActivity.this, DeviceActivity.class);
//        intent.putExtra(DeviceActivity.device_option, (int) id);
//        startActivity(intent);
    }
//}
