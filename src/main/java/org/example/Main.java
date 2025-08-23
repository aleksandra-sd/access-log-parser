package org.example;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Получим первое число
        System.out.println("Введите первое число:");
        int number1 = new Scanner(System.in).nextInt();

        //Получим второе число
        System.out.println("Введите второе число:");
        int number2 = new Scanner(System.in).nextInt();

        //Действия над числами
        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        double quotient = number1 / number2;

        //Выводим результат
        System.out.println("Сумма чисел: " + sum);
        System.out.println("Разность чисел: " + difference);
        System.out.println("Произведение чисел: " + product);
        System.out.println("Частное чисел: " + quotient);

    }
}
