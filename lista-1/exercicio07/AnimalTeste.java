package exercicio07;

public class AnimalTeste {
    public static void main(String[] args) {
        Animal dog1 = new Cachorro("Rex", 5);
        Animal cat1 = new Gato("Mingau", 3);

        dog1.emitirSom();
        cat1.emitirSom();
    } 
}
