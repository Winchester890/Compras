import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Integrantes: André Ramos Nogueira Filho, Luiz Otavio de Oliveira e Renata Fernandes Silva

public class Main {
    public static void main(String[] args) {
        Retorno retorno = new Retorno();
        Scanner scanner = new Scanner(System.in);
        List<ItemCompra> listaItens = new ArrayList<>();

        System.out.println("Bem-vindo(a)!");
        System.out.print("Digite o código do item que queira comprar: ");
        Long codigo = Long.parseLong(scanner.next());
        Produto produto = retorno.getProdutoByCodigo(codigo);
        System.out.print("Digite a quantidade: ");
        int qtde = Integer.parseInt(scanner.next());

        ItemCompra item = new ItemCompra(produto, qtde);
        listaItens.add(item);
        System.out.println("Você deseja continuar comprando?(1 - sim/0 - não) ");
        int resposta = scanner.nextInt();
        while (resposta == 1) {
            System.out.print("Digite o código do item que queira comprar: ");
            Long codigo1 = Long.parseLong(scanner.next());
            Produto produto1 = retorno.getProdutoByCodigo(codigo1);
            System.out.print("Digite a quantidade: ");
            int qtde1 = Integer.parseInt(scanner.next());

            ItemCompra item1 = new ItemCompra(produto1, qtde1);
            listaItens.add(item1);

            System.out.println("Você deseja continuar comprando?(1 - sim/0 - não) ");
            int resposta1 = scanner.nextInt();
            resposta = resposta1;
        }

        Carrinho carrinho = new Carrinho(listaItens, 0, 0.1, 0);

        double total = carrinho.somaValores();
        carrinho.setTotalCompra(total);
        double valorT = carrinho.calcDesconto(total);
        carrinho.setValorPagar(valorT);
        carrinho.mostraCarrinho();
        System.out.println("Total da compra: " + String.format("%.2f", total));
        double descontos = carrinho.retornoDesconto(total);
        System.out.println("Descontos: " + String.format("%.2f", descontos));
        System.out.println("Total: " + String.format("%.2f", valorT));
    }
}
