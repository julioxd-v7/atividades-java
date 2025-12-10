import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();
        input.nextLine();

        System.out.print("Nos infome seu cargo: ");
        String cargo = input.nextLine();


        System.out.print("Olá " + nome + ", você possui " + idade + " e o seu cargo é de " + cargo);
    }

}
