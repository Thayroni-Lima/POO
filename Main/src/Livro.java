    public class Livro {
        // Atributos privados que armazenam as propriedades de um livro
        private String titulo; // Título do livro
        private String autor;  // Autor do livro
        private String isbn;   // ISBN do livro

        // Construtor que inicializa um objeto Livro com título, autor e ISBN
        public Livro(String titulo, String autor, String isbn) {
            this.titulo = titulo;
            this.autor = autor;
            this.isbn = isbn;
        }

        // Getter para o título do livro
        public String getTitulo() {
            return titulo;
        }

        // Setter para o título do livro
        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        // Getter para o autor do livro
        public String getAutor() {
            return autor;
        }

        // Setter para o autor do livro
        public void setAutor(String autor) {
            this.autor = autor;
        }

        // Getter para o ISBN do livro
        public String getIsbn() {
            return isbn;
        }

        // Setter para o ISBN do livro
        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        //Método para Retornar uma string que representa o objeto Livro
        public String toString() {
            return "Livro{" +
                    "titulo='" + titulo + '\'' +
                    ", autor='" + autor + '\'' +
                    ", isbn='" + isbn + '\'' +
                    '}';
        }
    }
