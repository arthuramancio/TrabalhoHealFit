package com.trabalhohealfit;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity {

    private Button bttMulher, bttHomem, buttCronometro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        getSupportActionBar().hide();

        bttMulher = findViewById(R.id.bttMulher);
        bttHomem = findViewById(R.id.bttHomem);
        buttCronometro = findViewById(R.id.buttCronometro);

        bttMulher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Mulher.class);
                startActivity(intent);

            }
        });

        bttHomem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Homem.class);
                startActivity(intent);

            }
        });

        buttCronometro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Cronometro.class);
                startActivity(intent);

            }
        });
    }
}