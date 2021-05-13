package com.example.magicball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton Ball;
    private TextView respuesta;
    private String [] respuestaArray = {"Es cierto", "Definitivamente es así", "Sí, definitivamente",
            "Sin duda", "Lo más probable", "Perspectiva buena", "Sí", "Las señales apuntan a sí",
            "Respuesta confusa", "Mejor no decirte ahora", "No lo puedo predecir ahora", "Muy dudoso",
            "Concéntrate y pregunta de nuevo", "Outlook no es tan bueno", "Mis fuentes dicen que no",
            "Pregúntale a Siri", "No cuentes conmigo", "Probablemente", "No", "Puede confiar en él",
            "Lo puedes googlear", "Como yo lo veo, sí", "Respuesta confusa, intente de nuevo",
            "No cueentes con eso", "Mi respuesta es no, respuesta definitiva"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // referencia la imagen
        Ball = findViewById(R.id.btnBall);
        // referencia texto
        respuesta = findViewById(R.id.respuestavista);

        // proceso
        Ball.setOnClickListener((View.OnClickListener) this);
        Toast.makeText(MainActivity.this, "Consulta tu suerte", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        // creación método switch
        switch (v.getId()) {
            case R.id.btnBall:
                int rand = new Random().nextInt(respuestaArray.length);
                respuesta.setText(respuestaArray[rand]);
                break;
        }
    }
}