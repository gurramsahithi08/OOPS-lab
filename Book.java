class Book {
    // Attributes
    private String title;
    private String author;
    private int yearOfPublication;

    // Constructor
    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year of Publication: " + yearOfPublication);
        System.out.println(); // Blank line for better readability
    }

    public static void main(String[] args) {
        // Creating two Book objects
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        Book book2 = new Book("1984", "George Orwell", 1949);

        // Displaying details of both books
        System.out.println("Book 1 Details:");
        book1.displayDetails();

        System.out.println("Book 2 Details:");
        book2.displayDetails();
    }
}
