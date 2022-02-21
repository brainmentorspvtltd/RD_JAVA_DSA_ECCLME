import java.util.Scanner;

public class IfElse {
  public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);  
    System.out.println("Enter the Time 24 Hrs Format");
    int time = scanner.nextInt();
    boolean isCharge = true;
    if(time==21 && isCharge){
        System.out.println("Watching Netflix");
    }
    else if(time ==6){
        System.out.println("Excercise Time");
    }
    else if(time ==8){
        System.out.println("Travelling Time");
    }
    else{
        System.out.println("Invalid Time...");
    }


  }   
}
