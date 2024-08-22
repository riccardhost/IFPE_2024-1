public class FuncionarioTeste {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        Funcionario f3 = new Funcionario();

        f1.inserir(101, " - Joao Carlos R$ ", 45000);
        f2.inserir(102, " - Antonio Pedro R$ ", 25000);
        f3.inserir(103, " - Maria Adelaide R$ ", 55000);

        f1.exibir();
        f2.exibir();
        f3.exibir();
    }
}