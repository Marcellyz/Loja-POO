package com.mycompany;

public class Main {
    public static void main(String[] args) {;

        GerenciamentoProduto gerenciamentoProduto = new GerenciamentoProduto();

        Produto p1= new Produto("caneta",  "azul", 3.00, 5, "GYDI2");
        gerenciamentoProduto.adicionarProduto(p1);

        Produto p2 = new Produto("caneta", "preta", 3.50, 3, "GYDI4");
        gerenciamentoProduto.adicionarProduto(p2);

        Produto p3 = new Produto("caneta", "vermelha", 4.00, 2, "GYDI6");
        gerenciamentoProduto.adicionarProduto(p3);
        gerenciamentoProduto.listarProduto();
    }
}