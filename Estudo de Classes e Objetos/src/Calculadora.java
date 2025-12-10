public class Calculadora {
    double a;
    double b;

    void somar() {
        double resultado = a + b;
        System.out.printf("A Soma: %.2f%n", resultado);
    }

    void subtrair() {
        double resultado = a - b;
        System.out.printf("A Subtração: %.2f%n", resultado);
    }

    void multiplicar() {
        double resultado = a * b;
        System.out.printf("A Multiplicação: %.2f%n", resultado);
    }

    void dividir() {
        if (b != 0) {
            double resultado = a / b;
            System.out.printf("A Divisão: %.2f%n", resultado);
        } else {
            System.out.println("Erro: Divisão por zero não é permitida!");
        }
    }
}

