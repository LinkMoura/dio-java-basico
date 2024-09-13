import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor digite seu nome!");
        String nome = scanner.next();
        
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();

        System.out.println("Digite sua conta");
        int conta = scanner.nextInt();
        
        System.out.println("Saldo");
        double saldo = scanner.nextDouble();

        
        System.out.println("Ola, " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " Conta " + conta + " e seu saldo é " + saldo + " já está disponível para saque!");
        
        
    }
}