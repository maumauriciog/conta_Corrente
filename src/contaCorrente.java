import java.util.Scanner;

public class contaCorrente {
    public static void main(String[] arg) {
        Scanner imput = new Scanner(System.in);
        double soldBanck = 1500.0;
        double valor;
        int option = 0;
        System.out.print("""
                   ********************************************************
                      Dados do Cliente:
                      Nome Correntista:   Maurício G Chagas
                      Tipo de Conta:      Conta Corrente
                      Saldo Initial:     \s""");
        System.out.println("R$ " + soldBanck);
        System.out.print("******************************************************** \n");

        while (option != 4){
            System.out.println("""
                    \n
                    Operações:
                    
                    1 - Consultar Saldo
                    2 - Receber PIX
                    3 - Transferir PIX
                    4 - Sair
                    """);
            System.out.println("Digite a Opção Desejada:");
            option = imput.nextInt();

            switch (option){
                case 1:
                    System.out.println("Saldo em Conta Corrente: R$ " + soldBanck);
                    break;
                case 2:
                    System.out.println("Qual valor deseja receber ?");
                    valor = imput.nextDouble();
                    soldBanck += valor;
                    System.out.println("Saldo Atualizado: R$ " + soldBanck);
                    break;
                case 3:
                    System.out.println("Qual valor deseja transferir ?");
                    valor = imput.nextDouble();
                    soldBanck -= valor;
                    System.out.println("Saldo Atualizado: R$ " + soldBanck);
                    break;
            }
            if (option < 1 || option > 4){
                System.out.println("Opção inválida...");
            }
        }
    }
}