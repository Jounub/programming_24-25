package lr5.Example5;

public class Main {
    public static void main(String[] args) {
        Task5 example1 = new Task5();
        System.out.println("Num значение по умолчанию = " + example1.getNum());

        example1.setNum(55);
        System.out.println("Num значение задано методом = " + example1.getNum());

        Task5 example2 = new Task5(2354);
        System.out.println("Num значение задано в конструкторе = " + example2.getNum());

        example2.setNum();
        System.out.println("Num значение задано методом без аргументов = " + example2.getNum());
    }
}
