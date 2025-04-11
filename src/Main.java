import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {
        printHello();
        System.out.println(hello("Elena"));

        System.out.printf("%s * %s = %s%s", 2, 3, multiply(2, 3), System.lineSeparator());

        int factorial = factorial(3);
        System.out.println(factorial);

        /**
         * Homework 4. Вызов методов
         * 1. Сумма всех чисел между двумя заданными
         */
        System.out.println("Cумма всех чисел между двумя заданными: " + sumRange(7,9));

        // 2. Два перегруженных метода add
        System.out.println("Cумма двух чисел: " + add(1,9));
        System.out.println("Cумма двух строк: " + add("Добрый ", "день!"));

        // 3. Максимальный элемент массива.
        int [] a = {-1, 2, 3, 10, -8, 0};
        System.out.println("Максимальный элемент массива: " + findMax(a));

        // 4. Факториал числа.
        System.out.println("Факториал: " + calculateFactorial(3));

        // 5.Два перегруженных метода calculateArea.
        System.out.println("Площадь круга: " + calculateArea(3));
        System.out.println("Площадь прямоугольника: " + calculateArea(3, 3));

        // 6. Cреднее арифметическое.
        System.out.println("Cреднее арифметическое: " + calculateAverage(3, 4, 5));

        // 7. Длина гипотенузы.
        System.out.println("Длина гипотенузы: " + calculateHypotenuse(3, 4));
    }

    /**
     * (public - модификатор доступа)
     * (static - вызов метода возможен без создания обьекта)
     * (возвращаемого типа или void = не имеет возвращаемого значения)
     * (имя метода)
     * (входящие параметры)
     */
    public static void printHello() {
        System.out.println("Hello");
    }

    public static String hello(String name) {
        return "Hello " + name;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Одниковые названия методов, но разные типы данных (входящие) или количество параметров
     */
    public static double multiply(double a, double b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    /**
     * Рекурсия
     * Факториал 3! = 1 * 2 * 3 = 6
     */
    static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /**
     * factorial(3)
     *     3 * factorial(2)
     *          2 * factorial(1)
     *               1 (базовый случай)
     *          -> 2 * 1 = 2
     *     -> 3 * 2
     * -> 6
     */

    /**
     * Homework 4. Создание методов
     * 1. 1. Создайте метод sumRange, который принимает два числа (начало и конец диапазона) и возвращает сумму всех чисел между ними (включительно).
     */
    public static int sumRange(int a, int b) {
        int res = 0;
        while (a <= b) {
            res = res + a;
            a++;
        }
        return res;
    }

    // 2. Создайте два перегруженных метода add: Первый складывает два целых числа; Второй складывает две строки.
    public static int add(int a, int b) {
        return a + b;
    }

    public static String add(String a, String b) {
        return a + b;
    }

    // 3. Напишите метод findMax, который принимает массив целых чисел и возвращает его максимальный элемент.
    public static int findMax(int[] a) {
        int max = a[0];
        for(int x = 1; x < a.length; x++) {
            if (a[x] > max) {
                max = a[x];
            }
        }
        return max;
    }

    // 4. Напишите метод, вычисляющий факториал числа с помощью цикла for
    public static int calculateFactorial(int a) {
        int factrl = 1;
        if (a < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным");
        }
        for(int x = 1; x <= a; x++) {
            factrl = factrl * x;
        }
        return factrl;
    }

    // 5. Создайте перегруженные методы calculateArea: Для круга (принимает радиус); Для прямоугольника (принимает длину и ширину).
    public static double calculateArea(int r) {
        return Math.round(Math.PI * r * r) * 100 / 100.0;
    }

    public static int calculateArea(int a, int b) {
        return a * b;
    }

    // 6. Реализуйте метод, который принимает три числа и возвращает их среднее арифметическое.
    public static double calculateAverage (int a, int b, int c) {
        return Math.round((a + b + c) / 3) * 100 / 100.0;
    }

    // 7. Напишите метод, который принимает два числа, представляющие длины катетов, и возвращает длину гипотенузы (используйте теорему Пифагора).
    public static double calculateHypotenuse (int a, int b) {
        return Math.round(sqrt((a * a) + (b * b))) * 100 / 100.0;
    }
}


