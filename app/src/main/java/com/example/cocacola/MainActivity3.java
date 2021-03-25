package com.example.cocacola;

import androidx.annotation.NonNull;

import android.content.Intent;
import android.media.Image;
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

public class MainActivity3 extends line1admin111 {
TextView e1,e2,e3,e4,e5,e6,e7,e10sh,getE10sh;
Button b1;
ImageButton im1;
ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main49line1user1m1);
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
        e1 = findViewById(R.id.e1);e2 = findViewById(R.id.e3);e3 = findViewById(R.id.e4);e4 = findViewById(R.id.e6);
        e5 = findViewById(R.id.e7);e6 = findViewById(R.id.e8);e7 = findViewById(R.id.e89);
        e10sh = findViewById(R.id.shiftT);
        getE10sh =findViewById(R.id.Adminname);
        b1 =(Button)findViewById(R.id.e5);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Main27Activity.class));
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
                  if (dataSnapshot.exists()) {

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
                  if (dataSnapshot.exists()) {

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
                  if (dataSnapshot.exists()) {

                      String data2 = dataSnapshot.getValue().toString();
                      e2.setText(data2);

                  }
              }

              @Override
              public void onCancelled(@NonNull DatabaseError databaseError) {

              }
          });
          d3.addValueEventListener(new ValueEventListener() {
              @Override
              public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                  if (dataSnapshot.exists()) {

                      String data3 = dataSnapshot.getValue().toString();
                      e3.setText(data3);

                  }
              }

              @Override
              public void onCancelled(@NonNull DatabaseError databaseError) {

              }
          });
          d5.addValueEventListener(new ValueEventListener() {
              @Override
              public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                  if (dataSnapshot.exists()) {

                      String data4 = dataSnapshot.getValue().toString();
                      e4.setText(data4);

                  }
              }

              @Override
              public void onCancelled(@NonNull DatabaseError databaseError) {

              }
          });
          d6.addValueEventListener(new ValueEventListener() {
              @Override
              public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                  if (dataSnapshot.exists()) {

                      String data5 = dataSnapshot.getValue().toString();
                      e5.setText(data5);

                  }
              }

              @Override
              public void onCancelled(@NonNull DatabaseError databaseError) {

              }
          });
          d7.addValueEventListener(new ValueEventListener() {
              @Override
              public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                  if (dataSnapshot.exists()) {

                      String data6 = dataSnapshot.getValue().toString();
                      e6.setText(data6);
                  }
              }

              @Override
              public void onCancelled(@NonNull DatabaseError databaseError) {

              }
          });
          d8.addValueEventListener(new ValueEventListener() {
              @Override
              public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                  if (dataSnapshot.exists()) {

                      String data5 = dataSnapshot.getValue().toString();
                      e7.setText(data5);
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