import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int key = 3;

        StringBuilder result = new StringBuilder();


        for (int i = 0; i < input.length(); i++) {
           result.append((char) (input.charAt(i) + key));
        }

        System.out.println(result);
    }
}
