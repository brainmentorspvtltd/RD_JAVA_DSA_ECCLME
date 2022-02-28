public class NestedLoops {
    public static void main(String[] args) {
        // for(int i = 1; i<=10; i++){
        //     for(int j = 1; j<=10; j++){
        //         System.out.println(i+"X"+j+"="+i*j);
        //     }
        // }
        for(int row = 5 ; row>=1; row--){
            for(int star = 1; star<=row; star++){
                System.out.print("*");
            }
            System.out.println();
        }

        // for(int row = 1 ; row<=5; row++){
        //     for(int star = 1; star<=row; star++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i = 1;i<=3; i++){
        //     for(int j =1; j<=3; j++){
        //         System.out.println(i + " "+j);
        //     }
        // }
    }
}
