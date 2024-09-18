

import java.util.Scanner; 

public class ContaTerminal { 
    public static void main(String[] args) {
    
Scanner num = new Scanner(System.in);

Scanner agnc = new Scanner(System.in);

Scanner nome = new Scanner(System.in);

Scanner valorSaldo = new Scanner(System.in);



 try { System.out.println("Por favor, digite o nome do cliente !");    

    String nomeCliente = nome.next();

System.out.println("Por favor, digite o número da Conta !");
  
    int numero = num.nextInt();

System.out.println("Por favor, digite o número da Agência !");

    String agencia = agnc.next();

System.out.println(" Por favor, digite o Saldo da conta !");

    String saldo = valorSaldo.next();

System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    num.close();
    agnc.close();
    nome.close();
    valorSaldo.close();
 }
 catch (java.util.InputMismatchException a) {

System.out.println("O nome deve conter apenas letras, e o numero da conta e saldo apenas numeros");

 }



}

}
  