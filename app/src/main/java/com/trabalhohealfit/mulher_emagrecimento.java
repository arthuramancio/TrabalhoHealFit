package com.trabalhohealfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mulher_emagrecimento extends AppCompatActivity {
    private Button bttIniciante, bttIntermediario, bttAvancado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulher_emagrecimento);
        getSupportActionBar().hide();

        bttIniciante = findViewById(R.id.bttIniciante);
        bttIntermediario = findViewById(R.id.bttIntermediario);
        bttAvancado = findViewById(R.id.bttAvancado);

        bttIniciante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), mulher_emagrecimento_nv1.class);
                startActivity(intent);

            }
        });

        bttIntermediario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), mulher_emagrecimento_nv2.class);
                startActivity(intent);

            }
        });

        bttAvancado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), mulher_emagrecimento_nv3.class);
                startActivity(intent);

            }
        });

    }
}