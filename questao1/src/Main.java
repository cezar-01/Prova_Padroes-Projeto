
public class Main {

    public static void main(String[] args) {
        EmissorPassagem emissorAereo = new EmissorPassagemAerea();
        EmissorPassagem emissorRodoviario = new EmissorPassagemRodoviaria();
        EmissorPassagem emissorFerroviario = new EmissorPassagemFerroviaria();

        emissorAereo.emitir("Ana Souza", 1200.00);
        emissorRodoviario.emitir("Bruno Lima", 150.00);
        emissorFerroviario.emitir("Carla Mendes", 300.00);
    }
}
