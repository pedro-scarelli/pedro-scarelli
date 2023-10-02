package L8.model;

import L8.model.Professor;
import L8.model.Aluno;
import java.util.ArrayList;

public class Turma {

    private Professor professor;
    private Turno turno;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private String disciplina;

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
    public Turno getTurno(){
        return turno;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void incluirAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerAluno(Aluno aluno) {
        alunos.remove(aluno);
    }

    public Professor getProfessor() {
        return professor;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public Aluno obterAlunoMelhorNotaEnem() {
        if (getAlunos().size() == 0){
            return null;
        }else{
            Aluno alunoMelhorNota = getAlunos().get(0);
        for (Aluno i : alunos) {
            if (i.getNotaEnem() > alunoMelhorNota.getNotaEnem()) {
                alunoMelhorNota = i;     }
        }
        return alunoMelhorNota;
        
       
        }
    }
}
