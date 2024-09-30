package exercicio08;

public class ProdutoTeste {
    public static void main(String[] args) {
        Eletronico e1 = new Eletronico("Smartphone", 1000.0, 12);
        Alimento a1 = new Alimento("Arroz", 10.0, "10/10/2021");

        System.out.println("Eletronico: " + e1.getNome());
        System.out.println("Preço: " + e1.getPreco());
        System.out.println("Garantia: " + e1.getGarantia());
        System.out.println("Preço com desconto: " + e1.calcularPrecoComDesconto());
        
        System.out.println("==================");

        System.out.println("Alimento: " + a1.getNome());
        System.out.println("Preço: " + a1.getPreco());
        System.out.println("Data de validade: " + a1.getDataValidade());
        System.out.println("Preço com desconto: " + a1.calcularPrecoComDesconto());
    }
}
