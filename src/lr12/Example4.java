package lr12;

public class Example4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int threadNumber = i;
            Thread thread = new Thread(() -> {
                System.out.println("Thread number: " + threadNumber);
            });
            thread.start();

            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
