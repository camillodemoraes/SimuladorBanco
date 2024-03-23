import java.util.Scanner;

public class SimuladorBanco {
    private static double saldo = 0;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Depósito");
            System.out.println("2 - Saque");
            System.out.println("3 - Verificar Saldo");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            
            switch(opcao) {
                case 1:
                    System.out.print("Digite o valor a ser depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor a ser sacado: ");
                    double valorSaque = scanner.nextDouble();
                    sacar(valorSaque);
                    break;
                case 3:
                    verificarSaldo();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
        
        scanner.close();
    }
    
    public static void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }
    
    public static void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }
    
    public static void verificarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}
