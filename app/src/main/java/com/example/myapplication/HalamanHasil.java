package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HalamanHasil extends AppCompatActivity {

    Button quit;
    Button gntpswd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_hasil);

        Bundle data = getIntent().getExtras();
        String user = data.getString("USER");

        TextView salam = findViewById(R.id.salam);
        salam.setText("Selamat Datang "+ user);

        quit = (Button) findViewById(R.id. quit );
        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                quitDiklik();

            }
        });

    }




    public void quitDiklik(){
        Toast.makeText(this.getBaseContext(), "TERIMA KASIH", Toast.LENGTH_SHORT).show();
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }

}