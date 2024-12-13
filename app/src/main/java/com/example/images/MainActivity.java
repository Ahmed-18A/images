package com.example.images;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    int pec=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.img);
    }

    public void left(View view) {
        if(pec==5){
            img.setImageResource(R.drawable.pec4);
            pec--;
        }
        else {
            if(pec==4){
                img.setImageResource(R.drawable.pec3);
                pec--;
            }
            else {
                if(pec==3){
                    img.setImageResource(R.drawable.pec2);
                    pec--;
                }
                else {
                    if(pec==2){
                        img.setImageResource(R.drawable.pec1);
                        pec--;
                    }
                    else{
                        img.setImageResource(R.drawable.pec5);
                        pec=5;
                    }
                }
            }
        }
    }

    public void right(View view) {
        if(pec==1){
            img.setImageResource(R.drawable.pec2);
            pec++;
        }
        else {
            if(pec==2){
                img.setImageResource(R.drawable.pec3);
                pec++;
            }
            else {
                if(pec==3){
                    img.setImageResource(R.drawable.pec4);
                    pec++;
                }
                else {
                    if(pec==4){
                        img.setImageResource(R.drawable.pec5);
                        pec++;
                    }
                    else{
                        img.setImageResource(R.drawable.pec1);
                        pec=3;
                    }
                }
            }
        }
    }
}