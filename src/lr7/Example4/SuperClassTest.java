package lr7.Example4;

public class SuperClassTest {
    public char symbol;

    public SuperClassTest(char symbol) {
        this.symbol = symbol;
    }

    public SuperClassTest createClassCopy(){
        return new SuperClassTest(this.symbol);
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return "SuperClassTest{" +
                "symbol=" + symbol +
                '}';
    }
}
