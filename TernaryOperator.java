import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        //int num = scanner.nextInt();
        int num = new Scanner(System.in).nextInt();
        System.out.println(num%2==0?"Even "+num:"Odd "+num);
        // String result = num%2==0?"Even "+num:" Odd "+num;
        // System.out.println(result);
        // scanner.close();
        //boolean att = true;
        //System.out.println(att?"Employee Present":"Not Present");
    }
}
