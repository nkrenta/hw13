public class Hw13 {

    public static void printInformationAboutBook(String name, Author author, int year) {
        System.out.println("Название книги: " + name);
        System.out.println("Автор: " + author);
        System.out.println("Год выпуска: " + year);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Мёртвые души", new Author("Иван", "Гоголь"), 1842);
        printInformationAboutBook(book1.getName(), book1.getAuthor(), book1.getYear());
        System.out.println(book1.hashCode());
        System.out.println();
        Book book2 = new Book("Повесть о Ходже Насреддине", new Author("Леонид", "Соловьёв"), 1956);
        printInformationAboutBook(book2.getName(), book2.getAuthor(), book2.getYear());
        System.out.println(book1.hashCode());
        System.out.println();
        Book book3 = new Book("Герой нашего времени", new Author("Михаил", "Лермонтов"), 1841);
        printInformationAboutBook(book3.getName(), book3.getAuthor(), book3.getYear());
        System.out.println(book1.hashCode());
        System.out.println();
        book3.setYear(1840);
        printInformationAboutBook(book3.getName(), book3.getAuthor(), book3.getYear());
        System.out.println(book1.hashCode());
        System.out.println();

        System.out.println("Первая книга равна второй книге. Ответ: " + book1.equals(book2));

    }
}
