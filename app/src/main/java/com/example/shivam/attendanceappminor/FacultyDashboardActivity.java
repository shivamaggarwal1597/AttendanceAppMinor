package com.example.shivam.attendanceappminor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FacultyDashboardActivity extends AppCompatActivity {
    Button add_batch,mark_attendance,conduct_quiz_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_dashboard);
        mark_attendance = (Button)findViewById(R.id.mark_attendance_button);
        add_batch =(Button)findViewById(R.id.add_batch_button);
        conduct_quiz_btn = (Button)findViewById(R.id.conduct_quiz_button);
        conduct_quiz_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(FacultyDashboardActivity.this, QuizFaculty.class);
                startActivity(intent);
            }
        });
        add_batch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FacultyDashboardActivity.this, EnterBatchDetails.class);
                startActivity(intent);
            }
        });


        mark_attendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FacultyDashboardActivity.this, SelectBatchActivity.class);
                startActivity(intent);
            }
        });
         }
}
