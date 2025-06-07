import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n=== Sistema de Biblioteca ===");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Listar Todos os Livros");
            System.out.println("3. Buscar Livro");
            System.out.println("4. Emprestar Livro");
            System.out.println("5. Devolver Livro");
            System.out.println("0. Sair");
            System.out.print("Opção: ");

            // Protege contra entrada inválida
            if (scanner.hasNextInt()) {
                option = scanner.nextInt();
            } else {
                System.out.println("Por favor, insira um número válido.");
                scanner.nextLine(); // Limpa entrada inválida
                option = -1;
                continue;
            }
            scanner.nextLine(); // Limpar buffer

            switch (option) {
                case 1:
                    library.addBook();
                    break;
                case 2:
                    library.showAllBooks();
                    break;
                case 3:
                    library.searchBook();
                    break;
                case 4:
                    library.borrowBook();
                    break;
                case 5:
                    library.returnBook();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (option != 0);

        scanner.close();
    }
}