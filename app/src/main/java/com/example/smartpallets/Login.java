package com.example.smartpallets;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText login_mail = (EditText) findViewById(R.id.login_mail);
        final EditText login_pass = (EditText) findViewById(R.id.login_pass);
        Button loginBtn = (Button) findViewById(R.id.loginBtn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email, pass;
                email = login_mail.getText().toString();
                pass = login_pass.getText().toString();
                if (email.equals("")){
                    Toast.makeText(Login.this, "Email required",Toast.LENGTH_SHORT).show();
                }
                else if(pass.equals("")){
                    Toast.makeText(Login.this, "Password required",Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent i = new Intent(Login.this, EntryPage.class);
                    startActivity(i);
                }
            }
        });
    }
}
