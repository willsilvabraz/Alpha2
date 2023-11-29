package com.example.alpha2.caixaCarrinhoVenda;

import com.example.alpha2.estoqueProduto.Produto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Carrinho implements Serializable {
    private List<Produto> itensCarrinho;

    public Carrinho(){
        this.itensCarrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double valorCompra, double valorVenda, int quantidade){
        Produto temp = new Produto(nome, valorCompra, valorVenda,quantidade);
        itensCarrinho.add(temp);
    }

    public List<Produto> getListItens(){
        List<String> temp = new ArrayList<>();
        for(Produto i: itensCarrinho){
            temp.add(i.toString());
        }

        return itensCarrinho;
    }

    public double getValor(){
        double temp = 0;
        for(Produto i: itensCarrinho){
            temp += i.getValorVenda();
        }
        return temp;
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "itensCarrinho=" + itensCarrinho +
                '}';
    }
}