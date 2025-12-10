import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("BEM VINDO A CALCULADORA");
        System.out.println("Nos informe um número: ");
        int n1 = input.nextInt();
        System.out.println("Nos informe mais um número: ");
        int n2 = input.nextInt();
        System.out.printf("Nos informe o método de equação para utilizar na calculador com os seguintes números: %d e %d %n Selecione: %n 1 > Soma %n 2 > Subtração %n 3 > Multiplicação %n 4 > Divisão %n  ", n1, n2);
        int metodo = input.nextInt();

        if (metodo == 1) {
            int Soma = n1 + n2;
            System.out.printf("A Soma dos números %d e %d é: %d %n ", n1, n2, Soma);

        } else if (metodo == 2) {
            int Subtracao = n1 - n2;
            System.out.printf("A Subtração dos números %d e %d é: %d %n ", n1, n2, Subtracao);

        } else if (metodo == 3) {
            int Multiplicacao = n1 * n2;
            System.out.printf("A Multiplicação dos números %d e %d é: %d %n ", n1, n2, Multiplicacao);

        } else if (metodo == 4) {
            if (n2 != 0) {
                int Divisao = n1 / n2;
                System.out.printf("A Divisão dos números %d e %d é: %d %n ", n1, n2, Divisao);
            } else {
                System.out.println("Não é póssivel dividir por 0!");
            }
        } else {
            System.out.println("Seleção não encontrada!");
        }
        input.close();
    }
}
