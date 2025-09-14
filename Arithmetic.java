public class Arithmetic {
    public static void main(String[] args) {
        byte a = 5;
        byte b = 3;
        int c = a * b; // Type promotion => Operations on two byte values is assigned to int.
        System.out.println(c);
        int num = a; // byte value is assigned to int type.
        int result = num++; // first value of num is fetched and assigned to result and then it gets incremented. Post-Increment.
        System.out.println(result);
        System.out.println(num);
        int val = a;
        int res = ++val; // first value of val is incremented and then assigned to res. Pre-Increment.
        System.out.println(res);
        System.out.println(val);
    }
}
