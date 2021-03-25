package com.example.cocacola;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import java.text.DateFormat;
import java.util.Calendar;

public class line3user333 extends line3admin333 {
    TextView e1,e2,e3,e4,e5,e6,e7,e10sh,getE10sh;
    Button b1;
    ImageButton im1;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line3user333);
        Calendar calander = Calendar.getInstance();
        String CurrentData = DateFormat.getDateInstance().format(calander.getTime());
        TextView TextViewDate2 = (TextView) findViewById(R.id.textview_date2);
        TextViewDate2.setText(CurrentData);
        im1 = findViewById(R.id.imagebell);
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Announcement.class));
            }
        });
        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e3);
        e3 = findViewById(R.id.e4);
        e4 = findViewById(R.id.e5);
        e5 = findViewById(R.id.e6);
        e6 = findViewById(R.id.e7);
        e7 = findViewById(R.id.e8);
        progressBar = findViewById(R.id.progressBar5);
        progressBar.setVisibility(View.VISIBLE);
        e10sh = findViewById(R.id.shiftT);
        getE10sh = findViewById(R.id.Adminname);
    }
    @Override
    protected void onStart() {
        super.onStart();
        d12.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                String data1 = dataSnapshot.getValue().toString();
                getE10sh.setText(data1);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        d10.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){

                    String data1 = dataSnapshot.getValue().toString();
                    e10sh.setText(data1);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        d34.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){

                    String data1 = dataSnapshot.getValue().toString();
                    e1.setText(data1);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        d44.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){

                    String data2 = dataSnapshot.getValue().toString();
                    e2.setText(data2);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        d54.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){

                    String data3 = dataSnapshot.getValue().toString();
                    e3.setText(data3);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        d64.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){

                    String data4 = dataSnapshot.getValue().toString();
                    e4.setText(data4);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        d74.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){

                    String data5 = dataSnapshot.getValue().toString();
                    e5.setText(data5);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        d84.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){

                    String data6 = dataSnapshot.getValue().toString();
                    e6.setText(data6);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        d94.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){

                    String data7 = dataSnapshot.getValue().toString();
                    e7.setText(data7);
                    progressBar.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
    @Override
    public void onBackPressed(){
        finish();

    }
}