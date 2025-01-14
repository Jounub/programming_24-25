package lr5.Example5;

public class Task5 {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int value) {
        if(value > 100){
            value = 100;
        }
        this.num = value;
    }

    public void setNum(){
        this.num = 0;
    }

    Task5(int value){
        if(value > 100){
            value = 100;
        }
        this.num = value;
    }

    Task5(){
        this.num = 0;
    }
}
