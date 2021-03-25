package com.example.cocacola;

import android.app.AlertDialog;
import android.content.DialogInterface;
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

public class Main29Activity extends Main4Activity {
    EditText edittext1,et2,et3,et4,et5,et6,et7,et8;
    Button commentadd1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bdone,bt9;
    DatabaseReference database2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main29adminline2m1);
        Calendar calander = Calendar.getInstance();
        String CurrentData = DateFormat.getDateInstance().format(calander.getTime());
        TextView TextViewDate2 = (TextView) findViewById(R.id.textview_date2);
        TextViewDate2.setText(CurrentData);

        database2 = FirebaseDatabase.getInstance().getReference("Attendance").child("Line 2");
        edittext1 = (EditText) findViewById(R.id.b133);
        et2 = (EditText) findViewById(R.id.b233);
        et3 = (EditText) findViewById(R.id.b333);
//        et4 = (EditText)findViewById(R.id.b40);
        et5 = (EditText) findViewById(R.id.b50);
        et6 = (EditText) findViewById(R.id.bo0);
        et7 = (EditText) findViewById(R.id.bop0);
        et8 = (EditText) findViewById(R.id.bopp);

        commentadd1 = (Button) findViewById(R.id.bo33);
        bt2 = (Button) findViewById(R.id.boor533);
        bt3 = (Button) findViewById(R.id.boo33);
        bt4 = (Button) findViewById(R.id.booo);
        bt5 = (Button) findViewById(R.id.b5);
        bt6 = (Button) findViewById(R.id.boo0);
        bt7 = (Button) findViewById(R.id.bopp0);
        bt8 = (Button) findViewById(R.id.bog0);
        bdone = (Button) findViewById(R.id.bog0344);
//        bt9 = (Button) findViewById(R.id.blo760);


        commentadd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                addComment(edittext1,database2);
                edittext1.setText(" ");
            }
        });


    }

        public void addComment(EditText edittext100 , DatabaseReference database100 ){

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

            final AlertDialog.Builder builder = new AlertDialog.Builder(Main29Activity.this);
            builder.setMessage("Are You Sure You Want To Exit?");
            builder.setCancelable(true);
            builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();

                }
            });
            AlertDialog alertDialog = builder.create();

            alertDialog.show();



        }

    }
