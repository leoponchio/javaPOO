import java.util.Scanner;
public class retangulo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        retangulo retangulo = new retangulo();

        System.out.print("digite a altura do retangulo: ");
        double altura = ler.nextDouble();
        retangulo.setAltura(altura);

        System.out.print("digite a largura do retangulo: ");
        double largura = ler.nextDouble();
        retangulo.setLargura(largura);

        // Exibindo o valor da área
        System.out.println("area total: " + retangulo.getArea());
    }
    private double altura;
    private double largura;
    private double area;

    public retangulo() {
    }

    public void setAltura(double altura) {
        this.altura = altura;
        calcularArea();
    }
    public double getAltura() {
        return altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
        calcularArea();
    }
    public double getLargura() {
        return largura;
    }

    private void calcularArea() {
        area = altura * largura;
    }

    public double getArea() {
        return area;
    }
}
