package com.example.findoddoreven;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText NUM;
    Button CLR, RES;
    TextView OD,EV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NUM = (EditText) findViewById(R.id.No);
        CLR = (Button) findViewById(R.id.Cl);
        RES = (Button) findViewById(R.id.Re);
        OD = (TextView) findViewById(R.id.Odd);
        EV = (TextView) findViewById(R.id.Even);

        CLR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NUM.setText("");
                OD.setText("");
                EV.setText("");
            }
        });

        RES.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(NUM.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter the Number in the Input Box and Press Result Button.",Toast.LENGTH_SHORT).show();
                }
                else {
                    int a = Integer.parseInt(NUM.getText().toString());
                    if (a % 2 == 0)
                    {
                        EV.setText(Integer.toString(a));
                        EV.setTextColor(Color.parseColor("#008000"));

                        OD.setText("NO");
                        OD.setTextColor(Color.parseColor("#ff0000"));
                    }
                    else
                    {
                        OD.setText(Integer.toString(a));
                        OD.setTextColor(Color.parseColor("#008000"));
                        EV.setText("NO");
                        EV.setTextColor(Color.parseColor("#ff0000"));
                    }
                }
            }
        });

    }
}