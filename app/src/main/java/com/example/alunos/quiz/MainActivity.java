package com.example.alunos.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abrirPergunta(View view){

        Intent intent = new Intent(this, PerguntaActivity.class);
        startActivity(intent);

    }
    public void abrirPergunta2(View view){
        Intent intent = new Intent(this, PerguntaActivity.class);

        intent.putExtra("PERGUNTA", "2 - ARQUIVO DE LAYOUT DE TELA " + "SÃO DO TIPO?...");

        intent.putExtra("A", "Java");
        intent.putExtra("B", "JPG");
        intent.putExtra("C", "HTML");
        intent.putExtra("D", "XML");
        intent.putExtra("alternativaCorreta", R.id.rbD);
        startActivity(intent);
    }
    public void abrirPergunta3(View view){
        Intent intent = new Intent(this, PerguntaActivity.class);

        intent.putExtra("PERGUNTA", "3 - QUE MÉTODO É USADO PARA ACESSA ELEMETOS DA INTERFACE NO CÓDIGO JAVA? ");

        intent.putExtra("A", "FindViewById( )");
        intent.putExtra("B", "acessWidget( )");
        intent.putExtra("C", "connectObject( )");
        intent.putExtra("D", "getElement( )");
        intent.putExtra("alternativaCorreta", R.id.rbA);
        startActivity(intent);
    }
    public void abrirPergunta4(View view){
        Intent intent = new Intent(this, PerguntaActivity.class);

        intent.putExtra("PERGUNTA", "4 - A CLASSE USADA PARA ABERTURA DE NOVAS TELAS É?");

        intent.putExtra("A", "Activity");
        intent.putExtra("B", "View");
        intent.putExtra("C", "Intent");
        intent.putExtra("D", "Android");
        intent.putExtra("alternativaCorreta", R.id.rbC);
        startActivity(intent);
    }
    public void abrirPergunta5(View view){
        Intent intent = new Intent(this, PerguntaActivity.class);

        intent.putExtra("PERGUNTA", "5 - QUAL WIDGET É USADO PARA OBTERMOS UM TEXTO QUALQUER DO USUARIO?");

        intent.putExtra("A", "TextView");
        intent.putExtra("B", "Button");
        intent.putExtra("C", "Toast");
        intent.putExtra("D", "EditText");
        intent.putExtra("alternativaCorreta", R.id.rbD);
        startActivity(intent);
    }

}
