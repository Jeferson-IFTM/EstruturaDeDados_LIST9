import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Capacidade do sistema de livros: ");
        BookList acervo = new BookList(sc.nextInt());

        int menu = -1;
        while (menu != 0) {
            System.out.println("\n--- GESTÃO DE LIVROS (TAD) ---");
            System.out.println("1. Add Final   2. Add Início   3. Add Posição  4. Add Ordenado");
            System.out.println("5. Rem. Último 6. Rem. Primeiro 7. Rem. Posição 8. Rem. por ID");
            System.out.println("9. Buscar ID   10. Listar Tudo  0. Sair");
            System.out.print("Escolha: ");
            menu = sc.nextInt();

            switch (menu) {
                case 1 -> { System.out.print("ID Livro: "); acervo.addBookLast(sc.nextInt()); }
                case 2 -> { System.out.print("ID Livro: "); acervo.addBookFirst(sc.nextInt()); }
                case 3 -> {
                    System.out.print("Pos: "); int p = sc.nextInt();
                    System.out.print("ID: "); acervo.insertAt(p, sc.nextInt());
                }
                case 4 -> { System.out.print("ID Livro: "); acervo.addSorted(sc.nextInt()); }
                case 5 -> acervo.removeLast();
                case 6 -> acervo.removeFirst();
                case 7 -> { System.out.print("Pos: "); acervo.removeAt(sc.nextInt()); }
                case 8 -> { System.out.print("ID para remover: "); acervo.removeById(sc.nextInt()); }
                case 9 -> {
                    System.out.print("Procurar ID: ");
                    int pos = acervo.find(sc.nextInt());
                    System.out.println(pos != -1 ? "Localizado no índice: " + pos : "Não encontrado.");
                }
                case 10 -> acervo.display();
            }
        }
        sc.close();
    }
}