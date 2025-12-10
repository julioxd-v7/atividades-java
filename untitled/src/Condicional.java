import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        if (idade >= 18 && idade <= 100) {
            System.out.println("Olá " + nome + " Você é de maior, e possui " + idade + " anos.");
        }else if (idade >= 100) {
            System.out.println("Caramba " + nome + "Você ja ta com umn pé na cova, você tem " + idade + " anos!!!");
        }else {
            System.out.println("Perdão " + nome + " mas Você é de menor ainda... é necessário ter idade minima de 18 anos e você tem somente " + idade + " anos.");
        }
    }
}
