package com.example.mcqs;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class page3 extends AppCompatActivity {
    RadioGroup rg1,rg2,rg3;
    RadioButton r11,r12,r13,r14,r21,r22,r23,r24,r31,r32,r33,r34;
    Button sub3,finish3;
    TextView show3;
    TextView tv,tv1,tv2,tv3,percent3,te3;
    ProgressBar progressBar3;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page3);
        builder= new AlertDialog.Builder(this);
        tv=findViewById(R.id.tv);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        rg1=findViewById(R.id.rg1);
        rg2=findViewById(R.id.rg2);
        rg3=findViewById(R.id.rg3);

        r11=findViewById(R.id.r11);
        r12=findViewById(R.id.r12);
        r13=findViewById(R.id.r13);
        r14=findViewById(R.id.r14);

        r21=findViewById(R.id.r21);
        r22=findViewById(R.id.r22);
        r23=findViewById(R.id.r23);
        r24=findViewById(R.id.r24);

        r31=findViewById(R.id.r31);
        r32=findViewById(R.id.r32);
        r33=findViewById(R.id.r33);
        r34=findViewById(R.id.r34);

        show3=findViewById(R.id.show3);
        te3=findViewById(R.id.te3);

        sub3=findViewById(R.id.sub3);
        finish3=findViewById(R.id.finish3);
        finish3.setVisibility(finish3.INVISIBLE);
        progressBar3=findViewById(R.id.progressBar3);
        percent3=findViewById(R.id.percent3);
        percent3.setVisibility(percent3.INVISIBLE);
        progressBar3.setVisibility(progressBar3.INVISIBLE);


        sub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setMessage("Are you sure to submit test?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        int a1=rg1.getCheckedRadioButtonId();
                        int a2=rg2.getCheckedRadioButtonId();
                        int a3=rg3.getCheckedRadioButtonId();
                        int num=0;
                        double ans;
                        String result="";
                        if(r12.getId()==a1) {
                            r11.setBackgroundColor(Color.parseColor("#FF0000"));
                            r12.setBackgroundColor(Color.parseColor("#32CD32"));
                            r13.setBackgroundColor(Color.parseColor("#FF0000"));
                            r14.setBackgroundColor(Color.parseColor("#FF0000"));
                            num+=5;
                        }else {
                            r11.setBackgroundColor(Color.parseColor("#FF0000"));
                            r12.setBackgroundColor(Color.parseColor("#32CD32"));
                            r13.setBackgroundColor(Color.parseColor("#FF0000"));
                            r14.setBackgroundColor(Color.parseColor("#FF0000"));
                            num+=0;
                        }
                        if(r22.getId()==a2){
                            r21.setBackgroundColor(Color.parseColor("#FF0000"));
                            r22.setBackgroundColor(Color.parseColor("#32CD32"));
                            r23.setBackgroundColor(Color.parseColor("#FF0000"));
                            r24.setBackgroundColor(Color.parseColor("#FF0000"));
                            num+=5;

                        }else {
                            r21.setBackgroundColor(Color.parseColor("#FF0000"));
                            r22.setBackgroundColor(Color.parseColor("#32CD32"));
                            r23.setBackgroundColor(Color.parseColor("#FF0000"));
                            r24.setBackgroundColor(Color.parseColor("#FF0000"));
                            num+=0;
                        }
                        if(r34.getId()==a3) {
                            r31.setBackgroundColor(Color.parseColor("#FF0000"));
                            r32.setBackgroundColor(Color.parseColor("#FF0000"));
                            r33.setBackgroundColor(Color.parseColor("#FF0000"));
                            r34.setBackgroundColor(Color.parseColor("#32CD32"));
                            num+=5;
                        }else {
                            r31.setBackgroundColor(Color.parseColor("#FF0000"));
                            r32.setBackgroundColor(Color.parseColor("#FF0000"));
                            r33.setBackgroundColor(Color.parseColor("#FF0000"));
                            r34.setBackgroundColor(Color.parseColor("#32CD32"));
                            num+=0;
                        }
                        ans=(num*100)/15;
                        if(ans==0) {
                            te3.setText("😭");
                        }else if(ans==33) {
                            te3.setText("😟");
                        }else if(ans==66) {
                            te3.setText("😄");
                        }else if(ans==100) {
                            te3.setText("🤩");
                        }

                        percent3.setVisibility(percent3.VISIBLE);
                        progressBar3.setVisibility(progressBar3.VISIBLE);
                        show3.setBackgroundColor(Color.parseColor("#D34B0B67"));
                        show3.setTextColor(Color.parseColor("#FFFFFF"));
                        percent3.setText(""+ans+"%");
                        show3.setText("Result\n"+"Your Score: "+num+"/15\n"+"Percentage: "+ans+"%.");
                        progressBar3.setMax(100);
                        progressBar3.setProgress((int) ans);
                        finish3.setVisibility(finish3.VISIBLE);
                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                AlertDialog alert=builder.create();
                alert.setTitle("Submit");
                alert.show();

            }
        });
        finish3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(page3.this,ThankYou.class);
                startActivity(i);
            }
        });

    }
}