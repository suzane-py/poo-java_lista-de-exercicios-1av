package exercicio02;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado e1 = new Empregado("João", "Silva", 1000.0);
        System.out.println("Nome: " + e1.getNome());
        System.out.println("Sobrenome: " + e1.getSobrenome());
        System.out.println("Salário mensal: " + e1.getSalarioMensal());
        System.out.println("Salário anual: " + e1.getSalarioAnual());

        double aumentoSalarial1 = e1.getSalarioMensal()*0.1;
        e1.setSalarioMensal(e1.getSalarioMensal() + aumentoSalarial1);

        System.out.println("Salário mensal após aumento de 10%: " + e1.getSalarioMensal());
        System.out.println("====================");

        Empregado e2 = new Empregado("Maria", "Santos", 2000.0);
        System.out.println("Nome: " + e2.getNome());
        System.out.println("Sobrenome: " + e2.getSobrenome());
        System.out.println("Salário mensal: " + e2.getSalarioMensal());
        System.out.println("Salário anual: " + e2.getSalarioAnual());

        double aumentoSalarial2 = e2.getSalarioMensal()*0.1;
        e2.setSalarioMensal(e2.getSalarioMensal() + aumentoSalarial2);

        System.out.println("Salário mensal após aumento de 10%: " + e2.getSalarioMensal());

    }
}
