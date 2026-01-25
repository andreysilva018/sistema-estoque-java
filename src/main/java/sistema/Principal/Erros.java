package sistema.Principal;

public class Erros {
    public Erros(){
        System.out.println("Erro");
        System.out.println("Certifique-se que digitou algo válido");
        System.out.println("* Recomeçe o processo novamente *");
    }
    public Erros SemErro(){
        System.out.println("Certifique-se que digitou algo válido");
        System.out.println("* Recomeçe o processo novamente *");
        return null;
    }
}
