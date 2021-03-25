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

public class line4admin111 extends AppCompatActivity {
    EditText edittext1,et2,et3,et4,et5,et6,et7,et8;
    Button commentadd1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bdone,bt9;
    DatabaseReference database,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d14,r10;
    ImageButton im1;
    Spinner spinner,getSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line4admin111);
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
        database = FirebaseDatabase.getInstance().getReference().child("Attendance L4");
        d2 = FirebaseDatabase.getInstance().getReference().child("Safety L4");
        d3 = FirebaseDatabase.getInstance().getReference().child("Previous Day's Action L4");
        // d4 = FirebaseDatabase.getInstance().getReference().child("Review Of Past Performance L1");
        d5 = FirebaseDatabase.getInstance().getReference().child("Today Production plan L4");
        d6 = FirebaseDatabase.getInstance().getReference().child("Today's Action Plan L4");
        d7 = FirebaseDatabase.getInstance().getReference().child("General Communication L4");
        d8 = FirebaseDatabase.getInstance().getReference().child("Issues for escalation L4");
        d9 = FirebaseDatabase.getInstance().getReference().child("Shift L4");
        d10 = FirebaseDatabase.getInstance().getReference().child("Admin Name L4");
        edittext1 = (EditText)findViewById(R.id.b133);
        et2 = (EditText)findViewById(R.id.b233);
        et3 = (EditText)findViewById(R.id.b333);
// et4 = (EditText)findViewById(R.id.b40);
        et5 = (EditText)findViewById(R.id.b50);
        et6 = (EditText)findViewById(R.id.bo0);
        et7 = (EditText)findViewById(R.id.bop0);
        et8 = (EditText)findViewById(R.id.bopp);

        commentadd1=(Button)findViewById(R.id.bo33);
        bt2 = (Button)findViewById(R.id.boor533);
        bt3 = (Button)findViewById(R.id.boo33);
        bt4 = (Button)findViewById(R.id.booo);
        bt5 = (Button)findViewById(R.id.b5);
        bt6 = (Button)findViewById(R.id.boo0);
        bt7 = (Button)findViewById(R.id.bopp0);
        bt8 = (Button)findViewById(R.id.bog0);
        bdone =(Button)findViewById(R.id.bog0344);
        commentadd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data1 =  edittext1.getText().toString().trim();
                String spdata = spinner.getSelectedItem().toString().trim();
                String spdata2 = getSpinner.getSelectedItem().toString().trim();
                database.setValue(data1);
                d9.setValue(spdata);
                d10.setValue(spdata2);
                edittext1.setText(" ");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data2 = et2.getText().toString().trim();
                d2.setValue(data2);
                et2.setText(" ");

            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data3 = et3.getText().toString().trim();
                d3.setValue(data3);
                et3.setText(" ");

            }
        });
       /* bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Main25Activity.class));
                String data4 = et4.getText().toString().trim();
                d4.setValue(data4);
                //addComment(et4,d4);
                // et4.setText(" ");

            }
        });
        */
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),line4admintable111.class));
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String data5 = et5.getText().toString().trim();
                d5.setValue(data5);
                et5.setText(" ");

            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data6 = et6.getText().toString().trim();
                d6.setValue(data6);
                et6.setText(" ");

            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data7 = et7.getText().toString().trim();
                d7.setValue(data7);
                et7.setText(" ");

            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data8 = et8.getText().toString().trim();
                d8.setValue(data8);
                et8.setText(" ");

            }
        });
    }
    public void done(View v)
    {


        Toast.makeText(this,"Your comments and resolution are now avaliable for the fellow users ",Toast.LENGTH_LONG).show();
        commentadd1.setVisibility(View.INVISIBLE);
        bt2.setVisibility(View.INVISIBLE);
        bt3.setVisibility(View.INVISIBLE);
        bt4.setVisibility(View.INVISIBLE);
        bt5.setVisibility(View.INVISIBLE);
        bt6.setVisibility(View.INVISIBLE);
        bt7.setVisibility(View.INVISIBLE);
        bt8.setVisibility(View.INVISIBLE);


    }
    @Override
    public void onBackPressed(){

        finish();
    }


}
