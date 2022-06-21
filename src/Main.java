public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(new Author ("Orlov ", "Anatoliy" ), 100, 2022);
        Book book2 = new Book( new Author("Vladimir ","Megre"), 150,2020);
        book2.setYear(1997);
        System.out.println(book2);
        System.out.println(book1);
        System.out.println(book1.equals(book2));
    }

}