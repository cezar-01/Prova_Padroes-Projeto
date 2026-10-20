import java.util.Locale;

public class NfsBrasil implements DocumentoFiscal {

    private static final double ALIQUOTA_ISS = 0.05;

    private final double valor;

    public NfsBrasil(double valor) {
        this.valor = valor;
    }

    @Override
    public String descricao() {
        return String.format(Locale.forLanguageTag("pt-BR"),
                "Documento fiscal: NFS-e | valor R$ %.2f | ISS 5%% = R$ %.2f",
                valor, valor * ALIQUOTA_ISS);
    }
}
