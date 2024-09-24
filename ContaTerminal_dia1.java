import java.util.Scanner;
import java.util.InputMismatchException;

public class ContaTerminal_dia1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.0;
        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite a agência: ");
        agencia = scanner.nextLine();
        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o saldo: ");
        try {
            saldo = scanner.nextDouble();
            scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite um valor numérico para o saldo.");
                scanner.nextLine();
                }
                System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
            }
    }    
