import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 31일 : 1, 3, 5, 7, 8, 10, 12
        // 30일 : 4, 6, 9, 11
        // 28일 : 2

        if (n == 4 || n == 6 || n == 9 || n == 11) {
            System.out.print(30);
        } else if (n == 2) {
            System.out.print(28);
        } else {
            System.out.print(31);
        }

    }
}