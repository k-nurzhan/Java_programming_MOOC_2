
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String input = scanner.nextLine();
            if (input.equals("")) {
                System.out.println(books.size() + " books in total.");
                System.out.println("Books:");
                Comparator<Book> comparator = Comparator
                        .comparing(Book::getAge)
                        .thenComparing(Book::getName);
                Collections.sort(books, comparator);
                books.stream()
                        .forEach(book -> System.out.println(book.toString()));
                break;
            }
            System.out.println("Input the age recommendation:");
            Integer age = Integer.valueOf(scanner.nextLine());
            books.add(new Book(input, age));
        }

    }

}
