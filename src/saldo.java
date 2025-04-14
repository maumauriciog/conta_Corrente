import java.util.Scanner;

public class saldo {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        double soldBanck = 1.500;
        double valor = 0;
        int option = 0;
        System.out.print("""
                    ********************************************************
                      Dados Iniciando do Cliente:
                    
                      Nome Correntista:   Maurício G Chagas
                      Tipo de Conta:      Conta Corrente
                      Saldo Initial:     \s""");
        System.out.println("R$ " + soldBanck);
        System.out.print("********************************************************");
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
    }
}
