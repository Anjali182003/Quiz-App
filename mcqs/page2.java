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
public class page2 extends AppCompatActivity {
    RadioGroup rg1,rg2,rg3;
    RadioButton r11,r12,r13,r14,r21,r22,r23,r24,r31,r32,r33,r34;
    TextView tv,tv1,tv2,tv3,show2,percent2,te2;
    Button sub2,finish2;
    ProgressBar progressBar2;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        builder= new AlertDialog.Builder(this);
        tv=findViewById(R.id.tv);        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);        tv3=findViewById(R.id.tv3);
        rg1=findViewById(R.id.rg1);        rg2=findViewById(R.id.rg2);
        rg3=findViewById(R.id.rg3);        r11=findViewById(R.id.r11);
        r12=findViewById(R.id.r12);        r13=findViewById(R.id.r13);
        r14=findViewById(R.id.r14);        r21=findViewById(R.id.r21);
        r22=findViewById(R.id.r22);        r23=findViewById(R.id.r23);
        r24=findViewById(R.id.r24);        r31=findViewById(R.id.r31);
        r32=findViewById(R.id.r32);        r33=findViewById(R.id.r33);
        r34=findViewById(R.id.r34);        show2=findViewById(R.id.show2);
        te2=findViewById(R.id.te2);        sub2=findViewById(R.id.sub2);
        finish2=findViewById(R.id.finish2);
        finish2.setVisibility(finish2.INVISIBLE);
        progressBar2=findViewById(R.id.progressBar2);
        percent2=findViewById(R.id.percent2);
        percent2.setVisibility(percent2.INVISIBLE);
        progressBar2.setVisibility(progressBar2.INVISIBLE);
        sub2.setOnClickListener(new View.OnClickListener() {
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
                        if(r13.getId()==a1) {
                            r11.setBackgroundColor(Color.parseColor("#FF0000"));
                            r12.setBackgroundColor(Color.parseColor("#FF0000"));
                            r13.setBackgroundColor(Color.parseColor("#32CD32"));
                            r14.setBackgroundColor(Color.parseColor("#FF0000"));
                            num+=5;
                        }else {
                            r11.setBackgroundColor(Color.parseColor("#FF0000"));
                            r12.setBackgroundColor(Color.parseColor("#FF0000"));
                            r13.setBackgroundColor(Color.parseColor("#32CD32"));
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
                        if(r31.getId()==a3) {
                            r31.setBackgroundColor(Color.parseColor("#32CD32"));
                            r32.setBackgroundColor(Color.parseColor("#FF0000"));
                            r33.setBackgroundColor(Color.parseColor("#FF0000"));
                            r34.setBackgroundColor(Color.parseColor("#FF0000"));
                            num+=5;
                        }else {
                            r31.setBackgroundColor(Color.parseColor("#32CD32"));
                            r32.setBackgroundColor(Color.parseColor("#FF0000"));
                            r33.setBackgroundColor(Color.parseColor("#FF0000"));
                            r34.setBackgroundColor(Color.parseColor("#FF0000"));
                            num+=0;
                        }
                        ans=(num*100)/15;
                        if(ans==0) {
                            te2.setText("😭");
                        }else if(ans==33) {
                            te2.setText("😟");
                        }else if(ans==66) {
                            te2.setText("😄");
                        }else if(ans==100) {
                            te2.setText("🤩");
                        }
                        percent2.setVisibility(percent2.VISIBLE);
                        progressBar2.setVisibility(progressBar2.VISIBLE);
                        show2.setBackgroundColor(Color.parseColor("#D34B0B67"));
                        show2.setTextColor(Color.parseColor("#FFFFFF"));
                        percent2.setText(""+ans+"%");
                        show2.setText("Result\n"+"Your Score: "+num+"/15\n"+"Percentage: "+ans+"%.");
                        progressBar2.setMax(100);
                        progressBar2.setProgress((int) ans);
                        finish2.setVisibility(finish2.VISIBLE);
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
        finish2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(page2.this,ThankYou.class);
                startActivity(i);
            }
        });
    }
}