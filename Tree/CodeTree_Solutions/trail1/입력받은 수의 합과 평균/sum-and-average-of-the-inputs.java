import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        double avg = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            sum += a;
            count++;
        }

        avg = (double) sum / count;

        System.out.print(sum + " ");
        System.out.printf("%.1f", avg);

    }
}