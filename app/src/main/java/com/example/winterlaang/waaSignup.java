package com.example.winterlaang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class waaSignup extends AppCompatActivity {
    Button boton;
    static final String TEXTO = "RESULTADO";
    public static final int CODIGO_NUEVO=50;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waa_signup);
        boton = findViewById(R.id.cancel);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                volver();
            }
        });
    }
    public void volver(){
        Intent intent =new Intent(this, waaSplash.class);
        intent.putExtra(TEXTO, "Limpiando la pagina 1");
        setResult(CODIGO_NUEVO,intent);
        waaSignup.super.onBackPressed();
    }

}