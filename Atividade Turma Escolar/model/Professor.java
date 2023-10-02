package L8.model;

public class Professor {

    private String nome;
    private String email;
    private Titulacao titulacao;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setTitulacao(Titulacao titulacao) {
        this.titulacao = titulacao;
    }

    public Titulacao getTitulacao() {
        return titulacao;
    }

}
