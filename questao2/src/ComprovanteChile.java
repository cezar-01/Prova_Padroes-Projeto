public class ComprovanteChile implements ComprovanteMatricula {

    private final String nomeAluno;
    private final String rut;
    private final String curso;

    public ComprovanteChile(String nomeAluno, String rut, String curso) {
        this.nomeAluno = nomeAluno;
        this.rut = rut;
        this.curso = curso;
    }

    @Override
    public String descricao() {
        return "Comprovante de matrícula: " + nomeAluno + " | RUT " + rut + " | curso " + curso;
    }
}
