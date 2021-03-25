package com.example.cocacola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.DateFormat;
import java.util.Calendar;

public class Main4Activity extends AppCompatActivity  {

    EditText edittext1,et2,et3,et4,et5,et6,et7,et8;
    Button commentadd1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bdone,bt9;
    DatabaseReference database,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d14,r10;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4admim1l1);

        Calendar calander = Calendar.getInstance();
        String CurrentData = DateFormat.getDateInstance().format(calander.getTime());
        TextView TextViewDate2 =(TextView)findViewById(R.id.textview_date2);
        TextViewDate2.setText(CurrentData);

        database = FirebaseDatabase.getInstance().getReference("Attendance").child("Line 1");
        d2 = FirebaseDatabase.getInstance().getReference("Safety");
        d3 = FirebaseDatabase.getInstance().getReference("Previous Day's Action");
        d4 = FirebaseDatabase.getInstance().getReference("Review Of Past Performance");
        d5 = FirebaseDatabase.getInstance().getReference("Today Production plan");
        d6 = FirebaseDatabase.getInstance().getReference("Today's Action Plan");
        d7 = FirebaseDatabase.getInstance().getReference("General Communication");
        d8 = FirebaseDatabase.getInstance().getReference("Issues for escalation");
        d9 = FirebaseDatabase.getInstance().getReference("Work Practice");
        d10 =FirebaseDatabase.getInstance().getReference("General Comment");
        d11 =FirebaseDatabase.getInstance().getReference("Action Gap List");
        r10 = FirebaseDatabase.getInstance().getReference("firstrow");


        edittext1 = (EditText)findViewById(R.id.b133);
        et2 = (EditText)findViewById(R.id.b233);
        et3 = (EditText)findViewById(R.id.b333);
//        et4 = (EditText)findViewById(R.id.b40);
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
//        bt9 =(Button)findViewById(R.id.blo760);



        commentadd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addComment(edittext1,database);
                edittext1.setText(" ");
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addComment(et2,d2);
                et2.setText(" ");

            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addComment(et3,d3);
                et3.setText(" ");

            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
       startActivity(new Intent(getApplicationContext(),Main25Activity.class));

                //addComment(et4,d4);
               // et4.setText(" ");

            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addComment(et5,d5);
                et5.setText(" ");

            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addComment(et6,d6);
                et6.setText(" ");

            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  addComment(et7,d7);
                et7.setText(" ");

            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addComment(et8,d8);
                et8.setText(" ");

            }
        });
/*         bt9.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 startActivity(new Intent(getApplicationContext(),Main22Activity.class));

             }
         });
 */
    }

 public void addComment(EditText edittext100 ,DatabaseReference database100 ){

        String comment = edittext100.getText().toString().trim();
        if(!TextUtils.isEmpty(comment)){
   String id = database100.push().getKey();

   ket Ket = new ket(comment);

   database100.child(id).setValue(Ket);


            Toast.makeText(this,"comment added for today session",Toast.LENGTH_LONG).show();

        }
 else{

            Toast.makeText(this,"please enter any comment or resolution",Toast.LENGTH_LONG).show();

        }

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

        startActivity(new Intent(getApplicationContext(),Main34Activity.class));
    }


    }



