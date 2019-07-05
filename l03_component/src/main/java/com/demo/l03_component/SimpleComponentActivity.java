package com.demo.l03_component;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SimpleComponentActivity extends AppCompatActivity {

    private TextView tv_simple_message;
    private EditText et_simple_number;
    private Button btn_simple_submit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_component);


        //TextView
        tv_simple_message =(TextView)findViewById(R.id.tv_simple_message);
        tv_simple_message.setText("textviwe");
        //EditText
        et_simple_number=(EditText)findViewById(R.id.et_simple_number);

    }



}
