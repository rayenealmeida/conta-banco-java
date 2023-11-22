import java.util.Scanner;

public class  ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.print("Digite o número da Agência: ");
        String numeroAgencia = scanner.next();

        System.out.print("Digite o número da sua Conta: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o saldo que deseja depositar: ");
        double saldo = scanner.nextInt();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        
        //TODO: conhecer e importar a classe Scanner

        //Exivir as mensagens pro usuário

        //Obter pela classe Scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
    }
}