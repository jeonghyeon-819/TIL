import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        double avg = 0;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int a = sc.nextInt();

            if (a >= 0 && a <= 200) {
                sum += a;
                count++;
            }
        }

        avg = (double) sum / count;

        System.out.print(sum + " ");
        System.out.printf("%.1f", avg);

    }
}