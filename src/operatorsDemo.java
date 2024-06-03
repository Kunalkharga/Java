public class operatorsDemo {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 20;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println();

        // Relational Operators
        System.out.println("Relational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println();

        // Bitwise Operators
        int c = 5, d = 3;
        System.out.println("Bitwise Operators:");
        System.out.println("c & d: " + (c & d));
        System.out.println("c | d: " + (c | d));
        System.out.println("c ^ d: " + (c ^ d));
        System.out.println();

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("Logical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
        System.out.println();

        // Assignment Operators
        int e = 10;
        System.out.println("Assignment Operators:");
        e += 5;
        System.out.println("e += 5: " + e);
        e -= 3;
        System.out.println("e -= 3: " + e);
        e *= 2;
        System.out.println("e *= 2: " + e);
        e /= 4;
        System.out.println("e /= 4: " + e);
        e %= 3;
        System.out.println("e %= 3: " + e);
        e &= 2;
        System.out.println("e &= 2: " + e);
        e |= 1;
        System.out.println("e |= 1: " + e);
        e ^= 2;
        System.out.println("e ^= 2: " + e);
        e <<= 1;
        System.out.println("e <<= 1: " + e);
        e >>= 1;
        System.out.println("e >>= 1: " + e);
        System.out.println();

        // Conditional Operator
        System.out.println("Conditional Operator:");
        int f = (a > b) ? a : b;
        System.out.println("The larger value is: " + f);
        System.out.println();


    }
}
