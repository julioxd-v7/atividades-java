public class Animal {
    String nome;
    String tipo;
    String som;

    void fazerSom(){
        System.out.printf("O animal %s, %s fez barulho: %s!", tipo, nome, som);
    }
}
