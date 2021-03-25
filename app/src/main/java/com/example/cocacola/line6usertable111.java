package com.example.cocacola;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import java.text.DateFormat;
import java.util.Calendar;

public class line6usertable111 extends line6admintable111 {
    TextView t1,t2,t3,t4,t5,t6;
    Button b1;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line6usertable111);
        Calendar calander = Calendar.getInstance();
        String CurrentData = DateFormat.getDateInstance().format(calander.getTime());
        TextView TextViewDate =(TextView)findViewById(R.id.textView_date);
        TextViewDate.setText(CurrentData);
        t1 = (TextView) findViewById(R.id.e1);
        t2 = (TextView) findViewById(R.id.e2);
        t3 = (TextView) findViewById(R.id.e3);
        t4 = (TextView) findViewById(R.id.e4);
        t5 = (TextView) findViewById(R.id.e5);
        t6 = (TextView) findViewById(R.id.e6);
        progressBar =(ProgressBar)findViewById(R.id.progressBar5);
        // b1 = (Button) findViewById(R.id.button);
/*
   b1.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
*/

    }
    @Override
    protected void onStart() {
        super.onStart();
        r10.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){

                    String data1 = dataSnapshot.getValue().toString();
                    t1.setText(data1);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        r20.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){

                    String data2 = dataSnapshot.getValue().toString();
                    t2.setText(data2);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        r30.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){

                    String data3 = dataSnapshot.getValue().toString();
                    t3.setText(data3);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        r40.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){

                    String data4 = dataSnapshot.getValue().toString();
                    t4.setText(data4);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        r50.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){

                    String data5 = dataSnapshot.getValue().toString();
                    t5.setText(data5);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        r60.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists()){

                    String data6 = dataSnapshot.getValue().toString();
                    t6.setText(data6);
                    progressBar.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }


}
