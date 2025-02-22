package lr7.Example3;

public class SubClass1Test extends SuperClassTest {
    public char symbol;

    SubClass1Test(int n, char ch){
        super(n);
        this.symbol = ch;
    }

    public void setFields(int n, char ch) {
        super.setFields(n);
        this.symbol = ch;
    }

    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() +
                ", symbol=" + symbol +
                ", num=" + num;
    }
}
