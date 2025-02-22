package lr7.Example3;

public class SuperClassTest {
    public int num;

    SuperClassTest(int n){
        this.num = n;
    }

    public int getNum() {
        return num;
    }

    public void setFields(int n) {
        this.num = n;
    }

    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() +
                ", num=" + num;
    }
}
