import java.util.Scanner;

public class Arrays {
    public static void main(String[] args)
    {
        int ans=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int size=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<arr.length;i++)
        {
            int sum=0;
            for (int j=i;j<arr.length;j++)
            {
                sum=arr[i]+arr[j];
                if(sum<0)
                {
                    ans+=1;
                    for (int k=j+1;k<arr.length;k++)
                    {
                        if(sum+arr[k]<0)
                            ans+=1;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
