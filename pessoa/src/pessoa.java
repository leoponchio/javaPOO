public class pessoa {
    public static void main(String[] args) {

        Tipos pessoa1 = new Tipos();
        Tipos pessoa2 = new Tipos();

        pessoa1.setNome("leo");
        pessoa1.setIdade(18);
        pessoa1.setAltura(1.80);

        pessoa2.setNome("amora");
        pessoa2.setIdade(8);
        pessoa2.setAltura(0.45);

       pessoa1.exibirDados();
       System.out.println();
       pessoa2.exibirDados();
    }
}
