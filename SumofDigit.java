public class SumofDigit {
  public static void main(String[] args) {
      int n = 2250;
    // 123%10 = 3
    // 123/10 = 12;
    // 12%10 = 2
    // 12/10 = 1
    int temp = n;
    int sum = 0;
    while(n!=0){
        int digit = n%10;
        sum+=digit;
        n = n/10; 
    }
    if(temp%sum==0){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }
    System.out.println(sum);
  }  
}
