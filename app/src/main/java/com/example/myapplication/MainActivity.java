package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button start1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start1 = (Button) findViewById(R.id. start1 );
        start1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {kelogin();
            }
        });
    }

    public void kelogin(){
        Intent Halamanlogin=new Intent (getApplicationContext(), HalamanLogin.class);
        startActivity(Halamanlogin);
    }
}