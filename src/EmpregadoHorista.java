public class EmpregadoHorista extends Empregado {
    int totalDeHorasTrabalhadas;
    double valorDaHoraTrabalhada;

    public EmpregadoHorista(long matricula, String nome, double valorDaHoraTrabalhada, int totalDeHorasTrabalhadas) {
        super(matricula, nome);
        this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
        this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
    }

    public double calcularSalario() {
        return totalDeHorasTrabalhadas * valorDaHoraTrabalhada;
    }

    @Override
    public String getDados() {
        return super.getDados() + " -- R$ " + valorDaHoraTrabalhada + " por " + totalDeHorasTrabalhadas + "h trabalhadas." ;
    }
}
