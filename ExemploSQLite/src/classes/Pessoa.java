package classes;

public class Pessoa {
    private int id;
    private int idade;
    private String nome;

    //Construtor vazio
    public Pessoa() {

    }

    //Contrutor 2
    public Pessoa(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    /**
     * @return the idade
     */
    public int getId() {
        return id;
    }

    /**
     * @param idade the idade to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}