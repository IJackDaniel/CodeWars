// Task name: Regexp Basics - is it a digit?
// Difficulty: 8 kyu
// Condition: Task has been solved
// Date of creation: 2025-04-11

public class Regexp_Basics_is_it_a_digit {
    public static void main(String[] args) {
        boolean result = isDigit("");
        System.out.println(result);

        result = isDigit("7");
        System.out.println(result);

        result = isDigit(" ");
        System.out.println(result);

        result = isDigit("a");
        System.out.println(result);

        result = isDigit("a5");
        System.out.println(result);

        result = isDigit("14");
        System.out.println(result);
    }

    // First try
//    static boolean isDigit(String s) {
//        if (s.isEmpty()) {
//            return false;
//        }
//
//        if (s.length() != 1) {
//            return false;
//        }
//
//        String[] digits = new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",};
//
//        for (String num : digits) {
//            if (s.equals(num)) {
//                return true;
//            }
//        }
//
//        return false;
//    }

    // Second try. I learned more about Class Character
    static boolean isDigit(String s) {
        return s != null && s.length() == 1 && Character.isDigit(s.charAt(0));
    }
}