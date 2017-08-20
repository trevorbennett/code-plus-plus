package com.example.code_plus_plus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int score = 0;
    public int programs = 0;
    TextView textView;
    Button compileButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        compileButton = (Button) findViewById(R.id.button2);
        compileButton.setEnabled(false);

    }

        public void onClick(View v) {
            score++;
            textView = (TextView) findViewById(R.id.t1);
            textView.setText("Lines Of Code: " + score);
            if(score >= (programs + 1) * 20){
                compileButton.setEnabled(true);
            }
        }

}
