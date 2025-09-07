import java.util.Arrays;
import java.math.BigInteger;

public class testLessons3and4 {
    public static void main(String[] args) {
        //System.out.println(factorial(3));

        int[] array1 = {0, 2, 2};
        int[] array2 = {1, 3};
        int[] mergeArray = mergeArrays(array1, array2);
        //System.out.println(Arrays.toString(mergeArray));

        String[] roles= {
                "Городничий","Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};

        String[] textLines={
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        System.out.println(printTextPerRole(roles, textLines));
    }

    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {
        BigInteger bigValue = BigInteger.valueOf(value);
        BigInteger result = new BigInteger("1");
        while (value != 0) {
            result = result.multiply(bigValue);
            value--;
            bigValue = BigInteger.valueOf(value);
        }
        return result;
    }

    /**
     * Merges two given sorted arrays into one
     *
     * @param arr1 first sorted array
     * @param arr2 second sorted array
     * @return new array containing all elements from a1 and a2, sorted
     */
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        if (arr1 == null || arr1.length == 0) {
            return arr2 != null ? arr2.clone() : new int[0];
        }
        if (arr2 == null || arr2.length == 0) {
            return arr1.clone();
        }

        int n = arr1.length;
        int m = arr2.length;
        int[] result = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < n) {
            result[k++] = arr1[i++];
        }

        while (j < m) {
            result[k++] = arr2[j++];
        }

        return result;
    }

    public static String printTextPerRole(String[] roles, String[] textLines) {
        int i = 0; int j = 0;
        int rolesLength = roles.length;
        int textLineLength = textLines.length;
        StringBuilder result = new StringBuilder();

        String[][] rolesAndTextLines = new String[textLineLength+1][rolesLength];

        for (j = 0; j < roles.length; j++) {
            rolesAndTextLines[0][j] = roles[j]; // результирующий массив, в нулевой строке которого названия ролей
        } j = 0;

        for (String line: textLines) {
            String[] rolePlusHisLine = line.split(": ", 2); // роль и слова
            i++; j = 0;
            for (String roleLine: rolesAndTextLines[0]) {
                if (roleLine.equals(rolePlusHisLine[0])) { // если роль совпадает с ролью из результирующего массива
                    rolesAndTextLines[i][j] = rolePlusHisLine[1];
                    continue;
                } else j++;
            }
        } i = 0; j = 0;

        for (j = 0; j < rolesLength; j++) {
            result.append(rolesAndTextLines[0][j]+":\n");
            for (i = 1; i < textLineLength+1; i++) {
                if (rolesAndTextLines[i][j] != null) {
                    result.append(i + ") " + rolesAndTextLines[i][j] + "\n");
                }
            }
            result.append("\n");
        }

        String string = new String(result);

        return string;
    }
}
//System.out.println(Arrays.toString(rolePlusHisLine));
