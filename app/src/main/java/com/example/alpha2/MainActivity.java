package com.example.alpha2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.alpha2.Telas.FormCadastrarProduto;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private DatabaseReference ref = FirebaseDatabase.getInstance().getReference();

    private Button bt_tl_cadastrar, bt_estoque;

    private  Programa programa = new Programa();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ref.getDatabase().toString();

        DatabaseReference user = ref.child("usuarios");
        user.child("003");

        Bundle dados = getIntent().getExtras();
        if (dados != null) {
            programa = (Programa) dados.getSerializable("Programa");
        }
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarComponentes();


        bt_tl_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FormCadastrarProduto.class);
                intent.putExtra("Programa", programa);
                startActivity(intent);

            }
        });

        bt_estoque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FormEstoque.class);
                intent.putExtra("Programa", programa);
                startActivity(intent);
            }
        });
    }

    public void inicializarComponentes(){
        bt_tl_cadastrar = findViewById(R.id.bt_tl_cadastrar);
        bt_estoque = findViewById(R.id.bt_estoque);
    }
}