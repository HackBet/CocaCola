package com.example.cocacola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.hanks.passcodeview.PasscodeView;

public class Main40Activity extends AppCompatActivity {

    PasscodeView passcodeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main40pass5);

        passcodeView = findViewById(R.id.passcode);
        passcodeView.setPasscodeLength(4).setLocalPasscode("1234").setListener(new PasscodeView.PasscodeViewListener() {

            @Override
            public void onFail() {
                Toast.makeText(getApplicationContext(),"Password is wrong",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onSuccess(String number) {
                startActivity(new Intent(getApplicationContext(), Main4Activity.class));


            }

        });
    }

}
