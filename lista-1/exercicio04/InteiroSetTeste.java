package exercicio04;

public class InteiroSetTeste {
    public static void main(String[] args) {
        InteiroSet conjunto1 = new InteiroSet();
        InteiroSet conjunto2 = new InteiroSet();

        conjunto1.insereElemento(1);
        conjunto1.insereElemento(3);
        conjunto1.insereElemento(5);

        conjunto2.insereElemento(3);
        conjunto2.insereElemento(4);
        conjunto2.insereElemento(5);

        InteiroSet uniao = conjunto1.union(conjunto2);
        System.out.println("União: " + uniao.toSetString());

        InteiroSet intersecao = conjunto1.intersecao(conjunto2);
        System.out.println("Interseção: " + intersecao.toSetString());

        boolean saoIguais = conjunto1.ehIgualTo(conjunto2);
        System.out.println("Conjuntos são iguais? " + saoIguais);
    }
}