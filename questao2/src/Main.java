public class Main {

    public static void main(String[] args) {
        Matricula matriculaBrasil = new Matricula(new FabricaBrasil(),
                "João Silva", "123.456.789-00", "Padrões de Projetos em Java", 500.00);
        matriculaBrasil.confirmar();

        Matricula matriculaChile = new Matricula(new FabricaChile(),
                "María González", "12.345.678-5", "Padrões de Projetos em Java", 95000.00);
        matriculaChile.confirmar();
    }
}
