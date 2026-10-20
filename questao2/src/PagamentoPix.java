import java.util.Locale;

public class PagamentoPix implements Pagamento {

    private final double valor;

    public PagamentoPix(double valor) {
        this.valor = valor;
    }

    @Override
    public String descricao() {
        return String.format(Locale.forLanguageTag("pt-BR"),
                "Pagamento: Pix | R$ %.2f processado", valor);
    }
}
