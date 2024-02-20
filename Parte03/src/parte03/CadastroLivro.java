package parte03;

public class CadastroLivro {
    // Atributos
    private int codigo;
    private String titulo;
    private String autor;
    private String area;

    // Construtor
    public CadastroLivro(int codigo, String titulo, String autor, String area) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.area = area;
    }

    // Métodos Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    // Método para exibir informações do livro
    public void exibirInformacoes() {
        System.out.println("Código: " + codigo);
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Área: " + area);
    }
}
