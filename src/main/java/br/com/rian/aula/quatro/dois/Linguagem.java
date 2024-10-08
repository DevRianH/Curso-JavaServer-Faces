package br.com.rian.aula.quatro.dois;

public class Linguagem {

    private Integer id;
    private String nome;

    public static final Linguagem[] LINGUAGENS;

    static {
        LINGUAGENS = new Linguagem[5];
        LINGUAGENS[0] = new Linguagem(1, "java");
        LINGUAGENS[1] = new Linguagem(2, "iOS");
        LINGUAGENS[2] = new Linguagem(3, "C++");
        LINGUAGENS[3] = new Linguagem(4, "C#");
        LINGUAGENS[4] = new Linguagem(5, "PHP");
    }

    public Linguagem(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
