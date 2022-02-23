import java.util.Scanner;

public class Average{
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int sum = 0;
    int count = 0;
    //for( char singleChar = 'y';singleChar=='y' || singleChar=='Y';){
        char singleChar = 'y';
        while(singleChar=='y' || singleChar=='Y'){
        System.out.println("Enter the Number");
        int num = scanner.nextInt();
        sum+=num; // sum = sum + num;
        count++;
        System.out.println("Y for Continue and N for Exit ");
        singleChar = scanner.next().charAt(0);
    }
    System.out.println(sum/count);
}
}