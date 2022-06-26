package com.bodega;

public class EstoqueArray implements IEstoque{
    private Produto[] produtos_list = new Produto[200];
    private int count = 0;

    public void adicionar(Produto produto) throws PJCException {
        boolean exists = false;

        try { exists = buscar(produto.getCodigo()) != null ? true : false; }
        catch (PNEException e) { System.out.println(e.getMessage()); }

        if (exists == true) { throw new PJCException(); }
        else {
            produtos_list[count] = produto;
            count++;
        }
    }

    public Produto buscar(String codigo) throws PNEException {
        Produto aux = null;

        for(Produto p : this.produtos_list){
            if (p.getCodigo() == codigo) {
                aux = p;
                break;
            }
        }

        if (aux == null) throw new PNEException();
        else return aux;
    }

    public void apagar(String codigo) throws PNEException {
        boolean exists = false;
        int i = 0;
        for (Produto p: produtos_list){
            if (p.getCodigo() == codigo){
                exists = true;
                break;
            }
            i++;
        }
        if (exists == false) throw new PNEException();
        else {
            for (int j = i; j < this.count - 1; j++){
                this.produtos_list[j] = this.produtos_list[i + 1];
            }
            this.count--;
        }
    }

    public int Quantidade() {
        int qtd = 0;
        for (Produto p: produtos_list) qtd += p.getQtd();
        return qtd;
    }

    public Produto[] produtosEmEstoque() {
        Produto[] emEstoque = new Produto[200];
        int i = 0;
        for(Produto p: produtos_list){
            if (p.getQtd() > 0) {
                emEstoque[i] = p;
                i++;
            }
        }
        return emEstoque;
    }

    public Produto[] produtosEmFalta() {
        Produto[] emEstoque = new Produto[200];
        int i = 0;
        for(Produto p: produtos_list){
            if (p.getQtd() == 0) {
                emEstoque[i] = p;
                i++;
            }
        }
        return emEstoque;
    }
}
