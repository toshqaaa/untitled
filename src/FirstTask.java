import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/*
Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран.
 */
public class FirstTask {

    public static ArrayList<Double> getRandomList() {
        ArrayList<Double> randomList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            randomList.add(Math.random());
        }
        return randomList;
    }

    public static void getSortedList() {
        ArrayList<Double> randomList = getRandomList();
        System.out.println(randomList);
        Collections.sort(randomList);
        System.out.println(randomList);
        Collections.reverse(randomList);
        System.out.println(randomList);
    }
}
