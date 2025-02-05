import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] arr = {12000, 17800, 15300, 14346, 11432};
        float sum = 0;
        for (int index = 0; index < arr.length; index++) {
            sum += arr[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");
        System.out.println("Задача 2");
        int min = arr[0];
        int max = -1;
        for (int current : arr) {
            if (current < min) {
                min = current;
            }
            if (current > max) {
                max = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей.");
        System.out.println("Задача 3");
        float average = 0;
        average = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char a;
        for (int i = 0; i < reverseFullName.length / 2; i++) {
            a = reverseFullName[i];
            reverseFullName[i] = reverseFullName[reverseFullName.length - 1 - i];
            reverseFullName[reverseFullName.length - 1 - i] = a;
        }
        for (int i = 0; i < reverseFullName.length; i++) {
            System.out.print(reverseFullName[i]);
        }
    }
}