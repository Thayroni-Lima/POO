import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Acervo acervo = new Acervo();

        AdicionarLivros adicionarLivros = new AdicionarLivros(acervo);
        ExcluirLivros excluirLivros = new ExcluirLivros(acervo);
        ConsultarLivros consultarLivros = new ConsultarLivros(acervo);

        while (true) {
            System.out.println("Bem-vindo ao sistema da biblioteca!");
            System.out.println("1. Login");
            System.out.println("2. Cadastrar novo usuário");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 3) {
                break;
            }

            if (opcao == 2) {

                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Email: ");
                String email = scanner.nextLine();
                System.out.print("Senha: ");
                String senha = scanner.nextLine();
                // Adicionar novo usuário ao sistema
                User novoUsuario = new User(nome, email, senha);
                System.out.println("Usuário cadastrado com sucesso!");
                continue;
            }

            // Fazer login
            System.out.print("Email: ");
            String email = scanner.nextLine();
            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            // Autenticar usuário
            User usuario = new User("", email, senha);
            boolean autenticado = usuario.autenticar(senha);

            if (autenticado) {
                while (true) {
                    System.out.println("Bem-vindo, " + email);
                    System.out.println("1. Adicionar livro");
                    System.out.println("2. Excluir livro");
                    System.out.println("3. Consultar livros");
                    System.out.println("4. Sair");
                    System.out.print("Escolha uma opção: ");
                    int escolha = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha

                    if (escolha == 4) {
                        break;
                    }

                    switch (escolha) {
                        case 1:
                            System.out.print("Título: ");
                            String titulo = scanner.nextLine();
                            System.out.print("Autor: ");
                            String autor = scanner.nextLine();
                            System.out.print("ISBN: ");
                            String isbn = scanner.nextLine();
                            Livro livro = new Livro(titulo, autor, isbn);
                            adicionarLivros.adicionarLivro(livro);
                            break;
                        case 2:
                            System.out.print("ISBN do livro a excluir: ");
                            String isbnExcluir = scanner.nextLine();
                            excluirLivros.excluirLivro(isbnExcluir);
                            break;
                        case 3:
                            List<Livro> livros = consultarLivros.consultarLivros();
                            System.out.println("Livros no acervo:");
                            for (Livro l : livros) {
                                System.out.println(l);
                            }
                            break;
                        default:
                            System.out.println("Opção inválida.");
                            break;
                    }
                }
            } else {
                System.out.println("Email ou senha incorretos.");
            }
        }

        scanner.close();
    }
}
