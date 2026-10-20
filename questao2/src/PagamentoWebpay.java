import java.util.Locale;

public class PagamentoWebpay implements Pagamento {

    private final double valor;

    public PagamentoWebpay(double valor) {
        this.valor = valor;
    }

    @Override
    public String descricao() {
        return String.format(Locale.forLanguageTag("es-CL"),
                "Pagamento: Webpay | CLP %.2f processado", valor);
    }
}
