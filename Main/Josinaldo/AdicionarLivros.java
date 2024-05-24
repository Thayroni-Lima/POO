public class AdicionarLivros {
    private Acervo acervo;

    public AdicionarLivros(Acervo acervo) {
        this.acervo = acervo;
    }

    public void adicionarLivro(Livro livro) {
        acervo.adicionarLivro(livro);
    }
}