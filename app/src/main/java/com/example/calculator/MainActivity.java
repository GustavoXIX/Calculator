package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.calculator.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.Btnsuma.setOnClickListener(v -> {

            String numero1 = binding.Num1.getText().toString();
            String numero2 = binding.Num2.getText().toString();
            double NumeroPrimero ;
            double NumeroSegundo ;


            if ((!numero1.isEmpty()) && (!numero2.isEmpty())) {
                NumeroPrimero = Double.parseDouble(numero1);
                NumeroSegundo = Double.parseDouble(numero2);

                double resultado = NumeroPrimero + NumeroSegundo;
                String ResultadoFinali =  resultado + "";
                binding.EditResult.setText(ResultadoFinali);
            } else {
                Toast.makeText(this, getString(R.string.no_vacio), Toast.LENGTH_LONG).show();
            }

        });

        binding.BtnDiv.setOnClickListener(v -> {

            String numero1 = binding.Num1.getText().toString();
            String numero2 = binding.Num2.getText().toString();
            double NumeroPrimero ;
            double NumeroSegundo ;


            if ((!numero1.isEmpty()) && (!numero2.isEmpty())) {
                NumeroPrimero = Double.parseDouble(numero1);
                NumeroSegundo = Double.parseDouble(numero2);

                double resultado = NumeroPrimero / NumeroSegundo;
                String ResultadoFinali =  resultado + "";
                binding.EditResult.setText(ResultadoFinali);
            } else {
                Toast.makeText(this, getString(R.string.no_vacio), Toast.LENGTH_LONG).show();
            }

        });

        binding.BtnMult.setOnClickListener(v -> {

            String numero1 = binding.Num1.getText().toString();
            String numero2 = binding.Num2.getText().toString();
            double NumeroPrimero ;
            double NumeroSegundo ;


            if ((!numero1.isEmpty()) && (!numero2.isEmpty())) {
                NumeroPrimero = Double.parseDouble(numero1);
                NumeroSegundo = Double.parseDouble(numero2);

                double resultado = NumeroPrimero * NumeroSegundo;
                String ResultadoFinali =  resultado + "";
                binding.EditResult.setText(ResultadoFinali);
            } else {
                Toast.makeText(this, getString(R.string.no_vacio), Toast.LENGTH_LONG).show();
            }

        });

        binding.BtnRestar.setOnClickListener(v -> {

            String numero1 = binding.Num1.getText().toString();
            String numero2 = binding.Num2.getText().toString();
            double NumeroPrimero ;
            double NumeroSegundo ;


            if ((!numero1.isEmpty()) && (!numero2.isEmpty())) {
                NumeroPrimero = Double.parseDouble(numero1);
                NumeroSegundo = Double.parseDouble(numero2);

                double resultado = NumeroPrimero - NumeroSegundo;
                String ResultadoFinali =  resultado + "";
                binding.EditResult.setText(ResultadoFinali);
            } else {
                Toast.makeText(this, getString(R.string.no_vacio), Toast.LENGTH_LONG).show();
            }

        });
    }
}