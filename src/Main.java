import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Nummer 2
        // Зчитуємо два цілих числа з клавіатури
        System.out.print("Введіть перше ціле число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введіть друге ціле число: ");
        int number2 = scanner.nextInt();

        // Обчислюємо квадратні корені
        double sqrt1 = Math.sqrt(number1);
        double sqrt2 = Math.sqrt(number2);

        // Перевіряємо, чи менше з чисел менше від значення квадратного кореня з більшого числа
        if (Math.min(number1, number2) < Math.max(sqrt1, sqrt2)) {
            System.out.println("ТАК");
        } else {
            System.out.println("НІ");
        }

        //Nummer 3
        Scanner scanner1 = new Scanner(System.in);

        // Зчитуємо ціле число з клавіатури
        System.out.print("Введіть ціле число: ");
        int number = scanner1.nextInt();
        scanner.nextLine(); // Поглинаємо символ нового рядка

        // Зчитуємо рядок з клавіатури
        System.out.print("Введіть рядок: ");
        String inputString = scanner1.nextLine();

        // Перевіряємо, чи це число дорівнює довжині рядка
        if (number == inputString.length()) {
            System.out.println("ТАК");
        } else {
            System.out.println("НІ");
        }
    }
}