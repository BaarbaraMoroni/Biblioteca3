package parte03;

public class CadastroAluno {
    // Atributos
    private String nome;
    private String RA; // Registro Acadêmico

    // Construtor
    public CadastroAluno(String nome, String RA) {
        this.nome = nome;
        this.RA = RA;
    }

    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRA() {
        return RA;
    }

    public void setRA(String RA) {
        this.RA = RA;
    }

    // Método para exibir informações do aluno
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("RA: " + RA);
    }
}
