final class Constants {
    public static final String HELLO_MESSAGE = "Hello, World!";
    public static void printHello() {
        System.out.println(HELLO_MESSAGE);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(Constants.HELLO_MESSAGE);
        Constants.printHello();
    }
}

