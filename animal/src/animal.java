import java.util.Scanner;
public class animal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        animal animal = new animal();

        System.out.print("qual é o nome d animal: ");
        String nome = ler.nextLine();
        animal.setNome(nome);

        System.out.print("qual a espécie do animal: ");
        String especie = ler.nextLine();
        animal.setEspecie(especie);

        animal.exibirDados();
    }
    private String nome;
    private String especie;

    public animal() {
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public String getEspecie() {
        return especie;
    }

    public void exibirDados() {
        System.out.println("nome do animal: " + nome);
        System.out.println("espécie do animal: " + especie);
    }
}
