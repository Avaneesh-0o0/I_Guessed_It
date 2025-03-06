package com.example.iguessedit;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
ImageButton i1;
EditText e1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        i1=findViewById(R.id.imageButton);
        e1=findViewById(R.id.editTextNumber);

        i1.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                int num;
                if(e1.getText().toString().isEmpty()){num=100;}
                else{
                    num=Integer.parseInt(e1.getText().toString());}




                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                intent.putExtra("NUMBER_KEY",num);
                startActivity(intent);
            }
        });

    }

}