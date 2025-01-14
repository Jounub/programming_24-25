package lr5.Example4;

public class Task4 {
    private int num;
    private char ch;

    Task4(int n, char c){
        this.num = n;
        this.ch = c;
    }

    Task4(double value){
        this.ch = (char)value;
        this.num = (int)((value - (int)value) * 100);
    }

    public int getNum() {
        return num;
    }

    public char getCh() {
        return ch;
    }
}
