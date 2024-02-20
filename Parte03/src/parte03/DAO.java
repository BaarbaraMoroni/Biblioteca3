package parte03;

import java.util.List;

// Interface para acesso aos dados relacionados à entidade Livro
public interface DAO {
    // Métodos CRUD
    public void adicionarLivro(Livro livro);
    public void atualizarLivro(Livro livro);
    public void removerLivro(int codigo);
    public Livro buscarLivroPorCodigo(int codigo);
    public List<Livro> buscarTodosLivros();
}
