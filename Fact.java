import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = s.nextInt();
        int result = 1;
        for(int i = n ; i>=1; i--){
            result = result * i;
           //System.out.println(i*(i-1));
        }
        System.out.println(result);
    }
}
