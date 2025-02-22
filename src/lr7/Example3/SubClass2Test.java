package lr7.Example3;

public class SubClass2Test extends SubClass1Test{
    public String str;

    SubClass2Test(int n, char ch, String strEx){
        super(n, ch);
        this.str = strEx;
    }

    public void setFields(int n, char ch, String strEx) {
        super.setFields(n, ch);
        this.str = strEx;
    }

    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() +
                ", str='" + str + '\'' +
                ", symbol=" + symbol +
                ", num=" + num;
    }
}
