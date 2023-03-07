import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Task1

        System.out.print("Введите строку: ");
        String str1 = in.nextLine();

        System.out.print("Введите часть строки: ");
        String str2 = in.nextLine();

        System.out.println(str1.contains(str2));

        // Task2

        System.out.print("Введите строку в обратном порядке для проверки: ");
        String str3 = in.nextLine();

        System.out.println(str1.equals(new StringBuilder(str3).reverse().toString()));

        // Task3

        System.out.println("Перевёрнутая строка с помощью рекурсии: " + reverse(str1, str1.length() - 1));

        // Task4

        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();

        StringBuilder addition = new StringBuilder().append(num1).append(" + ").append(num2).append(" = ")
                .append(num1 + num2);

        StringBuilder subtraction = new StringBuilder().append(num1).append(" - ").append(num2).append(" = ")
                .append(num1 - num2);

        StringBuilder multiplication = new StringBuilder().append(num1).append(" * ").append(num2).append(" = ")
                .append(num1 * num2);

        System.out.println(addition + "\n" + subtraction + "\n" + multiplication);

        // Task5

        addition.insert(addition.indexOf("="),"равно").deleteCharAt(addition.indexOf("="));
        subtraction.insert(subtraction.indexOf("="),"равно").deleteCharAt(subtraction.indexOf("="));
        multiplication.insert(multiplication.indexOf("="),"равно").deleteCharAt(multiplication.indexOf("="));
        
        System.out.println(addition + "\n" + subtraction + "\n" + multiplication);

        // Task6

        addition.replace(addition.indexOf("="), addition.indexOf("=") + 1, "равно");
        subtraction.replace(subtraction.indexOf("="), subtraction.indexOf("=") + 1, "равно");
        multiplication.replace(multiplication.indexOf("="), multiplication.indexOf("=") + 1, "равно");
        
        System.out.println(addition + "\n" + subtraction + "\n" + multiplication);

        // Task7

        String tenThousandEqualsS = "=".repeat(10000);
        StringBuilder tenThousandEqualsSB = new StringBuilder("=".repeat(10000));
        
        long start = System.currentTimeMillis();
        tenThousandEqualsS = tenThousandEqualsS.replace("=", "равно");
        long end = System.currentTimeMillis();

        System.out.println("Время выполнения с 'String': " + (end - start) + " мс");

        start = System.currentTimeMillis();
        while (tenThousandEqualsSB.indexOf("=") != -1)
            tenThousandEqualsSB.replace(tenThousandEqualsSB.indexOf("="), tenThousandEqualsSB.indexOf("=") + 1, "равно");
        end = System.currentTimeMillis();

        System.out.println("Время выполнения с 'StringBuilder': " + (end - start) + " мс");
    }

    static String reverse(String str, int index) {
        if (index >= 0) {
            return str.charAt(index) + reverse(str, index - 1);
        }
        return "";
    }
}