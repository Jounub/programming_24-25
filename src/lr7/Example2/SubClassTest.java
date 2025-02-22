package lr7.Example2;

public class SubClassTest extends SuperClassTest{
    public int num;

    SubClassTest(String strEx){
        super(strEx);
    }

    SubClassTest(String strEx, int n){
        super(strEx);
        this.num = n;
    }

    @Override
    public void setFields(String str1) {
        super.setFields(str1);
    }

    public void setFields(){
        super.setFields("метод подкласса без параметров");
        this.num = 0;
    }

    public void setFields(int n){
        super.setFields("метод подкласса с целочисленным параметром");
        this.num = n;
    }

    public void setFields(String str1, int n){
        super.setFields(str1);
        this.num = n;
    }

    public int getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "SubClassTest{" +
                "num = " + num +
                "; str1 = '" + getStr1() + "'" +
                "; str1 length = " + getStr1Length() +
                '}';
    }
}
