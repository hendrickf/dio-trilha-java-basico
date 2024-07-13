import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);
        
        String agencia = "067-8";
        String nomeCliente = "MARIO ANDRADE";
        double saldo = 237.48;

        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valore digitador no terminal
        System.out.println("Por favor, digite o número da sua conta!");
        System.out.print("Número da conta: ");
        int numero = scanner.nextInt();

        //Exibir a mensagem conta criada
        System.out.println("olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já esta disponível para saque.");
    }
}