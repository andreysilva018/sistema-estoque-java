package sistema.Principal.Compras;

import java.util.Scanner;
import java.util.ArrayList;


import sistema.Principal.Erros;
import sistema.Principal.Estoque;
import sistema.Principal.Produto;

public class PedidoCompra {

    private int idPed;
    private String status;
    private boolean valorPedido;

    public void setIdPed(int idPed) {
        this.idPed = idPed;
    }

    public int getIdPed() {
        return idPed;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setValorPedido(boolean valorPedido) {
        this.valorPedido = valorPedido;
    }

    public boolean getValorPedido() {
        return valorPedido;
    }

    private ArrayList<Produto> produtos = new ArrayList<>();

    public void Pedido() {
        Scanner sc = new Scanner(System.in);
        setStatus("aberto");
        System.out.println("Situação do pedido: " + getStatus());
                
        System.out.println("Inserir o código do produto que deseja comprar");
        int codigo = sc.nextInt();
        new Estoque().buscarProduto(codigo);
        if(codigo == )){
            System.out.println("Dexrição do produto: " + p.getName());
            System.out.println("\nEntre com o preço de compra");
            double precoCompra = sc.nextDouble();
            if(precoCompra > 0){
                System.out.println("Entre com a quantidade comprada");
                double quantidadeComprada = sc.nextDouble();
                if ((quantidadeComprada > 0)) {
                    double quantidade = p.getQuantidade() + quantidadeComprada;

                    p.setPrecoCompra(precoCompra);
                    p.setQuantidadeComprada(quantidadeComprada);
                    p.setQuantidade(quantidade);
                }
            }
        } else{
            System.out.println("Produto não encontrado");
            new Erros().SemErro();
        }
    }
}
