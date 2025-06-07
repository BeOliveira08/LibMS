import java.util.*;

public class Library {
    private List<Book> books;
    private Scanner scanner = new Scanner(System.in);

    public Library() {
        books = FileManager.loadBooks();
    }

    public void addBook() {
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Título: ");
        String title = scanner.nextLine();
        System.out.print("Autor: ");
        String author = scanner.nextLine();
        books.add(new Book(id, title, author));
        FileManager.saveBooks(books);
        System.out.println("Livro adicionado!");
    }

    public void showAllBooks() {
        System.out.println("\n--- Todos os Livros ---");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void searchBook() {
        System.out.print("Digite o título ou autor para buscar: ");
        String query = scanner.nextLine().toLowerCase();
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(query) || book.getAuthor().toLowerCase().contains(query)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Nenhum livro encontrado.");
        }
    }

    public void borrowBook() {
        System.out.print("ID do livro para emprestar: ");
        String id = scanner.nextLine();
        for (Book book : books) {
            if (book.getId().equals(id)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    FileManager.saveBooks(books);
                    System.out.println("Livro emprestado com sucesso!");
                } else {
                    System.out.println("Livro já está emprestado.");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void returnBook() {
        System.out.print("ID do livro para devolver: ");
        String id = scanner.nextLine();
        for (Book book : books) {
            if (book.getId().equals(id)) {
                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    FileManager.saveBooks(books);
                    System.out.println("Livro devolvido com sucesso!");
                } else {
                    System.out.println("Livro já está disponível.");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    // Outros métodos, se necessário
}