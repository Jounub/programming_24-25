package lr5.Example6;

public class Task6 {
    private int min;
    private int max;

    Task6(){
    }

    Task6(int value){
        this.max = Math.max(this.max, value);
        this.min = Math.min(this.min, value);
    }
    Task6(int x, int y){
        this.max = Math.max(x, y);
        this.min = Math.min(x, y);
    }

    public void setNums(int value){
        this.max = Math.max(this.max, value);
        this.min = Math.min(this.min, value);
    }
    public void setNums(int x, int y){
        this.max = Math.max(x, y);
        this.min = Math.min(x, y);
    }

    public void printNums(){
        System.out.println("Min = " + min + "; Max = " + max);
    }
}
