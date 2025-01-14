package lr5.Example1;

public class Task1 {
    private char ch1;

    public void setCh1(char value) {
        this.ch1 = value;
    }

    public int getCharCode(){
        return ch1;
    }

    public void showCodeAndValue(){
        System.out.println("Value = " + ch1);
        System.out.println("Code = " + (int)ch1);
    }
}
