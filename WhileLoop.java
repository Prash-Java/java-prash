public class WhileLoop {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.print("Hello" + i);
            int j = 1;
            while(j<=3){
                System.out.println();
                System.out.print("Hello" + j);
                ++j;
            }
            System.out.println("Ending value of inner while counter " + j);
            ++i;
        }
        System.out.println("Ending value of outer while counter " + i);
    }
}
