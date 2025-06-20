package lr12;

public class Example6 {
    private static final Object lock = new Object();
    private static int result = 0;
    private static int currentIndex = 0;

    public static void main(String[] args) throws InterruptedException {
        int[] numArray = lr6.ArraysGenerator.generateIntArray(10, 0, 100);
        System.out.println("Sum: " + sumElements(numArray));
    }

    public static int sumElements(int[] arr) throws InterruptedException{
        int numThreads = Runtime.getRuntime().availableProcessors();
        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(() -> {
                int localResult = 0;
                int sizeBlock = 2;
                while (true) {
                    int startIndex, endIndex;
                    synchronized (lock) {
                        startIndex = currentIndex;
                        endIndex = Math.min(currentIndex + sizeBlock, arr.length);
                        currentIndex = endIndex;
                        if (startIndex >= arr.length) {
                            break;
                        }
                    }
                    for (int g = startIndex; g < endIndex; g++) {
                        localResult += arr[g];
                    }
                }
                synchronized (lock) {
                    result += localResult;
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }
        return result;
    }
}
