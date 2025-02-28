package com.mycompany;

import java.util.LinkedList;

public class GerenciamentoProduto {

    public static int lastCodigo;
    private LinkedList<Produto> produtos;

    public GerenciamentoProduto() {
        this.produtos = new LinkedList<Produto>();
        lastCodigo = 5000;
    }

    public void adicionarProduto( Produto p){
        this.produtos.add(p);
    }

    public void listarProduto(){
        for(Produto p: this.produtos){
            System.out.println(p.toString());
        }
    }

    public Produto buscarProduto(int busca){
        for(Produto p: this.produtos){
            if (p.getCodigo() == busca) return p;
        }
        return null;
    }

    public void atualizarProduto(Produto produto, int busca){
        for(Produto p: this.produtos){
            if(p.getCodigo() == busca) p = produto;
        }
    }

    public void deletarProduto(int busca){
        for(Produto p: this.produtos){
            if (p.getCodigo() == busca){
                this.produtos.remove(p);
            }
        }
    }





















}
