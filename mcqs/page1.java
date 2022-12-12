package com.example.mcqs;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AlertDialog;import android.content.DialogInterface;
import android.content.Intent;import android.graphics.Color;
import android.os.Bundle;import android.view.View;
import android.widget.Button;import android.widget.ProgressBar;
import android.widget.RadioButton;import android.widget.RadioGroup;
import android.widget.TextView;
public class page1 extends AppCompatActivity {
    RadioGroup rg1,rg2,rg3;
    RadioButton r11,r12,r13,r14,r21,r22,r23,r24,r31,r32,r33,r34;
    Button sub1,finish1;
    TextView show1,te1;
    TextView tv,tv1,tv2,tv3,percent1;
    ProgressBar progressBar1;
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        builder= new AlertDialog.Builder(this);
        tv=findViewById(R.id.tv);
        tv1=findViewById(R.id.tv1);        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);        rg1=findViewById(R.id.rg1);
        rg2=findViewById(R.id.rg2);        rg3=findViewById(R.id.rg3);
        r11=findViewById(R.id.r11);        r12=findViewById(R.id.r12);
        r13=findViewById(R.id.r13);        r14=findViewById(R.id.r14);
        r21=findViewById(R.id.r21);        r22=findViewById(R.id.r22);
        r23=findViewById(R.id.r23);        r24=findViewById(R.id.r24);
        r31=findViewById(R.id.r31);        r32=findViewById(R.id.r32);
        r33=findViewById(R.id.r33);        r34=findViewById(R.id.r34);
        show1=findViewById(R.id.show1);    te1=findViewById(R.id.te1);
        finish1=findViewById(R.id.finish1);
        finish1.setVisibility(finish1.INVISIBLE);
        progressBar1=findViewById(R.id.progressBar1);
        progressBar1.setVisibility(progressBar1.INVISIBLE);
        percent1=findViewById(R.id.percent1);
        percent1.setVisibility(percent1.INVISIBLE); sub1=findViewById(R.id.sub1);

        sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setMessage("Are you sure to submit test?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        int a1=rg1.getCheckedRadioButtonId();
                        int a2=rg2.getCheckedRadioButtonId();
                        int a3=rg3.getCheckedRadioButtonId();
                        int num=0;
                        int ans;
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
                        if(r33.getId()==a3) {
                            r31.setBackgroundColor(Color.parseColor("#FF0000"));
                            r32.setBackgroundColor(Color.parseColor("#FF0000"));
                            r33.setBackgroundColor(Color.parseColor("#32CD32"));
                            r34.setBackgroundColor(Color.parseColor("#FF0000"));
                            num+=5;
                        }else {
                            r31.setBackgroundColor(Color.parseColor("#FF0000"));
                            r32.setBackgroundColor(Color.parseColor("#FF0000"));
                            r33.setBackgroundColor(Color.parseColor("#32CD32"));
                            r34.setBackgroundColor(Color.parseColor("#FF0000"));
                            num+=0;
                        }
                        ans=(num*100)/15;
                        if(ans==0) {
                            te1.setText("😭");
                        }else if(ans==33) {
                            te1.setText("😟");
                        }else if(ans==66) {
                            te1.setText("😄");
                        }else if(ans==100) {
                            te1.setText("🤩");
                        }
                        percent1.setVisibility(percent1.VISIBLE);
                        progressBar1.setVisibility(progressBar1.VISIBLE);
                        show1.setBackgroundColor(Color.parseColor("#D34B0B67"));
                        show1.setTextColor(Color.parseColor("#FFFFFF"));
                        percent1.setText(""+ans+"%");
                        show1.setText("Result\n"+"Your Score: "+num+"/15\n"+"Percentage: "+ans+"%.");
                        progressBar1.setMax(100);
                        progressBar1.setProgress(ans);
                        finish1.setVisibility(finish1.VISIBLE);
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
        finish1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(page1.this,ThankYou.class);
                startActivity(i);
            }
        });

    }
}