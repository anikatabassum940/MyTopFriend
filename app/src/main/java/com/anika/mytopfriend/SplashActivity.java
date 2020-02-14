package com.anika.mytopfriend;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    private int splashTime=4000;
    ImageView imgPlayer;
    AnimationDrawable frameAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgPlayer=findViewById(R.id.imageView);

        imgPlayer.setImageResource(R.drawable.frameanimation);
        frameAnimation=(AnimationDrawable)imgPlayer.getDrawable();
        frameAnimation.start();

        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent=new Intent(SplashActivity.this, RecyclerViewActivity.class);
                startActivity(intent);
                finish();
            }
        },splashTime);
    }
}
