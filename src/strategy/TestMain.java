package strategy;

public class TestMain {
    public static void main(String[] args) {

        Imposto iss = new ISS();
        Imposto icms = new ICMS();

        Orcamento orcamento = new Orcamento(3001);

        CalculadorDeImposto calculador = new CalculadorDeImposto();

        calculador.realizaCalculo(orcamento, iss);
        calculador.realizaCalculo(orcamento, icms);

        Imposto iccc = new ICCC();
        calculador.realizaCalculo(orcamento, iccc);
    }
}
