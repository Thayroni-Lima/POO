public class ExcluirLivros {

    // atributo acervo para uso da classe.

    private Acervo acervo;

    // Criação do construtor
    public ExcluirLivros(Acervo acervo) {
        this.acervo = acervo;
    }

    // Criação do método de excluir livro do acervo pelo ISBN
    public void excluirLivro(String isbn) {
        acervo.excluirLivro(isbn);
    }

}