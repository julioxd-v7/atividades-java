public class uchiha extends ninja{
    public static void SharinganAtivado(String[] args) {
        String niveldosharingan = "Sharingan Nivel 2";

        System.out.println("Sharingan Ativado");
    }

    @Override
    public void ataquebase() {
        System.out.println("Atacou uma Kunai de FOGO");
    }

    public void ataquebase(int nivelchacra) {
        if (nivelchacra > 2) {
            System.out.println("Ativei o Susannoo");
        } else if (nivelchacra > 1) {
            System.out.println("So consegui ativar o sharingan.");
        } else {
            System.out.println("Droga estou sem chacra");
        }
    }
}
