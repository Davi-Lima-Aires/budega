package com.bodega;

public class ProdutoPerecivel extends Produto{
    public ProdutoPerecivel(){}
    public ProdutoPerecivel(String codigo){ super(codigo); }

    private String validade;

    public void setValidade(String val){ this.validade=val; }
    public String getValidade(){ return this.validade; }

}

