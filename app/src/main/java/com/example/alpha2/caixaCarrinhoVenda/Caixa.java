package com.example.alpha2.caixaCarrinhoVenda;

import java.io.Serializable;
import java.util.List;

public class Caixa implements Serializable {
    private double valorAbertura , valorAtual, valorFechamento;
    private List<Venda> venda;

    public Caixa(double valorAbertura){
        this.valorAbertura = valorAbertura;
        this.valorAtual = 0 + valorAbertura;
    }

}