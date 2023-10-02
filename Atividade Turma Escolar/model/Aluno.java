package L8.model;

public class Aluno {
    
    private int matricula;
    private String nome;
    private double notaEnem;

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotaEnem(double notaEnem) {
        this.notaEnem = notaEnem;
    }
    
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getNotaEnem() {
        return notaEnem;
    }
    
    
}
