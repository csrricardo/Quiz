package com.example.alunos.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class PerguntaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pergunta);
        Intent intent = getIntent();

        if (intent.getExtras() != null){
            // TEM PARÂMETROS... VOU TROCAR A PERGUNTA E AS ALTERNATIVAS.

            //1. PEGUEI OS PARÂMETROS E GUARDEI EM VARIÁVEIS.
            String pergunta = intent.getStringExtra("PERGUNTA");
            String alternativaA = intent.getStringExtra("A");
            String alternativaB = intent.getStringExtra("B");
            String alternativaC = intent.getStringExtra("C");
            String alternativaD = intent.getStringExtra("D");

            TextView txtPergunta = (TextView)findViewById(R.id.txtPergunta);
            txtPergunta.setText(pergunta);

            RadioButton rbA = (RadioButton)findViewById(R.id.rbA);
            RadioButton rbB = (RadioButton)findViewById(R.id.rbB);
            RadioButton rbC = (RadioButton)findViewById(R.id.rbC);
            RadioButton rbD = (RadioButton)findViewById(R.id.rbD);

            rbA.setText(alternativaA);
            rbB.setText(alternativaB);
            rbC.setText(alternativaC);
            rbD.setText(alternativaD);
        }
    }
    public void responder (View view){

        int alternativaCorreta = R.id.rbB;

        Intent intent = getIntent();
        if (intent.getExtras() != null){
            alternativaCorreta = intent.getIntExtra("alternativaCorreta", R.id.rbA);
        }

        RadioGroup radioGroup = (RadioGroup)findViewById(R.id.radioGroup);

        if (radioGroup.getCheckedRadioButtonId() == alternativaCorreta) {
            Toast.makeText(this, "RESPOSTA CERTA!...", Toast.LENGTH_SHORT).show();

        }else{
            Toast.makeText(this, "RESPOSTA ERRADA :(",Toast.LENGTH_SHORT).show();

        }
        finish();
    }
}
