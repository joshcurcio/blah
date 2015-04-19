package com.barnbuilders.nicholaslargen.mycommute;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class DashboardActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("DashboardActivity", "in the OnCreate method");
        setContentView(R.layout.activity_dashboard);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dashboard, menu);
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
    public void avgDay(View view)
    {
        //when this button is clicked, start the DashboardActivity
        Intent intent = new Intent(this, AvgDay.class);

        startActivity(intent);
    }
    public void avgWeek(View view)
    {
        //when this button is clicked, start the DashboardActivity
        Intent intent = new Intent(this, AvgWeek.class);

        startActivity(intent);
    }
    public void avgMonth(View view)
    {
        //when this button is clicked, start the DashboardActivity
        Intent intent = new Intent(this, AvgMonth.class);

        startActivity(intent);
    }
    public void avgYear(View view)
    {
        //when this button is clicked, start the DashboardActivity
        Intent intent = new Intent(this, AvgYear.class);

        startActivity(intent);
    }
}
