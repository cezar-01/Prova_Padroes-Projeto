
public interface FabricaArtefatosMatricula {

    DocumentoFiscal criarDocumentoFiscal(double valor);

    Pagamento criarPagamento(double valor);

    ComprovanteMatricula criarComprovante(String nomeAluno, String identificacaoAluno, String curso);
}
