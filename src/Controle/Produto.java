package Controle;
public class Produto implements Comparable <Produto> {
    private final String codigo;
    private String descric;
    private double preco;
    private int estoq;

    public Produto(String novoCod, String novoDesc) {
        this.codigo = novoCod;
        this.descric = novoDesc;
    }

    public Produto(String novoCod) {
        this.codigo = novoCod;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public String getDescric() {
        return this.descric;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getEstoq() {
        return this.estoq;
    }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public void setEstoq(int novoEstoq) {
        this.estoq = novoEstoq;
    }

    public int compareTo(Produto comparProd) {
        int compara;
        compara = this.codigo.compareTo(comparProd.codigo);
        return compara;
    }

    public String toString() {
        return "Código: " + this.codigo + "\n" + "Descrição: " + this.descric + "\n" + "Preço: R$" + this.preco
                + "\n" + "Quantidade em estoque: " + this.estoq;
    }
}