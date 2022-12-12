package com.example.mcqs;

import static android.graphics.Color.BLACK;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    EditText et1,et2;
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv);
        et1=findViewById(R.id.et2);
        et2=findViewById(R.id.et1);
        bt1=findViewById(R.id.bt1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(( et1.getText().toString().equals(""))&&(et2.getText().toString().equals(""))){
                    Toast.makeText(MainActivity.this,"Enter the required fields",Toast.LENGTH_LONG).show();
                }
                else{
                    Intent i = new Intent(MainActivity.this,Intro.class);
                    startActivity(i);
                }
            }
        });

    }
}