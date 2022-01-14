package com.example.sequencelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.transferwise.sequencelayout.SequenceStep;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    SequenceStep sequenceStep,sequenceStep2,sequenceStep3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sequenceStep=findViewById(R.id.first);
        sequenceStep2=findViewById(R.id.second);
        sequenceStep3=findViewById(R.id.third);
        sequenceStep2.setActive(true);
        sequenceStep.setOnClickListener(this);
        sequenceStep2.setOnClickListener(this);
        sequenceStep3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.first:
                Toast.makeText(MainActivity.this,"This is first step",Toast.LENGTH_LONG).show();
                break;
            case R.id.second:
                Toast.makeText(MainActivity.this,"This is second step",Toast.LENGTH_LONG).show();
                break;
            case R.id.third:
                Toast.makeText(MainActivity.this,"This is Third step",Toast.LENGTH_LONG).show();
                break;
        }
    }
}