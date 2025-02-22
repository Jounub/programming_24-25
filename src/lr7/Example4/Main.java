package lr7.Example4;

public class Main {
    public static void main(String[] args) {
        SuperClassTest superClassObject = new SuperClassTest('A');
        System.out.println(superClassObject);

        SuperClassTest copy1 = superClassObject.createClassCopy();
        System.out.println("Копия суперкласса: " + copy1);
        System.out.println(superClassObject == copy1);

        SubClass1Test subClass1Object = new SubClass1Test('A', "подкласс 1");
        System.out.println(subClass1Object);

        SuperClassTest copy2 = subClass1Object.createClassCopy();
        System.out.println("Копия подкласса 1: " + copy2);
        System.out.println(subClass1Object == copy2);

        SubClass2Test subClass2Object = new SubClass2Test('B', "подкласс 2", 3);
        System.out.println(subClass2Object);

        SuperClassTest copy3 = subClass2Object.createClassCopy();
        System.out.println("Копия подкласса 2: " + copy3);
        System.out.println(subClass2Object == copy3);
    }
}
