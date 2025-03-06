package com.example.iguessedit;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    TextView t1, t2;
    ImageButton yes, no;
    VideoView videoView;
    int num, step = 0, bits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        // Get the number from the previous activity
        num = getIntent().getIntExtra("NUMBER_KEY", 100);

        t1 = findViewById(R.id.textView8);
        t2 = findViewById(R.id.Numbers);
        yes = findViewById(R.id.yess);
        no = findViewById(R.id.noo);
        videoView = findViewById(R.id.videoView2);

        t1.setText("Think of a Number Between 0 and " + num);

        // Calculate number of bits required
        bits = (int) Math.ceil(Math.log(num + 1) / Math.log(2));

        // Show the first set of numbers
        showNumbers();

        // Handle Yes button click
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = num | (1 << step);
                nextStep();
            }
        });

        // Handle No button click
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num = num & ~(1 << step);
                nextStep();
            }
        });
    }

    private void showNumbers() {
        t2.setText(""); // Clear previous numbers
        for (int j = 0; j <= num; j++) {
            if ((j & (1 << step)) != 0) {
                t2.append(j + "  "); // Append numbers
            }
        }
        t1.setText("Is Your Number Present Here?");
    }

    private void nextStep() {
        step++;
        if (step < bits) {
            showNumbers();
        } else {
            // Hide Buttons
            yes.setVisibility(View.INVISIBLE);
            no.setVisibility(View.INVISIBLE);

            // Center the TextView (if using LinearLayout)
            t1.setGravity(Gravity.CENTER);
            t1.setTextSize(30);

            // Update Text
            if(num==69){

                t1.setText("Bohat Neech insaan h tu , Tharki 😂 : "+num);
                Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.akshay);
                videoView.setVideoURI(videoUri);
                playVideo();
            }
            else {
                t1.setText("Tune Socha tha 😉: " + num);

                Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.one_dance);
                videoView.setVideoURI(videoUri);
                playVideo();
                 // Clear Numbers List
            }
            t2.setText("");
        }
    }
    private void playVideo() {

        videoView.setVisibility(View.VISIBLE);
        videoView.start();

        // Stop looping (No need to set looping as VideoView doesn't loop by default)
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                // Do nothing (video stops automatically)
            }
        });
    }
    }

