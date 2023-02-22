import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final int ARR_SIZE = 15;
        int[] arr = new int[ARR_SIZE];

        final int RND_BOUND = 20; // Интервал генерируемых значений: [-RND_BOUND, RND_BOUND)
        Random rnd = new Random();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Инициализация массива
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(2 * RND_BOUND) - RND_BOUND;
        }

        // Вычисление максимального и минимального значений в массиве
        for (int el: arr) {
            max = Math.max(max, el);
            min = Math.min(min, el);
        }

        System.out.println("Максимальный элемент массива:   " + max);
        System.out.println("Минимальный элемент массива:    " + min);
        System.out.println("Наибольшее по модулю значение:  " + Math.max(Math.abs(min), Math.abs(max)));
    }
}