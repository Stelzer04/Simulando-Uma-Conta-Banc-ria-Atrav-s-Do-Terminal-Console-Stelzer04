import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Conhecer e importar a classe Scanner
        Scanner Scanner = new Scanner (System.in);
        // Exibir as mensagens para o usuário
        // Obter pela scanner os valores digitados no terminal (As variáveis são: AccountNumber, AgencyNumber, UserName, BalanceValue)
            System.out.println("Bem vindo ao Banco Santander! Por favor, insere seus dados do seu número da conta.");
            var numberAccount = Scanner.nextInt(); 
            System.out.println("Agora digite o número da agência.");
            var numberAgency = Scanner.next();
            System.out.println("Agora digite o seu nome de usuário");
            Scanner.nextLine();
            var userName = Scanner.nextLine();
            System.out.println("Por último, digite o valor que você deseja sacar.");
            var balanceValue = Scanner.nextDouble();

        // Exibir a mensagem da conta criada
        System.out.printf("Saudações %s! O número da sua conta é %s, o número da sua agência é %s e o seu saldo (%s) já está disponível para o saque. Tenha um bom dia! :)", userName, numberAccount, numberAgency, balanceValue);
    }
}