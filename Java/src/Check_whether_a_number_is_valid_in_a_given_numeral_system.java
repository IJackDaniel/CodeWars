// Task name: Check whether a number is valid in a given numeral system
// Difficulty: 7 kyu
// Condition: Task has been solved
// Date of creation: 2025-05-06

public class Check_whether_a_number_is_valid_in_a_given_numeral_system {
    public static void main(String[] args) {
        var result = validateBase("61262", 8);
        System.out.println(result);
        result = validateBase("ABCDEF", 16);
        System.out.println(result);
        result = validateBase("25172", 5);
        System.out.println(result);
        result = validateBase("EG", 16);
        System.out.println(result);
        result = validateBase("0", 5);
        System.out.println(result);
    }

    public static boolean validateBase(String num, int base) {
        String alph = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] arr = alph.substring(0, base).toCharArray();
        char[] arr2 = num.toCharArray();
        boolean result = true;
        boolean r;
        for (char elem : arr2) {
            r = false;
            for (char elem2 : arr) {
                if (elem == elem2) {
                    r = true;
                }
            }
            if (!r) {
                result = false;
                break;
            }
        }
        return result;
    }
}