package exercicio01;

public class Fatura {
    private String codigoProduto;
    private String descricaoProduto;
    private int quantidadeComprada;
    private double precoPorItem;

    public Fatura(String codigoProduto, String descricaoProduto, int quantidadeComprada, double precoPorItem) {
        this.codigoProduto = codigoProduto;
        this.descricaoProduto = descricaoProduto;
        this.quantidadeComprada = quantidadeComprada;
        this.precoPorItem = precoPorItem;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        this.precoPorItem = precoPorItem;
    }

    public double getTotalFatura() {
        if (quantidadeComprada < 0 && precoPorItem < 0) {
            quantidadeComprada = 0;
            precoPorItem = 0.0;
        }
        return quantidadeComprada*precoPorItem;
    }
}
