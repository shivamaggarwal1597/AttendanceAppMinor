package com.example.shivam.attendanceappminor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AdminDashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);

        //TODO : Add Students using excel sheet for login validation purpose
        // Data to be Added
        //Student_name
        //Student_id(enrollment number)
        //student_dob
        //password
        //batch_id
        //batch_start_year
        //batch_end_year
        //stream
        //mobile_number
        //gender

        //ToDO : Add Faculty using excel sheet for login validation purpose
        //Data to be added
        //faculty_name
        //faculty_id
        //dob
        //password
        //gender
        //mobile_number

        //This needs to be done only once by the administrator to register all students and faculties
        //so that they can be accessed from their respective dashboards.

    }
}
