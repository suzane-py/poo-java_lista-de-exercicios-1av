package exercicio05;

public class VeiculoTeste {
    public static void main(String[] args) {
        Veiculo v1 = new Veiculo("Chevrolet", "Onix", 2021);
        v1.exibirDetalhes();
        System.out.println("==================");

        Carro c1 = new Carro("Chevrolet", "Onix", 2021, 4);
        c1.exibirDetalhes();
        System.out.println("==================");

        Moto m1 = new Moto("Honda", "CG 160", 2021, "Guidão alto");
        m1.exibirDetalhes();
    }
}
