package com.example.cocacola;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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
import android.widget.Toast;
import com.example.cocacola.models.User;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ADminsLogin extends Main2Activity {
Button b1;
EditText v1,v2,v3;
FirebaseAuth fAuth;
ProgressBar progressBar3;
DatabaseReference reference2;
    CheckBox chekbox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admins_login);
        chekbox =(CheckBox)findViewById(R.id.checked);
        v1 =(EditText)findViewById(R.id.FullName);
        v2 =(EditText)findViewById(R.id.editText);
        v3 =(EditText)findViewById(R.id.editText3);
        fAuth =FirebaseAuth.getInstance();
       // reference2 = FirebaseDatabase.getInstance().getReference().child("Admins");
        b1=(Button)findViewById(R.id.button2);
        progressBar3 = (ProgressBar) findViewById(R.id.progressBar2);
       b1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(getApplicationContext(), Main4Activity.class));

           }
       });

        /*
     if(fAuth.getCurrentUser() != null){

            startActivity(new Intent(getApplicationContext(),Main9Activity.class));
            finish();

        }
*/


        chekbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    v3.setTransformationMethod(HideReturnsTransformationMethod.getInstance());


                }
                else{

                    v3.setTransformationMethod(PasswordTransformationMethod.getInstance());


                }
            }
        });
   b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            final String name = v1.getText().toString().trim();
            final String email = v2.getText().toString().trim();
            final String password = v3.getText().toString().trim();
            if (TextUtils.isEmpty(name)) {

                v1.setError("UserName is required if you want to procced");
                return;
            }

            if (TextUtils.isEmpty(email)) {

                v2.setError("Email is required if you want to procced");
                return;
            }
            if(!(isValidEmail(email))){
                v2.setError("please enter a valid Email");
                return;


            }
            if (TextUtils.isEmpty(password)) {


                v3.setError("password is required");

                return;
            }
            //String ab;
            //ab = Double.parseDouble(password);
          // double a = 123456;
            String am = "Admin101EABSC";
            if(!(password.equals(am)))
            {

                v3.setError("please enter the correct Admin Password the one you entered is not valid ");
                return;
            }


                progressBar3.setVisibility(View.VISIBLE);
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

                                        Toast.makeText(ADminsLogin.this, "ADMIN LOGGED IN WELL", Toast.LENGTH_LONG).show();

                                        startActivity(new Intent(getApplicationContext(), Main34Activity.class));


                                    }

                                }
                            });
                        } else {
                            progressBar3.setVisibility(View.INVISIBLE);
                            Toast.makeText(ADminsLogin.this, "Error!!!" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });




                    }
    });

    /*    b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ADminsLogin.this, Main34Activity.class));
            }
        });
*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if(item.getItemId()==R.id.menusIGNIN)
        {

            startActivity(new Intent(ADminsLogin.this, Main2Activity.class));

        }

        return super.onOptionsItemSelected(item);
    }

    public static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }
    @Override
    public void onBackPressed(){
        finish();

    }


}
