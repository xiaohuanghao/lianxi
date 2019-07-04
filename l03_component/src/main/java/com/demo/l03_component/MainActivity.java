package com.demo.l03_component;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.SimpleTimeZone;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn_main_test1).setOnClickListener(this);
        findViewById(R.id.btn_main_test2).setOnClickListener(this);
        findViewById(R.id.btn_main_test3).setOnClickListener(this);
        findViewById(R.id.btn_main_test4).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_main_test1:
                startActivity(new Intent(this,SimpleComponentActivity.class));
                break;

                case R.id.btn_main_test2:
                break;

                case R.id.btn_main_test3:
                break;

                case R.id.btn_main_test4:
                break;

                default:
                    break;
        }

    }
}
