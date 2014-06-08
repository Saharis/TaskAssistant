package com.virgil.taskassistant.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.virgil.taskassistant.basic.BasicActivity;


public class MainActivity extends BasicActivity implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.id_main_button_1:
                //按钮1
                Intent in=new Intent(MainActivity.this,SecondActivity.class);
                startActivity(in);
                finish();
                break;
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view=getLayoutInflater().inflate(R.layout.activity_main,null);
        setContentView(view);
        view.findViewById(R.id.id_main_button_1).setOnClickListener(this);
        view.findViewById(R.id.id_main_button_2).setOnClickListener(this);
        view.findViewById(R.id.id_main_button_3).setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
