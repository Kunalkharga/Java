public class ThreadExample {
    public static void main(String[] args) {
        ThreadA t1 = new ThreadA();
        ThreadB t2 = new ThreadB();

        t1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        t2.setPriority(t1.getPriority() + 1); // Priority 2

        t1.start();
        t2.start();
    }
}