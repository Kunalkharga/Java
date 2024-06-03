public class JumpingDemo {
    public static void main(String[] args) {
    // Break statement
                    System.out.println("Break statement:");
                    for (int m = 1; m <= 5; m++) {
        if (m == 3) {
            break; // Exit the loop when m is 3
        }
        System.out.println("m = " + m);
    }

    // Continue statement
                    System.out.println("Continue statement:");
                    for (int n = 1; n <= 5; n++) {
        if (n == 3) {
            continue; // Skip the current iteration when n is 3
        }
        System.out.println("n = " + n);
    }
    // Jumping - Return statement
                        System.out.println("Return statement:");
                        for (int p = 1; p <= 5; p++) {
        if (p == 3) {
            System.out.println("Returning from method when p is 3");
            return; // Exit the method when p is 3
        }
        System.out.println("p = " + p);
    }

}
            }



