package com.example.cocacola;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.google.android.material.snackbar.Snackbar;

public class SliderAdapter extends PagerAdapter{
    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context){

        this.context= context;

    }
    public String []slider_heading =
            {
                    "Line 1 Production Unit","Line 2 Production Unit","Line 3 Production Unit","Line 4 Production Unit","Line 5 Production Unit","Line 6 Production Unit"

            };
    public String[]Slide_decs =
            {

                    "This is for Line 1 Production Unit please choose which form you want to see ","This is for Line 2 Production Unit please choose which form you want to see  " ,
                    "This is for Line 3 Production Unit please choose which form you want to see  ","This is for Line 4 Production Unit please choose which form you want to see ","This is for Line 5 Production Unit please choose which form you want to see  ","This is for Line 6 Production Unit please choose which form you want to see "


            };




    @Override
    public int getCount() {
        return slider_heading.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==(RelativeLayout) object;

    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, final int position) {


        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout,container,false);
        TextView SlideHeading = (TextView)view.findViewById(R.id.slider_heading);
        TextView SlideDescription = (TextView)view.findViewById(R.id.Slide_decs);
  /*      Button SlideDescription2 = (Button) view.findViewById(R.id.Slide2);
        Button SlideDescription3 = (Button) view.findViewById(R.id.Slide1);
        Button SlideDescription4 = (Button) view.findViewById(R.id.Slide3);


     SlideDescription2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Line"+(position + 1)+"Button" + (position + 1),Snackbar.LENGTH_LONG).show();

            }
        });
        SlideDescription3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Line"+(position + 2)+"Button" + (position + 2),Snackbar.LENGTH_LONG).show();


            }
        });
        SlideDescription4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,"Line"+(position + 3)+"Button" + (position + 3),Snackbar.LENGTH_LONG).show();

            }
        });


/*        TextView SlideDescription3 = (TextView)view.findViewById(R.id.Slide1);
        TextView SlideDescription4 = (TextView)view.findViewById(R.id.Slide3);
*/
        SlideHeading.setText(slider_heading[position]);
        SlideDescription.setText(Slide_decs[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout)object);

    }
}
