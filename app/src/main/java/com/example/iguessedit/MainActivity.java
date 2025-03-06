package com.example.iguessedit;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        LottieAnimationView animationView=findViewById(R.id.lottie);
        animationView.playAnimation();

        new Handler().postDelayed(() -> {
            startActivity(new Intent(MainActivity.this, MainActivity2.class));
            finish();
        }, 3400);}





    }
