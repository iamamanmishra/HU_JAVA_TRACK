import java.util.Scanner;

public class Pattern {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows yo want to print: ");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for (int j=num;j>i;j--)
            {
                System.out.print(" ");
            }
            for (int k=0;k<i;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i=num-1;i>0;i--)
        {
            for (int j=num;j>i;j--)
            {
                System.out.print(" ");
            }
            for (int k=0;k<i;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
