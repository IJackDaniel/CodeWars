// Task name: Printing Array elements with Comma delimiters
// Difficulty: 8 kyu
// Condition: Task has been solved
// Date of creation: 2025-05-05

public class Printing_Array_elements_with_Comma_delimiters {
    public static void main(String[] args) {
        var result = printArray(new Object[]{ 2, 4, 5, 2 });
        System.out.println(result);
        result = printArray(new Object[]{ 7, 1, 5, 2 });
        System.out.println(result);
    }

    public static String printArray(Object[] array) {
        String result = "";
        for (Object el : array) {
            result = result + el + ",";
        }
        return result.substring(0, result.length() - 1);
    }
}