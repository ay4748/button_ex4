package com.example.buttonex4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dodge(View view) {
        btn=findViewById(R.id.button);
        counter +=1;
        if(counter%7==0)
        {
            btn.setText("BOOM !");
        }
        else
        {
            btn.setText("This is a click number:"+counter);
        }
    }
}