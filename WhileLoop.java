public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            int j = 1;
            while(j<=3){
                System.out.print(j);
                ++j;
            }
            System.out.println(j);
            ++i;
        }
        System.out.println(i);
    }
}
