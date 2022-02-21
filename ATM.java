public class ATM {
    public static void main(String[] args) {
        //int choice = 1;
        String choice = "ENTER-ACCOUNT-NUMBER";
        switch(choice){
            case "ENTER-ACCOUNT-NUMBER": // choice == 1
            System.out.println("Ac No Enter");
            break;
            case "WITHDRAW":
            System.out.println("WithDraw");
            break;
            case "BALANCE-CHECK":
            System.out.println("Balance Check");
            break;
            default:
            System.out.println("Wrong Choice");
        }
    }  
}
