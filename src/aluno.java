public class aluno {
    private String nome;
    private int idade;
    private String matricula;

    public aluno(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "Nome='" + nome + '\'' +
                ", Idade=" + idade +
                ", Matrícula='" + matricula + '\'' +
                '}';
    }
}
