package com.example.cocacola;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main10Activity extends AppCompatActivity {
TextView a;
ProgressBar progressBar;

    ListView ListViewComment;
    List<ket> ketLust;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10list);
        Calendar calander = Calendar.getInstance();
        String CurrentData = DateFormat.getDateInstance().format(calander.getTime());
        TextView TextViewDate =(TextView)findViewById(R.id.textView_date);
        TextViewDate.setText(CurrentData);
        progressBar =(ProgressBar)findViewById(R.id.progressBar5);
        ListViewComment = (ListView) findViewById(R.id.listviewcomment);
        ketLust = new ArrayList<>();
    }
    @Override
    protected void onStart() {
        super.onStart();
       /* database.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for(DataSnapshot bb:dataSnapshot.getChildren()){
                ketLust.clear();
                ket Ket = bb.getValue(ket.class);

                ketLust.add(Ket);
            }
                Comment_list adapter = new Comment_list(Main10Activity.this,ketLust);
                ListViewComment.setAdapter(adapter);
                progressBar.setVisibility(View.INVISIBLE);
            }


            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    */
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
