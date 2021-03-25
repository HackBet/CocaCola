package com.example.cocacola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.DateFormat;
import java.util.Calendar;

public class line4admin333 extends AppCompatActivity {
    DatabaseReference d34,d44,d54,d64,d74,d84,d94,d10,d12;
    EditText edittext1,et2,et3,et4,et5,et6,et7;
    Button commentadd1,bt2,bt3,bt4,bt5,bt6,bt7;
    ImageButton im1;
    Spinner spinner,getSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line4admin333);
        Calendar calander = Calendar.getInstance();
        String CurrentData = DateFormat.getDateInstance().format(calander.getTime());
        TextView TextViewDate2 =(TextView)findViewById(R.id.textview_date2);
        TextViewDate2.setText(CurrentData);
        spinner = findViewById(R.id.spiner101);
        getSpinner = findViewById(R.id.spiner404);
        im1 = findViewById(R.id.imagebell);
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Announcement.class));
            }
        });
        d34 = FirebaseDatabase.getInstance().getReference("Production Plan L4");
        d44 = FirebaseDatabase.getInstance().getReference("Quality Deviations L4");
        d54 = FirebaseDatabase.getInstance().getReference("Accidents, Incidents L4");
        d64 = FirebaseDatabase.getInstance().getReference("Absenteeism L4");
        d74 = FirebaseDatabase.getInstance().getReference("Stoppage Sheets Collected L4");
        d84 = FirebaseDatabase.getInstance().getReference("Actual Captured L4");
        d94 = FirebaseDatabase.getInstance().getReference(" Feedback L4");
        d10 =FirebaseDatabase.getInstance().getReference("Shift L4");
        d12 =FirebaseDatabase.getInstance().getReference("Admin Name L4");

        edittext1 = (EditText)findViewById(R.id.b133);
        et2 = (EditText)findViewById(R.id.b1339);
        et3 = (EditText)findViewById(R.id.b1338);
        et4 = (EditText)findViewById(R.id.b1337);
        et5 = (EditText)findViewById(R.id.b1336);
        et6 = (EditText)findViewById(R.id.b1335);
        et7 = (EditText)findViewById(R.id.b13344);
        commentadd1=(Button)findViewById(R.id.bo33);
        bt2 = (Button)findViewById(R.id.bo339);
        bt3 = (Button)findViewById(R.id.bo338);
        bt4 = (Button)findViewById(R.id.bo337);
        bt5 = (Button)findViewById(R.id.bo336);
        bt6 = (Button)findViewById(R.id.bo335);
        bt7 = (Button)findViewById(R.id.bo3344);
        commentadd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data1 =  edittext1.getText().toString().trim();
                String spdata = spinner.getSelectedItem().toString().trim();
                String spdata2 = getSpinner.getSelectedItem().toString().trim();
                d34.setValue(data1);
                d10.setValue(spdata);
                d12.setValue(spdata2);
                edittext1.setText(" ");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data2 = et2.getText().toString().trim();
                d44.setValue(data2);
                et2.setText(" ");

            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data2 = et3.getText().toString().trim();
                d54.setValue(data2);
                et3.setText(" ");

            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data2 = et4.getText().toString().trim();
                d64.setValue(data2);

                et4.setText(" ");

            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data2 = et5.getText().toString().trim();
                d74.setValue(data2);
                et5.setText(" ");

            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data2 = et6.getText().toString().trim();
                d84.setValue(data2);
                et6.setText(" ");

            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data2 = et7.getText().toString().trim();
                d94.setValue(data2);
                et7.setText(" ");

            }
        });


    }
    public void done(View v) {


        Toast.makeText(this, "Your comments and resolution are now avaliable for the fellow users ", Toast.LENGTH_LONG).show();
        commentadd1.setVisibility(View.INVISIBLE);
        bt2.setVisibility(View.INVISIBLE);
        bt3.setVisibility(View.INVISIBLE);
        bt4.setVisibility(View.INVISIBLE);
        bt5.setVisibility(View.INVISIBLE);
        bt6.setVisibility(View.INVISIBLE);
        bt7.setVisibility(View.INVISIBLE);


    }
    @Override
    public void onBackPressed(){

        finish();

    }
}
