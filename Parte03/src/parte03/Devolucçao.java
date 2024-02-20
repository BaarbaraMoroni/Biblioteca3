import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Devolucao {
    // Atributos
    private LocalDate dataDevolucao;
    private double valorTotal;
    private double multa;
    private int atraso;

    // Construtor
    public Devolucao(LocalDate dataDevolucao, double valorTotal) {
        this.dataDevolucao = dataDevolucao;
        this.valorTotal = valorTotal;
        this.multa = 0.0;
        this.atraso = 0;
    }

    // Métodos Getters e Setters
    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getMulta() {
        return multa;
    }

    public int getAtraso() {
        return atraso;
    }

    // Método para calcular a multa com base na quantidade de dias de atraso
    public void calcularMulta(LocalDate dataPrevistaDevolucao) {
        long diasAtraso = ChronoUnit.DAYS.between(dataPrevistaDevolucao, dataDevolucao);
        if (diasAtraso > 0) {
            this.atraso = (int) diasAtraso;
            this.multa = diasAtraso * 0.50; // Exemplo: multa de R$0,50 por dia de atraso
        }
    }

    // Método para verificar se houve atraso na devolução
    public boolean verificarAtraso(LocalDate dataPrevistaDevolucao) {
        return dataDevolucao.isAfter(dataPrevistaDevolucao);
    }
}
