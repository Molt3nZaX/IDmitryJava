package andersen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tasks {
    static Scanner scanner = new Scanner(System.in);

    public static String getFirstAlgorithm() {
        System.out.print("Если введешь число больше 7, то я скажу \"Привет\", а если меньше, то промолчу!\n");
        System.out.print("Введи любое целое число: ");

        try {
            int inputNumber = scanner.nextInt();
            return inputNumber > 7 ? "Привет" : "";
        } catch (Exception e) {
            System.out.println("Введено нецелочисленное число");
            throw new RuntimeException(e);
        }
    }

    public static String getSecondAlgorithm() {
        System.out.print("Я поздороваюсь с тобой, если твое имя есть в моей базе данных\n");
        System.out.print("Пожалуйста, введи свое имя: ");
        String inputName = scanner.next().trim();

        return inputName.equalsIgnoreCase("Вячеслав") ? "Привет, Вячеслав" : "Нет такого имени";
    }

    public static List<Integer> getThirdAlgorithm() {
        System.out.print("Введи целое число, которое будет равно длине массива: ");
        int arrayLength = scanner.nextInt();

        int[] inputArray = new int[arrayLength];
        System.out.print("Введи " + arrayLength + " чисел(-a): \n");
        for (int i = 0; i < arrayLength; i++) {
            System.out.println(i + " элемент массива: ");
            inputArray[i] = scanner.nextInt();
        }
        List<Integer> elementsList = new ArrayList<>();
        for (int element : inputArray) {
            if (element % 3 == 0) {
                elementsList.add(element);
            }
        }
        return elementsList;
    }

    public static void printList(List<Integer> list) {
        for (Integer number : list) {
            System.out.println("Число кратное 3: " + number);
        }
    }
}