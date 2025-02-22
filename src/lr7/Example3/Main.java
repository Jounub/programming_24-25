package lr7.Example3;

public class Main {
    public static void main(String[] args) {
        SuperClassTest superClassObject = new SuperClassTest(1);
        System.out.println(superClassObject);

        SubClass1Test subClass1Object = new SubClass1Test(2, 'A');
        System.out.println(subClass1Object);
        subClass1Object.setFields(3, 'B');
        System.out.println(subClass1Object);

        SubClass2Test subClass2Object = new SubClass2Test(4, 'C', "последний подкласс");
        System.out.println(subClass2Object);
        subClass2Object.setFields(5, 'D', "Hello");
        System.out.println(subClass2Object);
    }
}
