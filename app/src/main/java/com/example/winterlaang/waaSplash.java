package com.example.winterlaang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class waaSplash extends AppCompatActivity {

    TextView texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waa_splash);
        openApp();
        texto = findViewById(R.id.first);

        ImageView mfondo = findViewById(R.id.fondo);
        Glide.with(this)
                .load(R.drawable.splash)
                .transition(DrawableTransitionOptions.withCrossFade(100))
                .placeholder(new ColorDrawable(this.getResources().getColor(R.color.azul1)))
                .into(mfondo);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.fadein);
        mfondo.startAnimation(myanim);


    }

    private void openApp() {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable()
        {
            @Override
            public void run() {
                Intent intent = new Intent(waaSplash
                        .this, waaLogin.class);
                startActivity(intent);
            }
        }, 5000);


    }

}