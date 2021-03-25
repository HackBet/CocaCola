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

public class line1userman222 extends line1adminmin222
{
    TextView e1,e2,e3,e4,e6,e7,e10sh,getE10sh;
    ProgressBar progressBar;
    ImageButton im1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line1userman222);
        Calendar calander = Calendar.getInstance();
        String CurrentData = DateFormat.getDateInstance().format(calander.getTime());
        TextView TextViewDate2 =(TextView)findViewById(R.id.textview_date2);
        TextViewDate2.setText(CurrentData);
        progressBar = findViewById(R.id.progressBar5);
        im1 = findViewById(R.id.imagebell);
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Announcement.class));
            }
        });
        e1 = findViewById(R.id.e1);e2 = findViewById(R.id.e3);e3 = findViewById(R.id.e4);
        e10sh = findViewById(R.id.shiftT);
        getE10sh =findViewById(R.id.Adminname);
        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Main28Activity.class));
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        d10.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                String data1 = dataSnapshot.getValue().toString();
                getE10sh.setText(data1);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        d9.addValueEventListener(new ValueEventListener() {
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
        database.addValueEventListener(new ValueEventListener() {
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
        d2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){

                    String data2 = dataSnapshot.getValue().toString();
                    e3.setText(data2);
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
