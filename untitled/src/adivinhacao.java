import java.util.Scanner;
import java.util.Random;

public class adivinhacao {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int numeroSecret = rand.nextInt(10) + 1;
        int palpite;
        int tentativa = 3;

        System.out.println("Tente Adivinhar o número de 0 a 10");

        do {
            System.out.println("Digite seu palpite: ");
            palpite = input.nextInt();

            if (palpite > numeroSecret) {
                System.out.printf("O número é menor! Tentativas restantes: %d %n", --tentativa);

                if (tentativa == 0) {
                    System.out.println("Fim de jogo! XXX");
                    break;
                }else if (tentativa == 1) {
                    System.out.println("Só resta 1");
                } else {
                    System.out.println("Tente novamente!");
                }

            } else if (palpite < numeroSecret) {
                System.out.printf("O número é maior! Tentativas restantes: %d %n", --tentativa);

                if (tentativa == 0) {
                    System.out.println("Fim de jogo! XXX");
                    break;
                }else if (tentativa == 1) {
                    System.out.println("Só resta 1");
                } else {
                    System.out.println("Tente novamente!");
                }

            } else {
                System.out.printf("Parabéns você acertou! %d", numeroSecret);
            }
        } while (palpite != numeroSecret);

        input.close();
    }
}
