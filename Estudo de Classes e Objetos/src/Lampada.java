public class Lampada {
    boolean estado;

    void ligar(){
        estado = true;
        System.out.println("Luz se acende...!");
    }

    void desligar() {
        estado = false;
        System.out.println("Luz se apaga...!");
    }

    void estado() {
        if (estado == true) {
        System.out.println("Lampada ligada!");
        } else {
            System.out.println("Lampada desligada!");
        }
    }
}
