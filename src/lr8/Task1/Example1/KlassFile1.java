package lr8.Task1.Example1;

import java.io.File;

public class KlassFile1 {
    public static void main(String[] args) {
        try {
            File f1 = new File("MyFile.txt");
            f1.createNewFile();
            if(f1.exists()){
                System.out.println("Создан!!");
                System.out.println("Полный путь1: " + f1.getAbsolutePath());
            }

            File f2 = new File("E:\\MyFile2.txt");
            f2.createNewFile();
            System.out.println("Полный путь2: " + f2.getAbsolutePath());

            File f3 = new File("E:\\Papka1\\Papka2\\Papka3");
            f3.mkdirs();
            System.out.println("Полный путь3: " + f3.getAbsolutePath());
        } catch (Exception e){
            System.out.println("Ошибка!" + e);
        }
    }
}
