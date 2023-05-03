import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");

       //TODO:"Conhecer e importar a classe Scanner "
       //Exibir as mensagens para o nosso usuário
       //Obter pela SCANNER OS VALORES DIGITAdos no terminal 
       //Exibir a mensagem conta criada
           Scanner sc = new Scanner(System.in);
           int numero;
           String nomeTitular;
           String agencia; 
           double saldo;

           System.out.println("******** Extrato Bancario ********\n");
           //System.out.println();
           System.out.println("Por favor, digite o numero da sua conta !");
           numero = sc.nextInt();

           System.out.println("Por favor, digite o numero da Agencia !");
           agencia = sc.next();

           System.out.println("Informe o nome do titular da conta ");
           nomeTitular = sc.next();

           System.out.println("Seu saldo da conta é R$: ");
           saldo = sc.nextDouble();
           sc.nextLine();

           System.out.println("**********************\n");
           System.out.println("Seja bem vindo(a) " + nomeTitular + " obrigado por criar uma conta em nosso banco, sua agencia é " + agencia +  " conta " + numero + " e seu saldo " + saldo + " ja esta disponível para saque " ); 
            
           
           System.out.println("*********  FIM DO ATENDIMENTO ************\n");
           
           sc.close();


    }
}
