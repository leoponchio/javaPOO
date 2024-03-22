public class calculadora {

    private int valor1;
    private int valor2;

    public calculadora(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public int somar() {
        return valor1 + valor2;
    }

    public int subtrair() {
        return valor1 - valor2;
    }

    public int multiplicar() {
        return valor1 * valor2;
    }

    public int dividir() {
        return valor1 / valor2;
    }

    public void resultCalc() {
        System.out.println("soma: " + somar());
        System.out.println("subtração: " + subtrair());
        System.out.println("multiplicação: " + multiplicar());
        System.out.println("divisão: " + dividir());
    }
}
