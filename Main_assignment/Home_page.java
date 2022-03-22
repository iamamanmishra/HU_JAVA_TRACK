import java.util.Scanner;

public class Home_page {
    static boolean handleChoice(int ch) {
        switch (ch){
            case 1:
            case 2:break;
            case 3:return(true);
            default:
                System.out.println("Please enter a valid choice");
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int ch = -1;
        do {
            System.out.println("\n****Welcome To User Database****\n1. Log In\n2. Register\n3. Exit");
            System.out.println("\n********************************\n");
            System.out.println("Enter your choice : ");
            ch = sc.nextInt();
            exit = handleChoice(ch);
        }while(!exit);
    }
}
