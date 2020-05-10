package com.example.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirtstapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //called when the user taps the Send button
    // 이 메서드는 android:onClick 속성과 호환되는 것으로 인식하는데 필요하다.
    // 이 메서드 특징 : 공개 액세스, 무효, View가 유일한 매개변수. 1단계 마지막에 클릭하는 것이 View 개체이다.
    public void sendMessage(View view){
        //do Something in response to button
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }



}
