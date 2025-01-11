package lr4;

public class Example1 {
    public static void main(String[] args) {
        int figure = 11;
        int i;
        int j;
        int z;

        for(i = 1; i <= figure; i++){
            //System.out.print("номер строки: " + i + " ");
            z = 0;
            for(j = 0; j < 23; j++){
                System.out.print("+");
                z += 1;
            }
            System.out.println(" Количество символов в строке " + z);
            System.out.println();
        }
    }
}
