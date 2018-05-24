package com.example.xayk.add2numbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etA,etB;
    TextView tvSum;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etA=findViewById(R.id.A);
        etB=findViewById(R.id.B);
        tvSum=findViewById(R.id.Sum);

    }
    public void onClick(View view)
    {
        String a=etA.getText().toString();
        String b=etB.getText().toString();

        double iA,iB;
        iA=Double.parseDouble(a);iB=Double.parseDouble(b);
        iA=iA+iB;
        String Sum=Double.toString(iA);
        tvSum.setText(Sum);

    }
}
