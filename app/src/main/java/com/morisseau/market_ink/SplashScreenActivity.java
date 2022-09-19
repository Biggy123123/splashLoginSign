package com.morisseau.market_ink;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity {

    private static int Splashsceen=5000;
    Animation top, bottom;
    ImageView img;
    TextView nomApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        top = AnimationUtils.loadAnimation(this,R.anim.top);
        bottom = AnimationUtils.loadAnimation(this,R.anim.bottom);
        img = findViewById(R.id.imgSplash);
        nomApp = findViewById(R.id.nomApp);


        img.setAnimation(top);
        nomApp.setAnimation(bottom);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreenActivity.this,LoginActivity.class);
                startActivity(i);
                finish();
            }
        },Splashsceen);

    }
}