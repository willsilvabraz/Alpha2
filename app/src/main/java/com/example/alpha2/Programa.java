package com.example.alpha2;

import com.example.alpha2.caixaCarrinhoVenda.Caixa;
import com.example.alpha2.caixaCarrinhoVenda.Venda;
import com.example.alpha2.estoqueProduto.Estoque;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;


public class Programa implements Serializable {
    private static Programa instacia;
    private List<Caixa> caixa;
    private Estoque estoque;

    public Programa(){
        caixa = new ArrayList<>();
        estoque = new Estoque();
    }

    public void abrirCaixa(double valor){
        Caixa temp = new Caixa(valor);
    }

    public void vender(String nome, double valorCompra, double valorVenda, int quantidade){

    }

    public Estoque getEstoque(){
        return estoque;
    }

}