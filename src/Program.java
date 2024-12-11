import java.util.Random;
import java.util.Scanner; // Подгружаем библиотеку, где находиться класс Scanner

public class Program {

    public static int rnd(int MAX)              // Заводим метод rnd
    {
        return (int) (Math.random() * ++MAX);  // Используем класс Math и в нем используем метод random.
                                                // Умнажаем на 101
    }









    public static void main(String[] args) { // Вход в программу

        final int MAX = 100; // это константа максимального значения
        final int RND = rnd(MAX); // Тут хитрим и рандомим над значением 101

        System.out.println("Число, которое загодал комп.: " + RND);

        Scanner in = new Scanner(System.in); // Тут, видимо, инициируем использование класса Scanner и присваеваем
                                             // ему объект System in


        System.out.print("Введи число, которое загодал компьютер ");
        int bone = in.nextInt();


        if (bone == RND)
            System.out.println("Количество попыток и загаданное число  ");
        if (bone < RND)
            System.out.println("Я сам в шоке, но, загаданное число больше, брат  ");
        else
            System.out.println("Не ожидал от тебя такого. Загаданное число меньше, брат  ");



        System.out.printf("Bone %d \n", bone);


        Random rnd = new Random(); // Если я правильно понял, то здесь
        // мы объявляем переменную rnd и назначаем тип, но не приметивный,
        // а с типом Random
        int x = rnd.nextInt(100) + 1; // Здесь мы объявляем
        // приметивную перемену х и присваем ей значение от метода
        // nextInt, но т.к. это от 0 до max ты мы прибавляем 1 и получим
        // от 1 до 100, иначе мы выбираем от 0 до 99.
        System.out.println(x);

        in.close();                                   // Прекращаем программу.
    }
}