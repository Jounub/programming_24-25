package lr7.Example5;

public class Main {
    public static void main(String[] args) {
        SuperClassTest superClassObject = new SuperClassTest("суперкласс");
        superClassObject.showInfo();

        SubClass1Test subClass1Object = new SubClass1Test("подкласс 1", 1);
        subClass1Object.showInfo();

        SubClass2Test subClass2Object = new SubClass2Test("подкласс 2", 'A');
        subClass2Object.showInfo();

        SuperClassTest ref1 = subClass1Object;
        SuperClassTest ref2 = subClass2Object;

        ref1.showInfo();
        ref2.showInfo();
    }
}
