package com.demo.app_activity;

import androidx.appcompat.app.AppCompatActivity;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnLongClickListener {
    private EditText et_main_number;
    private EditText et_main_sms;
    private Button btn_main_call;
    private Button btn_main_send;
    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(view==btn_main_call){
                //点击打电话
                //Toast.makeText(MainActivity.this,"点击打电话",0).show();
                String action = "android.intent.action.DIAL";
                action = Intent.ACTION_DIAL;//一样的
                Intent intent=new Intent(action);
                //2.)携带数据
                String number= et_main_number.getText().toString();
                intent.setData(Uri.parse("tel:"+number));
                //3.)startActivity(intent)
                startActivity(intent);
            }else  if (view==btn_main_send) {//点击发短信
                Toast.makeText(MainActivity.this,"点击发短信",0).show();
                //1.)创建一个Intent(隐式)
                Intent intent=new Intent(Intent.ACTION_SENDTO);
                //2.)携带数据(号码/信息)
                String number =et_main_number.getText().toString();
                String sms= et_main_sms.getText().toString();
                intent.setData(Uri.parse("smsto:"+number));
                //携带额外数据
                intent.putExtra("sms_body",sms);
                //3.)startActivity(intent)
                startActivity(intent);
        }
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
            //Toast.makeText(MainActivity.this,"长按打电话",0).show();
            //1.)创建一个Intent(隐示)
            Intent intent=new Intent(Intent.ACTION_CALL);
            //2.)携带数据
            String number= et_main_number.getText().toString();
            intent.setData(Uri.parse("tel:"+number));
            //3.)startActivity(intent)
            startActivity(intent);
        }else  if (view==btn_main_send) {//长按发短信}
            Toast.makeText(MainActivity.this,"长按发短信",0).show();
            //1.得到SMsManager的对象
            SmsManager smsManager=SmsManager.getDefault();
            //2.发送文本信息
            String number =et_main_number.getText().toString();
            String sms= et_main_sms.getText().toString();
            smsManager.sendTextMessage(number,null,sms,null,null);
            }
        return true; }


}
