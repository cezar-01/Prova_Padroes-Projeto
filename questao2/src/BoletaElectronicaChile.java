import java.util.Locale;

public class BoletaElectronicaChile implements DocumentoFiscal {

    private static final double ALIQUOTA_IVA = 0.19;

    private final double valor;

    public BoletaElectronicaChile(double valor) {
        this.valor = valor;
    }

    @Override
    public String descricao() {
        return String.format(Locale.forLanguageTag("es-CL"),
                "Documento fiscal: Boleta electrónica | valor CLP %.2f | IVA 19%% = CLP %.2f",
                valor, valor * ALIQUOTA_IVA);
    }
}
