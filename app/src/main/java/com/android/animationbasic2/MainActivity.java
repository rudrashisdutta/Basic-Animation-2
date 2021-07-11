package com.android.animationbasic2;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    private ImageView invisible;
    ConstraintLayout backG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        invisible =(ImageView)findViewById(R.id.gayabHoGayaPhotu);
        backG=(ConstraintLayout)findViewById(R.id.backGround);
        invisible.setTranslationX(-2000);
        invisible.animate().translationX(0).rotation(1440).setDuration(2000);
        backG.setOnClickListener(view -> {
            if(invisible.getTranslationX()==-2000) {
                invisible.animate().translationX(0).rotation(1440).setDuration(2000);
            }
            else{
                invisible.animate().translationX(-2000).rotation(0).setDuration(2000);
            }
        });
    }
}