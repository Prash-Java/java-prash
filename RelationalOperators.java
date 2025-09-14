public class RelationalOperators {
    public static void main(String[] args) {
        int a = 9;
        int b = 8;
        // Relational operators
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(++b==a);
        // value of b becomes 9 in the previous ++b operation.
        System.out.println(a==b);
        System.out.println(++b==++a);
    }
}
