public class mainProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "sabão";
        produto1.preco = 2.30;
        produto1.quantidade = 3;

        Produto produto2 = new Produto();
        produto2.nome = "Pão";
        produto2.preco = 0.75;
        produto2.quantidade = 8;

        Produto produto3 = new Produto();
        produto3.nome = "biscoito";
        produto3.preco = 1.89;
        produto3.quantidade = 4;

        produto1.CalcularTotal();
        produto2.CalcularTotal();
        produto3.CalcularTotal();

        System.out.printf("---CAIXA---%nProduto: %s%n Valor:d R$ %.2f%n Quantidade: %d%n VALOR TOTAL: %.2f%n%n", produto1.nome, produto1.preco, produto1.quantidade, produto1.total);
        System.out.printf("---CAIXA---%nProduto: %s%n Valor: R$ %.2f%n Quantidade: %d%n VALOR TOTAL: %.2f%n%n", produto2.nome, produto2.preco, produto2.quantidade, produto2.total);
        System.out.printf("---CAIXA---%nProduto: %s%n Valor: R$ %.2f%n Quantidade: %d%n VALOR TOTAL: %.2f%n%n", produto3.nome, produto3.preco, produto3.quantidade, produto3.total);
    }
}
