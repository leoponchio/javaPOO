public class principalLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("livro exemplo 1", "leo ponchio", 2006, 230);
        Livro livro2 = new Livro("livro exemplo 2", "vinicius", 2024, 532);

        livro1.exibirDadosLivro();
        System.out.println();
        livro2.exibirDadosLivro();
    }
}
