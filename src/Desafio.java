import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nomeCliente = "Joao da Silva";
        String tipoConta = "Corrente";
        double saldoConta = 1599.99;
        double valorDeposito;
        double valorTransferencia;
        int opcoesMenu = 0;
        String menu = """
                    Escolha uma opcao:
                    1- Consultar saldo
                    2- Receber valor
                    3- Transferir valor
                    4- Sair
                    Digite a opcao desejada:""";

        Scanner scanner = new Scanner(System.in);

        System.out.println("********************************************************************************");
        System.out.printf("\nNome do cliente: %s \n", nomeCliente);
        System.out.printf("Tipo de Conta: %s \n", tipoConta);
        System.out.printf("Saldo da Conta: R$ %.2f\n\n", saldoConta);
        System.out.println("********************************************************************************");

        //Menu

        while (opcoesMenu != 4) {
            System.out.println(menu);
            opcoesMenu = scanner.nextInt();

            switch (opcoesMenu) {
                case 1:
                    System.out.printf("O seu saldo e de R$ %.2f\n", saldoConta);
                    break;

                case 2:
                    System.out.println("Digite o valor a receber: ");
                    valorDeposito = scanner.nextDouble();
                    saldoConta += valorDeposito;
                    System.out.printf("\nO seu saldo atualizado e de R$ %.2f\n", saldoConta);
                    break;

                case 3:
                    System.out.println("Digite o valor a transferir: ");
                    valorTransferencia = scanner.nextDouble();

                    if (valorTransferencia <= saldoConta) {
                        saldoConta -= valorTransferencia;
                        System.out.printf("\nO seu saldo atualizado e de R$ %.2f\n", saldoConta);
                    } else {
                        System.out.println("Voce nao possui saldo suficiente. Refaca a operacao.");
                    }
                    break;

                case 4:
                    System.out.println("Ate logo!");
                    break;

                default:
                    System.out.println("Opcao invalida!\n");
                    break;

            }
        }
    }
}
