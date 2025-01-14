package lr5.Example6;

public class Main {
    public static void main(String[] args) {
        Task6 example = new Task6();
        example.printNums();

        example.setNums(1);
        example.printNums();

        example.setNums(2, 5);
        example.printNums();

        example.setNums(1);
        example.printNums();
    }
}
