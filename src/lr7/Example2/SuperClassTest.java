package lr7.Example2;

public class SuperClassTest {
    private String str1;

    SuperClassTest(String strEx) {
        this.str1 = strEx;
    }

    public void setFields(String str1) {
        this.str1 = str1;
    }

    public int getStr1Length(){
        if(this.str1 == null) return 0;
        return str1.length();
    }

    public String getStr1() {
        return str1;
    }

    @Override
    public String toString() {
        return "SuperClassTest{" +
                "str1 = " + str1 +
                "; str1 length = " + getStr1Length() +
                '}';
    }
}
