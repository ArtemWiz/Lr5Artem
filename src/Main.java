import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
    }
}