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

public class line4admin222 extends AppCompatActivity {
    EditText edittext1, et2, et3;
    Button commentadd1, bt2, bt3, bt4;
    DatabaseReference database, d2,d9,d10;
    ImageButton im1;
    Spinner spinner, getSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line4admin222);
        Calendar calander = Calendar.getInstance();
        String CurrentData = DateFormat.getDateInstance().format(calander.getTime());
        TextView TextViewDate2 = (TextView) findViewById(R.id.textview_date2);
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
        d9 = FirebaseDatabase.getInstance().getReference().child("Shift M2L4");
        d10 = FirebaseDatabase.getInstance().getReference().child("Admin Name M2L4");
        database = FirebaseDatabase.getInstance().getReference().child("Work Practice L4");
        d2 = FirebaseDatabase.getInstance().getReference().child("General Comment L4");
        edittext1 = (EditText) findViewById(R.id.b133);
        //et2 = (EditText)findViewById(R.id.b233);
        et3 = (EditText) findViewById(R.id.b333);
        commentadd1 = (Button) findViewById(R.id.bo33);
        bt2 = (Button) findViewById(R.id.boor533);
        bt3 = (Button) findViewById(R.id.boo33);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), min2table4admin.class));
            }
        });

        commentadd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data1 = edittext1.getText().toString().trim();
                String spdata = spinner.getSelectedItem().toString().trim();
                String spdata2 = getSpinner.getSelectedItem().toString().trim();
                d9.setValue(spdata);
                d10.setValue(spdata2);
                database.setValue(data1);
                edittext1.setText(" ");
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data2 = et3.getText().toString().trim();
                d2.setValue(data2);
                et3.setText(" ");

            }
        });
    }
    public void done (View v)
    {


        Toast.makeText(this, "Your comments and resolution are now avaliable for the fellow users ", Toast.LENGTH_LONG).show();
        commentadd1.setVisibility(View.INVISIBLE);
        bt2.setVisibility(View.INVISIBLE);
        bt3.setVisibility(View.INVISIBLE);


    }
    @Override
    public void onBackPressed(){

        finish();
    }

}


