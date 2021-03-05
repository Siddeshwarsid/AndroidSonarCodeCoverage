package com.mzhang.sonarqubejacoco.math;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mzhang.sonarqubejacoco.R;

public class MathActivity extends AppCompatActivity implements View.OnClickListener {

    TextView text;
    Button clickMe, hide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);

        clickMe = findViewById(R.id.buttonClickMe);
        hide = findViewById(R.id.buttonHide);
        if (clickMe != null)  clickMe.setOnClickListener(this);
        if (hide != null)  hide.setOnClickListener(this);
        text = findViewById(R.id.textMath);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.buttonClickMe) {
            text.setText("Hello World");
        } else {
            v.setVisibility(View.GONE);
        }
    }

}