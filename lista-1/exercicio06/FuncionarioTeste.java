package exercicio06;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("João", 2000);
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Salário base: " + f1.getSalarioBase());
        System.out.println("Salário: " + f1.calcularSalario());
        System.out.println("==================");

        Assistente a1 = new Assistente("Maria", 2000);
        System.out.println("Nome: " + a1.getNome());
        System.out.println("Salário base: " + a1.getSalarioBase());
        System.out.println("Salário: " + a1.calcularSalario());
        System.out.println("==================");

        Gerente g1 = new Gerente("José", 2000, 500);
        System.out.println("Nome: " + g1.getNome());
        System.out.println("Salário base: " + g1.getSalarioBase());
        System.out.println("Salário: " + g1.calcularSalario());
        System.out.println("Bônus: " + g1.getBonus());
    }
}
