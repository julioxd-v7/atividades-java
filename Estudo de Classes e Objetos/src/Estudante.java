public class Estudante {

    String nome;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double total;

    void media() {
        total = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Sua média foi: " + total);
    }
    void status() {
         if (total >= 7) {
             System.out.println("Aluno Aprovado");
         } else {
             System.out.println("Aluno Reprovado");
         }
    }
}
