class PrintDigit{
    public static void main(String[] args) {
        int n = 12345;
        int temp = n;
        int count = 0;
        while(n!=0){
            count++;
            n = n/10;
        }
        while(temp!=0){
            int pow = (int)Math.pow(10, count-1);
            int r = temp/ pow;
            System.out.println(r);
            temp = temp %  pow;
            count--;
        }

    }
}