public class Main {
    public static void main(String[] args) {

        Empregado[] empregado = new Empregado[3];
        empregado[0] = new EmpregadoComissionado(123456, "maya", 30, 20);
        empregado[1] = new EmpregadoHorista(7891011, "grazon", 1, 6);
        empregado[2] = new EmpregadoHorista(12131415, "henriq", 20, 2);

        for(Empregado e : empregado) {
            System.out.println(e.getDados());
            System.out.println(e.calcularSalario());
            System.out.println();
        }

    }
}
