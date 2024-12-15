import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessTheHiddenNumber {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var attempts = 100;

        var number = ThreadLocalRandom.current().nextInt(1, 101);
        var currentAttempts = attempts;
        System.out.println("Угодай число от 0 до 100 ");
        while (currentAttempts > 0) {
            currentAttempts--;
            var input = Integer.parseInt(scanner.nextLine());
            if (input == number)
                break;
            else
                System.out.println((input < number ? "Я сам в шоке, но, загаданное число больше, брат" : "Не ожидал от тебя такого. Загаданное число меньше, брат"));
        }
        if (currentAttempts > 0)
            System.out.println("Вы угадали!");
        else {
            System.out.println("You loose! Better luck next time!");
            System.out.println("загаданное число " + number);
        }

        System.out.println("Количество попыток " + (100 - currentAttempts));
        System.out.println("загаданное число " + number);
    }
}
