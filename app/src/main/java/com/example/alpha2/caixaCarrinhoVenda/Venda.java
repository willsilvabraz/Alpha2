package com.example.alpha2.caixaCarrinhoVenda;

import java.io.Serializable;

public class Venda implements Serializable {
    private Carrinho carrinho;
    private double valor;

    public Venda() {
        carrinho = new Carrinho();
        valor =  0;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }
}