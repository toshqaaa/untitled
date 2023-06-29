import java.util.ArrayList;
import java.util.Collections;

/*
Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке.
 */
public class SecondTask {
    ArrayList<String> planets = new ArrayList<>();
    ArrayList<String> uniquePlanets = new ArrayList<>();

    SecondTask() {
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Венера");
        planets.add("Марс");
        planets.add("Земля");
        planets.add("Земля");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Плутон");
        planets.add("Марс");
        planets.add("Марс");
    }

    public void getUniquePlanets() {
        for (int i = 0; i < planets.size(); i++) {
            for (int j = 0; j < planets.size(); j++) {
                if (i != j && planets.get(i).equals(planets.get(j))
                    && !uniquePlanets.contains(planets.get(i))) {
                    int count = Collections.frequency(planets, planets.get(i));
                    System.out.println(planets.get(i) + " " + count);
                    uniquePlanets.add(planets.get(i));
                }
            }
        }
        System.out.println(uniquePlanets);
    }
}
