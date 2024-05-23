import java.util.List;

public class ConsultarLivro {

  private Acervo acervo;

  public ConsultarLivro(acervo acervo) {this.acervo = acervo; } 

  public List<List> consultarlivros() {return acervo.ConsultarLivros(); }

}
