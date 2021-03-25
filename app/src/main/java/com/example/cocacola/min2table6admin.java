package com.example.cocacola;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class min2table6admin extends AppCompatActivity {
    EditText v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,v11,v12,v13,v14,v15,v16,v17,v18,v19,v20,v21;
    Button b1;
    DatabaseReference r10,r20,r30,r40,r50,r60,r70,r80,r90,r11,r21,r31,r41,r51,r61,r71,r81,r91,r92,r93,r94;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main26l1table2admin);
        v1= (EditText)findViewById(R.id.p1);
        v2= (EditText)findViewById(R.id.p2);v3= (EditText)findViewById(R.id.p3);v4= (EditText)findViewById(R.id.p4);v5= (EditText)findViewById(R.id.p5);
        v6= (EditText)findViewById(R.id.p6);
        v7= (EditText)findViewById(R.id.p7);
        v8= (EditText)findViewById(R.id.p8);v9= (EditText)findViewById(R.id.p9);v10= (EditText)findViewById(R.id.p10);
        v11= (EditText)findViewById(R.id.p11);v12= (EditText)findViewById(R.id.p12);v13= (EditText)findViewById(R.id.p13);
        v14= (EditText)findViewById(R.id.p14);v15= (EditText)findViewById(R.id.e1);v16= (EditText)findViewById(R.id.e3);
        v17= (EditText)findViewById(R.id.e4);v18= (EditText)findViewById(R.id.e5);v19= (EditText)findViewById(R.id.e6);
        v20= (EditText)findViewById(R.id.e7);v21= (EditText)findViewById(R.id.e8);
        b1 =(Button)findViewById(R.id.bog0);
        r10 = FirebaseDatabase.getInstance().getReference().child("co1 L6");r20 = FirebaseDatabase.getInstance().getReference().child("co2 L6");
        r30 = FirebaseDatabase.getInstance().getReference().child("co3 L6");r40 = FirebaseDatabase.getInstance().getReference().child("co4 L6");
        r50 = FirebaseDatabase.getInstance().getReference().child("co5 L6");r60 = FirebaseDatabase.getInstance().getReference().child("co6 L6");
        r70 = FirebaseDatabase.getInstance().getReference().child("co7 L6");r80 = FirebaseDatabase.getInstance().getReference().child("co8 L6");
        r90 = FirebaseDatabase.getInstance().getReference().child("co9 L6");r11 = FirebaseDatabase.getInstance().getReference().child("co10 L6");
        r21 = FirebaseDatabase.getInstance().getReference().child("co11 L6");r31 = FirebaseDatabase.getInstance().getReference().child("co12 L6");
        r41 = FirebaseDatabase.getInstance().getReference().child("co13 L6");r51 = FirebaseDatabase.getInstance().getReference().child("co14 L6");
        r61 = FirebaseDatabase.getInstance().getReference().child("co15 L6");r71 = FirebaseDatabase.getInstance().getReference().child("co16 L6");
        r81 = FirebaseDatabase.getInstance().getReference().child("co17 L6");r91 = FirebaseDatabase.getInstance().getReference().child("co18 L6");
        r92 = FirebaseDatabase.getInstance().getReference().child("co19 L6");r93 = FirebaseDatabase.getInstance().getReference().child("co20 L6");
        r94 = FirebaseDatabase.getInstance().getReference().child("co21 L6");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String data1 = v1.getText().toString().trim();
                String data2 = v2.getText().toString().trim();
                String data3 = v3.getText().toString().trim();
                String data4 = v4.getText().toString().trim();
                String data5 = v5.getText().toString().trim();
                String data6 = v6.getText().toString().trim();
                String data7 = v7.getText().toString().trim();
                String data8 = v8.getText().toString().trim();
                String data9 = v9.getText().toString().trim();
                String data10 = v10.getText().toString().trim();
                String data11 = v11.getText().toString().trim();
                String data12 = v12.getText().toString().trim();
                String data13 = v13.getText().toString().trim();
                String data14 = v14.getText().toString().trim();
                String data15 = v15.getText().toString().trim();
                String data16 = v16.getText().toString().trim();
                String data17 = v17.getText().toString().trim();
                String data18 = v18.getText().toString().trim();
                String data19 = v19.getText().toString().trim();
                String data20 = v20.getText().toString().trim();
                String data21 = v21.getText().toString().trim();
                r10.setValue(data1);
                r20.setValue(data2);
                r30.setValue(data3);
                r40.setValue(data4);
                r50.setValue(data5);
                r60.setValue(data6);
                r70.setValue(data7);
                r80.setValue(data8);
                r90.setValue(data9);
                r11.setValue(data10);
                r21.setValue(data11);
                r31.setValue(data12);
                r41.setValue(data13);
                r51.setValue(data14);
                r61.setValue(data15);
                r71.setValue(data16);
                r81.setValue(data17);
                r91.setValue(data18);
                r92.setValue(data19);
                r93.setValue(data20);
                r94.setValue(data21);

                Toast.makeText( min2table6admin.this,"Table Uploded well",Toast.LENGTH_LONG).show();

            }
        });


    }
}

