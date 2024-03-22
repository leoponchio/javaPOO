public class aluno {
    private String nome;
    private int matricula;
    private double[] notas = new double[3];

    public aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getMatricula() {
        return matricula;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public double[] getNotas() {
        return notas;
    }

    public double calcularMedia() {
        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public boolean estaAprovado() {
        return calcularMedia() >= 7.0;
    }

    public String getSituacao() {
        return estaAprovado() ? "aprovado" : "reprovado";
    }

    public void infoAlunos() {
        System.out.println("nome: " + nome);
        System.out.println("matricula: " + matricula);
        System.out.println("notas:");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }
        System.out.println();
        System.out.println("média: " + calcularMedia());
        System.out.println(getSituacao());
        System.out.println();
    }
}
