import java.util.Scanner;

public class aluno {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("digite a quantidade de alunos que deseja: ");
        int qntAlunos = ler.nextInt();
        ler.nextLine();

        aluno[] alunos = new aluno[qntAlunos];


        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = dados(ler, i + 1);
        }

        for (aluno aluno : alunos) {
            aluno.exibirDados();
            System.out.println();
        }
    }
    private String nome;
    private String matricula;
    private double[] notas;

    public aluno(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    public double[] getNotas() {
        return notas;
    }

    public double media() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public void exibirDados() {
        System.out.println();
        System.out.println("nome: " + nome);
        System.out.println("matricula: " + matricula);
        System.out.print("notas: ");
        for (double nota : notas) {
            System.out.print(nota + " ");
        }
        System.out.println("\nmédia: " + media());
    }

    public static aluno dados(Scanner ler, int numeroAluno) {
        System.out.println();
        System.out.print("digite o nome do aluno " + numeroAluno + ": ");
        String nome = ler.nextLine();

        System.out.print("digite a matricula do aluno " + numeroAluno + ": ");
        String matricula = ler.nextLine();

        double[] notas = new double[3];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("digite a nota " + (i + 1) + " do aluno " + numeroAluno + ": ");
            notas[i] = ler.nextDouble();
        }
        ler.nextLine();

        return new aluno(nome, matricula, notas);
    }
}
