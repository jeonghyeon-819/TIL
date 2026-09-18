import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int oneage = sc.nextInt();
        String one = sc.next();
        int twoage = sc.nextInt();
        String two = sc.next();

        if ((oneage >= 19 && one.equals("M")) || (twoage >= 19 && two.equals("M"))) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
        
    }
}