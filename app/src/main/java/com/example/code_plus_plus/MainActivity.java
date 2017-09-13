package com.example.code_plus_plus;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int linesOfCode = 200;
    public int methods = 0;
    public int classes = 0;
    public int features = 0;
    public int releases = 0;
    public int projects = 0;

    TextView textView;
    Button methodButton;
    Button classButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        methodButton = (Button) findViewById(R.id.button2);
        methodButton.setEnabled(false);
        classButton = (Button) findViewById(R.id.button3);
        classButton.setEnabled(false);

        textView = (TextView) findViewById(R.id.currentData);
        new CountDownTimer(3000, 1000) {

            public void onTick(long millisUntilFinished) {
                textView.setText("seconds remaining: " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                textView.setText("done!");
            }
        }.start();

    }

        public void onClickLineOfCode(View v) {
            linesOfCode++;
            textView = (TextView) findViewById(R.id.t1);
            textView.setText("" + linesOfCode);
            if(linesOfCode >= (methods + 1) * 5){
                methodButton.setEnabled(true);
            } else {
                methodButton.setEnabled(false);
            }
        }

    public void onClickMethod(View v) {
        linesOfCode = linesOfCode - ((methods + 1) * 5);
        methods++;

        textView = (TextView) findViewById(R.id.t1);
        textView.setText("" + linesOfCode);
        textView = (TextView) findViewById(R.id.t2);
        textView.setText("" + methods);

        if(linesOfCode >= (methods + 1) * 5){
            methodButton.setEnabled(true);
        } else {
            methodButton.setEnabled(false);
        }

        if(methods >= (classes + 1) * 5){
            classButton.setEnabled(true);
        } else {
            classButton.setEnabled(false);
        }
    }


    public void onClickClass(View v) {
        methods = methods - ((classes + 1) * 5);
        classes++;

        textView = (TextView) findViewById(R.id.t2);
        textView.setText("" + methods);
        textView = (TextView) findViewById(R.id.t3);
        textView.setText("" + classes);

        if(methods >= (classes + 1) * 5){
            classButton.setEnabled(true);
        } else {
            classButton.setEnabled(false);
        }
    }

}
