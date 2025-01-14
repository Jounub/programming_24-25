package lr5.Example3;

public class Main {
    public static void main(String[] args) {
        Task3 noArgExample = new Task3();
        Task3 oneArgExample = new Task3(15);
        Task3 twoArgExample = new Task3(20, 25);

        System.out.println("noArgExample " + noArgExample.getNum1() + " " + noArgExample.getNum2());
        System.out.println("oneArgExample " + oneArgExample.getNum1() + " " + oneArgExample.getNum2());
        System.out.println("twoArgExample " + twoArgExample.getNum1() + " " + twoArgExample.getNum2());
    }

}
