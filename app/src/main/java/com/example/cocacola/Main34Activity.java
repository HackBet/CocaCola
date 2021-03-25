package com.example.cocacola;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cocacola.Adapters.Slider_Adapter2;

public class Main34Activity extends AppCompatActivity implements View.OnClickListener {
    private ViewPager mSlideviwerpage;
    private LinearLayout mDotLayout;
    private Slider_Adapter2 sliderAdapter;
    private TextView[] mdot;
    private ImageButton b1;
    private int mCurrentpage;
    private Button b14,c3,c4;
    private long backPressedTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main34slider2);
        b14 = (Button)findViewById(R.id.Slide2);
        c3 = (Button)findViewById(R.id.Slide1);
        c4 = (Button)findViewById(R.id.Slide3);
        mSlideviwerpage = (ViewPager) findViewById(R.id.viewpage);
        mDotLayout = (LinearLayout) findViewById(R.id.dotlayout);
        sliderAdapter = new Slider_Adapter2(this);
        mSlideviwerpage.setAdapter(sliderAdapter);
        b1 = (ImageButton) findViewById(R.id.imageButton);
        b1.setOnClickListener((View.OnClickListener) this);
        addDotsindicator(0);
        mSlideviwerpage.addOnPageChangeListener(viewListener);
    }
    public void addDotsindicator(int position) {
        mdot = new TextView[6];
        mDotLayout.removeAllViews();
        for (int i = 0; i < mdot.length; i++) {

            mdot[i] = new TextView(this);
            mdot[i].setText(Html.fromHtml("&#8226;"));
            mdot[i].setTextSize(35);
            mdot[i].setTextColor(getResources().getColor(R.color.colorPrimaryDark));
            mDotLayout.addView(mdot[i]);

        }
        if (mdot.length > 0) {

            mdot[position].setTextColor(getResources().getColor(R.color.colorWhite));
        }
    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

            if(i==0){
                b14.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(), line1admin111.class));
                    }
                });
                c3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),line1adminmin222 .class));

                    }
                });
                c4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),line1admin333.class));

                    }
                });
                return;
            }
            else if(i==1){

                b14.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(), line2admin111.class));

                    }
                });
                c3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),line2adminmin222.class));

                    }
                });
                c4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),line2admin333.class));

                    }
                });

            }
            else if(i==2){

                b14.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(), line3admin111.class));

                    }
                });
                c3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),line3admin222.class));

                    }
                });
                c4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),line3admin333.class));

                    }
                });

            }
            else if(i==3){

                b14.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(), line4admin111.class));

                    }
                });
                c3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),line4admin222.class));

                    }
                });
                c4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),line4admin333.class));

                    }
                });

            }
            else if(i==4){

                b14.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(), line5admin111.class));

                    }
                });
                c3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),line5admin222.class));

                    }
                });
                c4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),line5admin333.class));

                    }
                });

            }
            else if(i==5){

                b14.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(), line6admin111.class));

                    }
                });
                c3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),line6admin222.class));

                    }
                });
                c4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        startActivity(new Intent(getApplicationContext(),line6admin333.class));

                    }
                });

            }


        }

        @Override
        public void onPageSelected(int i) {
            addDotsindicator(i);
            mCurrentpage = i;

            if(i==5) {

                b1.setEnabled(true);
                b1.setVisibility(View.VISIBLE);

            } else {

                b1.setEnabled(false);
                b1.setVisibility(View.INVISIBLE);
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };


    @Override
    public void onClick(View v) {

        Intent intent = new Intent(this, Main7Activity.class);

        startActivity(intent);

    }


    @Override
    public void onBackPressed() {
        if(backPressedTime + 2000 > System.currentTimeMillis()){
            Intent a = new Intent(Intent.ACTION_MAIN);
            a.addCategory(Intent.CATEGORY_HOME);
            a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(a);
            return;
   }
   else
       {
       Toast.makeText(getBaseContext(),"Press back again to exit",Toast.LENGTH_SHORT).show();
       }
        backPressedTime = System.currentTimeMillis();


    }
}



