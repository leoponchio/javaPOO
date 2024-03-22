public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private int numPag;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    
    public String getAutor() {
        return autor;
    }
    public void setAutor;(String autor){
        this.autor = autor;
    
    public int getAno() {
        return ano;
    }
    public void setAno (int ano){
        this.ano = ano;
    
    public int getNumPag () {
        return numPag;
    }
public void setNumPag (int numPag){
        this.numPag = numPag;
    }

    public void exibirDadosLivro() {
        System.out.println("titulo: " + titulo);
        System.out.println("autor: " + autor);
        System.out.println("ano: " + ano);
        System.out.println("numero de paginas: " + numPag);
    }
}