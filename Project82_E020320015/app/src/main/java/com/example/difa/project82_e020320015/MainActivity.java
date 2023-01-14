package com.example.difa.project82_e020320015;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);
    }

    public void Login(View view) {
        Intent intent = new Intent(MainActivity.this,LoginActivity.class);
        startActivity(intent);
        Toast.makeText(this, "Welcome User", Toast.LENGTH_SHORT).show();
    }

    public void SignUp(View view) {
        Intent intent = new Intent(MainActivity.this,SignUpActivity.class);
        startActivity(intent);
        Toast.makeText(this, "Hello New User", Toast.LENGTH_SHORT).show();
    }
}