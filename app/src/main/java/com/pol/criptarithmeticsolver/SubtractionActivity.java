package com.pol.criptarithmeticsolver;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class SubtractionActivity extends AppCompatActivity {

    Button btn;
    Spinner s11,s12,s13,s14,s21,s22,s23,s24,s31,s32,s33,s34;
    String number[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subtraction);
        btn = findViewById(R.id.subButton);
        s11 = findViewById(R.id.spinner11);
        s12 = findViewById(R.id.spinner12);
        s13 = findViewById(R.id.spinner13);
        s14 = findViewById(R.id.spinner14);
        s21 = findViewById(R.id.spinner21);
        s22 = findViewById(R.id.spinner22);
        s23 = findViewById(R.id.spinner23);
        s24 = findViewById(R.id.spinner24);
        s31 = findViewById(R.id.spinner31);
        s32 = findViewById(R.id.spinner32);
        s33 = findViewById(R.id.spinner33);
        s34 = findViewById(R.id.spinner34);

        number = getResources().getStringArray(R.array.alphabet);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,number);
        s11.setAdapter(adapter);
        s12.setAdapter(adapter);
        s13.setAdapter(adapter);
        s14.setAdapter(adapter);
        s21.setAdapter(adapter);
        s22.setAdapter(adapter);
        s23.setAdapter(adapter);
        s24.setAdapter(adapter);
        s31.setAdapter(adapter);
        s32.setAdapter(adapter);
        s33.setAdapter(adapter);
        s34.setAdapter(adapter);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SubtractionActivity.this,SubResultActivity.class);
                startActivity(intent);
            }
        });



    }
}
