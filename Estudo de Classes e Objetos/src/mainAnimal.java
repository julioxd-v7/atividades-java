public class mainAnimal {
    public static void main(String[]args) {
        Animal ani1 = new Animal();
        ani1.nome = "Vaquinha Mocó";
        ani1.tipo = "Vaca";
        ani1.som = "MOoo!";

        Animal ani2 = new Animal();
        ani2.nome = "Macaquinho Pedro";
        ani2.tipo = "Macaco";
        ani2.som = "UinA A A A!";

        Animal ani3 = new Animal();
        ani3.nome = "Cabritinha Malu";
        ani3.tipo = "Cabra";
        ani3.som = "Béééééé!";

        ani1.fazerSom();
        System.out.println();
        ani2.fazerSom();
        System.out.println();
        ani3.fazerSom();
    }
}
