
import java.util.Scanner;

public class TesteVenda {

   public static void main(String[] args) {
		
      Scanner teclado = new Scanner(System.in);

       Venda v1 = new Venda();

       System.out.println("Informe o nome do cliente: ");
       v1.nomeCliente = teclado.next();

       System.out.println("Informe o valor total da venda: ");
       v1.valorTotal = teclado.nextDouble();

       v1.imprimir();

       System.out.println("---------------------------------------------");

       System.out.println("Informe o nome do cliente: ");
       String nome = teclado.next();

       System.out.println("Informe o valor total da venda: ");
       double valor = teclado.nextDouble();

       Venda v2 = new Venda(nome, valor);
       v2.imprimir();
   }
}
