// Task name: Grasshopper Personalized Message
// Difficulty: 8 kyu
// Condition: Task has been solved
// Date of creation: 2025-04-10

public class Grasshopper_Personalized_Message {
    public static void main(String[] args) {
        var result = greet("Daniel", "Daniel");
        System.out.println(result);
        result = greet("Greg", "Daniel");
        System.out.println(result);
        result = greet("Jen", "Jen");
        System.out.println(result);
    }

    static String greet(String name, String owner) {
        return name.equals(owner) ? "Hello boss" : "Hello guest";
    }
}