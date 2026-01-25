package sistema.Principal;

public class Produto {

    private int id;
    private String name;
    private boolean situacao;
    private double precoCompra;
    private double precoVenda;
    private double porcentagem;
    private double quantidade;
    private double quantidadeComprada;
    private double quantidadeRetirada;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPorcentagem(double porcentagem){
        this.porcentagem = porcentagem;
    }
    public double getPorcentagem(){
        return porcentagem;
    }

    public void setQuantidadeComprada(double quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public double getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeRetirada(double quantidadeRetirada) {
        this.quantidadeRetirada = quantidadeRetirada;
    }

    public double getQuantidadeRetirada() {
        return quantidadeRetirada;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public boolean getSituacao() {
        return situacao;
    }

    public Produto(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Produto() {
    }
}
