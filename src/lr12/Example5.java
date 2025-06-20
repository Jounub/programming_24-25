package lr12;

public class Example5 {
    private static final Object lock = new Object();
    private static int globalMax = Integer.MIN_VALUE;

    public static void main(String[] args) throws InterruptedException {
        int[] numArray = lr6.ArraysGenerator.generateIntArray(20, -200, 200);
        System.out.println("Max value: " + findMax(numArray));
    }

    public static int findMax(int[] arr) throws InterruptedException{
        int numThreads = Runtime.getRuntime().availableProcessors();
        int chunkSize = (int) Math.ceil(arr.length / (double) numThreads);

        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            final int start = i * chunkSize;
            final int end = Math.min(start + chunkSize, arr.length);

            threads[i] = new Thread(() -> {
                int localMax = Integer.MIN_VALUE;
                for (int j = start; j < end; j++) {
                    if (arr[j] > localMax) {
                        localMax = arr[j];
                    }
                }

                synchronized (lock) {
                    if (localMax > globalMax) {
                        globalMax = localMax;
                    }
                }
            });

            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }
        return globalMax;
    }
}
