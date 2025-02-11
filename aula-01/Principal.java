public class Principal{

    public static void main(String args[]){

        /*Pessoa objPessoa = new Pessoa();
        System.out.println(objPessoa.toString());

        Pessoa objPessoa2 = new Pessoa("Rafael", 34);
        System.out.println(objPessoa2.toString());

        Pessoa objPessoa3 = new Pessoa("Gabriel", 27, 10000000001L);
        System.out.println(objPessoa3.toString());*/

        Aluno aluno1 = new Aluno("David", 20, 12345678901l, 1001);
        System.out.println(aluno1.toString());

        Professor professor1 = new Professor("Junior", 37, 12345678801l, 7);
        System.out.println(professor1.toString());

        Aluno aluno2 = new Aluno("Lucas", 20, 12345678991l, 5001);
        System.out.println(aluno2.toString());

        Professor professor2 = new Professor("Jefersson", 33, 12345678301l, 9);
        System.out.println(professor2.toString());

        Disciplina disciplina = new Disciplina("Web II");
        System.out.println(disciplina.toString());

        disciplina.addAluno(aluno1);
        disciplina.addAluno(aluno2);

        disciplina.addProfessor(professor);
    }
}