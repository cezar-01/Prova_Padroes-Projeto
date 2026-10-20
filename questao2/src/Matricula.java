
public class Matricula {

    private final FabricaArtefatosMatricula fabrica;
    private final String nomeAluno;
    private final String identificacaoAluno;
    private final String curso;
    private final double valor;

    private DocumentoFiscal documentoFiscal;
    private Pagamento pagamento;
    private ComprovanteMatricula comprovante;

    public Matricula(FabricaArtefatosMatricula fabrica, String nomeAluno,
                     String identificacaoAluno, String curso, double valor) {
        this.fabrica = fabrica;
        this.nomeAluno = nomeAluno;
        this.identificacaoAluno = identificacaoAluno;
        this.curso = curso;
        this.valor = valor;
    }

    public void confirmar() {
        documentoFiscal = fabrica.criarDocumentoFiscal(valor);
        pagamento = fabrica.criarPagamento(valor);
        comprovante = fabrica.criarComprovante(nomeAluno, identificacaoAluno, curso);
        imprimirRelatorio();
    }

    private void imprimirRelatorio() {
        System.out.println("===== Relatorio da Matricula =====");
        System.out.println(documentoFiscal.descricao());
        System.out.println(pagamento.descricao());
        System.out.println(comprovante.descricao());
        System.out.println();
    }
}
