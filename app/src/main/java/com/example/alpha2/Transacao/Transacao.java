package com.example.alpha2.Transacao;

public class Transacao {
        private String tipo, descricao;
        private double valor;
    public Transacao(String tipo, String descricao, double valor){
        this.descricao = descricao;
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}