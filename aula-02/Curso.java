import java.util.List;
import java.util.ArrayList;

public class Curso{
    private String nomeCurso;
    private List<Disciplina> disciplinas;

    public Curso(){
        this("", new ArrayList<Disciplina>());
    }

    public Curso(String nomeCurso){
        this.nomeCurso = nomeCurso;
        this.disciplinas =  new ArrayList<Disciplina>();
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void addDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
   }

   public int cargaHorariaTotal(){
        int cargaHoraria = 0;
        for (Disciplina n : disciplinas) {
            cargaHoraria += n.getCargaHoraria();
        }
        return cargaHoraria;
   }

   @Override
   public String tosString(){
    return "Curso{ " + 
           "Nome Curso = " + getNomeCurso() + 
           "\n*** Disciplinas ***" + getDisciplinas() + 
           "}";
   }
}