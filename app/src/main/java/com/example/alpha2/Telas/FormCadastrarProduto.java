package com.example.alpha2.Telas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.alpha2.FormEstoque;
import com.example.alpha2.MainActivity;
import com.example.alpha2.Programa;
import com.example.alpha2.R;


public class FormCadastrarProduto extends AppCompatActivity {
    private EditText nome, valorCompra, valorVenda, quantidade;
    private Button bt_cadastrar, bt_estoque, bt_voltar;
    private Programa programa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastrar);

        inicializarComponentes();
        Bundle dados = getIntent().getExtras();
        programa = (Programa) dados.getSerializable("Programa");


        bt_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    programa.getEstoque().cadastrarProduto(
                            nome.getText().toString(), Double.parseDouble(valorCompra.getText().toString()),Double.parseDouble(valorVenda.getText().toString()), Integer.parseInt(quantidade.getText().toString())
                    );
                }catch (Exception e){

                }

            }
        });

        bt_estoque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FormCadastrarProduto.this, FormEstoque.class);
                intent.putExtra("Programa", programa);
                startActivity(intent);
            }
        });

        bt_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FormCadastrarProduto.this, MainActivity.class);
                intent.putExtra("Programa", programa);
                startActivity(intent);
            }
        });

    }

    public void inicializarComponentes(){
        bt_cadastrar = findViewById(R.id.bt_cadastrar);
        nome = findViewById(R.id.nome);
        valorCompra = findViewById(R.id.valorCompra);
        valorVenda = findViewById(R.id.valorVenda);
        quantidade = findViewById(R.id.quantidade);
        bt_estoque = findViewById(R.id.bt_estoque);
        bt_voltar = findViewById(R.id.bt_voltar);

    }

}