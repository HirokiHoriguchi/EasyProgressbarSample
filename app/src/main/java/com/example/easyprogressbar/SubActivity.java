package com.example.easyprogressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class SubActivity extends AppCompatActivity {

    private ProgressBar progressBar;
    private int val = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        Button button = findViewById(R.id.Button_for_Progressbar);
        progressBar = findViewById(R.id.ProgressBar);
        progressBar.setMax(100);


        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (val == 100){
                    val = 0;
                }else {
                    val += 10;
                    progressBar.setProgress(val);
                    progressBar.setSecondaryProgress(50);
                    Log.d("valの値は", String.valueOf(val));
                }
//                2020-06-22 19:46:14.942 20230-20230/com.example.easyprogressbar D/valの値は: 10
//                2020-06-22 19:46:15.621 20230-20230/com.example.easyprogressbar D/valの値は: 20
//                2020-06-22 19:46:15.892 20230-20230/com.example.easyprogressbar D/valの値は: 30
//                2020-06-22 19:46:16.057 20230-20230/com.example.easyprogressbar D/valの値は: 40
//                2020-06-22 19:46:16.279 20230-20230/com.example.easyprogressbar D/valの値は: 50
//                2020-06-22 19:46:16.542 20230-20230/com.example.easyprogressbar D/valの値は: 60
//                2020-06-22 19:46:16.752 20230-20230/com.example.easyprogressbar D/valの値は: 70
//                2020-06-22 19:46:16.935 20230-20230/com.example.easyprogressbar D/valの値は: 80
//                2020-06-22 19:46:17.580 20230-20230/com.example.easyprogressbar D/valの値は: 90
//                2020-06-22 19:46:18.549 20230-20230/com.example.easyprogressbar D/valの値は: 100
//                2020-06-22 19:46:20.391 20230-20230/com.example.easyprogressbar D/valの値は: 10
//                これがサイクル。11回押さないと、0にならず表示としては10からスタートされるから11回買い押さないといけない。
//                これをうまく変更するとしたらこうする。
            }
        });


    }

}
