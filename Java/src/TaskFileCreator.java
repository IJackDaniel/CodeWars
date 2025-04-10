import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TaskFileCreator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter task name: ");
        String classNameInput = scanner.nextLine().trim();
        String originalName = classNameInput; // Сохраняем оригинальное имя с пробелами

        // Ввод сложности задачи
        int difficulty = 0;
        while (difficulty < 1 || difficulty > 8) {
            System.out.print("Enter task difficulty (1-8): ");
            try {
                difficulty = Integer.parseInt(scanner.nextLine());
                if (difficulty < 1 || difficulty > 8) {
                    System.out.println("Difficulty must be between 1 and 8");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number between 1 and 8");
            }
        }

        // Ввод названия функции
        System.out.print("Enter function name: ");
        String functionName = scanner.nextLine().trim();
        while (!isValidFunctionName(functionName)) {
            System.out.print("Invalid function name. Enter valid function name: ");
            functionName = scanner.nextLine().trim();
        }

        // Validate class name (теперь заменяем пробелы на _ перед валидацией)
        String className;
        try {
            className = validateAndCreateClassName(classNameInput.replace(' ', '_'));
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
            scanner.close();
            return;
        }

        // Create standard source directory if needed
        Path srcDir = Paths.get("src");
        try {
            if (!Files.exists(srcDir)) {
                Files.createDirectory(srcDir);
                System.out.println("Created src directory");
            }
        } catch (IOException e) {
            System.err.println("Failed to create src directory: " + e.getMessage());
            scanner.close();
            return;
        }

        // Create file content without package declaration
        String fileContent = "// Task name: " + originalName + "\n"  // Используем оригинальное имя здесь
                + "// Difficulty: " + difficulty + " kyu\n"
                + "// Condition: Task has not been solved\n"
                + "// Date of creation: " + LocalDate.now().format(DateTimeFormatter.ISO_DATE) + "\n"
                + "\n"
                + "public class " + className + " {\n"
                + "    public static void main(String[] args) {\n"
                + "        var result = " + functionName + "();\n"
                + "        System.out.println(result);\n"
                + "        result = " + functionName + "();\n"
                + "        System.out.println(result);\n"
                + "    }\n"
                + "\n"
                + "    static String " + functionName + "() {\n"
                + "        return \"Function '" + functionName + "' result\";\n"
                + "    }\n"
                + "}";

        // Create Java file in src directory
        Path filePath = srcDir.resolve(className + ".java");
        try {
            Files.write(filePath, fileContent.getBytes());
            System.out.println("Java class created successfully: " + filePath);
            System.out.println("IntelliJ IDEA will recognize this as a Java class");
        } catch (IOException e) {
            System.err.println("Error creating Java file: " + e.getMessage());
        }

        scanner.close();
    }

    private static String validateAndCreateClassName(String input) throws IllegalArgumentException {
        if (input == null || input.trim().isEmpty()) {
            throw new IllegalArgumentException("Class name cannot be empty");
        }

        String className = input.trim(); // Пробелы уже заменены на _, просто обрезаем концы
        if (className.isEmpty()) {
            throw new IllegalArgumentException("Class name contains only spaces");
        }

        if (!Character.isJavaIdentifierStart(className.charAt(0))) {
            throw new IllegalArgumentException("Class name must start with a letter, $ or _");
        }

        for (int i = 1; i < className.length(); i++) {
            if (!Character.isJavaIdentifierPart(className.charAt(i))) {
                throw new IllegalArgumentException("Invalid character in class name: '" +
                        className.charAt(i) + "'");
            }
        }

        if (isJavaKeyword(className)) {
            throw new IllegalArgumentException("'" + className + "' is a Java reserved word");
        }

        return Character.toUpperCase(className.charAt(0)) + className.substring(1);
    }

    private static boolean isJavaKeyword(String word) {
        String[] keywords = {
                "abstract", "assert", "boolean", "break", "byte", "case", "catch",
                "char", "class", "const", "continue", "default", "do", "double",
                "else", "enum", "extends", "final", "finally", "float", "for",
                "goto", "if", "implements", "import", "instanceof", "int",
                "interface", "long", "native", "new", "package", "private",
                "protected", "public", "return", "short", "static", "strictfp",
                "super", "switch", "synchronized", "this", "throw", "throws",
                "transient", "try", "void", "volatile", "while", "true", "false", "null"
        };

        for (String keyword : keywords) {
            if (keyword.equalsIgnoreCase(word)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isValidFunctionName(String name) {
        if (name == null || name.trim().isEmpty()) {
            return false;
        }

        String trimmedName = name.trim();
        if (trimmedName.isEmpty()) {
            return false;
        }

        if (!Character.isJavaIdentifierStart(trimmedName.charAt(0))) {
            return false;
        }

        for (int i = 1; i < trimmedName.length(); i++) {
            if (!Character.isJavaIdentifierPart(trimmedName.charAt(i))) {
                return false;
            }
        }

        return !isJavaKeyword(trimmedName);
    }
}