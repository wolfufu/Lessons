public class Lesson7 {
    public static void main(String[] args) {
        for (DayOfWeek day: DayOfWeek.values()) {
            System.out.println(day.ordinal() + " " + day.name());
        }
    }

    public enum DayOfWeek { // каждому элементу эквивалентна запись public static final
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;

        // fields, methods
    }

    public final class Character {

        /*
        @Deprecated // показывают устаревшие методы
        public static boolean isJavaLetter(char c) {
            //...
        }
        */

        /*
        @SuppressWarnings("unchecked") // отключает предупреждения
        public static final Class<Character> TYPE = (Class<Character>) Class.getPrimitiveClass("char");
        */
    }

}
