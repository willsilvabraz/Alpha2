package com.example.alpha2.estoqueProduto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Estoque implements Serializable {
    private List<Produto> produto;

    public Estoque(){
        this.produto = new ArrayList<>();
    }

    public void cadastrarProduto(String nome, double valorCompra, double valorVenda, int quantidade){
        Produto temp = new Produto(nome,valorCompra,valorVenda,quantidade);
        produto.add(temp);
    }

    public void removerProduto(String nome){
        if(procurarPorNome(nome) != null){
            this.produto.remove(procurarPorNome(nome));
        }
    }


    public Produto procurarPorNome(String nome){
        for (Produto i : produto){
            if(i.getNome().equals(nome)){
                return i;
            }
        }
        return null;
    }

    public List<String> getList(){
        List<String> temp = new ArrayList<>();
        for(Produto i: produto){
            temp.add(i.toString());
        }

        return temp;
    }

    @Override
    public String toString() {
        return "Estoque{" +
                "produto=" + produto.toString() +
                ' ';
    }
}