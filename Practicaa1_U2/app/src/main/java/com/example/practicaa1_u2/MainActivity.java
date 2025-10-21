package com.example.practicaa1_u2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edtN;
    Button btnR;
    TextView txtR;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        edtN= findViewById(R.id.edtN);
        btnR= findViewById(R.id.btnR);
        txtR=findViewById(R.id.txtR);
    }
    public void  Calcular(View view)
    {
        String valor = edtN.getText().toString();



        double cal = Double.parseDouble(valor);
        String resultado;

        if (cal < 8) {
            resultado = "No Aprobado";
        } else if (cal >= 8 && cal < 9) {
            resultado = "Satisfactorio";
        } else if (cal >= 9 && cal < 9.5) {
            resultado = "Destacado";
        } else if (cal == 10) {
            resultado = "Autonomo";
        } else {
            resultado = "Fuera de rango";
        }

        txtR.setText("Nivel: " + resultado);
    }
}