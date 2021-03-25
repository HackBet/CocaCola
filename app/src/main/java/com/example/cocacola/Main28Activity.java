package com.example.cocacola;

import androidx.annotation.NonNull;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import java.text.DateFormat;
import java.util.Calendar;

public class Main28Activity extends Main26Activity {
    TextView v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13, v14, v15, v16, v17, v18, v19, v20, v21;
ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main28l1usertable2);
        Calendar calander = Calendar.getInstance();
        String CurrentData = DateFormat.getDateInstance().format(calander.getTime());
        TextView TextViewDate =(TextView)findViewById(R.id.textView_date);
        TextViewDate.setText(CurrentData);
        v1 = (TextView) findViewById(R.id.p1);
        v2 = (TextView) findViewById(R.id.p2);
        v3 = (TextView) findViewById(R.id.p3);
        v4 = (TextView) findViewById(R.id.p4);
        v5 = (TextView) findViewById(R.id.p5);
        v6 = (TextView) findViewById(R.id.p6);
        v7 = (TextView) findViewById(R.id.p7);
        v8 = (TextView) findViewById(R.id.p8);
        v9 = (TextView) findViewById(R.id.p9);
        v10 = (TextView) findViewById(R.id.p10);
        v11 = (TextView) findViewById(R.id.p11);
        v12 = (TextView) findViewById(R.id.p12);
        v13 = (TextView) findViewById(R.id.p13);
        v14 = (TextView) findViewById(R.id.p14);
        v15 = (TextView) findViewById(R.id.e1);
        v16 = (TextView) findViewById(R.id.e3);
        v17 = (TextView) findViewById(R.id.e4);
        v18 = (TextView) findViewById(R.id.e5);
        v19 = (TextView) findViewById(R.id.e6);
        v20 = (TextView) findViewById(R.id.e7);
        v21 = (TextView) findViewById(R.id.e8);
        progressBar =(ProgressBar)findViewById(R.id.progressBar5);
    }

    @Override
    protected void onStart() {
        super.onStart();
        r10.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {

                    String data1 = dataSnapshot.getValue().toString();
                    v1.setText(data1);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        r20.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {

                    String data2 = dataSnapshot.getValue().toString();
                    v2.setText(data2);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        r30.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {

                    String data3 = dataSnapshot.getValue().toString();
                    v3.setText(data3);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        r40.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {

                    String data4 = dataSnapshot.getValue().toString();
                    v4.setText(data4);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        r50.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {

                    String data5 = dataSnapshot.getValue().toString();
                    v5.setText(data5);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        r60.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {

                    String data6 = dataSnapshot.getValue().toString();
                    v6.setText(data6);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        r70.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {

                    String data1 = dataSnapshot.getValue().toString();
                    v7.setText(data1);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        r80.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {

                    String data2 = dataSnapshot.getValue().toString();
                    v8.setText(data2);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        r90.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {

                    String data3 = dataSnapshot.getValue().toString();
                    v9.setText(data3);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        r11.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {

                    String data4 = dataSnapshot.getValue().toString();
                    v10.setText(data4);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        r21.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {

                    String data5 = dataSnapshot.getValue().toString();
                    v11.setText(data5);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        r31.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {

                    String data6 = dataSnapshot.getValue().toString();
                    v12.setText(data6);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        r41.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {

                    String data1 = dataSnapshot.getValue().toString();
                    v13.setText(data1);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        r51.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {

                    String data2 = dataSnapshot.getValue().toString();
                    v14.setText(data2);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        r61.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {

                    String data3 = dataSnapshot.getValue().toString();
                    v15.setText(data3);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        r71.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {

                    String data4 = dataSnapshot.getValue().toString();
                    v16.setText(data4);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        r81.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {

                    String data5 = dataSnapshot.getValue().toString();
                    v17.setText(data5);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        r91.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {

                    String data6 = dataSnapshot.getValue().toString();
                    v18.setText(data6);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        r92.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {

                    String data1 = dataSnapshot.getValue().toString();
                    v19.setText(data1);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        r93.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {

                    String data2 = dataSnapshot.getValue().toString();
                    v20.setText(data2);

                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
        r94.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists()) {

                    String data3 = dataSnapshot.getValue().toString();
                    v21.setText(data3);
                    progressBar.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }
}