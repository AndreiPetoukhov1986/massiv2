import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static int[] generateRandomArray() {
  java.util.Random random = new java.util.Random(7);
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 100;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача №1");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }


        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задача №2, первый способ");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Минимальная сумма трат за месяц составила " + arr[0] + " рублей");
        System.out.println("Максимальная сумма трат за месяц составила " + arr[arr.length - 1] + " рублей");
    }

    public static void task3() {
        System.out.println("Задача №2, второй способ");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за месяц составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за месяц составила " + max + " рублей");
    }

    public static void task4() {
        System.out.println("Задача №4");
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int sum = 0;
         for (int i = 0; i< arr.length ; i++) {
            sum = sum+arr[i];
           }
        System.out.printf("Cредняя сумма трат за мессяц %.1f рублей%n", (double) sum/ arr.length);

    }
    public static void task5() {
        System.out.println("Задача №4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i =reverseFullName.length -1; i >=0 ; i--) {
            System.out.print(reverseFullName[i]);

        }
    }
}






