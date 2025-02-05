public class Pessoa{

    private String nome;
    private int idade;
    private long cpf;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getCpf() {
        return cpf;
    }
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString(){
        return "Pessoa {Nome= " + this.getNome() + ", Idade= " + this.getIdade() + ", CPF= " + this.getCpf() +"}";
    }


    public Pessoa(){
        this("", 0, 0);
    }

    public Pessoa(String nome, int idade){
        this(nome, idade, 0);
    }

    public Pessoa(String nome, int idade, long cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

}