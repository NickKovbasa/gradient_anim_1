package com.example.kolyakb.background_anim_11;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.kolyakb.background_anim_1.R;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    AnimationDrawable animationDrawable;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.linearl_main);
        animationDrawable = (AnimationDrawable) linearLayout.getBackground();

        animationDrawable.setEnterFadeDuration(10);
        animationDrawable.setExitFadeDuration(1000);
        animationDrawable.start();
    }
}
