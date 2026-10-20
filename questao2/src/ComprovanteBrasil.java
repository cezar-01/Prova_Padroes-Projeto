public class ComprovanteBrasil implements ComprovanteMatricula {

    private final String nomeAluno;
    private final String cpf;
    private final String curso;

    public ComprovanteBrasil(String nomeAluno, String cpf, String curso) {
        this.nomeAluno = nomeAluno;
        this.cpf = cpf;
        this.curso = curso;
    }

    @Override
    public String descricao() {
        return "Comprovante de matrícula: " + nomeAluno + " | CPF " + cpf + " | curso " + curso;
    }
}
