import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number");
        int first = scanner.nextInt();
        System.out.println("Enter the Second Number");
        int second  = scanner.nextInt();
        int third = first;
        first = second;
        second = third;
        // int first = 1000;
        // int second = 2000;
        //int result = first + second;
        System.out.println("Exchange "+first + " "+second);
        scanner.close();

    }
}
