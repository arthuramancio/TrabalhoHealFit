package com.trabalhohealfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Homem extends AppCompatActivity {
    private Button bttEmagrecimento, bttHipertrofia;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homem);
        getSupportActionBar().hide();

        bttEmagrecimento = findViewById(R.id.bttEmagrecimento);
        bttHipertrofia = findViewById(R.id.bttHipertrofia);


        bttEmagrecimento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), homem_emagrecimento.class);
                startActivity(intent);

            }
        });

        bttHipertrofia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), homem_hipertrofia.class);
                startActivity(intent);

            }
        });


    }

}