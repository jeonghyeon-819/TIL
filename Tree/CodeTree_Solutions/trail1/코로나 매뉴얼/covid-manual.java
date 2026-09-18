import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String yn1 = sc.next();
        int tmp1 = sc.nextInt();

        String yn2 = sc.next();
        int tmp2 = sc.nextInt();

        String yn3 = sc.next();
        int tmp3 = sc.nextInt();

        int A = 0;

        if (yn1.equals("Y") && tmp1 >= 37) {
            A = A + 1;
        }

        if (yn2.equals("Y") && tmp2 >= 37) {
            A = A + 1;
        }

        if (yn3.equals("Y") && tmp3 >= 37) {
            A = A + 1;
        }

        if (A >= 2) {
            System.out.print("E");
        } else {
            System.out.print("N");
        }

    }
}