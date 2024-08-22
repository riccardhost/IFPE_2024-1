class Funcionario {
    int id;
    String nome;
    double salario;

    void inserir(int i, String n, double s) {
        id = i;
        nome = n;
        salario = s;
    }

    void exibir() {
        System.out.println(id + "" + nome + "" + salario);
    }
}