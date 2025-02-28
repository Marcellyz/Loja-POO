package com.mycompany;

public class Produto {
    private int codigo;
    private String nome;
    private String descricao;
    private double preco;
    private int quantidade;
    private String lote;

    public Produto( String nome, String descricao, double preco, int quantidade, String lote){
        GerenciamentoProduto.lastCodigo +=2;
        this.codigo = GerenciamentoProduto.lastCodigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.lote = lote;

    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
       if (preco >= 0){
           this.preco = preco;
       }else {
           this.preco = 0;
       }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getLote() {
        return lote;
    }



    public void setLote(String lote) {
        this.lote = lote;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", lote='" + lote + '\'' +
                '}';
    }
}
