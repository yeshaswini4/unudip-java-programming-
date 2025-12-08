class Printer {

    // Method 1: String first, int second
    void printDetails(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Method 2: int first, String second
    void printDetails(int age, String name) {
        System.out.println("Age: " + age + ", Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        Printer p = new Printer();

        // Calling method with (String, int)
        p.printDetails("tara", 25);

        // Calling method with (int, String)
        p.printDetails(25, "tara");
    }
}
