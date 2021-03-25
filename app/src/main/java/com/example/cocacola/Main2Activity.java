package com.example.cocacola;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cocacola.models.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Main2Activity extends AppCompatActivity {
    private boolean isShowPass = false;
    EditText e1, e2, e3, mFullName;
    Button register;
    TextView t1;
    FirebaseAuth fAuth;
    ProgressBar progressBar2;
    DatabaseReference reference;
    CheckBox chekbox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2register);
        mFullName = findViewById(R.id.FullName);
        chekbox =(CheckBox)findViewById(R.id.checked);
        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText3);
        e3 = (EditText) findViewById(R.id.editText4);
        register = (Button) findViewById(R.id.button2);
        t1 = (TextView) findViewById(R.id.textView4);
        fAuth = FirebaseAuth.getInstance();
        reference = FirebaseDatabase.getInstance().getReference().child("Users");
        progressBar2 = (ProgressBar) findViewById(R.id.progressBar2);

       /*   if(fAuth.getCurrentUser() != null){

           startActivity(new Intent(getApplicationContext(),Main6Activity.class));

            finish();

      }
*/
     /*  register.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(getApplicationContext(),Main6Activity.class));
           }
       });


      */
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String name = mFullName.getText().toString().trim();
                final String email = e1.getText().toString().trim();
                final String password = e2.getText().toString().trim();
                final String co = e3.getText().toString().trim();


                if (TextUtils.isEmpty(name)) {

                    mFullName.setError("UserName is required if you want to procced");
                    return;
                }

                if (TextUtils.isEmpty(email)) {

                    e1.setError("Email is required if you want to procced");
                    return;
                }

                if(!(isValidEmail(email))){
                    e1.setError("please enter a valid Email");
                    return;


                }
                if (TextUtils.isEmpty(password)) {


                    e2.setError("password is required");

                    return;
                }
                if (password.length() < 6)
                {

                    e2.setError("please enter a 6 digit password");
                    return;

                }
                if (TextUtils.isEmpty(co)) {

                    e3.setError("please enter the confrimation code given by the admin");

                }

                //double ab;
                //ab = Double.parseDouble(confirmation);
                //&& co.equals(b) && co.equals(c) && co.equals(d) && co.equals(e))
                //(!(co.equals(a)) && !(co.equals(b)))

                String a = "12345", b = "45673 ", c = "12436", d = "34657", e = "23455";

                if(!(co.equals(a)|| co.equals(b)|| co.equals(c)|| co.equals(d)|| co.equals(e))){

                    e3.setError("please enter a correct confrimation code the code you enter is not valid");
                    return;

                }





                    progressBar2.setVisibility(View.VISIBLE);

                    fAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {

                            if (task.isSuccessful()) {


                                FirebaseUser firebaseUser = fAuth.getCurrentUser();
                                User u = new User();
                                u.setName(name);
                                u.setEmail(email);


                                reference.child(firebaseUser.getUid()).setValue(u).addOnCompleteListener(new OnCompleteListener<Void>() {
                                    @Override
                                    public void onComplete(@NonNull Task<Void> task) {

                                        if (task.isSuccessful()) {

                                            Toast.makeText(Main2Activity.this, "USER REGISTER WORKED WELL", Toast.LENGTH_LONG).show();

                                            startActivity(new Intent(getApplicationContext(), Main6Activity.class));


                                        }

                                    }
                                });


                                //Toast.makeText(Activity2.this, "USER REGISTER WORKED WELL", Toast.LENGTH_SHORT).show();

                            } else {

                                progressBar2.setVisibility(View.INVISIBLE);
                                Toast.makeText(Main2Activity.this, "Error!!!" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

                }

        });


        chekbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    e2.setTransformationMethod(HideReturnsTransformationMethod.getInstance());


                }
                else{

                    e2.setTransformationMethod(PasswordTransformationMethod.getInstance());


                }
            }
        });


        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Main3Activity.class));
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.menuLogout) {

            startActivity(new Intent(Main2Activity.this, ADminsLogin.class));

        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {

        final AlertDialog.Builder builder = new AlertDialog.Builder(Main2Activity.this);
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
    public static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }
}

