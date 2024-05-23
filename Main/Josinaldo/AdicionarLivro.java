import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Livro {
    private String titulo;
    private String autor;
    private String isbn;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn;
    }
}

public class Biblioteca {
    private List<Livro> livros;

    public Biblioteca() {
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado com sucesso!");
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro na biblioteca.");
        } else {
            System.out.println("Livros na biblioteca:");
            for (Livro livro : livros) {
                System.out.println(livro);
            }
        }
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);
        String titulo, autor, isbn;
        String continuar;

        do {
            System.out.println("Adicionar novo livro:");
            System.out.print("Título: ");
            titulo = scanner.nextLine();
            System.out.print("Autor: ");
            autor = scanner.nextLine();
            System.out.print("ISBN: ");
            isbn = scanner.nextLine();

            Livro livro = new Livro(titulo, autor, isbn);
            biblioteca.adicionarLivro(livro);

            System.out.print("Deseja adicionar outro livro? (s/n): ");
            continuar = scanner.nextLine();
        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("\nListagem de livros na biblioteca:");
        biblioteca.listarLivros();

        scanner.close();
    }
}
