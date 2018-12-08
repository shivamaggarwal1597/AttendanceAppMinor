package com.example.shivam.attendanceappminor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    EditText user_name,password;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user_name = (EditText) findViewById(R.id.user_name_edit);
        password = (EditText)findViewById(R.id.password_edit);
        button = (Button)findViewById(R.id.submit_btn);
        Intent intent = getIntent();
        String type  = intent.getStringExtra("type");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO : Do validations
                //username will be student_id(enrollment number)




            }
        });

    }
}
