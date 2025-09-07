public class Lesson2 {
    public static void main(String[] args) {
        // строки

        String hello = "Hello";
        String specialChars = "\r\n\t\"\\";
        String empty = "";

        char[] charArray = {'a', 'b', 'c'};
        String string = new String(charArray);
        char[] charsFromString = string.toCharArray();

        String zeros = "\n0000\n0000";

        // строки неизменяемы!

        String s = "stringIsImmutable";
        int length = s.length();
        char firstChar = s.charAt(0); // получение символа по индексу
        boolean endsWithTable = s.endsWith("table"); // строка заканчивается на ...
        boolean containsIs = s.contains("Is"); // в строку входит ...

        System.out.println(firstChar);
        System.out.println(endsWithTable);
        System.out.println(containsIs);

        String substring = s.substring(0, 6); // вырезка с 0 по 6 индекс из строки
        String afterReplace = s.replace("Imm", "M"); // замена подстроки на другую подстроку
        String allCapitals = s.toUpperCase(); // перевод всех символов в верхний регистр

        System.out.println(substring);
        System.out.println(afterReplace);
        System.out.println(allCapitals);

        String world = " world!";
        String helloWorld = hello + world; // конкатенация строк

        System.out.println(helloWorld);

        //StringBuilder допускает изменение строки

        StringBuilder sb = new StringBuilder();
        sb.append(hello);
        sb.append(world);
        String helloWorld2 = sb.toString(); //конкатенация, но другим способом
        System.out.println(helloWorld);

        // сравнение строк

        // boolean referenceEquals = s1 == s2;
            // сравнивает ссылки
        // boolean contentEquals = s1.equals(s2);
            // сравнение содержимого
        // boolean contentEqualsIgnoreCase = s1.equalsIgnoreCase(s2);
            // сравнение содержимого без учета регистра
    }
}
