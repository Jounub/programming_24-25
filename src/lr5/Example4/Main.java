package lr5.Example4;

public class Main {
    public static void main(String[] args) {
        Task4 twoArgExample = new Task4(1, 'c');
        Task4 doubleArgExample = new Task4(65.345);

        System.out.println("Char twoArgExample = " + twoArgExample.getCh() +
                "; Number twoArgExample = " + twoArgExample.getNum() +
                "; Char code twoArgExample = " + (int)twoArgExample.getCh());

        System.out.println("Char doubleArgExample = " + doubleArgExample.getCh() +
                "; Number doubleArgExample = " + doubleArgExample.getNum() +
                "; Char code doubleArgExample = " + (int)doubleArgExample.getCh());
    }
}
