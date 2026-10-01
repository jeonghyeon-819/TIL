import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        double avg = 0;
        int count = 0;

        for (int i = a; i <= b; i++) {
            if (i % 5 == 0 || i % 7 == 0) {
                cnt += i;
                count++;
            }
        }

        avg = (double) cnt / count;

        System.out.print(cnt + " ");
        System.out.printf("%.1f", avg);

    }
}