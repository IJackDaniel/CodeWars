// Task name: Who likes it
// Difficulty: 6 kyu
// Condition: Task has been solved
// Date of creation: 2025-04-11

public class Who_likes_it {
    public static void main(String[] args) {
        String result = whoLikesIt("Peter");
        System.out.println(result);

        result = whoLikesIt("Jacob", "Alex");
        System.out.println(result);

        result = whoLikesIt("Max", "John", "Mark");
        System.out.println(result);

        result = whoLikesIt("Alex", "Jacob", "Mark", "Max");
        System.out.println(result);
    }

    public static String whoLikesIt(String... names) {
        if (names.length == 0) {
            return "no one likes this";
        } else if (names.length == 1) {
            return String.format("%s likes this", names[0]);
        } else if (names.length == 2) {
            return String.format("%s and %s like this", names[0], names[1]);
        } else if (names.length == 3) {
            return String.format("%s, %s and %s like this", names[0], names[1], names[2]);
        } else {
            return String.format("%s, %s and %d others like this", names[0], names[1], (names.length - 2));
        }
    }
}