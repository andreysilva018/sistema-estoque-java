package sistema.Principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

    private ArrayList<Produto> produtos = new ArrayList<>();

    public void CadastrarProduto(Scanner sc){
        System.out.println("Vamos realizar a entrada do produto \n");
        System.out.println("Digite o codigo do produto: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o nome do produto: ");
        String name = sc.nextLine();
        Produto produto = new Produto(id, name);
        produtos.add(produto);
        System.out.println("Produto cadastrado");
    }

     public Produto buscarProduto(int codigo){
        
        for(Produto p : produtos){
            if(p.getId() == codigo){
                System.out.println("ID: " + p.getId());
                System.out.println("Nome: " + p.getName());
                System.out.println("Preço: " + p.getPrecoCompra());
                System.out.println("Quantidade: " + p.getQuantidade());
                return p;
            }
        }

        return null;
     }

     public Produto ListaProdutos(){

        for(Produto p : produtos){
            System.out.println("-----     ----- ");
            System.out.println("ID: " + p.getId());
            System.out.println("Nome: " + p.getName());
            System.out.println("Preço: " + p.getPrecoVenda());
            System.out.println("Quantidade: " + p.getQuantidade());
            System.out.println("-----     ----- ");
        }
        return null;
     }

     public Produto Entrada(int codigo){
        Scanner sc = new Scanner(System.in);
        for(Produto p : produtos){
            if(p.getId() == codigo){
                System.out.print("Descrição do produto: " + p.getName() + "\n");

                System.out.println("\nEntre com o preço de compra: ");
                double precoCompra = sc.nextDouble();

                double venda = precoCompra * 2;

                System.out.println("Digite a quantidade comprada: ");
                double quantidadeComprada = sc.nextDouble();

                double quantidade = p.getQuantidade() + quantidadeComprada;

                p.setPrecoCompra(precoCompra);
                p.setQuantidadeComprada(quantidadeComprada);
                p.setQuantidade(quantidade);
                p.setPrecoVenda(venda);

                System.out.println("Entrada inserido no estoque");
                return p;
            }
        }
        System.out.println("Produto não encontrado");
        return null;
    }
    
    public Produto Saida(int codigo){
        Scanner sc = new Scanner(System.in);
        for(Produto p : produtos){
            if (p.getId() == codigo) {
                System.out.print("Descrição do produto: " + p.getName() + "\n");
                System.out.println("\nValor de venda: " + p.getPrecoVenda());

                System.out.println("\nEntre com a quantidade que deseja retirar: ");
                double quantidadeVendida = sc.nextDouble();

                System.out.println("Deu certo");
            }
        }

        return null;
    }
    
    public Estoque(){};
}
/* teste de commit aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa */