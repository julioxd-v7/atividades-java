public class foreach {
    public static void main(String[] args) {
        String[] nomes = {"Julio", "Nicolas", "Pedro", "Romulo", "Anthony"};
        int i = 1;
        for (String nome : nomes) {
            System.out.println("Pessoa " + i + ": " + nome);
            i++;
        }
    }

}
