package sistema.Principal.Compras;

import java.util.ArrayList;

import javax.xml.crypto.Data;

import sistema.Principal.Produto;

public class PedidoCompra {

    private int idPed;
    private Data data;
    private String status;
    private boolean valorPedido;

    public void setIdPed(int idPed) {
        this.idPed = idPed;
    }

    public int getIdPed() {
        return idPed;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Data getData() {
        return data;
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

    public Produto Pedido() {
    }
}
