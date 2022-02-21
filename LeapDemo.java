import java.util.Scanner;

public class LeapDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year  = scanner.nextInt();
        if(year%4==0){ // true
            // if(year%100==0 && year%400!=0){ // true
            // System.out.println("Leap Year");
            // return ; // exit from the function
            // }
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not Leap Year");
        }
    }
}
