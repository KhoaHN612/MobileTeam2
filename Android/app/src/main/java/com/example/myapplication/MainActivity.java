package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText inputEmail, inputPassword;
    private Button btnLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputEmail = findViewById(R.id.editTextEmail);
        inputPassword = findViewById(R.id.editTextTextPassword);
        btnLogIn = findViewById(R.id.btnLogIn);
    }

    private boolean checkEmail(){
        String email = inputEmail.getText().toString();
        if (email.isEmpty())
            return false;
        else
            return  true;
    }

    private boolean checkPassword(){
        String password = inputPassword.getText().toString();
        if (password.isEmpty())
            return false;
        else
            return  true;
    }


    public void clickLogIn(View view) {
        if (checkEmail() && checkPassword()) {
            Intent intent = new Intent(MainActivity.this,com.example.myapplication.FragmentActivity.class);
            startActivity(intent);
        }
    }
}