import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "Júlio Vinícius";
        String tipoConta = "Corrente";
        double saldo = 2500;
        int operacao;
        double valorR;
        double valorT;
        System.out.printf(
                "******************************************************%n%n" +
                "Nome:                          %s%n" +
                "Tipo de Conta:                 %s%n" +
                "Saldo Inicial:                 R$ %.2f%n%n%n" +
                "******************************************************%n%n" +
                "Operações%n%n" +
                "1- Consultar Saldos%n" +
                "2- Receber Valor%n" +
                "3- Transferir Valor%n" +
                "4- Sair%n%n" +
                ""
                ,nome, tipoConta, saldo        );
        operacao = sc.nextInt();

        while(operacao != 4){
            switch (operacao) {
                case 1:
                    System.out.printf(
                            "Saldo: R$ %.2f%n%n" +
                                    "Operações%n%n" +
                                    "1- Consultar Saldos%n" +
                                    "2- Receber Valor%n" +
                                    "3- Transferir Valor%n" +
                                    "4- Sair%n%n"
                            , saldo);
                    operacao = sc.nextInt();
                    break;
                case 2:
                    System.out.printf("Quanto você deseja receber? :  %n");
                    valorR = sc.nextDouble();
                    if(valorR <= 0){
                        System.out.printf("Valor inválido! Digite um valor positivo." +
                                "Operações%n%n" +
                                "1- Consultar Saldos%n" +
                                "2- Receber Valor%n" +
                                "3- Transferir Valor%n" +
                                "4- Sair%n%n");
                        operacao = sc.nextInt();
                    } else {
                        saldo = valorR + saldo;
                        System.out.printf("Saldo: R$ %.2f%n%n" +
                                "Operações%n%n" +
                                "1- Consultar Saldos%n" +
                                "2- Receber Valor%n" +
                                "3- Transferir Valor%n" +
                                "4- Sair%n%n", saldo);
                        operacao = sc.nextInt();
                    }
                    break;
                case 3:
                    System.out.printf("Saldo:       R$ %.2f%n" +
                            "Quanto você deseja transferir? :  %n", saldo);
                    valorT = sc.nextDouble();

                if (valorT <= 0){
                    System.out.printf("Valor inválido! Digite um valor maior que 0" +
                            "Operações%n%n" +
                            "1- Consultar Saldos%n" +
                            "2- Receber Valor%n" +
                            "3- Transferir Valor%n" +
                            "4- Sair%n%n");
                    operacao = sc.nextInt();
                }  else if (valorT > saldo) {

                        System.out.printf(
                                "Saldo insuficiente!. . . Tente novamente!. . .%n" +
                                        "Operações%n%n" +
                                        "1- Consultar Saldos%n" +
                                        "2- Receber Valor%n" +
                                        "3- Transferir Valor%n" +
                                        "4- Sair%n%n");
                        operacao = sc.nextInt();

                    } else {
                        saldo -= valorT;
                        System.out.printf("Transferencia de %.2f efetuada. . .%n%n" +
                                        "Saldo em conta:         %.2f%n%n" +
                                        "Operações%n%n" +
                                        "1- Consultar Saldos%n" +
                                        "2- Receber Valor%n" +
                                        "3- Transferir Valor%n" +
                                        "4- Sair%n%n"
                                , valorT, saldo);

                        operacao = sc.nextInt();

                    }
                    break;
                case 4:
                    System.out.println("Saindo do Sistema. . ." +
                            "******************************************************");
                default:
                    break;

            }


        }
        sc.close();
    }
}
