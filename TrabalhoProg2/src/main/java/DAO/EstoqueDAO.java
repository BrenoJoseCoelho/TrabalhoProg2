
package DAO;
import Repositorio.EstoqueRepositorio;
import java.util.ArrayList;
import java.util.List;
import models.Estoque;
import models.Livro;
import models.LivroNovo;
import models.LivroUsado;

/**
 *
 * @author LRodrigues
 */
public class EstoqueDAO implements EstoqueRepositorio {

    private static List<LivroNovo> livrosnovo = new ArrayList<>();
    private static List<LivroUsado> livrosusado = new ArrayList<>();


    @Override
    public List<LivroUsado> getTodosLivrosUsado() {

        return livrosusado;
    }
    public List<LivroNovo> getTodosLivrosNovo() {

        return livrosnovo;
    }

    @Override
    public void addEstoqueNovo(LivroNovo livroNovo) {
        livrosnovo.add(livroNovo);
    }

    @Override
    public void addEstoqueUsado(LivroUsado livroUsado) {
        livrosusado.add(livroUsado);
    }

   

    @Override
    public void removeLivroNovo(LivroNovo livroNovo) {
        livrosnovo.remove(livroNovo);
    }
    
    @Override
    public void removeLivroUsado(LivroUsado livroUsado) {
        livrosusado.remove(livroUsado);
    }

}
