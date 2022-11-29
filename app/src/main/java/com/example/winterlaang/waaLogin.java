package com.example.winterlaang;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

public class waaLogin extends AppCompatActivity {
    Button botonR;
    Button login;
    Button botonc;
    static String MESSAGE_NOMBRE, TAG;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waa_login);
        botonR = findViewById(R.id.registrarse);
        login = findViewById(R.id.login);
        botonc = findViewById(R.id.cancel);

        botonR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Registrarse();
            }
        });
        botonc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                salir();
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loginApp();
            }
        });

        ImageView mMessi = findViewById(R.id.icono);

        Glide.with(this)
                .load(R.drawable.splash)
                .transition(DrawableTransitionOptions.withCrossFade(100))
                .circleCrop()
                .into(mMessi);

        ImageView thunder = findViewById(R.id.icono);
        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.zoom);
        thunder.startAnimation(myanim);


    }

    public void salir() {
        System.exit(0);
    }
    public void Registrarse() {
        Intent intent = new Intent(this, waaSignup.class);
        activityResult.launch(intent);
    }

    public void loginApp() {
        Intent intent = new Intent(this, waaSplash.class);
        activityResult.launch(intent);
    }




    ActivityResultLauncher<Intent> activityResult = registerForActivityResult(
            new ActivityResultContracts.StartActivityForResult(),
            new ActivityResultCallback<ActivityResult>() {
                @Override
                public void onActivityResult(ActivityResult result) {
                    Log.d(TAG, ""+result.getResultCode());
                }
            }
    );

}