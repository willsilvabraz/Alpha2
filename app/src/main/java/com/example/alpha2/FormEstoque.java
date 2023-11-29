package com.example.alpha2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.alpha2.Programa;
import com.example.alpha2.R;

import org.w3c.dom.Text;


public class FormEstoque extends AppCompatActivity {

    private Programa programa;
    private ListView menuList;

    private TextView saida;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_estoque);
        inicializarComponents();

        Bundle dados = getIntent().getExtras();
        programa = (Programa) dados.getSerializable("Programa");

        try {
            saida.setText(programa.getEstoque().toString());
            ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, programa.getEstoque().getList() );
            menuList.setAdapter(adapter);
        }catch (Exception e){
            saida.setText("Não encontramos");
        }
    }

    public void inicializarComponents(){
        saida = findViewById(R.id.textView2);
        menuList = findViewById(R.id.menuList);
    }

}