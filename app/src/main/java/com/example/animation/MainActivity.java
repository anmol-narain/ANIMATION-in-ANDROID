package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtAnim;
    Button btnTranslate,btnAlpha,btnRotate,btnScale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAnim = findViewById(R.id.txtAnim);
        btnTranslate = findViewById(R.id.btnTranslate);
        btnAlpha = findViewById(R.id.btnAlpha);
        btnRotate = findViewById(R.id.btnRotate);
        btnScale = findViewById(R.id.btnScale);



        //event listeners
        btnTranslate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //now get the move file in java file as a variable
                Animation move = AnimationUtils.loadAnimation(MainActivity.this,R.anim.move);
                txtAnim.startAnimation(move);
            }
        });

        btnAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //now get the move file in java file as a variable
                Animation alpha = AnimationUtils.loadAnimation(MainActivity.this,R.anim.alpha);
                txtAnim.startAnimation(alpha);
            }
        });

        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //now get the move file in java file as a variable
                Animation rotation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.rotation);
                txtAnim.startAnimation(rotation);
            }
        });

        btnScale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //now get the move file in java file as a variable
                Animation scale = AnimationUtils.loadAnimation(MainActivity.this,R.anim.scale);
                txtAnim.startAnimation(scale);
            }
        });

    }
}

//startAnimation() --> gets executed when it gets called .
//setAnimation() -->when layout loads for first time then animation occurs --> used in splash activity only (mostly)