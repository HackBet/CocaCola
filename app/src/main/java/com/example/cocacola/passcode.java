package com.example.cocacola;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import com.hanks.passcodeview.PasscodeView;

public class passcode extends Main5Activity {
PasscodeView passcodeView;

 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passcode);

        passcodeView = findViewById(R.id.passcode);
        passcodeView.setPasscodeLength(4).setLocalPasscode("1234").setListener(new PasscodeView.PasscodeViewListener() {

            @Override
            public void onFail() {
                Toast.makeText(getApplicationContext(),"Password is wrong",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onSuccess(String number) {

                    startActivity(new Intent(getApplicationContext(), MainActivity3.class));


                }


        });
    }


}
