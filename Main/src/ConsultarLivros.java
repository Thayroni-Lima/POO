import java.util.List;

public class ConsultarLivros {
    private Acervo acervo;

    public ConsultarLivros(Acervo acervo) {
        this.acervo = acervo;
    }

    public List<Livro> consultarLivros() {
        return acervo.consultarLivros();
    }
}