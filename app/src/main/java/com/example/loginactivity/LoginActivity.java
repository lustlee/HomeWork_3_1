package com.example.loginactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {
    EditText editTxt1;
    EditText editTxt2;
    Button button;
    protected String editStr1;
    protected String editStr2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        editTxt1 = findViewById(R.id.main_login_mail);
        editTxt2 = findViewById(R.id.main_login_password);
        button = findViewById(R.id.btnSend);
        editStr1 = editTxt1.getText().toString();
        editStr2 = editTxt2.getText().toString();
        String s1 = editTxt1.getText().toString();
        String s2 = editTxt2.getText().toString();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = editTxt1.getText().toString();
                String s2 = editTxt2.getText().toString();
                if (!s1.isEmpty() && !s2.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Бобро пожаловать! =)", Toast.LENGTH_LONG).show();
                } else {
                    button.setBackground(getDrawable(R.drawable.round));
                    Toast.makeText(LoginActivity.this, "Плииис запоните оба поля", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}