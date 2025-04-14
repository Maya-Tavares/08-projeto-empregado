public class EmpregadoComissionado extends Empregado {
    double totalDeVendas;
    double comissao;

    public EmpregadoComissionado(long matricula, String nome, double comissao, double totalDeVendas) {
        // chama o construtor da superclasse
        super(matricula, nome);
        this.comissao = comissao;
        this.totalDeVendas = totalDeVendas;
    }

    public double calcularSalario() {
        return totalDeVendas * comissao / 100;
    }

    @Override
    public String getDados() {
        return super.getDados() + " --- " + comissao + " --- " + totalDeVendas ;
    }
}
