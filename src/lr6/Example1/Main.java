package lr6.Example1;

public class Main {
    public static void main(String[] args) {
        Task1 example = new Task1();

        example.setField('A');
        example.setField("some text");
        example.printFields();

        char[] oneElementArray = {'B'};
        char[] multipleElementArray = {'n', 'e', 'w', ' ', 't', 'e', 'x', 't'};
        example.setField(oneElementArray);
        example.setField(multipleElementArray);
        example.printFields();
    }
}
