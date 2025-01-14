package lr6.Example1;

public class Task1 {
    private char ch;
    private String text;

    public void setField(char value){
        this.ch = value;
    }

    public void setField(String value){
        this.text = value;
    }

    public void setField(char[] value){
        if(value.length == 1){
            this.ch = value[0];
        }
        else {
            this.text = new String(value);
        }
    }

    public void printFields(){
        System.out.println("Char = " + this.ch + "; string = " + this.text);
    }
}
