public class usoarreys {
    public static void main(String[] args) {

        //modo1
        int[] numeros = {13, 34, 42, 91, 13};

        System.out.println("O primeiro número é: " + numeros[0]);
        System.out.println("O ultimo numero é: " + numeros[4]);
        System.out.println("O último número é: " + numeros[numeros.length - 1]);


        //modo2
        int[] numeros3 = new int[5];

        numeros3[0] = 1;
        numeros3[1] = 2;
        numeros3[2] = 3;
        numeros3[3] = 4;

        System.out.println("O segundo número é: " + numeros3[1]);

        //modo 3
        int[] numeros2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Contando: " + numeros2[i]);
        }
    }
}
