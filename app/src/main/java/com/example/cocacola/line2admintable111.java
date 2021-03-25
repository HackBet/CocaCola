package com.example.cocacola;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class line2admintable111 extends AppCompatActivity {
    EditText e10,e20,e30,e40,e50,e60;
    DatabaseReference r10,r20,r30,r40,r50,r60;
    Button b1;
    com.example.cocacola.models.memebers memebers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line2admintable111);
        e10 =(EditText)findViewById(R.id.e1);e20 =(EditText)findViewById(R.id.e2);e30 =(EditText)findViewById(R.id.e3);e40 =(EditText)findViewById(R.id.e4);
        e50 =(EditText)findViewById(R.id.e5);  e60 =(EditText)findViewById(R.id.e6);

        r10 = FirebaseDatabase.getInstance().getReference().child("firstrow L2");
        r20 = FirebaseDatabase.getInstance().getReference().child("secondrow L2");
        r30 = FirebaseDatabase.getInstance().getReference().child("thirdrow L2");;
        r40 = FirebaseDatabase.getInstance().getReference().child("forthrow L2");
        r50 = FirebaseDatabase.getInstance().getReference().child("fifthrow L2");
        r60 = FirebaseDatabase.getInstance().getReference().child("Sixthrow L2");

        b1=(Button)findViewById(R.id.uplodetable);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String data1 = e10.getText().toString().trim();
                String data2 = e20.getText().toString().trim();
                String data3 = e30.getText().toString().trim();
                String data4 = e40.getText().toString().trim();
                String data5 = e50.getText().toString().trim();
                String data6 = e60.getText().toString().trim();

                r10.setValue(data1);
                r20.setValue(data2);
                r30.setValue(data3);
                r40.setValue(data4);
                r50.setValue(data5);
                r60.setValue(data6);

                Toast.makeText(line2admintable111.this,"Table Uploded well",Toast.LENGTH_LONG).show();
            }
        });

    }
}
