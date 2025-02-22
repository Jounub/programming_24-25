package lr7.Example5;

public class SubClass1Test extends SuperClassTest {
    protected int num;

    public SubClass1Test(String str, int num) {
        super(str);
        this.num = num;
    }

    @Override
    public void showInfo() {
        String info = "Class name: " + this.getClass().getSimpleName() +
                ", str='" + super.getStr() + '\'' +
                ", num=" + num;
        System.out.println(info);
    }
}
