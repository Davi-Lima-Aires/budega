package com.bodega;

public interface IEstoque {
    public void adicionar(Produto produto) throws PJCException;

    public Produto buscar(String codigo) throws PNEException;

    public void apagar(String codigo) throws PNEException;

    public int Quantidade();

    public Produto[] produtosEmEstoque();

    public Produto[] produtosEmFalta();

}
