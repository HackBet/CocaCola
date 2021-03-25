package com.example.cocacola;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.firebase.database.DatabaseReference;

import java.util.List;

public class Comment_list extends ArrayAdapter<ket>  {

    private Activity context;
    private List<ket> commentlist;
    private Object DatabaseReference;

    public Comment_list(Activity context ,List<ket> commentlist){

        super(context,R.layout.list_layout,commentlist);
        this.context = context;
this.commentlist = commentlist;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listviewitem = inflater.inflate(R.layout.list_layout,null,true);
        TextView comment = (TextView)listviewitem.findViewById(R.id.textViewComment);
       // TextView comment2 = (TextView)listviewitem.findViewById(R.id.textViewComment2);

        ket Ket = commentlist.get(position);
        comment.setText(Ket.getComment());
        //comment2.setText(Ket.getComment());
        return listviewitem;

    }


    }

