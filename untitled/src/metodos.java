public class metodos {
    static void Ola() {
        System.out.println("Oi!");
    }

    static void Ola(String nome) {
        System.out.println("Oi, " + nome + "!");
    }
    public static void main(String[] args) {
        Ola(); //chamando o método
        Ola("Julinho");
    }
}