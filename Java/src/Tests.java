import java.util.Scanner;

public class Tests {
    static String input;

    static void bot() {
        if (input.equals("1")) {
            System.out.println("Order confirmed");
        } else if (input.equals("2")) {
            System.out.println("info@sololearn.com");
        } else {
            System.out.println("Try again");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        bot();
    }
}