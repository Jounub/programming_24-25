package lr7.Example4;

public class SubClass1Test extends SuperClassTest{
    public String str;

    public SubClass1Test(char symbol, String str) {
        super(symbol);
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public SubClass1Test createClassCopy(){
        return new SubClass1Test(this.symbol, this.str);
    }

    @Override
    public String toString() {
        return "SubClass1Test{" +
                "str='" + str + '\'' +
                ", symbol=" + symbol +
                '}';
    }
}
