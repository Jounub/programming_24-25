package lr4.Example8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования");
        String message = in.nextLine();

        System.out.println("Введите ключ шифрования");
        int shift = in.nextInt();

        String encryptedMessage = Encrypt.getEncryptedString(message, shift);
        System.out.println("Текст после преобразования: " + encryptedMessage);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        boolean continueInput = true;
        while (continueInput){
            String command = in.next();
            if(command.equals("y")){
                System.out.println("Текст после обратного преобразования: "
                        + Encrypt.getDecryptedString(encryptedMessage, shift));
                continueInput = false;
            }
            else if (command.equals("n")) {
                System.out.println("До свидания!");
                continueInput = false;
            }
            else {
                System.out.println("Введите корректный ответ");
            }
        }
    }
}
