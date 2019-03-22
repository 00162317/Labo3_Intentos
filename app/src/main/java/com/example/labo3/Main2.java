package com.example.labo3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.labo3.utils.AppConstants;

public class Main2 extends AppCompatActivity {

    private TextView mText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mText=findViewById(R.id.tv_mensaje);
        Intent mIntent=getIntent();
        if (mIntent!=null) {
            mText.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY));
        }
        if (mIntent!=null) {
            mText.setText(mIntent.getStringExtra(AppConstants.TEXT_KEY));
        }
    }
}
