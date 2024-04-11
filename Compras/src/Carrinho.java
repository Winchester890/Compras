import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private static List<ItemCompra> listaItens = new ArrayList<>();
    private double totalCompra;
    private double porcDesconto;
    private double valorPagar;

    public static List<ItemCompra> getListaItens() {
        return listaItens;
    }

    public void setListaItens(List<ItemCompra> listaItens) {
        this.listaItens = listaItens;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }

    public double getPorcDesconto() {
        return porcDesconto;
    }

    public void setPorcDesconto(double porcDesconto) {
        this.porcDesconto = porcDesconto;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public Carrinho(List<ItemCompra> listaItens, double totalCompra, double porcDesconto, double valorPagar) {
        this.listaItens = listaItens;
        this.totalCompra = totalCompra;
        this.porcDesconto = porcDesconto;
        this.valorPagar = valorPagar;
    }

    public void mostraCarrinho() {
        for (ItemCompra itemCompra : listaItens) {
            double pr = itemCompra.calcSubTotal();
            System.out.println("Item: " + itemCompra.getProduto().getDescricao());
            System.out.println("Quantidade: " + itemCompra.getQtde());
            System.out.println("Preço: " + itemCompra.getProduto().getPreco());
            System.out.println("Subtotal: " + pr);
            System.out.println("---------------------------------------------------");
        }
    }

    public double calcDesconto(double valor) {
        double valorDescontado = valor - (valor * porcDesconto);
        return valorDescontado;
    }

    public double retornoDesconto(double valor) {
        double valorDescontado = valor * porcDesconto;
        return valorDescontado;
    }

    public double somaValores() {
        double total = 0;
        for (ItemCompra itemCompra : listaItens) {
            total += itemCompra.calcSubTotal();
        }
        return total;
    }

}
