public class Lesson4 {
    public static void main(String[] args) {
        System.out.println(getGreeting("user"));
    }

    public static String getGreeting(String name) {
        if (name == null) {
            return "Hello anonymous!";
        } else {
            return "Hello " + name + "!";
        }
    }
}
