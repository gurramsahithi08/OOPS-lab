class MyClass {
    // Static variable count initialized to zero
    private static int count = 0;

    // Constant variable PI
    private static final double PI = 3.1415;

    // Constructor increments count each time an object is created
    public MyClass() {
        count++;
    }

    // Method to display values of count and PI
    public static void displayValues() {
        System.out.println("Final count: " + count);
        System.out.println("Value of PI: " + PI);
    }

    public static void main(String[] args) {
        // Creating multiple objects
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        MyClass obj3 = new MyClass();

        // Displaying final values of count and PI
        MyClass.displayValues();
    }
}
