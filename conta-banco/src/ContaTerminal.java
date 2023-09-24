import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args){
        //TODO:Conhecer e importar a classe Scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        Scanner meuScn = new Scanner(System.in).useLocale(Locale.US);

        int numeroConta;
        String numeroAgencia;
        String nomeCliente;
        double saldo;

        System.out.println("BEM VINDO(A) AO BANCO XPTO");
        System.out.println("VAMOS EFETUAR SEU SAQUE");
        
        System.out.println("--------------------------");

        System.out.print("Digite seu nome: ");
        nomeCliente = meuScn.nextLine();

        System.out.print("Por favor, digite o número da sua Agência: ");
        numeroAgencia = meuScn.nextLine();

        System.out.print("Por favor, digite o número da sua Conta: ");
        numeroConta = meuScn.nextInt();

        System.out.print("Digite seu saldo: ");
        saldo = meuScn.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já esta disponível para saque");
    }
}