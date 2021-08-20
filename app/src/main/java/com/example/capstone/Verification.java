package com.example.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Verification extends AppCompatActivity {

    private EditText InputCode1, InputCode2, InputCode3, InputCode4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verification);
        Button OTPbutton = findViewById(R.id.submitOTP);
        TextView MobileText = findViewById(R.id.TextMobile);

        MobileText.setText(String.format("+63-%s", getIntent().getStringExtra("mobile")
        ));

        InputCode1 = findViewById(R.id.InputCode1);
        InputCode2 = findViewById(R.id.InputCode2);
        InputCode3 = findViewById(R.id.InputCode3);
        InputCode4 = findViewById(R.id.InputCode4);

        OTPInputs();

        OTPbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent((getApplicationContext()), Verified.class);
                startActivity(intent);
            }
        });
    }


    private void OTPInputs(){
        InputCode1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!s.toString().trim().isEmpty()) {
                    InputCode2.requestFocus();

                }
            }
            @Override
            public void afterTextChanged(Editable s) {}


        });
        InputCode2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!s.toString().trim().isEmpty()) {
                    InputCode3.requestFocus();

                }
            }
            @Override
            public void afterTextChanged(Editable s) {}

        });
        InputCode3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!s.toString().trim().isEmpty()) {
                    InputCode4.requestFocus();

                }
            }
            @Override
            public void afterTextChanged(Editable s) {}

        });

        }
    }



