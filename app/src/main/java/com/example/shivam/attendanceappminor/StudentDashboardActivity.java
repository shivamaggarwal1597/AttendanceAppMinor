package com.example.shivam.attendanceappminor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentDashboardActivity extends AppCompatActivity {
    Button check_attendance,take_quiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_dashboard);
        check_attendance = (Button)findViewById(R.id.check_attendance);
        take_quiz = (Button)findViewById(R.id.take_quiz);

        check_attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // Intent intent = new Intent(StudentDashboardActivity.this,SelectSubjectAttendanceActivity.class);
                //startActivity(intent);
            }
        });
    }
}
