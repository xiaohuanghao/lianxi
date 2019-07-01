package com.demo.app_activity;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener {
    private EditText et_main_number;
    private EditText et_main_sms;
    private Button btn_main_call;
    private Button btn_main_send;
    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view==btn_main_call){
                //点击打电话
                Toast.makeText(MainActivity.this,"点击打电话",0).show();
            }else  if (view==btn_main_send) {//点击发短信}
                Toast.makeText(MainActivity.this,"点击发短信",0).show();}

        }

    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化视图对象
        et_main_number=(EditText)findViewById(R.id.et_main_number);
        et_main_sms=(EditText)findViewById(R.id.et_main_sms);
        btn_main_call=(Button)findViewById(R.id.btn_main_call);
        btn_main_send=(Button)findViewById(R.id.btn_main_send);
        //给视图对象设置点击监听
        btn_main_call.setOnClickListener(onClickListener);
        btn_main_send.setOnClickListener(onClickListener);

       //给视图对象设置长按监听
        btn_main_call.setOnLongClickListener(this);
        btn_main_send.setOnLongClickListener(this);
    }

    @Override
    public boolean onLongClick(View view) {
        if(view==btn_main_call){
            //长按打电话
            Toast.makeText(MainActivity.this,"长按打电话",0).show();
        }else  if (view==btn_main_send) {//点击发短信}
            Toast.makeText(MainActivity.this,"长按发短信",0).show();}

        return true; }


}
