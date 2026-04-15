public interface BookListTAD {
    void addBookLast(int bookId);
    void addBookFirst(int bookId);
    void insertAt(int index, int bookId);
    void addSorted(int bookId);
    void removeLast();
    void removeFirst();
    void removeAt(int index);
    void removeById(int bookId);
    int find(int bookId);
    int get(int index);
    void set(int index, int bookId);
    boolean isEmpty();
    boolean isFull();
    int size();
}