class ThreadA extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Running thread " + i + " From Class A");
        }
        System.out.println("Exit from Class A");
    }
}

class ThreadB extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("Running thread " + j + " From Class B");
        }
        System.out.println("Exit from Class B");
    }
}


