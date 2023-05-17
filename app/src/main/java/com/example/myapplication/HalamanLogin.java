package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class HalamanLogin extends AppCompatActivity {

    Button login;
    EditText user;
    EditText pswd;

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_login);

        user = (EditText) findViewById(R.id.user);
        pswd = (EditText) findViewById(R.id.pswd);

        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginDiklik();
            }
        });
    }

    public void loginDiklik() {
        String ID, password;
        ID = user.getText().toString();
        password = pswd.getText().toString();


        SharedPreferences SP = PreferenceManager.getDefaultSharedPreferences(getBaseContext());

        String isianUser = SP.getString("user", "admin");

        String isianPswd = SP.getString("password", "pswd123");


        if (ID.equals(isianUser) && password.equals(isianPswd)) {
            Intent halamanakhir = new Intent(this, HalamanHasil.class);
            Bundle data = new Bundle();
            data.putString("USER", ID);
            halamanakhir.putExtras(data);
            startActivity(halamanakhir);
        } else {
            Toast.makeText(this.getBaseContext(), "User atau Password salah", Toast.LENGTH_SHORT).show();
        }

    }
}