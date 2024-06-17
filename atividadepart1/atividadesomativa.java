import java.util.ArrayList;

class Financiamento {
    private double valorImovel;
    private double valorFinanciamento;

    public Financiamento(double valorImovel, double valorFinanciamento) {
        this.valorImovel = valorImovel;
        this.valorFinanciamento = valorFinanciamento;
    }

    public double getValorImovel() {
        return valorImovel;
    }

    public double getValorFinanciamento() {
        return valorFinanciamento;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Financiamento> financiamentos = new ArrayList<>();

        financiamentos.add(new Financiamento(200000, 220000));
        financiamentos.add(new Financiamento(300000, 380000));
        financiamentos.add(new Financiamento(150000, 155000));
        financiamentos.add(new Financiamento(250000, 275000));

        double totalImoveis = 0;
        double totalFinanciamentos = 0;

        for (int i = 0; i < financiamentos.size(); i++) {
            Financiamento financiamento = financiamentos.get(i);
            totalImoveis += financiamento.getValorImovel();
            totalFinanciamentos += financiamento.getValorFinanciamento();

            System.out.println("Financiamento " + (i + 1) + " - valor do imóvel: R$ " + financiamento.getValorImovel() +
                    ", valor do financiamento: R$ " + financiamento.getValorFinanciamento() + ".");
        }

        System.out.println("Total de todos os imóveis: R$ " + totalImoveis + ", total de todos os financiamentos: R$ " + totalFinanciamentos + ".");
    }
}