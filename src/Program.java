import java.util.Random;
import java.util.Scanner; // Подгружаем библиотеку, где находиться класс Scanner

public class Program {

    public static int rnd()
    {
        Random rnd = new Random();
        return (rnd.nextInt(100) + 1);
    }

    public static int UserChoice()
    {

        System.out.println("Отгадай загаданное число ");
        Scanner in = new Scanner(System.in);
        return (in.nextInt());
    }

    public static void main(String[] args) { // Вход в программу


        int madeANumber = rnd();
        System.out.println("Число, которое загодал комп.: " + madeANumber);
        int answerOption = UserChoice();



        if (answerOption < madeANumber){
            System.out.println("Число, которое загодал комп.: " + madeANumber);
            System.out.println("Я сам в шоке, но, загаданное число больше, брат  ");
        }

        if (answerOption > madeANumber){
            System.out.println("Число, которое загодал комп.: " + madeANumber);
            System.out.println("Не ожидал от тебя такого. Загаданное число меньше, брат  ");
        }

        if (answerOption == madeANumber){
            System.out.println("Число, которое загодал комп.: " + madeANumber);
            System.out.println("Молодец!");
            //in.close();
        }
    }
}