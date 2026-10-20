import java.util.List;

public class PassagemRodoviaria extends Passagem {

    public PassagemRodoviaria(String nomePassageiro, double valorTarifa) {
        super(nomePassageiro, valorTarifa);
    }

    @Override
    public String getModal() {
        return "Rodoviário";
    }

    @Override
    protected double getPercentualTaxaEmbarque() {
        return 0.03;
    }

    @Override
    public List<String> getDocumentosExigidos() {
        return List.of("Documento de identidade com foto");
    }
}
