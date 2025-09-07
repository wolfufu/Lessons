public class testLessons1and2 {
    public static void main(String[] args) {

        System.out.println("A" + 12); // A12
        System.out.println('A' + '1' + '2'); // 164
        System.out.println('A' + "12"); // A12
        System.out.println("A" + ('\t' + '\u0003')); // A12

        boolean itIs = isPalindrome("те , нет");

        System.out.println(itIs);
    }

    /**
     * Checks if given <code>text</code> is a palindrome.
     *
     * @param text any string
     * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
     */
    public static boolean isPalindrome(String text) {
        String stringOnlySymbolsAndNumbers = text.replaceAll("[^A-Za-zА-Яа-я0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(stringOnlySymbolsAndNumbers);
        sb.reverse();
        String stringReverse = sb.toString();

        return stringOnlySymbolsAndNumbers.equals(stringReverse);
    }
}
