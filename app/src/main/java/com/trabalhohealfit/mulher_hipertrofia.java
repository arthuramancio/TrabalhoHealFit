package com.trabalhohealfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mulher_hipertrofia extends AppCompatActivity {
    private Button bttIniciante, bttAvancado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulher_hipertrofia);
        getSupportActionBar().hide();

        bttIniciante = findViewById(R.id.bttIniciante);
        bttAvancado = findViewById(R.id.bttAvancado);

        bttIniciante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), mulher_hipertrofia_nv1.class);
                startActivity(intent);

            }
        });
        bttAvancado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), mulher_hipertrofia_nv2.class);
                startActivity(intent);

            }
        });

    }
}