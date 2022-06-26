package com.bodega;

public class Produto {

    public Produto(){}
    public Produto(String codigo){ this.codigo=codigo; }

    private String codigo;
    private String nome;
    private double preco;
    private int quantidade;

    public void setCodigo(String cod){ this.codigo=cod; }
    public String getCodigo(){ return this.codigo; }

    public void setNome(String n){ this.nome=n; }
    public String getNome(){ return this.nome; }

    public void setPreco(double p){ this.preco=p; }
    public double getPreco(){ return this.preco; }

    public void setQtd(int qtd){ this.quantidade=qtd; }
    public int getQtd(){ return this.quantidade; }

}


