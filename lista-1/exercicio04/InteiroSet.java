package exercicio04;

public class InteiroSet {
    private boolean[] conjunto;

    public InteiroSet() {
        conjunto = new boolean[101];
    }

    public InteiroSet union(InteiroSet outroConjunto) {
        InteiroSet resultado = new InteiroSet();
        for (int i = 0; i < conjunto.length; i++) {
            resultado.conjunto[i] = this.conjunto[i] || outroConjunto.conjunto[i];
        }
        return resultado;
    }

    public InteiroSet intersecao(InteiroSet outroConjunto) {
        InteiroSet resultado = new InteiroSet();
        for (int i = 0; i < conjunto.length; i++) {
            resultado.conjunto[i] = this.conjunto[i] && outroConjunto.conjunto[i];
        }
        return resultado;
    }

    public void insereElemento(int k) {
        if (k >= 0 && k <= 100) {
            conjunto[k] = true;
        }
    }

    public void deleteElemento(int m) {
        if (m >= 0 && m <= 100) {
            conjunto[m] = false;
        }
    }

    public String toSetString() {
        StringBuilder sb = new StringBuilder();
        boolean vazio = true;
        for (int i = 0; i < conjunto.length; i++) {
            if (conjunto[i]) {
                sb.append(i).append(" ");
                vazio = false;
            }
        }
        return vazio ? "-" : sb.toString().trim();
    }

    public boolean ehIgualTo(InteiroSet outroConjunto) {
        for (int i = 0; i < conjunto.length; i++) {
            if (this.conjunto[i] != outroConjunto.conjunto[i]) {
                return false;
            }
        }
        return true;
    }
}

