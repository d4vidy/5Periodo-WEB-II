import java.util.List;
import java.util.ArrayList;

public class Disciplina{
    private String nomeDisciplina;
    private List<Aluno> alunos;
    private List<Professor> professor;

    public Disciplina(){
        this("", new ArrayList<Aluno>(), new ArrayList<Professor>());
    }

    public Disciplina(String nomeDisciplina){
        this(nomeDisciplina, new ArrayList<Aluno>(), new ArrayList<Professor>());
    }

    public Disciplina(String nomeDisciplina, List<Aluno> alunos, List<Professor> professores){
        this.nomeDisciplina = nomeDisciplina;
        this.alunos = alunos;
        this.professores = professores;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setProfessor(List<Professor> professor) {
        this.professor = professor;
    }
    public List<Professor> getProfessor() {
        return professor;
    }

    @Override
    public String toString(){
        return "Disciplina{" + getNomeDisciplina() + ", alunos = " + getAlunos() + ", professores = " + getProfessor() + "}";
    }

}
