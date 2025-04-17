// Task name: Looking for a benefactor
// Difficulty: 7 kyu
// Condition: Task has been solved
// Date of creation: 2025-04-17

public class Looking_for_a_benefactor {
    public static void main(String[] args) {
        double[] a = new double[] {14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0};
        var result = newAvg(a, 90);
        System.out.println(result);

        a = new double[] {14, 30, 5, 7, 9, 11, 15};
        result = newAvg(a, 92);
        System.out.println(result);

        a = new double[] {14, 30, 5, 7, 9, 11, 15};
        result = newAvg(a, 2);
        System.out.println(result);
    }

    public static long newAvg(double[] arr, double navg) {
        // nn = navg * (len + 1) - sum
        double sum = 0;
        for (double elem : arr) {
            sum += elem;
        }
        long nnum = (long) Math.ceil(navg * (arr.length + 1) - sum);
        if (nnum <= 0) {
            throw new IllegalArgumentException();
        }
        return nnum;
    }
}