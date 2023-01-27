import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Day today = Day.SUNDAY;
        System.out.println("Сегодня " + today.value);
        System.out.println(" ");
        for (int i = 0; i < Day.Values.size(); i++){
            System.out.println(Day.Values.get(i));
        }
        System.out.println(" ");
        for (String days : Day.Values){
            System.out.println(days);
        }
        System.out.println(" ");
        Iterator iterator = Day.Values.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public enum Day {
        SUNDAY("Воскресенье"),
        MONDAY("Понедельник"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THURSDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("Суббота");

        private static final List<String> Values;

        static {
            Values = new ArrayList<>();
            for (Day day : Day.values()){
                Values.add(day.value);
            }
        }

        public final String value;

        Day(String value) {
            this.value = value;
        }

        public static List<String> getValues(){
            return Collections.unmodifiableList(Values);
        }
    }
}