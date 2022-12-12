package com.example.mcqs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class content extends AppCompatActivity {
    TextView q,c,cpp,java;
    ImageView c1,c2,j3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
        q=findViewById(R.id.q);
        c=findViewById(R.id.c);
        cpp=findViewById(R.id.cpp);
        java=findViewById(R.id.java);
        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        j3=findViewById(R.id.j3);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(content.this,page1.class);
                startActivity(i);
            }
        });
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(content.this,page1.class);
                startActivity(i);
            }
        });

        cpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(content.this,page2.class);
                startActivity(i);
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(content.this,page2.class);
                startActivity(i);
            }
        });

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(content.this,page3.class);
                startActivity(i);
            }
        });
        j3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(content.this,page3.class);
                startActivity(i);
            }
        });
    }
}