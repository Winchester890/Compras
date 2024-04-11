import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Retorno {

    Produto p1 = new Produto(12345l, "Tesoura Molin 17cm Blue", 25.67);
    Produto p2 = new Produto(67890l, "Conjunto Geométrico Super Molin C/4", 17.89);
    Produto p3 = new Produto(564678l, "Caderno Universitario Espiral 200 folhas FLS", 32.11);
    Produto p4 = new Produto(10000l, "Caneta Escreve e Apaga Frixion 0,7mm", 15.90);
    Produto p5 = new Produto(20000l, "Bloco Autoadesivo Post - it amarelo", 28.80);
    Produto p6 = new Produto(30000l, "Caderno executivo 96fl Viva rosa", 35.30);
    Produto p7 = new Produto(40000l, "Borracha técnica Dust Free Faber", 6.60);
    Produto p8 = new Produto(50000l, "Cola em bastão 20g Pritt grande", 11.20);
    Produto p9 = new Produto(60000l, "Estojo Escolar PVC Preto / branco", 59.90);
    Produto p10 = new Produto(70000l, "Lápis de Cor Aquarelável 24 Cores", 54.40);
    Produto p11 = new Produto(80000l, "Lapiseira 0.7mm Azul + Tubo Grafite", 28.60);
    Produto p12 = new Produto(90000l, "Pincel marca texto amarelo Oval", 2.60);
    Produto p13 = new Produto(11111l, "Caneta Esfereográfica BIC Cristal", 15.10);
    Produto p14 = new Produto(22222l, "Papel Sufite Chamequinho A4 75g", 9.40);
    Produto p15 = new Produto(33333l, "Bloco de Desenho A4 branco 180g Canson", 12.00);
    Produto p16 = new Produto(44444l, "Apontador Croquicroqui Sapo com depósito", 10.70);
    Produto p17 = new Produto(55555l, "Caderno universitário rapadura 96fl", 9.50);
    Produto p18 = new Produto(66666l, "Tesoura Sensoft 3D para canhoto", 14.90);
    Produto p19 = new Produto(77777l, "Massa p/ modelar 180g c/ 12 cores", 5.60);
    Produto p20 = new Produto(88888l, "Giz de cera 12 cores gizão Acrelex", 9.90);

    List<Produto> produtos = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20));

    public Produto getProdutoByCodigo(Long codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo().equals(codigo)) {
                return produto;
            }
        }
        System.out.println("Produto com o código não encontrado!");
        return null;
    }
}
