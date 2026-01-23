package sistema.Principal;

public class Produto {
    private int id;
    private String name;
    private double precoCompra;
    private double precoVenda;
    private double quantidade;
    private double quantidadeComprada;
    private double quantidadeRetirada;
    private boolean estoqueSuficiente;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setPrecoCompra(double precoCompra){
        this.precoCompra = precoCompra;
    }
    public double getPrecoCompra(){
        return precoCompra;
    }

    public void setPrecoVenda(double precoVenda){
        this.precoVenda = precoVenda;
    }
    public double getPrecoVenda(){
        return precoVenda;
    }

    public void setQuantidadeComprada(double quantidadeComprada){
        this.quantidadeComprada = quantidadeComprada;
    }
    public double getQuantidadeComprada(){
        return quantidadeComprada;
    }

    public void setQuantidadeRetirada(double quantidadeRetirada){
        this.quantidadeRetirada = quantidadeRetirada;
    }
    public double getQuantidadeRetirada(){
        return quantidadeRetirada;
    }

    public void setQuantidade(double quantidade){
        this.quantidade = quantidade;
    }
    public double getQuantidade(){
        return quantidade;
    }
    
    public void setEstoqueSuficiente(boolean estoqueSuficiente){
        this.estoqueSuficiente = estoqueSuficiente;
    }
    public boolean getEstoqueSuficiente(){
        return estoqueSuficiente;
    }

    public Produto(int id, String name){
        this.id = id;
        this.name = name;
    }

    /* Construtor utilizado para dar entrada no produto */

    /* Construtor utilizado para dar entrada no produto */

    public Produto(){}
}
