import java.util.Scanner;

public class usotry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        try {
            System.out.print("Nos informe um número: ");
            int numero = input.nextInt();
            System.out.printf("Você digitou o número: %d %n", numero);

        } catch (Exception e) {
            System.out.println("Eita tu digitou algo que não é um número inteiro, moral!");

        } finally {
            System.out.println("Finalizando o programa...");
        }
        input.close();
    }
}
