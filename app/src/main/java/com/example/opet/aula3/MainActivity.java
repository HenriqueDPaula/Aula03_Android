package com.example.opet.aula3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    private Spinner spinner;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.Spinner1);
        textView = findViewById(R.id.textView);

    }

    public void timeGrupo(View v) {


        switch (spinner.getSelectedItem().toString()){
        case "Grupo 1":
        textView.setText("Egito\n" + "Russia\n" + "Arábia Saudita\n" + "Uruguai");
        break;
        case "Grupo 2":
        textView.setText("Irã\n" + "Marrocos\n" + "Portugal\n" + "Espanha");
        break;
        case "Grupo 3":
        textView.setText("Austrália\n" + "Dinamarca\n" + "França\n" + "Peru");
        break;
        case "Grupo 4":
        textView.setText("Argentina\n" + "Croácia\n" + "Islândia\n" + "Nigéria");
        break;
        case "Grupo 5":
        textView.setText("Brasil\n" + "Costa Rica\n" + "Suiça\n" + "Sérvia");
        break;
        case "Grupo 6":
        textView.setText("Alemanha\n" + "Coréia do Sul\n" + "México\n" + "Suécia");
        break;
        case "Grupo 7":
        textView.setText("Bélgica\n" + "Inglaterra\n" + "Panamá\n" + "Tunísia");
        break;
        case "Grupo 8":
        textView.setText("Colombia\n" + "Japão\n" + "Polonia\n" + "Senegal");
        break;

    }


}


}




