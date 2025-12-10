public class uzumaki extends ninja{

    boolean temBiju;

    public static void chacrainfinito(String[] args) {
        System.out.println("Voce tem chacra infinito");
    }

    @Override
    public void ataquebase() {
        System.out.println("Atacou uma Kunai de VENTO");
    }

    public void ataquebase(int nivelchacra) {
        if (nivelchacra > 2) {
            System.out.println("Ativei o modo Kurama");
        } else if (nivelchacra >= 1) {
            System.out.println("RAZENGANN!!!");
        } else {
            System.out.println("Puxa vida estou sem chacra");
        }
    }
}
