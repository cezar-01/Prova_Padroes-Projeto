import java.util.List;

public class PassagemAerea extends Passagem {

    public PassagemAerea(String nomePassageiro, double valorTarifa) {
        super(nomePassageiro, valorTarifa);
    }

    @Override
    public String getModal() {
        return "Aéreo";
    }

    @Override
    protected double getPercentualTaxaEmbarque() {
        return 0.08;
    }

    @Override
    public List<String> getDocumentosExigidos() {
        return List.of("Documento de identidade com foto", "Bilhete eletrônico (e-ticket)");
    }
}
