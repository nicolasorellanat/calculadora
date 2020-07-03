package com.example.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String numero ="";
    private double num1 = 0;
    private double num2 = 0;
    private String symbol= "";


    private TextView Resultado;
    private Button key_Pad0, key_Pad1, key_Pad2, key_Pad3, key_Pad4, key_Pad5, key_Pad6, key_Pad7, key_Pad8, key_Pad9;
    private Button key_PadSubstract, key_PadSum, key_PadMultiply, key_PadDivision, key_PadEqual, key_PadClear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Resultado =  findViewById(R.id.solucion);
        //Config Botones
        key_Pad0 = findViewById(R.id.num_cero);
        key_Pad1 = findViewById(R.id.num_uno);
        key_Pad2 = findViewById(R.id.num_dos);
        key_Pad3 = findViewById(R.id.num_tres);
        key_Pad4 = findViewById(R.id.num_cuatro);
        key_Pad5 = findViewById(R.id.num_cinco);
        key_Pad6 = findViewById(R.id.num_seis);
        key_Pad7 = findViewById(R.id.num_siete);
        key_Pad8 = findViewById(R.id.num_ocho);
        key_Pad9 = findViewById(R.id.num_nueve);

        key_PadSubstract = findViewById(R.id.resta);
        key_PadSum = findViewById(R.id.suma);
        key_PadMultiply = findViewById(R.id.multiplicacion);
        key_PadClear = findViewById(R.id.CE);
        key_PadDivision=findViewById(R.id.division);
        key_PadEqual=findViewById(R.id.igual);

        //Clicks para efectuar proceso
        key_Pad0.setOnClickListener(this);
        key_Pad1.setOnClickListener(this);
        key_Pad2.setOnClickListener(this);
        key_Pad3.setOnClickListener(this);
        key_Pad4.setOnClickListener(this);
        key_Pad5.setOnClickListener(this);
        key_Pad6.setOnClickListener(this);
        key_Pad7.setOnClickListener(this);
        key_Pad8.setOnClickListener(this);
        key_Pad9.setOnClickListener(this);

        key_PadSubstract.setOnClickListener(this);
        key_PadDivision.setOnClickListener(this);
        key_PadMultiply.setOnClickListener(this);
        key_PadClear.setOnClickListener(this);
        key_PadEqual.setOnClickListener(this);
        key_PadSum.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //switchs para calculos
        switch (v.getId()){
            case R.id.num_cero:
                numero = numero + "0";
                Resultado.setText(numero);
                break;

            case R.id.num_uno:
                numero = numero + "1";
                Resultado.setText(numero);
                break;

            case R.id.num_dos:
                numero = numero + "2";
                Resultado.setText(numero);
                break;

            case R.id.num_tres:
                numero = numero + "3";
                Resultado.setText(numero);
                break;

            case R.id.num_cuatro:
                numero = numero + "4";
                Resultado.setText(numero);
                break;

            case R.id.num_cinco:
                numero = numero + "5";
                Resultado.setText(numero);
                break;

            case R.id.num_seis:
                numero = numero + "6";
                Resultado.setText(numero);
                break;

            case R.id.num_siete:
                numero  = numero + "7";
                Resultado.setText(numero);
                break;

            case R.id.num_ocho:
                numero = numero + "8";
                Resultado.setText(numero);
                break;

            case R.id.num_nueve:
                numero = numero + "9";
                Resultado.setText(numero);
                break;

            //Operatoria
            case R.id.suma:
                symbol = "+";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;

            case R.id.resta:
                symbol = "-";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;

            case R.id.division:
                symbol = "/";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;

            case R.id.multiplicacion:
                symbol = "X";
                num1 = Integer.parseInt(numero);
                numero = "";
                break;
            case R.id.CE:
                symbol = "";
                numero = "";
                num1 = 0;
                num2= 0;
                Resultado.setText("");
                break;

            case R.id.igual:
                num2 = Integer.parseInt(numero );
                switch (symbol){
                    case "+":
                        Resultado.setText("solucion: " + (num1 + num2));
                        break;
                    case "-":
                        Resultado.setText("solucion: " + (num1 - num2));
                        break;
                    case "/":
                        Resultado.setText("solucion: " + (num1 / num2));
                        break;
                    case "X":
                        Resultado.setText("solucion: " + (num1 * num2));
                        break;
                }

                num1 = 0;
                num2 = 0;
                numero = "";

                break;
        }
    }
}