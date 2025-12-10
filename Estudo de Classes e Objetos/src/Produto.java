public class Produto {
    String nome;
    double preco;
    int quantidade;
    double total;

    void CalcularTotal() {
        total = preco * quantidade;
    }
}
