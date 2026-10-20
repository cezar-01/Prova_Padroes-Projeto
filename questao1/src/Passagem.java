import java.util.List;
import java.util.Locale;


public abstract class Passagem {

    private static final Locale PT_BR = Locale.forLanguageTag("pt-BR");

    private final String nomePassageiro;
    private final double valorTarifa;
    private double taxaEmbarque;

    protected Passagem(String nomePassageiro, double valorTarifa) {
        this.nomePassageiro = nomePassageiro;
        this.valorTarifa = valorTarifa;
    }

    public abstract String getModal();

    protected abstract double getPercentualTaxaEmbarque();

    public abstract List<String> getDocumentosExigidos();

    public double calcularTaxaEmbarque() {
        taxaEmbarque = valorTarifa * getPercentualTaxaEmbarque();
        return taxaEmbarque;
    }

    public void imprimirResumo() {
        System.out.println("===== Resumo da Passagem =====");
        System.out.println("Modal.............: " + getModal());
        System.out.println("Passageiro........: " + nomePassageiro);
        System.out.println(String.format(PT_BR, "Valor da tarifa...: R$ %.2f", valorTarifa));
        System.out.println(String.format(PT_BR, "Taxa de embarque..: R$ %.2f (%.0f%%)",
                taxaEmbarque, getPercentualTaxaEmbarque() * 100));
        System.out.println("Documentos exigidos:");
        for (String documento : getDocumentosExigidos()) {
            System.out.println("  - " + documento);
        }
        System.out.println();
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public double getValorTarifa() {
        return valorTarifa;
    }
}
