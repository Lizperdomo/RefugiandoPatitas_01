package com.example.refugiandopatitas;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AdopcionesAdminActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adopciones_admin);

        FloatingActionButton fabAgregar = findViewById(R.id.fab_agregar);
        fabAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AdopcionesAdminActivity.this, "Botón agregar presionado", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
