class Tipos {
    private String nome;
    private int idade;
    private double altura;

    public void setNome(String n) {
        this.nome = n;
    }
    public String getNome() {
        return nome;
    }

    public void setIdade(int i) {
        this.idade = i;
    }
    public int getIdade() {
        return idade;
    }

    public void setAltura(double a) {
        this.altura = a;
    }
    public double getAltura() {
        return altura;
    }

    public void exibirDados() {
        System.out.println("nome: " + nome);
        System.out.println("idade: " + idade);
        System.out.println("altura: " + altura);
    }
}
