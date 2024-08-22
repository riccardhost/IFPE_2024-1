
public class Venda {
  
   String nomeCliente;
   double valorTotal;

   public Venda() {

   }

   public Venda(String nomeCliente, double valorTotal) {

       this.nomeCliente = nomeCliente;
       this.valorTotal = valorTotal;
   }

   public void imprimir() {
       System.out.println("Cliente: " + nomeCliente + ", Valor total da venda: " + valorTotal);
   }
}
