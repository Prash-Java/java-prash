public class LogicalOperators {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int a = 9;
        int b = 11;
        boolean result = x < y;
        System.out.println(result);
        result = b > a;
        System.out.println(result);
        result = x < y && a < b;
        System.out.println(result);
        result = x < y || a < b;
        System.out.println(result);
        System.out.println(!result);
    }
}
