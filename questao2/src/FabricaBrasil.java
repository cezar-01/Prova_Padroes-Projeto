public class FabricaBrasil implements FabricaArtefatosMatricula {

    @Override
    public DocumentoFiscal criarDocumentoFiscal(double valor) {
        return new NfsBrasil(valor);
    }

    @Override
    public Pagamento criarPagamento(double valor) {
        return new PagamentoPix(valor);
    }

    @Override
    public ComprovanteMatricula criarComprovante(String nomeAluno, String identificacaoAluno, String curso) {
        return new ComprovanteBrasil(nomeAluno, identificacaoAluno, curso);
    }
}
