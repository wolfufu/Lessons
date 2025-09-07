public class Lesson3 {
    public static void main(String[] args) {

        // условные операторы

        boolean weatherIsGood = true;

        if (weatherIsGood) {
            System.out.println("Weather is good!");
        } else {
            System.out.println("Weather is bad!");
        }

        System.out.println("Weather is " + (weatherIsGood ? "good!" : "bad!"));

        int digit = 0;
        String text;

        switch (digit) { // byte, short, char, int, Byte, Short, Character, Integer, String, enum
            case 0:
                text = "zero";
                break;
            case 1:
                text = "one";
                break;
            default:
                text = "???";
        }

        System.out.println(text);

        // циклы

        boolean haveTime = true;
        boolean haveMoney = true;
        String goShopping = "yay!";

        while (haveTime && haveMoney) {
            System.out.println(goShopping);
            break; // завершаем цикл, иначе он будет вечно работать
        }

        do {
            System.out.println(goShopping);
            break;
        } while (haveTime && haveMoney); // цикл с постусловием

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        /* for (;;) - бесконечный цикл

        for (String arg : args) {
            System.out.println(arg); - перебор коллекции
        }

        outer:
        for (...) {
            for (...) {
                ...
                break outer; - метка выхода
            }
        }
         */

    }
}
