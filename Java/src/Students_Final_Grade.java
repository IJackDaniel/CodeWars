// Task name: Student's Final Grade
// Difficulty: 8 kyu
// Condition: Task has been solved
// Date of creation: 2025-04-11

public class Students_Final_Grade {
    public static void main(String[] args) {
        var result = finalGrade(99, 1);
        System.out.println(result);
        result = finalGrade(76, 5);
        System.out.println(result);
        result = finalGrade(76, 4);
        System.out.println(result);
        result = finalGrade(52, 1);
        System.out.println(result);
    }

    public static int finalGrade(int exam, int projects){
        if (exam > 90 || projects > 10) {
            return 100;
        } else if (exam > 75 &&  projects >= 5) {
            return 90;
        } else if (exam > 50 &&  projects >= 2) {
            return 75;
        } else {
            return 0;
        }
    }
}