package com.bodega;

public class Bodega {
    public Bodega() {}
    public Bodega(IEstoque estoque){ this.estoque = estoque; }
    
    private IEstoque estoque;

    public void adicionarProduto(Produto produto){
        try{
            estoque.adicionar(produto);
        } catch (PJCException e){
            System.out.println(e.getMessage());
        }
    }

    public void removerProduto(String codigo) {
        try{
            estoque.apagar(codigo);
        } catch (PNEException e){
            System.out.println(e.getMessage());
        }
    }

    public void venderProduto(String codigo, int quantidade){
        try{
            Produto p = estoque.buscar(codigo);
            if (p != null){
                p.setQtd(p.getQtd() - quantidade);
            }
        } catch (PNEException e){
            System.out.println(e.getMessage());
        }
    }

    public void estocarProduto(String codigo, int quantidade){
        try{
            Produto p = estoque.buscar(codigo);
            if (p != null){
                p.setQtd(p.getQtd() + quantidade);
            }
        } catch (PNEException e){
            System.out.println(e.getMessage());
        }
    }

    public Produto consultarProduto(String codigo){
        Produto p = new Produto();
        try{
            p = estoque.buscar(codigo);
        } catch (PNEException e){
            System.out.println(e.getMessage());
        }
        return p;
    }

    public Produto[] listarProdutos(){
        return estoque.produtosEmEstoque();
    }

    public Produto[] listarProdutosEmFalta(){
        return estoque.produtosEmFalta();
    }
}
