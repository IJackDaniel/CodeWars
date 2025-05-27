// Task name: Counting Duplicates
// Difficulty: 6 kyu
// Condition: Task has not been solved
// Date of creation: 2025-05-25

public class Counting_Duplicates {
    public static void main(String[] args) {
        var result = duplicateCount("abcde");
        System.out.println(result);
        result = duplicateCount("abcdea");
        System.out.println(result);
        result = duplicateCount("indivisibility");
        System.out.println(result);
    }

    static int duplicateCount(String inp) {
        char[] letters = inp.toCharArray();
        int result = 0;
        char[] find;
        for (char elem : letters) {
            
        }
        return result;
    }
}