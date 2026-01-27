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
                System.out.println("-----     ----- ");
                System.out.println("ID: " + p.getId());
                System.out.println("Nome: " + p.getName());
                System.out.println("Quantidade: " + p.getQuantidade());
                ConferirSituacao(p.getId());
                if (p.getSituacao() == true) {
                    System.out.println("Situação: Ativado");
                }else{
                    System.out.println("Situação: Inativado");
                }
                System.out.println("Preço de compra: " + p.getPrecoCompra());
                if (p.getPrecoCompra() == 0) {
                    System.out.println("Preço de venda: " + p.getPrecoVenda());
                } else{
                    CalcularPrecoVenda(p.getId());
                    System.out.println("Preço de venda: " + p.getPrecoVenda());
                }
                return p;
            }else{
                System.out.println("Produto não encontrado");
                new Erros().SemErro();
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
            ConferirSituacao(p.getId());
            if (p.getSituacao() == true) {
                System.out.println("Situação: Ativado");
            }else{
                System.out.println("Situação: Inativado");
            }
            System.out.println("Preço de compra: " + p.getPrecoCompra());
            if (p.getPrecoCompra() == 0) {
                System.out.println("Preço de venda: " + p.getPrecoVenda());
            } else{
                CalcularPrecoVenda(p.getId());
                System.out.println("Preço de venda: " + p.getPrecoVenda());
            }
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

                        System.out.println("Digite a porcentagem de lucro na venda do produto em cima do preço de compra (ex: 0,5 | 1,5 | 10)");
                        double porcentagem = sc.nextDouble();

                        p.setPorcentagem(porcentagem);
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
        new Erros().SemErro();
        return null;
    }

    public Produto Saida(int codigo) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        for (Produto p : produtos) {
            if (p.getId() == codigo) {
                    
                    System.out.print("Descrição do produto: " + p.getName() + "\n");
                    ConferirSituacao(codigo);
                    if (p.getSituacao() == true) {                    
                        CalcularPrecoVenda(codigo);
    
                        System.out.println("\nEntre com a quantidade que deseja retirar: ");
                        double quantidadeRetirada = sc.nextDouble();
                        if (quantidadeRetirada > 0 && quantidadeRetirada <= p.getQuantidade()) {
                            double quantidade = p.getQuantidade() - quantidadeRetirada;
        
                            p.setQuantidadeRetirada(quantidadeRetirada);
                            p.setQuantidade(quantidade);

                            if (p.getQuantidade() == 0) {
                                System.out.println("** Atenção estoque do produto se encontra zerado **");
                            }
                            return p;
                        } else {
                            System.out.println("Quantidade incorreta");
                            new Erros();
                        }
                    }
                    else {
                        System.out.println("Produto inativado devido ao estoque insuficiente");
                        continuar = false;
                    }

                return p;
            }
            else {
                System.out.println("Produto não encontrado");
                new Erros().SemErro();
            }
        }
        return null;
    }

    public Produto ConferirSituacao(int codigo) {
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

    public Produto CalcularPrecoVenda(int codigo ){
        for(Produto p: produtos){
            if(p.getId() == codigo){
                    double proprocao = p.getPorcentagem() / p.getPrecoCompra();
                    double lucro = p.getPrecoCompra() * proprocao;
                    double venda = p.getPrecoCompra() + lucro;
                    p.setPrecoVenda(venda);
            }
        }
        return null;
    }

    public Estoque() {
    }
}
