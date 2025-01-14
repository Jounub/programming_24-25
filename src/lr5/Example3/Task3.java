package lr5.Example3;

public class Task3 {
    private int num1;
    private int num2;

    Task3(){
        this.num1 = 10;
        this.num2 = 10;
    }

    Task3(int value){
        this.num1 = value;
        this.num2 = 10;
    }

    Task3(int x, int y){
        this.num1 = x;
        this.num2 = y;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }
}
