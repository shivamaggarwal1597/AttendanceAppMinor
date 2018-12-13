package com.example.shivam.attendanceappminor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SelectSubectAttendanceActivity extends AppCompatActivity {
    TinyDB tinyDB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_subect_attendance);
        tinyDB = new TinyDB(SelectSubectAttendanceActivity.this);
        String id = tinyDB.getString("student_id");
    }
}
