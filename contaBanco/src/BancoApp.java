import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu\r\n"
                    + "1 - Criar conta\r\n"
                    + "2 - Depósito\r\n"
                    + "3 - Saque\r\n"
                    + "4 - Transferência\r\n"
                    + "5 - Sair\n\n"
                    + "Digite a opção");

            opcao = scan.nextInt();
            double saldo = 0;
            

            switch(opcao){

                case 1:    
                    System.out.println("Qual o seu nome?");
                    String nome = scan.next();            

                    System.out.println("Informe o numero de usuario desejado");
                    int userId = scan.nextInt();

                    System.out.println("Escolha uma senha forte");
                    String senha = scan.next();

                    System.out.println("Confirme sua senha");
                    String senhaConfirmacao = scan.next();

                    if (senha.equals(senhaConfirmacao)){
                        System.out.println("Conta criada com sucesso");
                        System.out.println("Olá "+nome+ ", obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta " + userId + "e seu saldo :"+ saldo +" já está disponível para saque");

                    }else{
                        System.out.println("Senhas diferentes");
                    }

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                default:
                    System.out.println("Opcao invalida");
            }

        } while (opcao != 5);
        

    }
}
