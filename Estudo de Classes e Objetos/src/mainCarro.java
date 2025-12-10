public class mainCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.ano = 2021;
        carro1.cor = "Azul";
        carro1.marca = "Fiat";
        carro1.modelo = "Renault";

        System.out.println("Marca: " + carro1.marca + " Modelo: " + carro1.modelo + " Idade: " + carro1.ano + " Cor: " + carro1.cor);
        carro1.LigarCarro();
    }
}
