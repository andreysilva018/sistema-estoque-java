package sistema.Principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

    private ArrayList<Produto> produtos = new ArrayList<>();

    public void CadastrarProduto(Scanner sc) {
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

    public Produto buscarProduto(int codigo) {

        for (Produto p : produtos) {
            if (p.getId() == codigo) {
                System.out.println("ID: " + p.getId());
                System.out.println("Nome: " + p.getName());
                System.out.println("Preço: " + p.getPrecoCompra());
                System.out.println("Quantidade: " + p.getQuantidade());
                return p;
            }
        }

        return null;
    }

    public Produto ListaProdutos() {

        for (Produto p : produtos) {
            System.out.println("-----     ----- ");
            System.out.println("ID: " + p.getId());
            System.out.println("Nome: " + p.getName());
            System.out.println("Quantidade: " + p.getQuantidade());
            System.out.println("Preço de compra: " + p.getPrecoCompra());
            System.out.println("Preço de venda: " + p.getPrecoVenda());
            System.out.println("-----     ----- ");
        }
        return null;
    }

    public Produto Entrada(int codigo) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        for (Produto p : produtos) {
            if (p.getId() == codigo) {
                while (continuar) {
                    System.out.print("Descrição do produto: " + p.getName() + "\n");

                    System.out.println("\nEntre com o preço de compra: ");
                    double precoCompra = sc.nextDouble();

                    System.out.println("Digite a quantidade comprada: ");
                    double quantidadeComprada = sc.nextDouble();
                    if (quantidadeComprada > 0) {
                        double quantidade = p.getQuantidade() + quantidadeComprada;

                        p.setPrecoCompra(precoCompra);
                        p.setQuantidadeComprada(quantidadeComprada);
                        p.setQuantidade(quantidade);

                        System.out.println("Entrada inserida no estoque");
                        continuar = false;
                        return p;
                    } else {
                        System.out.println("Quantidade incorreta");
                        new Erros();
                    }
                }
            }
        }
        System.out.println("Produto não encontrado");
        return null;
    }

    public Produto Saida(int codigo) {
        Scanner sc = new Scanner(System.in);
        for (Produto p : produtos) {
            if (p.getId() == codigo) {
                System.out.print("Descrição do produto: " + p.getName() + "\n");

                System.out.println("Digite a porcentagem de lucro (ex: 0,5 | 1,5 | 10)");
                double porcentagem = sc.nextDouble();
                double proprocao = porcentagem / p.getPrecoCompra();
                double lucro = p.getPrecoCompra() * proprocao;
                double venda = p.getPrecoCompra() + lucro;
                System.out.println("\nEntre com a quantidade que deseja retirar: ");
                double quantidadeRetirada = sc.nextDouble();
                if (quantidadeRetirada > 0) {
                    double quantidade = p.getQuantidade() - quantidadeRetirada;

                    p.setQuantidadeRetirada(quantidadeRetirada);
                    p.setQuantidade(quantidade);
                    p.setPrecoVenda(venda);
                } else {
                    System.out.println("Quantidade incorreta");
                    new Erros();
                }
                System.out.println("Deu certo");
            }
        }

        return null;
    }

    public Produto Situacao(int codigo) {
        Scanner sc = new Scanner(System.in);
        for (Produto p : produtos) {
            if (p.getId() == codigo) {
                if (p.getQuantidade() <= 0) {
                    System.out.println("Estoque vazio");
                    p.setSituacao(false);
                    return p;
                } else {
                    System.out.println("Estoque cheio");
                    p.setSituacao(true);
                    return p;
                }
            }
        }
        return null;
    }

    public Estoque() {
    }
}
/* teste de commit aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa 
double quantidadeVendida = sc.nextDouble();*/
