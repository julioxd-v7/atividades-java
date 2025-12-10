public class mainEstudante {
    public static void main(String[] args) {

        Estudante aluno1 = new Estudante();
        aluno1.nome = "José";
        aluno1.nota1 = 7;
        aluno1.nota2 = 5;
        aluno1.nota3 = 3;
        aluno1.nota4 = 10;

        Estudante aluno2 = new Estudante();
        aluno2.nome = "Franciane";
        aluno2.nota1 = 9;
        aluno2.nota2 = 6;
        aluno2.nota3 = 8;
        aluno2.nota4 = 10;

        Estudante aluno3 = new Estudante();
        aluno3.nome = "Peter";
        aluno3.nota1 = 6;
        aluno3.nota2 = 5;
        aluno3.nota3 = 4;
        aluno3.nota4 = 8;

        aluno1.media();
        aluno1.status();

        System.out.println();

        aluno2.media();
        aluno2.status();

        System.out.println();

        aluno3.media();
        aluno3.status();
    }
}
