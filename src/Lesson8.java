public class Lesson8 {

    public interface CharSequence {

        int length();

        char charAt(int index);

        CharSequence subSequence(int start, int end);
    }

    public interface Appendable {

        Appendable append(CharSequence csq);

        Appendable append(CharSequence csq, int start, int end);

        Appendable append(char c);
    }

    // интерфейсы позволяют писать максимально обобщенный код, допускающий разнообразные реализации

    @FunctionalInterface
    public interface Runnable {
        void run();
    }

    @FunctionalInterface
    public interface Comparator<T> {
        int compare(T o1, T o2);

        // if obj1 < obj2 = -1
        // if obj1 == obj2 = 0
        // if obj1 > obj2 = +1
    }

}
