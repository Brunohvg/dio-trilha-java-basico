import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criação de um saldo inicial fixo
        double saldo = 237.48;

        // Inicializa o scanner para capturar entradas do usuário
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Solicita e captura o nome do usuário
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        // Solicita e captura o número da conta
        System.out.println("Certo, " + nome + ", agora digite o número de sua conta: ");
        int numero = scanner.nextInt();

        // Solicita e captura a agência
        System.out.println("Digite sua agência (ex: 067-8): ");
        String agencia = scanner.next();

        // Exibe a mensagem de conta criada com sucesso
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$ " + saldo + " já está disponível para saque.");

        // Fecha o scanner
        scanner.close();
    }
}
