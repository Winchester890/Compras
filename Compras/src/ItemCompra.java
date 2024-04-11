public class ItemCompra {
    private Produto produto;
    private int qtde;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public ItemCompra(Produto produto, int qtde) {
        this.produto = produto;
        this.qtde = qtde;
    }

    public double calcSubTotal() {
        double precoTotal = this.produto.getPreco() * qtde;
        return precoTotal;
    }

    public void mostraItem() {
        double p = calcSubTotal();
        System.out.println("Descrição: " + produto.getDescricao() + ", preço: "
        + produto.getPreco() + ", quantidade: " + qtde + " e subtotal: " + p);
    }
}
