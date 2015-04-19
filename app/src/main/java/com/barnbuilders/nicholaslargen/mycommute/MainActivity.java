package com.barnbuilders.nicholaslargen.mycommute;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import org.json.JSONArray;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void dashboardButton(View view)
    {
        //when this button is clicked, start the DashboardActivity
        Intent intent = new Intent(this, DashboardActivity.class);

        startActivity(intent);

        Log.i("MainActivity", "Starting Dashboard");

        startActivity(intent);
    }


    public void startButton()
    {
      //start a thread to deal with the recording, then display the dashboard
        //RecordingDrive rd = new RecordingDrive(); //might be threaded later and need more
        Intent intent = new Intent(this, DashboardActivity.class);
        startActivity(intent);
    }


}
