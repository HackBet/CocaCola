package com.example.cocacola;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
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

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Main3Activity extends AppCompatActivity {
    EditText mEmail,mPassword;
    TextView t1;
    Button b1;
    FirebaseAuth fAuth;
    CheckBox chekbox;
    ProgressBar progressbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        mEmail = (EditText) findViewById(R.id.editText);
        mPassword = (EditText) findViewById(R.id.editText3);
        chekbox =(CheckBox)findViewById(R.id.checked);
        progressbar=(ProgressBar)findViewById(R.id.progressBar2);
        fAuth = FirebaseAuth.getInstance();
        b1 = (Button) findViewById(R.id.button2);
        t1 = (TextView) findViewById(R.id.textView4);
        chekbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    mPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());


                }
                else{

                    mPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());


                }
            }
        });
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Main2Activity.class));
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email1 = mEmail.getText().toString().trim();
                String password1 = mPassword.getText().toString().trim();
                if (TextUtils.isEmpty(email1)) {

                    mEmail.setError("Email is required if you want to procced");
                    return;
                }
                if (TextUtils.isEmpty(password1)) {


                    mPassword.setError("password is required");

                    return;
                }
              /*  if (password1.length() < 6) {

                    mPassword.setError("passwords are always more than 6 digits ");
                    return;

                }
               */
                progressbar.setVisibility(View.VISIBLE);

                fAuth.signInWithEmailAndPassword(email1, password1).addOnCompleteListener(
                        new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(Main3Activity.this, "Logged in Successfully", Toast.LENGTH_SHORT).show();

                                    startActivity(new Intent(getApplicationContext(), Main5Activity.class));


                                } else {
                                    progressbar.setVisibility(View.INVISIBLE);
                                    Toast.makeText(Main3Activity.this, "Error There is no Account By this Email!!!", Toast.LENGTH_SHORT).show();
                                }

                            }
                        });
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

            startActivity(new Intent(Main3Activity.this, ADminsLogin.class));

        }

        return super.onOptionsItemSelected(item);

    }

}
