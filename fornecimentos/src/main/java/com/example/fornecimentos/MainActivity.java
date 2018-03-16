package com.example.fornecimentos;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    private EditText editProduto;
    private EditText editVU;
    private EditText editQTD;
    private TextView textResultado;
    private ListView listView;

    public class Produto {
        private String nome;
        private double valorUnitario;
        private int quantidade;

        public Produto(String nome, double valorUnitario, int quantidade){
            this.nome = nome;
            this.valorUnitario = valorUnitario;
            this.quantidade = quantidade;
        }

        public double Calcular(){

            double resultado = valorUnitario * quantidade;
            return resultado;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editProduto = findViewById(R.id.editProduto);
        editVU = findViewById(R.id.editVU);
        editQTD = findViewById(R.id.editQTD);
        listView = findViewById(R.id.lista);
    }

    public List<Produto>todosOsProdutos(){

        String nome = editProduto.getText().toString();
        int quantidade = Integer.parseInt(editQTD.getText().toString());
        double valorUnitario = Double.parseDouble(editVU.getText().toString());

        Produto objeto = new Produto(nome, valorUnitario, quantidade);
        List<Produto>produtos = new ArrayList<>();
        produtos.add(objeto);

        return produtos;
    }
}
