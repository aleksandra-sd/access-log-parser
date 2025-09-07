package org.example;

import java.io.File;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //System.out.println("Случайное число от 0 до 1: " + Math.random());

        int fileCount = 0;
        while (true) {
            System.out.println("Введите путь к файлу:");
            String path = new Scanner(System.in).nextLine();

            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();

            if (!fileExists || !isDirectory) {
                System.out.println("Ошибка: указанный файл не существует или указанный путь является путём к папке.");
                continue;
            }
            fileCount++;
            System.out.println("Путь указан верно. Это файл номер " + fileCount);
        }
    }
}
