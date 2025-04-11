// Task name: Volume of a Cuboid
// Difficulty: 8 kyu
// Condition: Task has been solved
// Date of creation: 2025-04-11

public class Volume_of_a_Cuboid {
    public static void main(String[] args) {
        double result = getVolumeOfCuboid(1, 2, 2);
        System.out.println(result);

        result = getVolumeOfCuboid(6.3, 2, 5);
        System.out.println(result);
    }

    public static double getVolumeOfCuboid(final double length, final double width, final double height) {
        return length * width * height;
    }
}