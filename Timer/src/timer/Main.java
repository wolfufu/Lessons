package timer;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Timer timer = new Timer();
        //анонимный класс
        long time = timer.measureTime(() -> {
            new BigDecimal("1234567").pow(100000); // timer.measureTime(Main::bigDecimalPower); // ссылка на метод
        });
        System.out.println(time);
    }

//    public static void bigDecimalPower() {
//        new BigDecimal("1234567").pow(100000);
//    }
}
