import java.util.ArrayList;
import java.util.List;

public class Acervo {
    // Lista para armazenar os livros
    private List<Livro> livros;

    // Construtor que inicializa a lista de livros
    public Acervo() {
        this.livros = new ArrayList<>();
    }

    // Método para adicionar um livro ao acervo
    public void adicionarLivro(Livro livro) {
        livros.add(livro); // Adiciona o livro à lista
        System.out.println("Livro adicionado: " + livro); // Imprime uma mensagem confirmando a adição
    }

    // Método para excluir um livro do acervo usando o ISBN
    public void excluirLivro(String isbn) {
        // Remove o livro da lista se o ISBN corresponder
        boolean removed = livros.removeIf(livro -> livro.getIsbn().equals(isbn));
        if (removed) {
            // Imprime uma mensagem confirmando a exclusão se o livro foi encontrado e removido
            System.out.println("Livro com ISBN " + isbn + " excluído.");
        } else {
            // Imprime uma mensagem indicando que o livro não foi encontrado
            System.out.println("Livro com ISBN " + isbn + " não encontrado.");
        }
    }

    // Método para consultar e retornar a lista de livros no acervo
    public List<Livro> consultarLivros() {
        return livros; // Retorna a lista de livros
    }
}
