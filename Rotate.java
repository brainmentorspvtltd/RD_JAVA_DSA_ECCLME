public class Rotate {
    public static void main(String[] args) {
        int n = 12345;
        int r = 2;
        int temp = n; // n copy store temp
        int pow = (int) Math.pow(10,r);
        int secondPart = n%pow ;
        int firstPart = n/pow;
        //System.out.println(firstPart + " "+secondPart);
        int count = 0;
        while(temp!=0){
            count++;
            temp = temp /10;
        }
        int place =  count - r;
        n =secondPart *(int)Math.pow(10, place) + firstPart;
        System.out.println(n);
    }
}
