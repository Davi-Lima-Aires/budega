package com.bodega;


public class Main {
    public static void main(String[] args){
        IEstoque estoque = new EstoqueArray();
        Bodega Bodeguinha = new Bodega(estoque);
    }
}
