package com.example.xmlexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText augentText, addendText;
    TextView resultText;
    Button sumButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addendText = findViewById(R.id.addent);
        augentText = findViewById(R.id.augent);
        resultText = findViewById(R.id.res);
        sumButton = findViewById(R.id.sum);

        sumButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aug = augentText.getText().toString();
                float augent = Float.parseFloat(aug);
                float addent = Float.parseFloat(addendText.getText().toString());
                float res = augent + addent;
                resultText.setText(Float.valueOf(res).toString());
            }
        });
    }
}