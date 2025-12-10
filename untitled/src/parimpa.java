import java.util.Scanner;

public class parimpa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = input.nextInt();

        if (valor % 2 == 0) {
            System.out.println("O valor é par.");
        } else {
            System.out.println("O valor é ímpar.");
        }

        input.close();
    }
}

