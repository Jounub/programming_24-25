package lr7.Example4;

public class SubClass2Test extends SubClass1Test{
    public int num;

    public SubClass2Test(char symbol, String str, int num) {
        super(symbol, str);
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public SubClass2Test createClassCopy(){
        return new SubClass2Test(this.symbol, this.str, this.num);
    }

    @Override
    public String toString() {
        return "SubClass2Test{" +
                "num=" + num +
                ", str='" + str + '\'' +
                ", symbol=" + symbol +
                '}';
    }
}
