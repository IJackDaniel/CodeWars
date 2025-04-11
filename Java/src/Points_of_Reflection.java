// Task name: Points of Reflection
// Difficulty: 8 kyu
// Condition: Task has been solved
// Date of creation: 2025-04-11

public class Points_of_Reflection {
    public static void main(String[] args) {

        int[] result = reflectPoint(new int[]{0,0}, new int[]{1,1});
        for (int elem : result) {
            System.out.print(elem + " ");
        }
        System.out.print("\n");

        result = reflectPoint(new int[]{2,6}, new int[]{-2,-6});
        for (int elem : result) {
            System.out.println(elem + " ");
        }
        System.out.print("\n");
    }

    public static int[] reflectPoint(int[] p, int[] q) {
        int x_p1 = -(p[0] - q[0]) + q[0];
        int y_p1 = -(p[1] - q[1]) + q[1];
        return new int[] {x_p1, y_p1};
    }
}