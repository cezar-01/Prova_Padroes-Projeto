public class FabricaChile implements FabricaArtefatosMatricula {

    @Override
    public DocumentoFiscal criarDocumentoFiscal(double valor) {
        return new BoletaElectronicaChile(valor);
    }

    @Override
    public Pagamento criarPagamento(double valor) {
        return new PagamentoWebpay(valor);
    }

    @Override
    public ComprovanteMatricula criarComprovante(String nomeAluno, String identificacaoAluno, String curso) {
        return new ComprovanteChile(nomeAluno, identificacaoAluno, curso);
    }
}
