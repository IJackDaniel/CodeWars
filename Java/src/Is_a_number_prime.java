// Task name: Is a number prime
// Difficulty: 6 kyu
// Condition: Task has been solved
// Date of creation: 2025-04-17

public class Is_a_number_prime {
    public static void main(String[] args) {
        var result = isPrime(0);
        System.out.println(result);
        result = isPrime(1);
        System.out.println(result);
        result = isPrime(2);
        System.out.println(result);
        result = isPrime(73);
        System.out.println(result);
        result = isPrime(75);
        System.out.println(result);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) { return false; }
        for (int num_2 = 2; num_2 < (int)Math.sqrt(num) + 1; num_2++) {
            if (num % num_2 == 0) { return false; }
        }
        return true;
    }
}