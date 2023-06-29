import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.

 */
public class ThirdTask {
    ArrayList<String> strings = new ArrayList<>();

    ThirdTask() {
        strings.add("a");
        strings.add(String.valueOf(1));
        strings.add("b");
        strings.add(String.valueOf(100));
        strings.add("c");
        strings.add("c");
        strings.add(String.valueOf(2));
        strings.add("a");
        strings.add(String.valueOf(7));
    }

    public void deleteDigits() {
        System.out.println(strings);

        Iterator<String> iterator = strings.iterator();
        ListIterator<String> stringListIterator = strings.listIterator();
        
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.matches("(\\d+)|([\\+-]?\\d+)")) {
                iterator.remove();
            }
        }

        System.out.println(strings);
    }
}
//                              [a, 1, b, 100, c, c, 2, a,  7]
//                              .  . .  ...                . .