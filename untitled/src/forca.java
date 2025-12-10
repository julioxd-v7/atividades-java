import java.util.Scanner;
import java.util.Random;

public class forca {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random rand = new Random();

        String[] palavras = {"abacaxi", "carrossel", "cadeira"};
        String palavraSurpresa = palavras[rand.nextInt(palavras.length)];

        System.out.println("Iniciando o Jogo da Forca");
        if (palavraSurpresa == "abacaxi") {
            System.out.println("Dica da palavra: É uma fruta!");
            String palavraFruta = input.nextLine();
            if(palavraFruta == "abacaxi") {
                System.out.println("Parabéns você Acertou!");
            } else {
                System.out.println("Você errou tente novamente!");
            }
        } else if (palavraSurpresa == "carrossel") {
            System.out.println("Dica da palavra: Brinquedo do parque de diversões!");
            String palavraBrinquedo = input.nextLine();
            if(palavraBrinquedo == "carrossel") {
                System.out.println("Parabéns você Acertou!");
            } else {
                System.out.println("Você errou tente novamente!");
            }
        } else if (palavraSurpresa == "cadeira") {
            System.out.println("Dica da palavra: Lugar usado para sentar!");
            String palavraAssento = input.nextLine();
            if(palavraAssento == "cadeira") {
                System.out.println("Parabéns você Acertou!");
            } else {
                System.out.println("Você errou tente novamente!");
            }
        }
    }
}
