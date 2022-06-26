package com.bodega;


public class Main {
    public static void main(String[] args){
        IEstoque estoque = new EstoqueArray();
        Bodega bodeguinha = new Bodega(estoque);

        ProdutoPerecivel maca = new ProdutoPerecivel("1");
        maca.setNome("maca");
        maca.setPreco(12.5);
        maca.setQtd(50);
        maca.setValidade("12/2022");
        bodeguinha.adicionarProduto(maca);

        ProdutoPerecivel banana = new ProdutoPerecivel("2");
        maca.setNome("banana");
        maca.setPreco(12.5);
        maca.setQtd(50);
        maca.setValidade("12/2022");
        bodeguinha.adicionarProduto(banana);

        Produto boneco = new Produto("3");
        boneco.setNome("Batman");
        boneco.setPreco(50.0);
        boneco.setQtd(100);
        bodeguinha.adicionarProduto(boneco);

        System.out.println("Produto: "+bodeguinha.consultarProduto("3").getNome());;
    }
}
