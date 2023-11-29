package com.example.alpha2.estoqueProduto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.Serializable;

public class Produto implements Serializable {
    private String nome, descricao, tipo;


    private double valorCompra, valorVenda;
    private int quantidade;

    @Override
    public String toString() {
        return "\nProduto = \n" +
                "nome='" + nome + '\n' +
                "descricao='" + descricao + '\n' +
                "tipo='" + tipo + '\'' +
                "\nvalorCompra=" + valorCompra +
                "\nvalorVenda=" + valorVenda +
                "\nquantidade=" + quantidade +
                '\n';
    }
    public Produto(String nome, double valorCompra, double valorVenda, int quantidade){
        this.nome = nome;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
        this.quantidade = quantidade;
        this.descricao = "Não implementado";
        this.tipo = "Não implementado";
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    ///////////////////////////////////


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}