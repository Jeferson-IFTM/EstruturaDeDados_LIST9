public class BookList implements BookListTAD {
    private int[] books;
    private int count;
    private int capacity;

    public BookList(int capacity) {
        this.capacity = capacity;
        this.books = new int[capacity];
        this.count = 0;
    }

    @Override
    public boolean isEmpty()
    { return count == 0; }
    @Override
    public boolean isFull()
    { return count == capacity; }
    @Override
    public int size()
    { return count; }

    @Override
    public void addBookLast(int bookId) {
        if (isFull()) {
            System.out.println("[Erro] Lista cheia.");
            return;
        }
        books[count++] = bookId;
    }

    @Override
    public void addBookFirst(int bookId) {
        if (isFull()) return;
        // Shift para a direita
        for (int i = count; i > 0; i--) books[i] = books[i - 1];
        books[0] = bookId;
        count++;
    }

    @Override
    public void insertAt(int index, int bookId) {
        if (isFull() || index < 0 || index > count) return;
        for (int i = count; i > index; i--) books[i] = books[i - 1];
        books[index] = bookId;
        count++;
    }

    @Override
    public void addSorted(int bookId) {
        if (isFull()) return;
        int i = count - 1;
        while (i >= 0 && books[i] > bookId) {
            books[i + 1] = books[i];
            i--;
        }
        books[i + 1] = bookId;
        count++;
    }

    @Override
    public void removeLast() {
        if (!isEmpty()) count--;
    }

    @Override
    public void removeFirst() {
        if (isEmpty()) return;
        // Shift para a esquerda
        for (int i = 0; i < count - 1; i++) books[i] = books[i + 1];
        count--;
    }

    @Override
    public void removeAt(int index) {
        if (index < 0 || index >= count) return;
        for (int i = index; i < count - 1; i++) books[i] = books[i + 1];
        count--;
    }

    @Override
    public void removeById(int bookId) {
        int index = find(bookId);
        if (index != -1) removeAt(index);
    }

    @Override
    public int find(int bookId) {
        for (int i = 0; i < count; i++) {
            if (books[i] == bookId) return i;
        }
        return -1;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= count) throw new IndexOutOfBoundsException();
        return books[index];
    }

    @Override
    public void set(int index, int bookId) {
        if (index >= 0 && index < count) books[index] = bookId;
    }

    public void display() {
        System.out.print("Livros no Acervo: [ ");
        for (int i = 0; i < count; i++) System.out.print(books[i] + " ");
        System.out.println("]");
    }
}