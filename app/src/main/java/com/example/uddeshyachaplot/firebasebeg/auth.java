package com.example.uddeshyachaplot.firebasebeg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class auth extends AppCompatActivity {

    EditText username, password;
    private String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        value= getIntent().getStringExtra("myKey");

        username = (EditText) findViewById(R.id.emailid);
        password = (EditText) findViewById(R.id.password);
        Button loginButton = (Button) findViewById(R.id.button2);

    }
    public void nextpage(View view) {
        //two string objects to store the values
        String mEmail,mPassword;
        mEmail=username.getText().toString();//we get a char sequence
        mPassword=password.getText().toString();
        //validate email and password
        if((mEmail.equals("udchaplot007"))&&(mPassword.equals("firaagaya")))
        {
            Intent intent = new Intent(auth.this,New_case.class);
            intent.putExtra("myKey",value);
            startActivity(intent);
            Toast.makeText(auth.this,"To be filled by doctors",Toast.LENGTH_SHORT).show();

        }
        else
            Toast.makeText(this,"Incorrect password",Toast.LENGTH_SHORT).show();
    }
}
