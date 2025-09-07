public class Lesson6 {
    public static void main(String[] args) {

    }

    public final class Integer { // нельзя наследовать из-за final
        private  final int value; // значение полю можно присвоить только единожды и оно будет неизменяемо из-за final

        public Integer(int value) { // конструктор
            this.value = value;
        }

        public int intValue() {
            return value;
        }
    }

    public final class Math {
        private Math() {} // сделали запрет на вызов конструктора класса
    }

    public class BigInteger {
        public BigInteger(String val) {
            this(val, 10); // конструктор вызывает другой конструктор
        }

        public BigInteger(String val, int radix) {
            //...
        }
    }

    public class FileInputStream {
        protected void finalize() { // старый сборщик мусора
            //cleanup
        }

        public void close() { // новый сборщик мусора
            //cleanup
        }
    }



}
