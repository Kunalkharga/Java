public class LoopingDemo {
    public static void main(String[] args) {
        // For loop
        System.out.println("For loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // While loop
        System.out.println("While loop:");
        int j = 1;
        while (j <= 5) {
            System.out.println("j = " + j);
            j++;
        }

        // Do-while loop
        System.out.println("Do-while loop:");
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 5);

    }
}
