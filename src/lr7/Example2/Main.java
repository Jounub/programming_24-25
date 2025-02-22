package lr7.Example2;

public class Main {
    public static void main(String[] args) {

        SuperClassTest superClassObject = new SuperClassTest("передал в конструктор суперкласса");
        System.out.println(superClassObject);

        SubClassTest subClassObject1 = new SubClassTest("передал в конструктор подкласса", 1);
        System.out.println(subClassObject1);

        subClassObject1.setFields();
        System.out.println(subClassObject1);

        subClassObject1.setFields(2);
        System.out.println(subClassObject1);

        subClassObject1.setFields("метод подкласса с двумя параметрами", 3);
        System.out.println(subClassObject1);
    }
}
