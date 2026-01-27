package sistema.Principal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estoque estoque = new Estoque();
        int codigo;
        boolean continuar = true;
        
        while(continuar){
            System.out.println("\n----  Bem vindo a sistema ---- \n");

            System.out.println("Digite 1 para ver o ESTOQUE");
            System.out.println("Digite 2 para CADASTRAR algum produto");
            System.out.println("Digite 3 para visualizar o cadastro de algum produto");
            System.out.println("Digite 4 para dar ENTRADA em um produto");
            System.out.println("Digite 5 para dar SAÍDA em um produto");
            System.out.println("Digite 0 para fechar o sistema");

            switch (sc.nextInt()) {
                case 1:
                     estoque.ListaProdutos();
                    break;
                case 2:
                    estoque.CadastrarProduto(sc);
                    break;
                case 3:
                    System.out.println("Digite o codigo do produto para ver o cadastro dele: ");
                    codigo = sc.nextInt();
                    estoque.buscarProduto(codigo);
                    break;
                case 4:
                    System.out.println("Digite o codigo do produto que deseja dar entrada: ");
                    codigo = sc.nextInt();
                    estoque.Entrada(codigo);
                    break;
                case 5:
                    System.out.println("Digite o codigo do produto que deseja retirar do estoque: ");
                    codigo = sc.nextInt();
                    estoque.Saida(codigo);
                    break;
                default:
                    new Erros();
                    break;
            }
        }
        sc.close();
    }
}