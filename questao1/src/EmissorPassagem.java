
public abstract class EmissorPassagem {

    protected abstract Passagem criarPassagem(String nomePassageiro, double valorTarifa);

    public final Passagem emitir(String nomePassageiro, double valorTarifa) {
        Passagem passagem = criarPassagem(nomePassageiro, valorTarifa);
        passagem.calcularTaxaEmbarque();
        passagem.imprimirResumo();
        return passagem;
    }
}
