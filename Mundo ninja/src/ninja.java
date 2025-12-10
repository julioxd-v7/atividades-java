public class ninja {
    private String nome;
    String aldeia;
    int idade = 16;


    //GETTER
    public String getNome() {

        return nome;
    }

    //SETTER
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void ataquebase() {
        System.out.println("Atacou uma Kunai");
    }
}