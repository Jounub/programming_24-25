package lr7.Example5;

public class SuperClassTest {
    private String str;

    public SuperClassTest(String str) {
        this.str = str;
    }

    public void  showInfo() {
        String info = "Class name: " + this.getClass().getSimpleName() +
                ", str='" + str + '\'';
        System.out.println(info);
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
