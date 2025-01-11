package lr4;

public class Example2 {
    public static void main(String[] args) {
        int figure = 10;
        int z = 1;

        for(int i = 0; i < figure; i++){
            for(int j = 0; j < z; j++){
                System.out.print("+");
            }
            z += 1;
            System.out.println();
        }
    }
}
