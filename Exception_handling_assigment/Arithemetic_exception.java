import java.util.Scanner;

public class Arithemetic_exception {
    public static void main(String[] args) {

        try{
            int div = 100/0;
            System.out.println("Result : "+ div);
        }
        catch(ArithmeticException ae){
            System.out.println("Arithmetic Exception occurred in code : " + ae);
        }
        finally {
            System.out.println("Thank you!");
        }
    }
}
