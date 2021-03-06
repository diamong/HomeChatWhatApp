package com.diamong.homechatwhatapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity
{
    private Button CreateAccountButton;
    private EditText UserEmail,UserPassword;
    private TextView AlreadyHaveAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        InitializeFields();

        AlreadyHaveAccount.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                SendUserToLoginActivity();
            }
        });
    }

    private void InitializeFields()
    {
        CreateAccountButton=findViewById(R.id.register_button);
        UserEmail=findViewById(R.id.register_email);
        UserPassword=findViewById(R.id.register_password);
        AlreadyHaveAccount=findViewById(R.id.already_have_account_link);
    }

    private void SendUserToLoginActivity()
    {
        Intent loginIntent = new Intent(RegisterActivity.this,LoginActivity.class);
        startActivity(loginIntent);
    }
}
