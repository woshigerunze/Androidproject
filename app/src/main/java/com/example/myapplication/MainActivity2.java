package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.BatteryManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.database.sqlite.*;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    public String tag="Activity1";
    public ArrayList<String> Color_list=new ArrayList<String>() {
        {
            add("#FFFFFF");
            add("#FF0000");
            add("#7CFC00");
            add("#FFF000");
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d(tag,"oncreate2");
        Button button=(Button)findViewById(R.id.button_changecolor);
        TextView textView=(TextView)findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int index=new Random().nextInt(Color_list.size());
                button.setBackgroundColor(Color.parseColor(
                        Color_list.get(index)
                ));//动态改变按钮颜色
                textView.setText("现在的颜色编码是："+Color_list.get(index));
            }
        });
//        BatteryManager batteryManager = (BatteryManager)getSystemService(BATTERY_SERVICE);
//        int battery = batteryManager.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY);
//        textView.setText(String.valueOf(battery));
    }
    @Override
    protected void onStart()
    {
        super.onStart();
        Log.d(tag,"onstart2");
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d(tag,"onresume2");
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d(tag,"onpause2");
    }
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d(tag,"onrestart2");
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d(tag,"ondestroy2");
    }
}